package mx.com.pruebajobrappi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lmx/com/pruebajobrappi/data/repository/PopularRepositoryImpl;", "Lmx/com/pruebajobrappi/data/repository/PopularRepository;", "movieEndpoints", "Lmx/com/pruebajobrappi/data/remote/MovieEndpoints;", "moviesDao", "Lmx/com/pruebajobrappi/data/local/MoviesDao;", "(Lmx/com/pruebajobrappi/data/remote/MovieEndpoints;Lmx/com/pruebajobrappi/data/local/MoviesDao;)V", "getPopularDB", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularNetwork", "getVideTrailerNetwork", "", "idMovie", "saveOnDataBase", "", "pageMovie", "Lmx/com/pruebajobrappi/data/model/PageMovie;", "(Lmx/com/pruebajobrappi/data/model/PageMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PopularRepositoryImpl implements mx.com.pruebajobrappi.data.repository.PopularRepository {
    private final mx.com.pruebajobrappi.data.remote.MovieEndpoints movieEndpoints = null;
    private final mx.com.pruebajobrappi.data.local.MoviesDao moviesDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularDB(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularNetwork(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getVideTrailerNetwork(int idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    public PopularRepositoryImpl(@org.jetbrains.annotations.NotNull()
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