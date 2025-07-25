package com.applovin.impl;

import com.applovin.impl.AbstractC5512sf;
import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.pq */
/* loaded from: classes2.dex */
final class C5140pq implements InterfaceC4780lj {

    /* renamed from: a */
    private final long[] f9055a;

    /* renamed from: b */
    private final long[] f9056b;

    /* renamed from: c */
    private final long f9057c;

    /* renamed from: d */
    private final long f9058d;

    private C5140pq(long[] jArr, long[] jArr2, long j, long j2) {
        this.f9055a = jArr;
        this.f9056b = jArr2;
        this.f9057c = j;
        this.f9058d = j2;
    }

    /* renamed from: a */
    public static C5140pq m96503a(long j, long j2, AbstractC5512sf.C5513a c5513a, C4066ah c4066ah) {
        int m100762w;
        c4066ah.m100778g(10);
        int m100775j = c4066ah.m100775j();
        if (m100775j <= 0) {
            return null;
        }
        int i = c5513a.f10346d;
        long m92974c = AbstractC5863xp.m92974c(m100775j, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int m100799C = c4066ah.m100799C();
        int m100799C2 = c4066ah.m100799C();
        int m100799C3 = c4066ah.m100799C();
        c4066ah.m100778g(2);
        long j3 = j2 + c5513a.f10345c;
        long[] jArr = new long[m100799C];
        long[] jArr2 = new long[m100799C];
        int i2 = 0;
        long j4 = j2;
        while (i2 < m100799C) {
            int i3 = m100799C2;
            long j5 = j3;
            jArr[i2] = (i2 * m92974c) / m100799C;
            jArr2[i2] = Math.max(j4, j5);
            if (m100799C3 == 1) {
                m100762w = c4066ah.m100762w();
            } else if (m100799C3 == 2) {
                m100762w = c4066ah.m100799C();
            } else if (m100799C3 == 3) {
                m100762w = c4066ah.m100759z();
            } else if (m100799C3 != 4) {
                return null;
            } else {
                m100762w = c4066ah.m100801A();
            }
            j4 += m100762w * i3;
            i2++;
            j3 = j5;
            m100799C2 = i3;
        }
        if (j != -1 && j != j4) {
            AbstractC5063oc.m96800d("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new C5140pq(jArr, jArr2, m92974c, j4);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: c */
    public long mo96502c() {
        return this.f9058d;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f9057c;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        int m92980b = AbstractC5863xp.m92980b(this.f9055a, j, true, true);
        C4719kj c4719kj = new C4719kj(this.f9055a[m92980b], this.f9056b[m92980b]);
        if (c4719kj.f7553a < j && m92980b != this.f9055a.length - 1) {
            int i = m92980b + 1;
            return new InterfaceC4591ij.C4592a(c4719kj, new C4719kj(this.f9055a[i], this.f9056b[i]));
        }
        return new InterfaceC4591ij.C4592a(c4719kj);
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: a */
    public long mo96504a(long j) {
        return this.f9055a[AbstractC5863xp.m92980b(this.f9056b, j, true, true)];
    }
}
