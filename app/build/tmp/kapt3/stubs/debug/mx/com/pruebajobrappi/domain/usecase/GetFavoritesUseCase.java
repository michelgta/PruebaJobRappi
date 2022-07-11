package mx.com.pruebajobrappi.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lmx/com/pruebajobrappi/domain/usecase/GetFavoritesUseCase;", "Lmx/com/pruebajobrappi/base/BaseUseCase;", "getFavorites", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideTrailerNetwork", "", "idMovie", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GetFavoritesUseCase extends mx.com.pruebajobrappi.base.BaseUseCase {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mx.com.pruebajobrappi.data.models.Movie>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideTrailerNetwork(int idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
}