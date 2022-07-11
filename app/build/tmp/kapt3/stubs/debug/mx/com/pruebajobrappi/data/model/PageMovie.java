package mx.com.pruebajobrappi.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J6\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lmx/com/pruebajobrappi/data/model/PageMovie;", "", "page", "", "totalPage", "results", "", "Lmx/com/pruebajobrappi/data/models/MovieData;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResults", "()Ljava/util/List;", "getTotalPage", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lmx/com/pruebajobrappi/data/model/PageMovie;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PageMovie {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer totalPage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<mx.com.pruebajobrappi.data.models.MovieData> results = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<mx.com.pruebajobrappi.data.models.MovieData> getResults() {
        return null;
    }
    
    public PageMovie(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total_pages")
    java.lang.Integer totalPage, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "results")
    java.util.List<mx.com.pruebajobrappi.data.models.MovieData> results) {
        super();
    }
    
    public PageMovie() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<mx.com.pruebajobrappi.data.models.MovieData> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mx.com.pruebajobrappi.data.model.PageMovie copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total_pages")
    java.lang.Integer totalPage, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "results")
    java.util.List<mx.com.pruebajobrappi.data.models.MovieData> results) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}