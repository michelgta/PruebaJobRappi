package mx.com.pruebajobrappi.ui.popular.model

sealed class PopularViewState {
    data class OnSuccessFetch(val newPage: Int) : PopularViewState()
    object OnError : PopularViewState()
    object OnLoading : PopularViewState()
    object OnMaxPagesReached : PopularViewState()
}