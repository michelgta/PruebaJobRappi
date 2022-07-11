package mx.com.pruebajobrappi.ui.popular.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0011J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0011H\u0002J\u0016\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00178F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lmx/com/pruebajobrappi/ui/popular/viewmodel/PopularViewModel;", "Lmx/com/pruebajobrappi/base/BaseViewModel;", "useCase", "Lmx/com/pruebajobrappi/domain/usecase/GetPopularUseCase;", "(Lmx/com/pruebajobrappi/domain/usecase/GetPopularUseCase;)V", "_favoriteViewState", "Landroidx/lifecycle/MutableLiveData;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "_popularMovies", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "_popularViewState", "Lmx/com/pruebajobrappi/ui/popular/model/PopularViewState;", "_trailerVideosViewState", "", "_trailerViewState", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "favoriteMoviesViewState", "Landroidx/lifecycle/LiveData;", "getFavoriteMoviesViewState", "()Landroidx/lifecycle/LiveData;", "popularMovies", "getPopularMovies", "popularViewState", "getPopularViewState", "trailerMoviesViewState", "getTrailerMoviesViewState", "trailerViewState", "getTrailerViewState", "canLoadMoreMovies", "", "fetchPopularMovies", "", "getMoviesTrailer", "idMovie", "getPopularMoviesDB", "getPopularRequest", "getVideoTrailerRequest", "updateFavorite", "id", "", "isFavorite", "app_debug"})
public final class PopularViewModel extends mx.com.pruebajobrappi.base.BaseViewModel {
    private androidx.lifecycle.MutableLiveData<mx.com.pruebajobrappi.ui.popular.model.PopularViewState> _popularViewState;
    private androidx.lifecycle.MutableLiveData<mx.com.pruebajobrappi.ui.popular.model.PopularViewState> _trailerViewState;
    private androidx.lifecycle.MutableLiveData<java.util.List<mx.com.pruebajobrappi.data.models.Movie>> _popularMovies;
    private androidx.lifecycle.MutableLiveData<mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState> _favoriteViewState;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _trailerVideosViewState;
    private int currentPage = 1;
    private final mx.com.pruebajobrappi.domain.usecase.GetPopularUseCase useCase = null;
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<mx.com.pruebajobrappi.data.models.Movie>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<mx.com.pruebajobrappi.ui.popular.model.PopularViewState> getPopularViewState() {
        return null;
    }
    
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
    
    public final void fetchPopularMovies() {
    }
    
    public final void getMoviesTrailer(int idMovie) {
    }
    
    public final void updateFavorite(long id, boolean isFavorite) {
    }
    
    private final void getPopularMoviesDB() {
    }
    
    private final void getPopularRequest() {
    }
    
    private final void getVideoTrailerRequest(int idMovie) {
    }
    
    private final boolean canLoadMoreMovies(int currentPage) {
        return false;
    }
    
    public PopularViewModel(@org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.domain.usecase.GetPopularUseCase useCase) {
        super();
    }
}