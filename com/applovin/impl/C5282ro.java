package com.applovin.impl;

/* renamed from: com.applovin.impl.ro */
/* loaded from: classes2.dex */
final class C5282ro {

    /* renamed from: a */
    public final C4787lo f9499a;

    /* renamed from: b */
    public final int f9500b;

    /* renamed from: c */
    public final long[] f9501c;

    /* renamed from: d */
    public final int[] f9502d;

    /* renamed from: e */
    public final int f9503e;

    /* renamed from: f */
    public final long[] f9504f;

    /* renamed from: g */
    public final int[] f9505g;

    /* renamed from: h */
    public final long f9506h;

    public C5282ro(C4787lo c4787lo, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC4100b1.m100580a(z2);
        AbstractC4100b1.m100580a(iArr2.length == jArr2.length);
        this.f9499a = c4787lo;
        this.f9501c = jArr;
        this.f9502d = iArr;
        this.f9503e = i;
        this.f9504f = jArr2;
        this.f9505g = iArr2;
        this.f9506h = j;
        this.f9500b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m95798a(long j) {
        for (int m92980b = AbstractC5863xp.m92980b(this.f9504f, j, true, false); m92980b >= 0; m92980b--) {
            if ((this.f9505g[m92980b] & 1) != 0) {
                return m92980b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m95797b(long j) {
        for (int m93001a = AbstractC5863xp.m93001a(this.f9504f, j, true, false); m93001a < this.f9504f.length; m93001a++) {
            if ((this.f9505g[m93001a] & 1) != 0) {
                return m93001a;
            }
        }
        return -1;
    }
}
