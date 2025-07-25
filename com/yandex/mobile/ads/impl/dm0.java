package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
final class dm0 {

    /* renamed from: a */
    private int f78198a = 0;

    /* renamed from: b */
    private int f78199b = -1;

    /* renamed from: c */
    private int f78200c = 0;

    /* renamed from: d */
    private int[] f78201d = new int[16];

    /* renamed from: e */
    private int f78202e = 15;

    /* renamed from: a */
    public final void m34884a(int i) {
        int i2 = this.f78200c;
        int[] iArr = this.f78201d;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.f78198a;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy(this.f78201d, 0, iArr2, i4, i3);
                this.f78198a = 0;
                this.f78199b = this.f78200c - 1;
                this.f78201d = iArr2;
                this.f78202e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.f78199b + 1) & this.f78202e;
        this.f78199b = i5;
        this.f78201d[i5] = i;
        this.f78200c++;
    }

    /* renamed from: b */
    public final boolean m34883b() {
        if (this.f78200c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int m34882c() {
        int i = this.f78200c;
        if (i != 0) {
            int[] iArr = this.f78201d;
            int i2 = this.f78198a;
            int i3 = iArr[i2];
            this.f78198a = (i2 + 1) & this.f78202e;
            this.f78200c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public final void m34885a() {
        this.f78198a = 0;
        this.f78199b = -1;
        this.f78200c = 0;
    }
}
