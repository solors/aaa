package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;

/* loaded from: classes6.dex */
final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id */
    public final MediaSource.MediaPeriodId f58741id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f58741id = mediaPeriodId;
        this.startPositionUs = j;
        this.endPositionUs = j2;
        this.contentPositionUs = j3;
        this.durationUs = j4;
        this.isLastInTimelinePeriod = z;
        this.isFinal = z2;
    }

    public final MediaPeriodInfo copyWithPeriodIndex(int i) {
        return new MediaPeriodInfo(this.f58741id.copyWithPeriodIndex(i), this.startPositionUs, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public final MediaPeriodInfo copyWithStartPositionUs(long j) {
        return new MediaPeriodInfo(this.f58741id, j, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }
}
