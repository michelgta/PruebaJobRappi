package mx.com.pruebajobrappi

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.main_activity.*
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.ui.detail.DetailMovieActivity
import mx.com.pruebajobrappi.ui.detail.dialogs.DetailMovieDialog
import mx.com.pruebajobrappi.ui.feed.FeedTabsAdapter
import mx.com.pruebajobrappi.ui.listener.FragmentCommunication
import mx.com.pruebajobrappi.utils.Constants
import mx.com.pruebajobrappi.utils.Constants.MOVIE
import mx.com.pruebajobrappi.utils.Constants.PATH_VIDEO
import mx.com.pruebajobrappi.utils.Constants.RANKING
import mx.com.pruebajobrappi.utils.Constants.TITLE

class MainActivity : AppCompatActivity(), FragmentCommunication {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setUpNavigation()

        viewPagerFeeds.adapter = FeedTabsAdapter(this)

        TabLayoutMediator(tabLayoutFeeds, viewPagerFeeds) { tab, position ->
            if (position == Constants.TAB_1)
                tab.text = getString(R.string.text_popular_movies)
            else
                tab.text = getString(R.string.text_favorites_movies)
        }.attach()

    }

    private fun setUpNavigation() {
        (supportFragmentManager.findFragmentById(R.id.navHostFragment) as? NavHostFragment)?.navController?.navigate(
            R.id.favoriteFragment
        )
    }



    override fun selectMovie(poster: View, title: View, ranking: View, movie: Movie, videoTrailer: String?) {
        val intent = Intent(this, DetailMovieActivity::class.java).apply {
            putExtra(MOVIE, movie)
            putExtra(PATH_VIDEO,videoTrailer)
        }
        val image = movie.posterPath

        val pairPoster : Pair<View, String> = Pair(poster, image)
        val pairTitle : Pair<View, String> = Pair(title, TITLE)
        val pairRanking : Pair<View, String> = Pair(ranking, RANKING)
        val options = ActivityOptions.makeSceneTransitionAnimation(this, pairPoster, pairTitle, pairRanking)
        startActivity(intent, options.toBundle())
    }
}

