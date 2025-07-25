package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class WavSeekMap implements SeekMap {

    /* renamed from: a */
    private final WavFormat f33689a;

    /* renamed from: b */
    private final int f33690b;

    /* renamed from: c */
    private final long f33691c;

    /* renamed from: d */
    private final long f33692d;

    /* renamed from: e */
    private final long f33693e;

    public WavSeekMap(WavFormat wavFormat, int i, long j, long j2) {
        this.f33689a = wavFormat;
        this.f33690b = i;
        this.f33691c = j;
        long j3 = (j2 - j) / wavFormat.blockSize;
        this.f33692d = j3;
        this.f33693e = m74262a(j3);
    }

    /* renamed from: a */
    private long m74262a(long j) {
        return Util.scaleLargeTimestamp(j * this.f33690b, 1000000L, this.f33689a.frameRateHz);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f33693e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        long constrainValue = Util.constrainValue((this.f33689a.frameRateHz * j) / (this.f33690b * 1000000), 0L, this.f33692d - 1);
        long j2 = this.f33691c + (this.f33689a.blockSize * constrainValue);
        long m74262a = m74262a(constrainValue);
        SeekPoint seekPoint = new SeekPoint(m74262a, j2);
        if (m74262a < j && constrainValue != this.f33692d - 1) {
            long j3 = constrainValue + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(m74262a(j3), this.f33691c + (this.f33689a.blockSize * j3)));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
