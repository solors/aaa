package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

/* loaded from: classes4.dex */
public abstract class ForwardingTimeline extends Timeline {

    /* renamed from: f */
    protected final Timeline f34227f;

    public ForwardingTimeline(Timeline timeline) {
        this.f34227f = timeline;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z) {
        return this.f34227f.getFirstWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return this.f34227f.getIndexOfPeriod(obj);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z) {
        return this.f34227f.getLastWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int i, int i2, boolean z) {
        return this.f34227f.getNextWindowIndex(i, i2, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        return this.f34227f.getPeriod(i, period, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.f34227f.getPeriodCount();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        return this.f34227f.getPreviousWindowIndex(i, i2, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i) {
        return this.f34227f.getUidOfPeriod(i);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        return this.f34227f.getWindow(i, window, j);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.f34227f.getWindowCount();
    }
}
