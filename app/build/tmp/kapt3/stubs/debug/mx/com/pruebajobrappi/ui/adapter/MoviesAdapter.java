package mx.com.pruebajobrappi.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J,\u0010\u0019\u001a\u00020\n2$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\bJ\u001a\u0010\u001a\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\fJ\u0014\u0010\u001b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR.\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lmx/com/pruebajobrappi/ui/adapter/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmx/com/pruebajobrappi/ui/adapter/MoviesAdapter$ViewHolder;", "movies", "", "Lmx/com/pruebajobrappi/data/models/Movie;", "(Ljava/util/List;)V", "listener", "Lkotlin/Function4;", "Landroid/view/View;", "", "update", "Lkotlin/Function1;", "addNewMovies", "newMovies", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemClickListener", "setUpdateListener", "updateMovies", "ViewHolder", "app_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<mx.com.pruebajobrappi.ui.adapter.MoviesAdapter.ViewHolder> {
    private kotlin.jvm.functions.Function1<? super mx.com.pruebajobrappi.data.models.Movie, kotlin.Unit> update;
    private kotlin.jvm.functions.Function4<? super android.view.View, ? super android.view.View, ? super android.view.View, ? super mx.com.pruebajobrappi.data.models.Movie, kotlin.Unit> listener;
    private final java.util.List<mx.com.pruebajobrappi.data.models.Movie> movies = null;
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super android.view.View, ? super android.view.View, ? super android.view.View, ? super mx.com.pruebajobrappi.data.models.Movie, kotlin.Unit> listener) {
    }
    
    public final void setUpdateListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super mx.com.pruebajobrappi.data.models.Movie, kotlin.Unit> listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public mx.com.pruebajobrappi.ui.adapter.MoviesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addNewMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.Movie> newMovies) {
    }
    
    public final void updateMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.Movie> newMovies) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.ui.adapter.MoviesAdapter.ViewHolder holder, int position) {
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<mx.com.pruebajobrappi.data.models.Movie> movies) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lmx/com/pruebajobrappi/ui/adapter/MoviesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lmx/com/pruebajobrappi/databinding/ItemPopularMovieBinding;", "(Lmx/com/pruebajobrappi/ui/adapter/MoviesAdapter;Lmx/com/pruebajobrappi/databinding/ItemPopularMovieBinding;)V", "getBinding", "()Lmx/com/pruebajobrappi/databinding/ItemPopularMovieBinding;", "bindData", "", "movie", "Lmx/com/pruebajobrappi/data/models/Movie;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final mx.com.pruebajobrappi.databinding.ItemPopularMovieBinding binding = null;
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        mx.com.pruebajobrappi.data.models.Movie movie) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mx.com.pruebajobrappi.databinding.ItemPopularMovieBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        mx.com.pruebajobrappi.databinding.ItemPopularMovieBinding binding) {
            super(null);
        }
    }
}