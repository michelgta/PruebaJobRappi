package mx.com.pruebajobrappi.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\t\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\t\u001a\u001e\u0010\u000f\u001a\u00020\u0001*\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t\u001a\u001e\u0010\u000f\u001a\u00020\u0001*\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\n2\u0006\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\t\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0013"}, d2 = {"gone", "", "Landroid/view/View;", "invisible", "longToast", "Landroid/content/Context;", "any", "", "stringRes", "", "Landroidx/fragment/app/Fragment;", "snack", "message", "Landroidx/fragment/app/FragmentActivity;", "duration", "toast", "resString", "", "visible", "app_debug"})
public final class ViewExtensionsKt {
    
    public static final void visible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$visible) {
    }
    
    public static final void invisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$invisible) {
    }
    
    public static final void gone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$gone) {
    }
    
    public static final void snack(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$snack, @androidx.annotation.StringRes()
    int message, int duration) {
    }
    
    public static final void snack(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$snack, @androidx.annotation.StringRes()
    int message) {
    }
    
    /**
     * Default short toast
     */
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.Object any, int duration) {
    }
    
    /**
     * Default short toast
     */
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @androidx.annotation.StringRes()
    int resString, int duration) {
    }
    
    /**
     * Long duration toast
     */
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$longToast, @org.jetbrains.annotations.NotNull()
    java.lang.Object any) {
    }
    
    /**
     * Long duration toast
     */
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$longToast, @androidx.annotation.StringRes()
    int stringRes) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @androidx.annotation.StringRes()
    int resString, int duration) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$longToast, @androidx.annotation.StringRes()
    int stringRes) {
    }
}