package mx.com.pruebajobrappi.ui.listener

import android.view.View
import mx.com.pruebajobrappi.data.models.Movie


interface FragmentCommunication {
    fun selectMovie(poster: View, title: View, ranking: View, movie: Movie, videoTrailer:String?)
}