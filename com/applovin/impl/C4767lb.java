package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.lb */
/* loaded from: classes2.dex */
public final class C4767lb implements InterfaceC4591ij {

    /* renamed from: a */
    private final long[] f7722a;

    /* renamed from: b */
    private final long[] f7723b;

    /* renamed from: c */
    private final long f7724c;

    /* renamed from: d */
    private final boolean f7725d;

    public C4767lb(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f7725d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f7722a = jArr3;
            long[] jArr4 = new long[i];
            this.f7723b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f7722a = jArr;
            this.f7723b = jArr2;
        }
        this.f7724c = j;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        if (!this.f7725d) {
            return new InterfaceC4591ij.C4592a(C4719kj.f7552c);
        }
        int m92980b = AbstractC5863xp.m92980b(this.f7723b, j, true, true);
        C4719kj c4719kj = new C4719kj(this.f7723b[m92980b], this.f7722a[m92980b]);
        if (c4719kj.f7553a != j && m92980b != this.f7723b.length - 1) {
            int i = m92980b + 1;
            return new InterfaceC4591ij.C4592a(c4719kj, new C4719kj(this.f7723b[i], this.f7722a[i]));
        }
        return new InterfaceC4591ij.C4592a(c4719kj);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f7724c;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return this.f7725d;
    }
}
