package mx.com.pruebajobrappi.utils.recyclerview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lmx/com/pruebajobrappi/utils/recyclerview/InfiniteScrollProvider;", "", "()V", "isLoading", "", "lastVisibleItem", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onLoadMoreListener", "Lmx/com/pruebajobrappi/utils/recyclerview/InfiniteScrollProvider$OnLoadMoreListener;", "previousItemCount", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "totalItemCount", "attach", "", "setInfiniteScrollGrid", "Companion", "OnLoadMoreListener", "app_debug"})
public final class InfiniteScrollProvider {
    
    /**
     * [RecyclerView] that we want to provide infinite scrolling behavior for it
     */
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    
    /**
     * used to determine currently user is waiting for loading items or not
     */
    private boolean isLoading = false;
    
    /**
     * listener that trigger when user reach end of list.
     */
    private mx.com.pruebajobrappi.utils.recyclerview.InfiniteScrollProvider.OnLoadMoreListener onLoadMoreListener;
    
    /**
     * [GridLayoutManager] that is attached to [.recyclerView]
     *
     *
     * used to determine [.lastVisibleItem],[.totalItemCount],[.previousItemCount]
     */
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    
    /**
     * position of last visible item
     */
    private int lastVisibleItem = 0;
    
    /**
     * total items count of [.recyclerView]
     */
    private int totalItemCount = 0;
    
    /**
     * total items count, relate to before last [.onLoadMoreListener] call.
     */
    private int previousItemCount = 0;
    
    /**
     * [.onLoadMoreListener] called when [.recyclerView] reach to item with position [.totalItemCount] - {@value THRESHOLD}
     */
    private static final int THRESHOLD = 3;
    public static final mx.com.pruebajobrappi.utils.recyclerview.InfiniteScrollProvider.Companion Companion = null;
    
    /**
     * this function attach [.recyclerView] to provide infinite scroll for it
     *
     * @param recyclerView       see [.recyclerView] for more information
     * @param onLoadMoreListener callback for notifying when user reach list ends.
     */
    public final void attach(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.utils.recyclerview.InfiniteScrollProvider.OnLoadMoreListener onLoadMoreListener) {
    }
    
    /**
     * this function get scrolling control of [.recyclerView] and whenever
     * user reached list ends, [.onLoadMoreListener] will be called
     */
    private final void setInfiniteScrollGrid(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
    }
    
    public InfiniteScrollProvider() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lmx/com/pruebajobrappi/utils/recyclerview/InfiniteScrollProvider$OnLoadMoreListener;", "", "onLoadMore", "", "app_debug"})
    public static abstract interface OnLoadMoreListener {
        
        public abstract void onLoadMore();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lmx/com/pruebajobrappi/utils/recyclerview/InfiniteScrollProvider$Companion;", "", "()V", "THRESHOLD", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}