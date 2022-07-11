package mx.com.pruebajobrappi.ui.favorite.model

import mx.com.pruebajobrappi.data.models.Movie

sealed class FavoriteViewState {
    object OnSuccessRemoveFavorite : FavoriteViewState()
    object OnSuccessAddFavorite : FavoriteViewState()
    object OnEmptyFavorites : FavoriteViewState()
    data class OnResultFavorites(val movies: List<Movie>) : FavoriteViewState()
}