package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.or */
/* loaded from: classes2.dex */
final class C5087or implements InterfaceC4591ij {

    /* renamed from: a */
    private final C4970mr f8947a;

    /* renamed from: b */
    private final int f8948b;

    /* renamed from: c */
    private final long f8949c;

    /* renamed from: d */
    private final long f8950d;

    /* renamed from: e */
    private final long f8951e;

    public C5087or(C4970mr c4970mr, int i, long j, long j2) {
        this.f8947a = c4970mr;
        this.f8948b = i;
        this.f8949c = j;
        long j3 = (j2 - j) / c4970mr.f8466e;
        this.f8950d = j3;
        this.f8951e = m96609c(j3);
    }

    /* renamed from: c */
    private long m96609c(long j) {
        return AbstractC5863xp.m92974c(j * this.f8948b, 1000000L, this.f8947a.f8464c);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f8951e;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        long m92990b = AbstractC5863xp.m92990b((this.f8947a.f8464c * j) / (this.f8948b * 1000000), 0L, this.f8950d - 1);
        long j2 = this.f8949c + (this.f8947a.f8466e * m92990b);
        long m96609c = m96609c(m92990b);
        C4719kj c4719kj = new C4719kj(m96609c, j2);
        if (m96609c < j && m92990b != this.f8950d - 1) {
            long j3 = m92990b + 1;
            return new InterfaceC4591ij.C4592a(c4719kj, new C4719kj(m96609c(j3), this.f8949c + (this.f8947a.f8466e * j3)));
        }
        return new InterfaceC4591ij.C4592a(c4719kj);
    }
}
