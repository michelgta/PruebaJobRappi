package mx.com.pruebajobrappi.ui.favorite.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lmx/com/pruebajobrappi/ui/favorite/viewmodel/FavoritesViewModel;", "Lmx/com/pruebajobrappi/base/BaseViewModel;", "useCase", "Lmx/com/pruebajobrappi/domain/usecase/GetFavoritesUseCase;", "(Lmx/com/pruebajobrappi/domain/usecase/GetFavoritesUseCase;)V", "_favoriteViewState", "Landroidx/lifecycle/MutableLiveData;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "_trailerVideosViewState", "", "_trailerViewState", "Lmx/com/pruebajobrappi/ui/popular/model/PopularViewState;", "favoriteMoviesViewState", "Landroidx/lifecycle/LiveData;", "getFavoriteMoviesViewState", "()Landroidx/lifecycle/LiveData;", "trailerMoviesViewState", "getTrailerMoviesViewState", "trailerViewState", "getTrailerViewState", "getFavoritesMovies", "", "getMoviesTrailer", "idMovie", "", "getVideoTrailerRequest", "handleFavoritesListResult", "movies", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "updateFavorite", "id", "", "isFavorite", "", "app_debug"})
public final class FavoritesViewModel extends mx.com.pruebajobrappi.base.BaseViewModel {
    private androidx.lifecycle.MutableLiveData<mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState> _favoriteViewState;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _trailerVideosViewState;
    private androidx.lifecycle.MutableLiveData<mx.com.pruebajobrappi.ui.popular.model.PopularViewState> _trailerViewState;
    private final mx.com.pruebajobrappi.domain.usecase.GetFavoritesUseCase useCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState> getFavoriteMoviesViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTrailerMoviesViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<mx.com.pruebajobrappi.ui.popular.model.PopularViewState> getTrailerViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMoviesTrailer(int idMovie) {
        return null;
    }
    
    public final void getFavoritesMovies() {
    }
    
    public final void updateFavorite(long id, boolean isFavorite) {
    }
    
    private final void handleFavoritesListResult(java.util.List<mx.com.pruebajobrappi.data.models.Movie> movies) {
    }
    
    private final void getVideoTrailerRequest(int idMovie) {
    }
    
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.domain.usecase.GetFavoritesUseCase useCase) {
        super();
    }
}