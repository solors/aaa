package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class IntArrayQueue {

    /* renamed from: a */
    private int f33806a = 0;

    /* renamed from: b */
    private int f33807b = -1;

    /* renamed from: c */
    private int f33808c = 0;

    /* renamed from: d */
    private int[] f33809d;

    /* renamed from: e */
    private int f33810e;

    public IntArrayQueue() {
        int[] iArr = new int[16];
        this.f33809d = iArr;
        this.f33810e = iArr.length - 1;
    }

    /* renamed from: a */
    private void m74225a() {
        int[] iArr = this.f33809d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f33806a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f33809d, 0, iArr2, i2, i);
            this.f33806a = 0;
            this.f33807b = this.f33808c - 1;
            this.f33809d = iArr2;
            this.f33810e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void add(int i) {
        if (this.f33808c == this.f33809d.length) {
            m74225a();
        }
        int i2 = (this.f33807b + 1) & this.f33810e;
        this.f33807b = i2;
        this.f33809d[i2] = i;
        this.f33808c++;
    }

    public int capacity() {
        return this.f33809d.length;
    }

    public void clear() {
        this.f33806a = 0;
        this.f33807b = -1;
        this.f33808c = 0;
    }

    public boolean isEmpty() {
        if (this.f33808c == 0) {
            return true;
        }
        return false;
    }

    public int remove() {
        int i = this.f33808c;
        if (i != 0) {
            int[] iArr = this.f33809d;
            int i2 = this.f33806a;
            int i3 = iArr[i2];
            this.f33806a = (i2 + 1) & this.f33810e;
            this.f33808c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public int size() {
        return this.f33808c;
    }
}
