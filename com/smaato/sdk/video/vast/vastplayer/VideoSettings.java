package com.smaato.sdk.video.vast.vastplayer;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.VideoAdViewProperties;

/* loaded from: classes7.dex */
public final class VideoSettings {
    public final int closeButtonSize;
    public final boolean isVideoClickable;
    public final boolean isVideoSkippable;
    public final boolean isVideoSoundOn;
    public final long skipOffsetMillis;
    public long videoDurationMillis;

    private VideoSettings(long j, long j2, boolean z, boolean z2, boolean z3, int i) {
        this.videoDurationMillis = j;
        this.skipOffsetMillis = j2;
        this.isVideoSkippable = z;
        this.isVideoClickable = z2;
        this.isVideoSoundOn = z3;
        this.closeButtonSize = i;
    }

    @NonNull
    public static VideoSettings create(long j, VideoAdViewProperties videoAdViewProperties) {
        return new VideoSettings(j, videoAdViewProperties.skipInterval(), videoAdViewProperties.isSkippable(), videoAdViewProperties.isClickable(), videoAdViewProperties.isSoundOn(), videoAdViewProperties.closeButtonSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateVideoDurationMillis(long j) {
        this.videoDurationMillis = j;
    }
}
