package mx.com.pruebajobrappi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lmx/com/pruebajobrappi/data/repository/PopularRepository;", "Lmx/com/pruebajobrappi/data/repository/BaseRepository;", "getPopularDB", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularNetwork", "getVideTrailerNetwork", "", "idMovie", "app_debug"})
public abstract interface PopularRepository extends mx.com.pruebajobrappi.data.repository.BaseRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularDB(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularNetwork(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideTrailerNetwork(int idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.List<mx.com.pruebajobrappi.data.models.Movie> sortMovies(mx.com.pruebajobrappi.data.repository.PopularRepository $this, @org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.MovieData> movies) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public static java.lang.String getLastVideoTrailer(mx.com.pruebajobrappi.data.repository.PopularRepository $this, @org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.VideoTrailerData> trailers) {
            return null;
        }
    }
}