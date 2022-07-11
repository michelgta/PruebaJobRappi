package mx.com.pruebajobrappi.data.repository

import mx.com.pruebajobrappi.data.mapper.toDomainModel
import mx.com.pruebajobrappi.data.models.MovieData
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.data.models.VideoTrailerData
import mx.com.pruebajobrappi.utils.Constants.FIRST_POSITION

interface BaseRepository {

    fun sortMovies(movies: MutableList<MovieData>): List<Movie> = movies.map { result ->
        result.toDomainModel()
    }.sortedByDescending { item -> item.voteAverage }

    fun getLastVideoTrailer(trailers: MutableList<VideoTrailerData>): String? =
        trailers.get(FIRST_POSITION).key


}