package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class XingSeeker implements Seeker {

    /* renamed from: a */
    private final long f33163a;

    /* renamed from: b */
    private final int f33164b;

    /* renamed from: c */
    private final long f33165c;

    /* renamed from: d */
    private final long f33166d;

    /* renamed from: e */
    private final long f33167e;
    @Nullable

    /* renamed from: f */
    private final long[] f33168f;

    private XingSeeker(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    /* renamed from: a */
    private long m74548a(int i) {
        return (this.f33165c * i) / 100;
    }

    @Nullable
    public static XingSeeker create(long j, long j2, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt;
        int i = header.samplesPerFrame;
        int i2 = header.sampleRate;
        int readInt = parsableByteArray.readInt();
        if ((readInt & 1) == 1 && (readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) != 0) {
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedIntToInt, i * 1000000, i2);
            if ((readInt & 6) != 6) {
                return new XingSeeker(j2, header.frameSize, scaleLargeTimestamp);
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            long[] jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = parsableByteArray.readUnsignedByte();
            }
            if (j != -1) {
                long j3 = j2 + readUnsignedInt;
                if (j != j3) {
                    Log.m72602w("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
                }
            }
            return new XingSeeker(j2, header.frameSize, scaleLargeTimestamp, readUnsignedInt, jArr);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.f33167e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f33165c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        double d;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.f33163a + this.f33164b));
        }
        long constrainValue = Util.constrainValue(j, 0L, this.f33165c);
        double d2 = (constrainValue * 100.0d) / this.f33165c;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) Assertions.checkStateNotNull(this.f33168f);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.f33163a + Util.constrainValue(Math.round((d3 / 256.0d) * this.f33166d), this.f33164b, this.f33166d - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        long j2;
        double d;
        long j3 = j - this.f33163a;
        if (isSeekable() && j3 > this.f33164b) {
            long[] jArr = (long[]) Assertions.checkStateNotNull(this.f33168f);
            double d2 = (j3 * 256.0d) / this.f33166d;
            int binarySearchFloor = Util.binarySearchFloor(jArr, (long) d2, true, true);
            long m74548a = m74548a(binarySearchFloor);
            long j4 = jArr[binarySearchFloor];
            int i = binarySearchFloor + 1;
            long m74548a2 = m74548a(i);
            if (binarySearchFloor == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j4 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j4) / (j2 - j4);
            }
            return m74548a + Math.round(d * (m74548a2 - m74548a));
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        if (this.f33168f != null) {
            return true;
        }
        return false;
    }

    private XingSeeker(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f33163a = j;
        this.f33164b = i;
        this.f33165c = j2;
        this.f33168f = jArr;
        this.f33166d = j3;
        this.f33167e = j3 != -1 ? j + j3 : -1L;
    }
}
