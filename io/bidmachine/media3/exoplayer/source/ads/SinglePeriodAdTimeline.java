package io.bidmachine.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.AdPlaybackState;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.ForwardingTimeline;

@VisibleForTesting(otherwise = 3)
@UnstableApi
/* loaded from: classes9.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        boolean z;
        if (timeline.getPeriodCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }

    @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        this.timeline.getPeriod(i, period, z);
        long j = period.durationUs;
        if (j == -9223372036854775807L) {
            j = this.adPlaybackState.contentDurationUs;
        }
        period.set(period.f96659id, period.uid, period.windowIndex, j, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }
}
