package mx.com.pruebajobrappi.data.repository

import mx.com.pruebajobrappi.data.local.MoviesDao
import mx.com.pruebajobrappi.data.mapper.toDomainModel
import mx.com.pruebajobrappi.data.models.Movie
import mx.com.pruebajobrappi.data.remote.MovieEndpoints

interface FavoriteRepository : BaseRepository {
    suspend fun getFavorites(): List<Movie>
    suspend fun updateFavoriteState(id: Long, isFavorite: Boolean)
    suspend fun getVideTrailerNetwork(idMovie: Int): String?

}

class FavoriteRepositoryImpl(private val movieEndpoints: MovieEndpoints, private val moviesDao: MoviesDao) : FavoriteRepository {

    override suspend fun getFavorites(): List<Movie>
       =  moviesDao.getFavoritesMovies().map { result ->
            result.toDomainModel()
        }.sortedByDescending { item -> item.voteAverage }


    override suspend fun updateFavoriteState(id: Long, isFavorite: Boolean) {
        moviesDao.updateFavorite(id, isFavorite)
    }

    override suspend fun getVideTrailerNetwork(idMovie: Int): String? {
        val videoTrailers = movieEndpoints.getVideoTrailerMovies(idMovie)
        return getLastVideoTrailer(videoTrailers.results)
    }
}