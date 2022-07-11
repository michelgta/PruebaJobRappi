package mx.com.pruebajobrappi.domain.usecase

import mx.com.pruebajobrappi.data.repository.FavoriteRepository
import mx.com.pruebajobrappi.base.BaseUseCase
import mx.com.pruebajobrappi.data.models.Movie

interface GetFavoritesUseCase : BaseUseCase {
   suspend fun getFavorites(): List<Movie>
    suspend fun getVideTrailerNetwork(idMovie: Int): String?
}

class GetFavoritesUseCaseImpl(private val favoriteRepository: FavoriteRepository) :
    GetFavoritesUseCase {

    override suspend fun getFavorites(): List<Movie> {
        return favoriteRepository.getFavorites()
    }

    override suspend fun updateFavoriteState(id: Long, isFavorite: Boolean) {
        favoriteRepository.updateFavoriteState(id, isFavorite)
    }

    override suspend fun getVideTrailerNetwork(idMovie: Int): String? = favoriteRepository.getVideTrailerNetwork(idMovie)



}