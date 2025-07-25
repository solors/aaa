package com.pubmatic.sdk.video.player;

import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface POBPlayer {
    public static final int MEDIA_DISPLAY_ERROR = -108;
    public static final int MEDIA_FILE_TIMEOUT_ERROR = -1;
    public static final double PROGRESS_UPDATE_DELAY = 0.5d;

    @MainThread
    /* loaded from: classes7.dex */
    public interface POBPlayerListener {
        void onBufferUpdate(int i);

        void onCompletion();

        void onFailure(int i, @NonNull String str);

        void onPause();

        void onPrepared();

        void onProgressUpdate(int i);

        void onResume();

        void onStart();

        void onStop();
    }

    void destroy();

    int getDuration();

    int getVideoHeight();

    int getVideoWidth();

    void onSurfaceCreated(@NonNull Surface surface);

    void onSurfaceDestroyed(@NonNull Surface surface);

    void pause();

    void setPlayerListener(@NonNull POBPlayerListener pOBPlayerListener);

    void setPrepareTimeout(int i);

    void setStallTimeout(int i);

    void setVolume(int i, int i2);

    void start();

    void stop();
}
