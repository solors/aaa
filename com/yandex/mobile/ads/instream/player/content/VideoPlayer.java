package com.yandex.mobile.ads.instream.player.content;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface VideoPlayer {
    long getVideoDuration();

    long getVideoPosition();

    float getVolume();

    void pauseVideo();

    void prepareVideo();

    void resumeVideo();

    void setVideoPlayerListener(@Nullable VideoPlayerListener videoPlayerListener);
}
