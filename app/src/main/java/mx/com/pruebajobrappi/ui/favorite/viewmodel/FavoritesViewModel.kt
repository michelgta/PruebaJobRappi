package mx.com.pruebajobrappi.ui.favorite.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import mx.com.pruebajobrappi.base.BaseViewModel
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.domain.usecase.GetFavoritesUseCase
import mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState
import mx.com.pruebajobrappi.ui.popular.model.PopularViewState


class FavoritesViewModel(private val useCase: GetFavoritesUseCase) : BaseViewModel() {

    private var _favoriteViewState = MutableLiveData<FavoriteViewState>()

    private var _trailerVideosViewState = MutableLiveData<String>()

    private var _trailerViewState = MutableLiveData<PopularViewState>()


    val favoriteMoviesViewState: LiveData<FavoriteViewState>
        get() = _favoriteViewState

    val trailerMoviesViewState: LiveData<String>
        get() = _trailerVideosViewState

    val trailerViewState: LiveData<PopularViewState>
        get() = _trailerViewState

    init {
        getFavoritesMovies()
    }

    fun getMoviesTrailer(idMovie: Int) :String? {
        getVideoTrailerRequest(idMovie)
        return trailerMoviesViewState.value
    }


    fun getFavoritesMovies(){
        main {
            runCatching {
                useCase.getFavorites()
            }.onSuccess {
                handleFavoritesListResult(it)
            }.onFailure {
                _favoriteViewState.postValue(FavoriteViewState.OnEmptyFavorites)
            }
        }
    }

    fun updateFavorite(id: Long, isFavorite: Boolean) {
        main {
            runCatching {
                useCase.updateFavoriteState(id, isFavorite)
            }.onSuccess {
                getFavoritesMovies()
                _favoriteViewState.postValue(getFavoriteViewStateWhenUpdate(isFavorite))
            }
        }
    }

    private fun handleFavoritesListResult(movies: List<Movie>) {
        if (movies.isNullOrEmpty()) {
            _favoriteViewState.postValue(FavoriteViewState.OnEmptyFavorites)

        } else {
            _favoriteViewState.postValue(FavoriteViewState.OnResultFavorites(movies))
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

}