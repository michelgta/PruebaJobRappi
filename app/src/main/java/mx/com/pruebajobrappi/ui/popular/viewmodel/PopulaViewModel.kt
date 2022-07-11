package mx.com.pruebajobrappi.ui.popular.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import mx.com.pruebajobrappi.base.BaseViewModel
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.domain.usecase.GetPopularUseCase
import mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState
import mx.com.pruebajobrappi.ui.popular.model.PopularViewState
import mx.com.pruebajobrappi.utils.Constants

class PopularViewModel(private val useCase: GetPopularUseCase) : BaseViewModel() {

    private var _popularViewState = MutableLiveData<PopularViewState>()
    private var _trailerViewState = MutableLiveData<PopularViewState>()
    private var _popularMovies = MutableLiveData<List<Movie>>()
    private var _favoriteViewState = MutableLiveData<FavoriteViewState>()
    private var _trailerVideosViewState = MutableLiveData<String>()

    var currentPage: Int = 1

    val popularMovies: LiveData<List<Movie>>
        get() = _popularMovies

    val popularViewState: LiveData<PopularViewState>
        get() = _popularViewState

    val favoriteMoviesViewState: LiveData<FavoriteViewState>
        get() = _favoriteViewState

    val trailerMoviesViewState: LiveData<String>
        get() = _trailerVideosViewState

    val trailerViewState: LiveData<PopularViewState>
        get() = _trailerViewState

    init {
        fetchPopularMovies()
    }

    fun fetchPopularMovies() {
        when {
            canLoadMoreMovies(currentPage) -> getPopularMoviesDB()
            else -> _popularViewState.postValue(PopularViewState.OnMaxPagesReached)
        }
    }


    fun getMoviesTrailer(idMovie: Int) {
        getVideoTrailerRequest(idMovie)
    }

    fun updateFavorite(id: Long, isFavorite: Boolean) {
        main {
            runCatching {
                useCase.updateFavoriteState(id, isFavorite)
            }.onSuccess {
                _favoriteViewState.postValue(getFavoriteViewStateWhenUpdate(isFavorite))
            }.onFailure {
                Log.wtf("Fail", it.localizedMessage)
            }
        }
    }

    private fun getPopularMoviesDB() {
        _popularViewState.postValue(PopularViewState.OnLoading)
        main {
            runCatching {
                useCase.getPopularDB(page = currentPage)
            }.onSuccess {
                if (it.isNotEmpty()) {
                    currentPage++
                    _popularMovies.postValue(it)
                    _popularViewState.postValue(PopularViewState.OnSuccessFetch(currentPage))
                } else {
                    getPopularRequest()
                }
            }.onFailure {
                _popularViewState.postValue(PopularViewState.OnError)
            }
        }
    }

    private fun getPopularRequest() {
        main {
            runCatching {
                useCase.getPopularNetwork(page = currentPage)
            }.onSuccess {
                getPopularMoviesDB()
            }.onFailure {
                _popularViewState.postValue(PopularViewState.OnError)
            }
        }
    }


    private fun getVideoTrailerRequest(idMovie: Int) {
        main {
            runCatching {
                useCase.getVideTrailerNetwork(idMovie = idMovie)
            }.onSuccess {
                if (!it.isNullOrEmpty()) {
                    _trailerVideosViewState.postValue(it)
                } else {
                    _trailerVideosViewState.postValue("")
                }

            }.onFailure {
                _trailerViewState.postValue(PopularViewState.OnError)
            }
        }
    }


    private fun canLoadMoreMovies(currentPage: Int) = currentPage < Constants.MAX_PAGES

}