package mx.com.pruebajobrappi.ui.detail

import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.google.android.youtube.player.*
import kotlinx.android.synthetic.main.dialog_detail_movie.*
import mx.com.pruebajobrappi.R
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.utils.Constants
import mx.com.pruebajobrappi.utils.Constants.MOVIE
import mx.com.pruebajobrappi.utils.Constants.PATH_VIDEO
import mx.com.pruebajobrappi.utils.extensions.loadImageUrl
import mx.com.pruebajobrappi.utils.extensions.posterFullUrl


class DetailMovieActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    var mMovie: Movie? = null
    lateinit var mYouTubePlayerView: YouTubePlayerView
    lateinit var mKeyVideo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        mKeyVideo = intent.getStringExtra(PATH_VIDEO)!!
        intent.extras?.let {
            mMovie = it.getParcelable(MOVIE)
        }
        setUpMovieData()

        ivCloseFullScreen.setOnClickListener {
            finish()
        }
        mYouTubePlayerView = findViewById<YouTubePlayerView>(R.id.ytpvMovieTrailer)
        mYouTubePlayerView.initialize(Constants.API_KEY_YT, this)
    }


    private fun setUpMovieData() {
        mMovie.let { item ->
            loadImageUrl(backgroundPoster, item?.posterPath!!.posterFullUrl)
            tvMovieTitle.apply {
                transitionName = Constants.TITLE
                text = item.title
            }
            tvTotalPointsItem.apply {
                transitionName = Constants.RANKING
                text = getString(
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

        youTubePlayer?.loadVideo(mKeyVideo);
        youTubePlayer?.play()

    }

    override fun onInitializationFailure(
        provider: YouTubePlayer.Provider?,
        youTubeInitializationResult: YouTubeInitializationResult?
    ) {
        Toast.makeText(
            this,
            getString(R.string.error_youtube_network_connection),
            Toast.LENGTH_SHORT
        ).show()
    }

}