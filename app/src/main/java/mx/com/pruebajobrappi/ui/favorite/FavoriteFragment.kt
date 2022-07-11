package mx.com.pruebajobrappi.ui.favorite

import android.content.Context
import android.content.res.Configuration
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_favorite.*
import kotlinx.android.synthetic.main.fragment_popular.*
import mx.com.pruebajobrappi.R
import mx.com.pruebajobrappi.base.BaseFragment
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.ui.adapter.reciclerview.SpacesItemDecoration
import mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState
import mx.com.pruebajobrappi.ui.favorite.viewmodel.FavoritesViewModel
import mx.com.pruebajobrappi.ui.listener.FragmentCommunication
import mx.com.pruebajobrappi.ui.popular.model.PopularViewState
import mx.com.pruebajobrappi.utils.extensions.gone
import mx.com.pruebajobrappi.utils.extensions.observe
import mx.com.pruebajobrappi.utils.extensions.snack
import mx.com.pruebajobrappi.utils.extensions.visible
import org.koin.android.viewmodel.ext.android.viewModel

class FavoriteFragment : BaseFragment() {

    private val viewModel: FavoritesViewModel by viewModel()

    lateinit var communication: FragmentCommunication

    lateinit var mPoster: View
    lateinit var mTitle: View
    lateinit var mRanking: View
    lateinit var mMovie: Movie

    override fun getLayoutView(): Int = R.layout.fragment_favorite

    override fun initView() {
        initAdapterManager()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        communication = context as FragmentCommunication
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        val isLandscape = newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE
        rvFavoriteMovies?.apply {
            moviesLayoutManager?.spanCount = getColumnsByOrientation(isLandscape)
            adapter?.notifyDataSetChanged()
        }
    }

    override fun attachObservers() {
        viewModel.apply {
            getFavoritesMovies()
            observe(favoriteMoviesViewState, ::handleFavoriteViewState)
            observe(trailerMoviesViewState, ::getTrailerFromMovie)
            observe(trailerViewState, ::handleTrailerViewState)
        }
    }

    private fun handleTrailerViewState(viewState: PopularViewState) {
        when (viewState) {
            is PopularViewState.OnError -> {
                pgrsFavoritesMovies.gone()
                Toast.makeText(context, getText(R.string.error_no_trailers), Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun getTrailerMovie(poster: View, title: View, ranking: View, movie: Movie) {
        viewModel.getMoviesTrailer(movie.id.toInt())
        mPoster = poster
        mTitle = title
        mRanking = ranking
        mMovie = movie
    }

    private fun getTrailerFromMovie(path: String) {
        pgrsFavoritesMovies.gone()
        communication.selectMovie(mPoster, mTitle, mRanking, mMovie, path)
    }

    private fun handleFavoriteViewState(viewState: FavoriteViewState) {
        when (viewState) {
            is FavoriteViewState.OnSuccessAddFavorite -> snack(R.string.message_success_add_favorites)
            is FavoriteViewState.OnSuccessRemoveFavorite -> snack(R.string.message_success_remove_favorites)
            is FavoriteViewState.OnResultFavorites -> showFavoritesMovies(viewState.movies)
            is FavoriteViewState.OnEmptyFavorites -> showEmptyFavorites()
        }
    }

    private fun showEmptyFavorites() {
        rvFavoriteMovies.gone()
        tvEmptyFavoritesMovies.visible()
    }

    private fun showFavoritesMovies(movies: List<Movie>) {
        moviesAdapter.updateMovies(movies)
        rvFavoriteMovies.visible()
        tvEmptyFavoritesMovies.gone()
    }

    private fun initAdapterManager() {
        rvFavoriteMovies?.apply {
            layoutManager = moviesLayoutManager ?: GridLayoutManager(
                requireContext(),
                getColumnsByOrientation(isLandScape)
            )
            addItemDecoration(SpacesItemDecoration(SPACE_ITEM_DECORATION))
            adapter = moviesAdapter
            setHasFixedSize(true)
            handleItemClickListener()
        }
    }

    private fun handleItemClickListener() {
        moviesAdapter.apply {
            setItemClickListener { poster, title, ranking, movie ->
                pgrsFavoritesMovies.visible()
               getTrailerMovie(poster, title, ranking, movie)
            }
            setUpdateListener {
                it.run {
                    val newValue = !isFavorite
                    isFavorite = newValue
                    viewModel.updateFavorite(id, newValue)
                    notifyDataSetChanged()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.getFavoritesMovies()

    }

}