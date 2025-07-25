package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class iq0 {

    /* renamed from: a */
    private int f80580a;

    /* renamed from: b */
    private long[] f80581b;

    public iq0() {
        this(0);
    }

    /* renamed from: a */
    public final void m33151a(long j) {
        int i = this.f80580a;
        long[] jArr = this.f80581b;
        if (i == jArr.length) {
            this.f80581b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f80581b;
        int i2 = this.f80580a;
        this.f80580a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public final long[] m33150b() {
        return Arrays.copyOf(this.f80581b, this.f80580a);
    }

    public iq0(int i) {
        this.f80581b = new long[32];
    }

    /* renamed from: a */
    public final long m33152a(int i) {
        if (i >= 0 && i < this.f80580a) {
            return this.f80581b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f80580a);
    }

    /* renamed from: a */
    public final int m33153a() {
        return this.f80580a;
    }
}
