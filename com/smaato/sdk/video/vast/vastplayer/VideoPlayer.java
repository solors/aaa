package com.smaato.sdk.video.vast.vastplayer;

import android.net.Uri;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.inmobi.commons.core.configs.CrashConfig;
import com.smaato.sdk.video.vast.vastplayer.exception.VideoPlayerException;

/* loaded from: classes7.dex */
public interface VideoPlayer {

    /* loaded from: classes7.dex */
    public interface LifecycleListener {
        void onCompleted(@NonNull VideoPlayer videoPlayer);

        void onError(@NonNull VideoPlayer videoPlayer, @NonNull VideoPlayerException videoPlayerException);

        void onPaused(@NonNull VideoPlayer videoPlayer);

        void onReleased(@NonNull VideoPlayer videoPlayer);

        void onReset(@NonNull VideoPlayer videoPlayer);

        void onResumed(@NonNull VideoPlayer videoPlayer);

        void onSeekComplete(@NonNull VideoPlayer videoPlayer);

        void onStarted(@NonNull VideoPlayer videoPlayer);

        void onStopped(@NonNull VideoPlayer videoPlayer);
    }

    /* loaded from: classes7.dex */
    public interface OnVolumeChangeListener {
        void onVolumeChanged(float f);
    }

    /* loaded from: classes7.dex */
    public interface PrepareListener {
        void onError(@NonNull VideoPlayer videoPlayer, @NonNull VideoPlayerException videoPlayerException);

        void onInitialized(@NonNull VideoPlayer videoPlayer);

        void onPrepared(@NonNull VideoPlayer videoPlayer);

        void onPreparing(@NonNull VideoPlayer videoPlayer);
    }

    long getCurrentPositionMillis();

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    float getCurrentVolume();

    long getDuration();

    int getMediaHeight();

    int getMediaWidth();

    int getRingerMode();

    void isCompleted(boolean z);

    void pause();

    void prepare();

    void release();

    void reset();

    void seekTo(long j);

    void setDataSource(@NonNull Uri uri);

    void setDataSource(@NonNull String str);

    void setLifecycleListener(@Nullable LifecycleListener lifecycleListener);

    void setOnVolumeChangeListener(@Nullable OnVolumeChangeListener onVolumeChangeListener);

    void setPrepareListener(@Nullable PrepareListener prepareListener);

    void setSurface(@Nullable Surface surface);

    void setVolume(@FloatRange(from = 0.0d, m105511to = 1.0d) float f);

    void start();

    void stop();
}
