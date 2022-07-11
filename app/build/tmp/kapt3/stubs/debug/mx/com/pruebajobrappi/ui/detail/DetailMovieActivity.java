package mx.com.pruebajobrappi.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u001c\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0017H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lmx/com/pruebajobrappi/ui/detail/DetailMovieActivity;", "Lcom/google/android/youtube/player/YouTubeBaseActivity;", "Lcom/google/android/youtube/player/YouTubePlayer$OnInitializedListener;", "()V", "mKeyVideo", "", "getMKeyVideo", "()Ljava/lang/String;", "setMKeyVideo", "(Ljava/lang/String;)V", "mMovie", "Lmx/com/pruebajobrappi/data/models/Movie;", "getMMovie", "()Lmx/com/pruebajobrappi/data/models/Movie;", "setMMovie", "(Lmx/com/pruebajobrappi/data/models/Movie;)V", "mYouTubePlayerView", "Lcom/google/android/youtube/player/YouTubePlayerView;", "getMYouTubePlayerView", "()Lcom/google/android/youtube/player/YouTubePlayerView;", "setMYouTubePlayerView", "(Lcom/google/android/youtube/player/YouTubePlayerView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onInitializationFailure", "provider", "Lcom/google/android/youtube/player/YouTubePlayer$Provider;", "youTubeInitializationResult", "Lcom/google/android/youtube/player/YouTubeInitializationResult;", "onInitializationSuccess", "youTubePlayer", "Lcom/google/android/youtube/player/YouTubePlayer;", "wasRestored", "", "setUpMovieData", "app_debug"})
public final class DetailMovieActivity extends com.google.android.youtube.player.YouTubeBaseActivity implements com.google.android.youtube.player.YouTubePlayer.OnInitializedListener {
    @org.jetbrains.annotations.Nullable()
    private mx.com.pruebajobrappi.data.models.Movie mMovie;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.youtube.player.YouTubePlayerView mYouTubePlayerView;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String mKeyVideo;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final mx.com.pruebajobrappi.data.models.Movie getMMovie() {
        return null;
    }
    
    public final void setMMovie(@org.jetbrains.annotations.Nullable()
    mx.com.pruebajobrappi.data.models.Movie p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.youtube.player.YouTubePlayerView getMYouTubePlayerView() {
        return null;
    }
    
    public final void setMYouTubePlayerView(@org.jetbrains.annotations.NotNull()
    com.google.android.youtube.player.YouTubePlayerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMKeyVideo() {
        return null;
    }
    
    public final void setMKeyVideo(@org.jetbrains.annotations.NotNull()
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
    
    public DetailMovieActivity() {
        super();
    }
}