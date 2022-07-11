package mx.com.pruebajobrappi.ui.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a8\u0006\f"}, d2 = {"Lmx/com/pruebajobrappi/ui/listener/FragmentCommunication;", "", "selectMovie", "", "poster", "Landroid/view/View;", "title", "ranking", "movie", "Lmx/com/pruebajobrappi/data/models/Movie;", "videoTrailer", "", "app_debug"})
public abstract interface FragmentCommunication {
    
    public abstract void selectMovie(@org.jetbrains.annotations.NotNull()
    android.view.View poster, @org.jetbrains.annotations.NotNull()
    android.view.View title, @org.jetbrains.annotations.NotNull()
    android.view.View ranking, @org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.models.Movie movie, @org.jetbrains.annotations.Nullable()
    java.lang.String videoTrailer);
}