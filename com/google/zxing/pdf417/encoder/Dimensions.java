package com.google.zxing.pdf417.encoder;

/* loaded from: classes5.dex */
public final class Dimensions {

    /* renamed from: a */
    private final int f44659a;

    /* renamed from: b */
    private final int f44660b;

    /* renamed from: c */
    private final int f44661c;

    /* renamed from: d */
    private final int f44662d;

    public Dimensions(int i, int i2, int i3, int i4) {
        this.f44659a = i;
        this.f44660b = i2;
        this.f44661c = i3;
        this.f44662d = i4;
    }

    public int getMaxCols() {
        return this.f44660b;
    }

    public int getMaxRows() {
        return this.f44662d;
    }

    public int getMinCols() {
        return this.f44659a;
    }

    public int getMinRows() {
        return this.f44661c;
    }
}
