package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class IndexSeeker implements Seeker {

    /* renamed from: a */
    private final long f33131a;

    /* renamed from: b */
    private final LongArray f33132b;

    /* renamed from: c */
    private final LongArray f33133c;

    /* renamed from: d */
    private long f33134d;

    public IndexSeeker(long j, long j2, long j3) {
        this.f33134d = j;
        this.f33131a = j3;
        LongArray longArray = new LongArray();
        this.f33132b = longArray;
        LongArray longArray2 = new LongArray();
        this.f33133c = longArray2;
        longArray.add(0L);
        longArray2.add(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m74567a(long j) {
        this.f33134d = j;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.f33131a;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f33134d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.f33132b, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f33132b.get(binarySearchFloor), this.f33133c.get(binarySearchFloor));
        if (seekPoint.timeUs != j && binarySearchFloor != this.f33132b.size() - 1) {
            int i = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.f33132b.get(i), this.f33133c.get(i)));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.f33132b.get(Util.binarySearchFloor(this.f33133c, j, true, true));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public boolean isTimeUsInIndex(long j) {
        LongArray longArray = this.f33132b;
        if (j - longArray.get(longArray.size() - 1) < 100000) {
            return true;
        }
        return false;
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.f33132b.add(j);
        this.f33133c.add(j2);
    }
}
