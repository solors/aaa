package com.google.android.exoplayer2.source.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;

@VisibleForTesting(otherwise = 3)
/* loaded from: classes4.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {

    /* renamed from: g */
    private final AdPlaybackState f34551g;

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
        this.f34551g = adPlaybackState;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        this.f34227f.getPeriod(i, period, z);
        long j = period.durationUs;
        if (j == -9223372036854775807L) {
            j = this.f34551g.contentDurationUs;
        }
        period.set(period.f32005id, period.uid, period.windowIndex, j, period.getPositionInWindowUs(), this.f34551g, period.isPlaceholder);
        return period;
    }
}
