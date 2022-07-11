package mx.com.pruebajobrappi.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001aA\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u0011H\b\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\r\u001aA\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00112!\u0010\f\u001a\u001d\u0012\u0013\u0012\u0011H\b\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\r\u001a\"\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0004\u00a8\u0006\u001c"}, d2 = {"loadImageUrl", "", "Landroid/app/Activity;", "image", "Landroid/widget/ImageView;", "url", "", "observe", "T", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Landroidx/lifecycle/LiveData;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "Landroidx/lifecycle/MutableLiveData;", "showAlert", "Landroidx/appcompat/app/AlertDialog;", "Landroidx/fragment/app/Fragment;", "message", "", "listener", "Lkotlin/Function0;", "startEnterTransitionAfterLoadingImage", "imageAddress", "imageView", "app_debug"})
public final class FragmentExtensionsKt {
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final void startEnterTransitionAfterLoadingImage(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$startEnterTransitionAfterLoadingImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageAddress, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    public static final void loadImageUrl(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$loadImageUrl, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView image, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.appcompat.app.AlertDialog showAlert(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$showAlert, @androidx.annotation.StringRes()
    int message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        return null;
    }
}