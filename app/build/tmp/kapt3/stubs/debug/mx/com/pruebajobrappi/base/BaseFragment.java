package mx.com.pruebajobrappi.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0004J\b\u0010\u0016\u001a\u00020\u0015H&J(\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0013H&J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lmx/com/pruebajobrappi/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "isLandScape", "", "()Z", "isLandScape$delegate", "Lkotlin/Lazy;", "moviesAdapter", "Lmx/com/pruebajobrappi/ui/adapter/MoviesAdapter;", "getMoviesAdapter", "()Lmx/com/pruebajobrappi/ui/adapter/MoviesAdapter;", "moviesLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "getMoviesLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setMoviesLayoutManager", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "attachObservers", "", "getColumnsByOrientation", "", "getLayoutView", "getTrailerMovie", "poster", "Landroid/view/View;", "title", "ranking", "movie", "Lmx/com/pruebajobrappi/data/models/Movie;", "initView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy isLandScape$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final mx.com.pruebajobrappi.ui.adapter.MoviesAdapter moviesAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.GridLayoutManager moviesLayoutManager;
    public static final int RECYCLER_VIEW_SPAN_COUNT_PORTRAIT = 2;
    public static final int RECYCLER_VIEW_SPAN_COUNT_LANDSCAPE = 3;
    public static final int SPACE_ITEM_DECORATION = 12;
    public static final mx.com.pruebajobrappi.base.BaseFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getLayoutView();
    
    public abstract void initView();
    
    public abstract void attachObservers();
    
    public abstract void getTrailerMovie(@org.jetbrains.annotations.NotNull()
    android.view.View poster, @org.jetbrains.annotations.NotNull()
    android.view.View title, @org.jetbrains.annotations.NotNull()
    android.view.View ranking, @org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.models.Movie movie);
    
    public final boolean isLandScape() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final mx.com.pruebajobrappi.ui.adapter.MoviesAdapter getMoviesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.recyclerview.widget.GridLayoutManager getMoviesLayoutManager() {
        return null;
    }
    
    protected final void setMoviesLayoutManager(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.GridLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected final int getColumnsByOrientation(boolean isLandScape) {
        return 0;
    }
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lmx/com/pruebajobrappi/base/BaseFragment$Companion;", "", "()V", "RECYCLER_VIEW_SPAN_COUNT_LANDSCAPE", "", "RECYCLER_VIEW_SPAN_COUNT_PORTRAIT", "SPACE_ITEM_DECORATION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}