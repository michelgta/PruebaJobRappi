package mx.com.pruebajobrappi.base

interface BaseUseCase {
    suspend fun updateFavoriteState(id: Long, isFavorite: Boolean)


}