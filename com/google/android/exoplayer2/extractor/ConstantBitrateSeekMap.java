package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;

/* loaded from: classes4.dex */
public class ConstantBitrateSeekMap implements SeekMap {

    /* renamed from: a */
    private final long f32881a;

    /* renamed from: b */
    private final long f32882b;

    /* renamed from: c */
    private final int f32883c;

    /* renamed from: d */
    private final long f32884d;

    /* renamed from: e */
    private final int f32885e;

    /* renamed from: f */
    private final long f32886f;

    /* renamed from: g */
    private final boolean f32887g;

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, false);
    }

    /* renamed from: a */
    private long m74736a(long j) {
        int i = this.f32883c;
        long j2 = (((j * this.f32885e) / 8000000) / i) * i;
        long j3 = this.f32884d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - i);
        }
        return this.f32882b + Math.max(j2, 0L);
    }

    /* renamed from: b */
    private static long m74735b(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f32886f;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.f32884d == -1 && !this.f32887g) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.f32882b));
        }
        long m74736a = m74736a(j);
        long timeUsAtPosition = getTimeUsAtPosition(m74736a);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, m74736a);
        if (this.f32884d != -1 && timeUsAtPosition < j) {
            int i = this.f32883c;
            if (i + m74736a < this.f32881a) {
                long j2 = m74736a + i;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j2), j2));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUsAtPosition(long j) {
        return m74735b(j, this.f32882b, this.f32885e);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        if (this.f32884d == -1 && !this.f32887g) {
            return false;
        }
        return true;
    }

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2, boolean z) {
        this.f32881a = j;
        this.f32882b = j2;
        this.f32883c = i2 == -1 ? 1 : i2;
        this.f32885e = i;
        this.f32887g = z;
        if (j == -1) {
            this.f32884d = -1L;
            this.f32886f = -9223372036854775807L;
            return;
        }
        this.f32884d = j - j2;
        this.f32886f = m74735b(j, j2, i);
    }
}
