package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class MlltSeeker implements Seeker {

    /* renamed from: a */
    private final long[] f33135a;

    /* renamed from: b */
    private final long[] f33136b;

    /* renamed from: c */
    private final long f33137c;

    private MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.f33135a = jArr;
        this.f33136b = jArr2;
        this.f33137c = j == -9223372036854775807L ? Util.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    private static Pair<Long, Long> m74566a(long j, long[] jArr, long[] jArr2) {
        double d;
        int binarySearchFloor = Util.binarySearchFloor(jArr, j, true, true);
        long j2 = jArr[binarySearchFloor];
        long j3 = jArr2[binarySearchFloor];
        int i = binarySearchFloor + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    public static MlltSeeker create(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.bytesDeviations.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i3];
            j3 += mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new MlltSeeker(jArr, jArr2, j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f33137c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        Pair<Long, Long> m74566a = m74566a(Util.usToMs(Util.constrainValue(j, 0L, this.f33137c)), this.f33136b, this.f33135a);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) m74566a.first).longValue()), ((Long) m74566a.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return Util.msToUs(((Long) m74566a(j, this.f33135a, this.f33136b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
