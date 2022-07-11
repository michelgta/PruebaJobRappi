package mx.com.pruebajobrappi.domain.usecase

import mx.com.pruebajobrappi.data.repository.FavoriteRepository
import mx.com.pruebajobrappi.data.repository.PopularRepository

import mx.com.pruebajobrappi.base.BaseUseCase
import mx.com.pruebajobrappi.data.models.Movie

interface GetPopularUseCase : BaseUseCase {
    suspend fun getPopularDB(page: Int): List<Movie>
    suspend fun getPopularNetwork(page: Int): List<Movie>
    suspend fun getVideTrailerNetwork(idMovie: Int): String?
}

class GetPopularUseCaseImpl(private val repositoryPopular: PopularRepository,
                                  private val repositoryFavorite: FavoriteRepository) : GetPopularUseCase {

    override suspend fun getPopularDB(page: Int): List<Movie> = repositoryPopular.getPopularDB(page)

    override suspend fun getPopularNetwork(page: Int): List<Movie> = repositoryPopular.getPopularNetwork(page)

    override suspend fun getVideTrailerNetwork(idMovie: Int): String? = repositoryPopular.getVideTrailerNetwork(idMovie)


    override suspend fun updateFavoriteState(id: Long, isFavorite: Boolean) {
        repositoryFavorite.updateFavoriteState(id, isFavorite)
    }


}
