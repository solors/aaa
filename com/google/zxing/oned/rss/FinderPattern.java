package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class FinderPattern {

    /* renamed from: a */
    private final int f44536a;

    /* renamed from: b */
    private final int[] f44537b;

    /* renamed from: c */
    private final ResultPoint[] f44538c;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.f44536a = i;
        this.f44537b = iArr;
        float f = i4;
        this.f44538c = new ResultPoint[]{new ResultPoint(i2, f), new ResultPoint(i3, f)};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FinderPattern) || this.f44536a != ((FinderPattern) obj).f44536a) {
            return false;
        }
        return true;
    }

    public ResultPoint[] getResultPoints() {
        return this.f44538c;
    }

    public int[] getStartEnd() {
        return this.f44537b;
    }

    public int getValue() {
        return this.f44536a;
    }

    public int hashCode() {
        return this.f44536a;
    }
}
