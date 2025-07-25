package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LongArray {

    /* renamed from: a */
    private int f36116a;

    /* renamed from: b */
    private long[] f36117b;

    public LongArray() {
        this(32);
    }

    public void add(long j) {
        int i = this.f36116a;
        long[] jArr = this.f36117b;
        if (i == jArr.length) {
            this.f36117b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f36117b;
        int i2 = this.f36116a;
        this.f36116a = i2 + 1;
        jArr2[i2] = j;
    }

    public long get(int i) {
        if (i >= 0 && i < this.f36116a) {
            return this.f36117b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f36116a);
    }

    public int size() {
        return this.f36116a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.f36117b, this.f36116a);
    }

    public LongArray(int i) {
        this.f36117b = new long[i];
    }
}
