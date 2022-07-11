package mx.com.pruebajobrappi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lmx/com/pruebajobrappi/data/repository/FavoriteRepository;", "Lmx/com/pruebajobrappi/data/repository/BaseRepository;", "getFavorites", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideTrailerNetwork", "", "idMovie", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteState", "", "id", "", "isFavorite", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FavoriteRepository extends mx.com.pruebajobrappi.data.repository.BaseRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateFavoriteState(long id, boolean isFavorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideTrailerNetwork(int idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.List<mx.com.pruebajobrappi.data.models.Movie> sortMovies(mx.com.pruebajobrappi.data.repository.FavoriteRepository $this, @org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.MovieData> movies) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public static java.lang.String getLastVideoTrailer(mx.com.pruebajobrappi.data.repository.FavoriteRepository $this, @org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.VideoTrailerData> trailers) {
            return null;
        }
    }
}