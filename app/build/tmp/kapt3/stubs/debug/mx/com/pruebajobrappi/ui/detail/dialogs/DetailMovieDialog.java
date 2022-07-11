package mx.com.pruebajobrappi.ui.detail.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u001c\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J$\u0010.\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020&H\u0002R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00064"}, d2 = {"Lmx/com/pruebajobrappi/ui/detail/dialogs/DetailMovieDialog;", "Landroid/app/Dialog;", "Lcom/google/android/youtube/player/YouTubePlayer$OnInitializedListener;", "activity", "Landroid/app/Activity;", "movie", "Lmx/com/pruebajobrappi/data/models/Movie;", "keyVideo", "", "(Landroid/app/Activity;Lmx/com/pruebajobrappi/data/models/Movie;Ljava/lang/String;)V", "mActivity", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "(Landroid/app/Activity;)V", "mKeyVideo", "getMKeyVideo", "()Ljava/lang/String;", "setMKeyVideo", "(Ljava/lang/String;)V", "mMovie", "getMMovie", "()Lmx/com/pruebajobrappi/data/models/Movie;", "setMMovie", "(Lmx/com/pruebajobrappi/data/models/Movie;)V", "mTransaction", "Landroid/app/FragmentTransaction;", "getMTransaction", "()Landroid/app/FragmentTransaction;", "setMTransaction", "(Landroid/app/FragmentTransaction;)V", "mYouTubePlayerFragment", "Lcom/google/android/youtube/player/YouTubePlayerFragment;", "getMYouTubePlayerFragment", "()Lcom/google/android/youtube/player/YouTubePlayerFragment;", "setMYouTubePlayerFragment", "(Lcom/google/android/youtube/player/YouTubePlayerFragment;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onInitializationFailure", "provider", "Lcom/google/android/youtube/player/YouTubePlayer$Provider;", "youTubeInitializationResult", "Lcom/google/android/youtube/player/YouTubeInitializationResult;", "onInitializationSuccess", "youTubePlayer", "Lcom/google/android/youtube/player/YouTubePlayer;", "wasRestored", "", "setUpMovieData", "app_debug"})
public final class DetailMovieDialog extends android.app.Dialog implements com.google.android.youtube.player.YouTubePlayer.OnInitializedListener {
    @org.jetbrains.annotations.NotNull()
    private mx.com.pruebajobrappi.data.models.Movie mMovie;
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity mActivity;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.youtube.player.YouTubePlayerFragment mYouTubePlayerFragment;
    @org.jetbrains.annotations.NotNull()
    public android.app.FragmentTransaction mTransaction;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mKeyVideo;
    
    @org.jetbrains.annotations.NotNull()
    public final mx.com.pruebajobrappi.data.models.Movie getMMovie() {
        return null;
    }
    
    public final void setMMovie(@org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.models.Movie p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getMActivity() {
        return null;
    }
    
    public final void setMActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.youtube.player.YouTubePlayerFragment getMYouTubePlayerFragment() {
        return null;
    }
    
    public final void setMYouTubePlayerFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.youtube.player.YouTubePlayerFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.FragmentTransaction getMTransaction() {
        return null;
    }
    
    public final void setMTransaction(@org.jetbrains.annotations.NotNull()
    android.app.FragmentTransaction p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMKeyVideo() {
        return null;
    }
    
    public final void setMKeyVideo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpMovieData() {
    }
    
    @java.lang.Override()
    public void onInitializationSuccess(@org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubePlayer.Provider provider, @org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubePlayer youTubePlayer, boolean wasRestored) {
    }
    
    @java.lang.Override()
    public void onInitializationFailure(@org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubePlayer.Provider provider, @org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubeInitializationResult youTubeInitializationResult) {
    }
    
    public DetailMovieDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    mx.com.pruebajobrappi.data.models.Movie movie, @org.jetbrains.annotations.Nullable()
    java.lang.String keyVideo) {
        super(null);
    }
}