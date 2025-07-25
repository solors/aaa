package com.mobilefuse.videoplayer.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.FrameLayout;
import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseMediaPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFusePlayer extends FrameLayout {
    private final MediaPlayer mediaPlayer;
    @Nullable
    private Functions<Unit> playbackCompletionListener;
    @NotNull
    private MobileFuseMediaPlayer playerState;
    @Nullable
    private Function1<? super MobileFuseMediaPlayer, Unit> playerStateChangeListener;
    private VideoViewInterface videoView;
    @NotNull
    private ViewType viewType;
    private float volume;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFusePlayer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playerState = MobileFuseMediaPlayer.IDLE;
        this.mediaPlayer = new MediaPlayer();
        this.viewType = ViewType.SURFACE_VIEW;
        this.volume = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.mobilefuse.videoplayer.media.MobileFuseVideoSurfaceView] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.mobilefuse.videoplayer.media.MobileFusePlayer, android.view.View, android.view.ViewGroup] */
    private final void applyViewType() {
        MobileFuseVideoTextureView mobileFuseVideoTextureView;
        if (!getCanPlay() && !getCanPause()) {
            return;
        }
        VideoViewInterface videoViewInterface = this.videoView;
        if (videoViewInterface != null) {
            this.mediaPlayer.setDisplay(null);
            this.mediaPlayer.setSurface(null);
            videoViewInterface.destroy();
            removeView((View) videoViewInterface);
            this.videoView = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        if (this.viewType == ViewType.SURFACE_VIEW) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            mobileFuseVideoTextureView = new MobileFuseVideoSurfaceView(context, this.mediaPlayer);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            mobileFuseVideoTextureView = new MobileFuseVideoTextureView(context2, this.mediaPlayer);
        }
        this.videoView = mobileFuseVideoTextureView;
        addView(mobileFuseVideoTextureView, layoutParams);
    }

    public final boolean changePlayerState(MobileFuseMediaPlayer mobileFuseMediaPlayer) {
        if (mobileFuseMediaPlayer == this.playerState) {
            return false;
        }
        Debugging.logDebug$default(this, "Changed Player state from " + this.playerState + " to " + mobileFuseMediaPlayer, null, 2, null);
        this.playerState = mobileFuseMediaPlayer;
        Function1<? super MobileFuseMediaPlayer, Unit> function1 = this.playerStateChangeListener;
        if (function1 != null) {
            function1.invoke(mobileFuseMediaPlayer);
            return true;
        }
        return true;
    }

    public final void onMediaPlayerPrepared() {
        if (!changePlayerState(MobileFuseMediaPlayer.PREPARED)) {
            return;
        }
        applyViewType();
    }

    public static /* synthetic */ void prepare$default(MobileFusePlayer mobileFusePlayer, String str, ViewType viewType, Functions functions, int i, Object obj) {
        if ((i & 2) != 0) {
            viewType = ViewType.SURFACE_VIEW;
        }
        mobileFusePlayer.prepare(str, viewType, functions);
    }

    public final void destroy() {
        try {
            if (!changePlayerState(MobileFuseMediaPlayer.DESTROYED)) {
                return;
            }
            this.mediaPlayer.reset();
            this.mediaPlayer.release();
            VideoViewInterface videoViewInterface = this.videoView;
            if (videoViewInterface != null) {
                videoViewInterface.destroy();
                removeView((View) videoViewInterface);
                this.videoView = null;
            }
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    public final boolean getCanApplyFullscreen() {
        if (!getCanPlay() && !getCanPause()) {
            return false;
        }
        return true;
    }

    public final boolean getCanPause() {
        MobileFuseMediaPlayer mobileFuseMediaPlayer = this.playerState;
        if (mobileFuseMediaPlayer != MobileFuseMediaPlayer.PREPARED && mobileFuseMediaPlayer != MobileFuseMediaPlayer.PLAYING) {
            return false;
        }
        return true;
    }

    public final boolean getCanPlay() {
        MobileFuseMediaPlayer mobileFuseMediaPlayer = this.playerState;
        if (mobileFuseMediaPlayer != MobileFuseMediaPlayer.PREPARED && mobileFuseMediaPlayer != MobileFuseMediaPlayer.PAUSED) {
            return false;
        }
        return true;
    }

    public final int getCurrentPosition() {
        try {
            return this.mediaPlayer.getCurrentPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final int getDuration() {
        try {
            return this.mediaPlayer.getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Nullable
    public final Functions<Unit> getPlaybackCompletionListener() {
        return this.playbackCompletionListener;
    }

    @NotNull
    public final MobileFuseMediaPlayer getPlayerState() {
        return this.playerState;
    }

    @Nullable
    public final Function1<MobileFuseMediaPlayer, Unit> getPlayerStateChangeListener() {
        return this.playerStateChangeListener;
    }

    @NotNull
    public final ViewType getViewType() {
        return this.viewType;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final boolean isDestroyed() {
        if (this.playerState == MobileFuseMediaPlayer.DESTROYED) {
            return true;
        }
        return false;
    }

    public final void pause() {
        if (!getCanPause()) {
            return;
        }
        this.mediaPlayer.pause();
        changePlayerState(MobileFuseMediaPlayer.PAUSED);
    }

    public final void play() {
        if (!getCanPlay()) {
            return;
        }
        this.mediaPlayer.start();
        changePlayerState(MobileFuseMediaPlayer.PLAYING);
    }

    public final void prepare(@NotNull String uri, @NotNull ViewType viewType, @NotNull final Functions<Unit> prepareCompletedAction) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(prepareCompletedAction, "prepareCompletedAction");
        if (!changePlayerState(MobileFuseMediaPlayer.PREPARING)) {
            return;
        }
        setViewType(viewType);
        try {
            this.mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).setUsage(1).build());
            this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$1
                {
                    MobileFusePlayer.this = this;
                }

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    boolean changePlayerState;
                    Debugging.logDebug$default(MobileFusePlayer.this, "MediaPlayer onError", null, 2, null);
                    changePlayerState = MobileFusePlayer.this.changePlayerState(MobileFuseMediaPlayer.ERROR);
                    return changePlayerState;
                }
            });
            this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$2
                {
                    MobileFusePlayer.this = this;
                }

                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    MobileFusePlayer.this.changePlayerState(MobileFuseMediaPlayer.COMPLETED);
                    Functions<Unit> playbackCompletionListener = MobileFusePlayer.this.getPlaybackCompletionListener();
                    if (playbackCompletionListener != null) {
                        playbackCompletionListener.invoke();
                    }
                }
            });
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$3
                {
                    MobileFusePlayer.this = this;
                }

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    if (!MobileFusePlayer.this.isDestroyed()) {
                        MobileFusePlayer.this.onMediaPlayerPrepared();
                        prepareCompletedAction.invoke();
                    }
                }
            });
            this.mediaPlayer.setScreenOnWhilePlaying(true);
            this.mediaPlayer.setDataSource(uri);
            this.mediaPlayer.prepareAsync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setPlaybackCompletionListener(@Nullable Functions<Unit> functions) {
        this.playbackCompletionListener = functions;
    }

    public final void setPlayerStateChangeListener(@Nullable Function1<? super MobileFuseMediaPlayer, Unit> function1) {
        this.playerStateChangeListener = function1;
    }

    public final void setViewType(@NotNull ViewType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.viewType == value) {
            return;
        }
        this.viewType = value;
        applyViewType();
    }

    public final void setVolume(float f) {
        try {
            this.volume = f;
            this.mediaPlayer.setVolume(f, f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void getViewType$annotations() {
    }
}
