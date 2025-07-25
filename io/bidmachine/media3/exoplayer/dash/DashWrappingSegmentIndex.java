package io.bidmachine.media3.exoplayer.dash;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.dash.manifest.RangedUri;
import io.bidmachine.media3.extractor.ChunkIndex;

@UnstableApi
/* loaded from: classes9.dex */
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j) {
        this.chunkIndex = chunkIndex;
        this.timeOffsetUs = j;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j2) {
        return this.chunkIndex.length;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j2) {
        return this.chunkIndex.durationsUs[(int) j];
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
        return this.chunkIndex.length;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j2) {
        return this.chunkIndex.getChunkIndex(j + this.timeOffsetUs);
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j) {
        ChunkIndex chunkIndex = this.chunkIndex;
        int i = (int) j;
        return new RangedUri(null, chunkIndex.offsets[i], chunkIndex.sizes[i]);
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return this.chunkIndex.timesUs[(int) j] - this.timeOffsetUs;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }
}
