package com.pubmatic.sdk.video.player;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;

/* loaded from: classes7.dex */
public interface POBVideoPlayer {
    public static final int MAX_STALLING_TIMEOUT = 15000;
    public static final int MEDIA_FILE_TIMEOUT_ERROR = -1;
    public static final int RUNTIME_ERROR = -2;
    public static final SupportedMediaType[] SUPPORTED_MEDIA_TYPE = SupportedMediaType.values();

    /* loaded from: classes7.dex */
    public enum SupportedMediaType {
        MEDIA_3GPP("video/3gpp"),
        MEDIA_MP4("video/mp4"),
        MEDIA_WEBM("video/webm");
        

        /* renamed from: b */
        private final String f70965b;

        SupportedMediaType(String str) {
            this.f70965b = str;
        }

        @NonNull
        public static String[] getStringValues() {
            SupportedMediaType[] values = values();
            String[] strArr = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                strArr[i] = values[i].getValue();
            }
            return strArr;
        }

        public String getValue() {
            return this.f70965b;
        }
    }

    /* loaded from: classes7.dex */
    public enum VideoPlayerState {
        UNKNOWN,
        LOADED,
        PLAYING,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR
    }

    void destroy();

    @Nullable
    POBPlayerController getControllerView();

    int getMediaDuration();

    @NonNull
    VideoPlayerState getPlayerState();

    boolean isMute();

    void load(@NonNull String str);

    void mute();

    void pause();

    void play();

    void playOnMute(boolean z);

    void setAutoPlayOnForeground(boolean z);

    void setControllerView(@NonNull POBPlayerController pOBPlayerController, @NonNull FrameLayout.LayoutParams layoutParams);

    void setListener(@NonNull POBVideoPlayerView.POBVideoPlayerListener pOBVideoPlayerListener);

    void setPrepareTimeout(int i);

    void stop();

    void unMute();
}
