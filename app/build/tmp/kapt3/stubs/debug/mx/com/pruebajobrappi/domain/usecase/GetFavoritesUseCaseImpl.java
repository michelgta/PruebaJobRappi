package mx.com.pruebajobrappi.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lmx/com/pruebajobrappi/domain/usecase/GetFavoritesUseCaseImpl;", "Lmx/com/pruebajobrappi/domain/usecase/GetFavoritesUseCase;", "favoriteRepository", "Lmx/com/pruebajobrappi/data/repository/FavoriteRepository;", "(Lmx/com/pruebajobrappi/data/repository/FavoriteRepository;)V", "getFavorites", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideTrailerNetwork", "", "idMovie", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteState", "", "id", "", "isFavorite", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetFavoritesUseCaseImpl implements mx.com.pruebajobrappi.domain.usecase.GetFavoritesUseCase {
    private final mx.com.pruebajobrappi.data.repository.FavoriteRepository favoriteRepository = null;
    
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
    
    public GetFavoritesUseCaseImpl(@org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.repository.FavoriteRepository favoriteRepository) {
        super();
    }
}