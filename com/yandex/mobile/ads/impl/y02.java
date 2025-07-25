package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class y02 {

    /* renamed from: a */
    public final s02 f87982a;

    /* renamed from: b */
    public final int f87983b;

    /* renamed from: c */
    public final long[] f87984c;

    /* renamed from: d */
    public final int[] f87985d;

    /* renamed from: e */
    public final int f87986e;

    /* renamed from: f */
    public final long[] f87987f;

    /* renamed from: g */
    public final int[] f87988g;

    /* renamed from: h */
    public final long f87989h;

    public y02(s02 s02Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31567a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C30937nf.m31567a(z2);
        C30937nf.m31567a(iArr2.length == jArr2.length);
        this.f87982a = s02Var;
        this.f87984c = jArr;
        this.f87985d = iArr;
        this.f87986e = i;
        this.f87987f = jArr2;
        this.f87988g = iArr2;
        this.f87989h = j;
        this.f87983b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m27124a(long j) {
        for (int m27067a = y32.m27067a(this.f87987f, j, true); m27067a < this.f87987f.length; m27067a++) {
            if ((this.f87988g[m27067a] & 1) != 0) {
                return m27067a;
            }
        }
        return -1;
    }
}
