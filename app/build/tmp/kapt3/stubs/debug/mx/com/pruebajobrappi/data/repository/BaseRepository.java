package mx.com.pruebajobrappi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0016\u00a8\u0006\f"}, d2 = {"Lmx/com/pruebajobrappi/data/repository/BaseRepository;", "", "getLastVideoTrailer", "", "trailers", "", "Lmx/com/pruebajobrappi/data/models/VideoTrailerData;", "sortMovies", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "movies", "Lmx/com/pruebajobrappi/data/models/MovieData;", "app_debug"})
public abstract interface BaseRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<mx.com.pruebajobrappi.data.models.Movie> sortMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.MovieData> movies);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getLastVideoTrailer(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.VideoTrailerData> trailers);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<mx.com.pruebajobrappi.data.models.Movie> sortMovies(mx.com.pruebajobrappi.data.repository.BaseRepository $this, @org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.MovieData> movies) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.String getLastVideoTrailer(mx.com.pruebajobrappi.data.repository.BaseRepository $this, @org.jetbrains.annotations.NotNull()
        java.util.List<mx.com.pruebajobrappi.data.models.VideoTrailerData> trailers) {
            return null;
        }
    }
}