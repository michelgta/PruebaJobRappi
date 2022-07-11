package mx.com.pruebajobrappi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lmx/com/pruebajobrappi/data/repository/FavoriteRepositoryImpl;", "Lmx/com/pruebajobrappi/data/repository/FavoriteRepository;", "movieEndpoints", "Lmx/com/pruebajobrappi/data/remote/MovieEndpoints;", "moviesDao", "Lmx/com/pruebajobrappi/data/local/MoviesDao;", "(Lmx/com/pruebajobrappi/data/remote/MovieEndpoints;Lmx/com/pruebajobrappi/data/local/MoviesDao;)V", "getFavorites", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideTrailerNetwork", "", "idMovie", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteState", "", "id", "", "isFavorite", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FavoriteRepositoryImpl implements mx.com.pruebajobrappi.data.repository.FavoriteRepository {
    private final mx.com.pruebajobrappi.data.remote.MovieEndpoints movieEndpoints = null;
    private final mx.com.pruebajobrappi.data.local.MoviesDao moviesDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateFavoriteState(long id, boolean isFavorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getVideTrailerNetwork(int idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    public FavoriteRepositoryImpl(@org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.remote.MovieEndpoints movieEndpoints, @org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.local.MoviesDao moviesDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<mx.com.pruebajobrappi.data.models.Movie> sortMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.MovieData> movies) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLastVideoTrailer(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.VideoTrailerData> trailers) {
        return null;
    }
}