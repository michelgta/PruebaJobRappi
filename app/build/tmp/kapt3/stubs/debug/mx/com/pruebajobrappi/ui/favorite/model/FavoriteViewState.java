package mx.com.pruebajobrappi.ui.favorite.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "", "()V", "OnEmptyFavorites", "OnResultFavorites", "OnSuccessAddFavorite", "OnSuccessRemoveFavorite", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnSuccessRemoveFavorite;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnSuccessAddFavorite;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnEmptyFavorites;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnResultFavorites;", "app_debug"})
public abstract class FavoriteViewState {
    
    private FavoriteViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnSuccessRemoveFavorite;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "()V", "app_debug"})
    public static final class OnSuccessRemoveFavorite extends mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState {
        public static final mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState.OnSuccessRemoveFavorite INSTANCE = null;
        
        private OnSuccessRemoveFavorite() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnSuccessAddFavorite;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "()V", "app_debug"})
    public static final class OnSuccessAddFavorite extends mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState {
        public static final mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState.OnSuccessAddFavorite INSTANCE = null;
        
        private OnSuccessAddFavorite() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnEmptyFavorites;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "()V", "app_debug"})
    public static final class OnEmptyFavorites extends mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState {
        public static final mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState.OnEmptyFavorites INSTANCE = null;
        
        private OnEmptyFavorites() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState$OnResultFavorites;", "Lmx/com/pruebajobrappi/ui/favorite/model/FavoriteViewState;", "movies", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "(Ljava/util/List;)V", "getMovies", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnResultFavorites extends mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<mx.com.pruebajobrappi.data.models.Movie> movies = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<mx.com.pruebajobrappi.data.models.Movie> getMovies() {
            return null;
        }
        
        public OnResultFavorites(@org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.Movie> movies) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<mx.com.pruebajobrappi.data.models.Movie> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mx.com.pruebajobrappi.ui.favorite.model.FavoriteViewState.OnResultFavorites copy(@org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.Movie> movies) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}