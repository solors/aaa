package io.bidmachine.media3.exoplayer.dash.manifest;

import io.bidmachine.media3.exoplayer.dash.DashSegmentIndex;

/* renamed from: io.bidmachine.media3.exoplayer.dash.manifest.a */
/* loaded from: classes9.dex */
final class SingleSegmentIndex implements DashSegmentIndex {
    private final RangedUri uri;

    public SingleSegmentIndex(RangedUri rangedUri) {
        this.uri = rangedUri;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j2) {
        return 1L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return 1L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j) {
        return this.uri;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j2) {
        return j2;
    }
}
