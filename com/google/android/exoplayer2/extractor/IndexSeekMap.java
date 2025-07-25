package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class IndexSeekMap implements SeekMap {

    /* renamed from: a */
    private final long[] f32921a;

    /* renamed from: b */
    private final long[] f32922b;

    /* renamed from: c */
    private final long f32923c;

    /* renamed from: d */
    private final boolean f32924d;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f32924d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f32921a = jArr3;
            long[] jArr4 = new long[i];
            this.f32922b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f32921a = jArr;
            this.f32922b = jArr2;
        }
        this.f32923c = j;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f32923c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (!this.f32924d) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int binarySearchFloor = Util.binarySearchFloor(this.f32922b, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f32922b[binarySearchFloor], this.f32921a[binarySearchFloor]);
        if (seekPoint.timeUs != j && binarySearchFloor != this.f32922b.length - 1) {
            int i = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.f32922b[i], this.f32921a[i]));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.f32924d;
    }
}
