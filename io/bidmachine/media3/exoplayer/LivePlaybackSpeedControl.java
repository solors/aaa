package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j, long j2);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j);
}
