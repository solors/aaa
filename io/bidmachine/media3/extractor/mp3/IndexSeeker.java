package io.bidmachine.media3.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.util.LongArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;

/* renamed from: io.bidmachine.media3.extractor.mp3.b */
/* loaded from: classes9.dex */
final class IndexSeeker implements Seeker {
    @VisibleForTesting
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final long dataEndPosition;
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public IndexSeeker(long j, long j2, long j3) {
        this.durationUs = j;
        this.dataEndPosition = j3;
        LongArray longArray = new LongArray();
        this.timesUs = longArray;
        LongArray longArray2 = new LongArray();
        this.positions = longArray2;
        longArray.add(0L);
        longArray2.add(j2);
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(binarySearchFloor), this.positions.get(binarySearchFloor));
        if (seekPoint.timeUs != j && binarySearchFloor != this.timesUs.size() - 1) {
            int i = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i), this.positions.get(i)));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker, io.bidmachine.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public boolean isTimeUsInIndex(long j) {
        LongArray longArray = this.timesUs;
        if (j - longArray.get(longArray.size() - 1) < MIN_TIME_BETWEEN_POINTS_US) {
            return true;
        }
        return false;
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.timesUs.add(j);
        this.positions.add(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDurationUs(long j) {
        this.durationUs = j;
    }
}
