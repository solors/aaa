package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.qc */
/* loaded from: classes2.dex */
public final class C5178qc {

    /* renamed from: a */
    private int f9181a;

    /* renamed from: b */
    private long[] f9182b;

    public C5178qc() {
        this(32);
    }

    /* renamed from: a */
    public void m96392a(long j) {
        int i = this.f9181a;
        long[] jArr = this.f9182b;
        if (i == jArr.length) {
            this.f9182b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f9182b;
        int i2 = this.f9181a;
        this.f9181a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long[] m96391b() {
        return Arrays.copyOf(this.f9182b, this.f9181a);
    }

    public C5178qc(int i) {
        this.f9182b = new long[i];
    }

    /* renamed from: a */
    public long m96393a(int i) {
        if (i >= 0 && i < this.f9181a) {
            return this.f9182b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f9181a);
    }

    /* renamed from: a */
    public int m96394a() {
        return this.f9181a;
    }
}
