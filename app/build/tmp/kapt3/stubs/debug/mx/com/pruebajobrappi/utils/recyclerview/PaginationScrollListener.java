package mx.com.pruebajobrappi.utils.recyclerview;

import java.lang.System;

/**
 * Pagination class to add more items to the list when reach the last item.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lmx/com/pruebajobrappi/utils/recyclerview/PaginationScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V", "getLayoutManager", "()Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "setLayoutManager", "pastVisibleItems", "", "getPastVisibleItems", "()I", "setPastVisibleItems", "(I)V", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "isLoading", "", "loadMoreItems", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "app_debug"})
public abstract class PaginationScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private int pastVisibleItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager;
    
    public abstract boolean isLoading();
    
    public final int getPastVisibleItems() {
        return 0;
    }
    
    public final void setPastVisibleItems(int p0) {
    }
    
    public final int getVisibleItemCount() {
        return 0;
    }
    
    public final void setVisibleItemCount(int p0) {
    }
    
    public final int getTotalItemCount() {
        return 0;
    }
    
    public final void setTotalItemCount(int p0) {
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    public abstract void loadMoreItems();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.StaggeredGridLayoutManager p0) {
    }
    
    public PaginationScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager) {
        super();
    }
}