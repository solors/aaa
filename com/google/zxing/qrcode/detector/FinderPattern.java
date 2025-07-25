package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class FinderPattern extends ResultPoint {

    /* renamed from: c */
    private final float f44727c;

    /* renamed from: d */
    private final int f44728d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinderPattern(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m65525b(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f44727c);
        if (abs > 1.0f && abs > this.f44727c) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public FinderPattern m65524c(float f, float f2, float f3) {
        int i = this.f44728d;
        int i2 = i + 1;
        float x = (i * getX()) + f2;
        float f4 = i2;
        return new FinderPattern(x / f4, ((this.f44728d * getY()) + f) / f4, ((this.f44728d * this.f44727c) + f3) / f4, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m65523d() {
        return this.f44728d;
    }

    public float getEstimatedModuleSize() {
        return this.f44727c;
    }

    private FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f44727c = f3;
        this.f44728d = i;
    }
}
