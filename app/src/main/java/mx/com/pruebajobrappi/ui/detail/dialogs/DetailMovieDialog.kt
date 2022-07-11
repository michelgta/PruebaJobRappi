package mx.com.pruebajobrappi.ui.detail.dialogs

import android.app.Activity
import android.app.Dialog
import android.app.FragmentTransaction
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerFragment
import kotlinx.android.synthetic.main.dialog_detail_movie.*
import kotlinx.android.synthetic.main.main_activity.*
import mx.com.pruebajobrappi.R
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.utils.Constants
import mx.com.pruebajobrappi.utils.Constants.API_KEY_YT
import mx.com.pruebajobrappi.utils.extensions.loadImageUrl
import mx.com.pruebajobrappi.utils.extensions.posterFullUrl


class DetailMovieDialog(activity: Activity, movie: Movie, keyVideo:String?) : Dialog(activity, R.style.PauseDialog),
    YouTubePlayer.OnInitializedListener {
    var mMovie: Movie = movie
    var mActivity: Activity = activity
    lateinit var mYouTubePlayerFragment: YouTubePlayerFragment
    lateinit var mTransaction: FragmentTransaction
    var mKeyVideo: String? = keyVideo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_detail_movie)

        getWindow()?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        );

        setUpMovieData()

        ivCloseFullScreen.setOnClickListener { dismiss()

        }

        mTransaction =  mActivity.fragmentManager.beginTransaction()

        mYouTubePlayerFragment = mActivity.fragmentManager.findFragmentById(R.id.ytpvMovieTrailer) as YouTubePlayerFragment


        mYouTubePlayerFragment.initialize(API_KEY_YT, this)

    }



    private fun setUpMovieData() {
        mMovie.let { item ->
            mActivity.loadImageUrl(backgroundPoster, item.posterPath.posterFullUrl)
            tvMovieTitle.apply {
                transitionName = Constants.TITLE
                text = item.title
            }
            tvTotalPointsItem.apply {
                transitionName = Constants.RANKING
                text = mActivity.getString(
                    R.string.text_placeholder_votes,
                    item.voteAverage.toString(), item.voteCount.toString()
                )
            }
            tvMovieOverview.text = item.overview
        }
    }

    override fun onInitializationSuccess(
        provider: YouTubePlayer.Provider?,
        youTubePlayer: YouTubePlayer?,
        wasRestored: Boolean
    ) {
        if (!wasRestored) {
            youTubePlayer?.cueVideo(mKeyVideo);
        }
    }

    override fun onInitializationFailure(
        provider: YouTubePlayer.Provider?,
        youTubeInitializationResult: YouTubeInitializationResult?
    ) {
        Toast.makeText(
            context,
            context.getString(R.string.error_youtube_network_connection),
            Toast.LENGTH_SHORT
        ).show()
    }



}