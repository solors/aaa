package io.bidmachine.media3.exoplayer;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.MediaSource;

/* renamed from: io.bidmachine.media3.exoplayer.p1 */
/* loaded from: classes9.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id */
    public final MediaSource.MediaPeriodId f97119id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        Assertions.checkArgument(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        Assertions.checkArgument(z6);
        if (!z || (!z2 && !z3 && !z4)) {
            z7 = true;
        }
        Assertions.checkArgument(z7);
        this.f97119id = mediaPeriodId;
        this.startPositionUs = j;
        this.requestedContentPositionUs = j2;
        this.endPositionUs = j3;
        this.durationUs = j4;
        this.isFollowedByTransitionToSameStream = z;
        this.isLastInTimelinePeriod = z2;
        this.isLastInTimelineWindow = z3;
        this.isFinal = z4;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
        if (j == this.requestedContentPositionUs) {
            return this;
        }
        return new MediaPeriodInfo(this.f97119id, this.startPositionUs, j, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j) {
        if (j == this.startPositionUs) {
            return this;
        }
        return new MediaPeriodInfo(this.f97119id, j, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
        if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Util.areEqual(this.f97119id, mediaPeriodInfo.f97119id)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f97119id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
