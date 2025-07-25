package com.applovin.impl;

import com.applovin.impl.AbstractC5512sf;
import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.ds */
/* loaded from: classes2.dex */
final class C4287ds implements InterfaceC4780lj {

    /* renamed from: a */
    private final long f5707a;

    /* renamed from: b */
    private final int f5708b;

    /* renamed from: c */
    private final long f5709c;

    /* renamed from: d */
    private final long f5710d;

    /* renamed from: e */
    private final long f5711e;

    /* renamed from: f */
    private final long[] f5712f;

    private C4287ds(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    /* renamed from: a */
    public static C4287ds m99711a(long j, long j2, AbstractC5512sf.C5513a c5513a, C4066ah c4066ah) {
        int m100801A;
        int i = c5513a.f10349g;
        int i2 = c5513a.f10346d;
        int m100775j = c4066ah.m100775j();
        if ((m100775j & 1) != 1 || (m100801A = c4066ah.m100801A()) == 0) {
            return null;
        }
        long m92974c = AbstractC5863xp.m92974c(m100801A, i * 1000000, i2);
        if ((m100775j & 6) != 6) {
            return new C4287ds(j2, c5513a.f10345c, m92974c);
        }
        long m100760y = c4066ah.m100760y();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = c4066ah.m100762w();
        }
        if (j != -1) {
            long j3 = j2 + m100760y;
            if (j != j3) {
                AbstractC5063oc.m96800d("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new C4287ds(j2, c5513a.f10345c, m92974c, m100760y, jArr);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        long[] jArr;
        if (!mo92788b()) {
            return new InterfaceC4591ij.C4592a(new C4719kj(0L, this.f5707a + this.f5708b));
        }
        long m92990b = AbstractC5863xp.m92990b(j, 0L, this.f5709c);
        double d = (m92990b * 100.0d) / this.f5709c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) AbstractC4100b1.m100578b(this.f5712f))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new InterfaceC4591ij.C4592a(new C4719kj(m92990b, this.f5707a + AbstractC5863xp.m92990b(Math.round((d2 / 256.0d) * this.f5710d), this.f5708b, this.f5710d - 1)));
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: c */
    public long mo96502c() {
        return this.f5711e;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f5709c;
    }

    private C4287ds(long j, int i, long j2, long j3, long[] jArr) {
        this.f5707a = j;
        this.f5708b = i;
        this.f5709c = j2;
        this.f5712f = jArr;
        this.f5710d = j3;
        this.f5711e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: a */
    public long mo96504a(long j) {
        long j2 = j - this.f5707a;
        if (!mo92788b() || j2 <= this.f5708b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC4100b1.m100578b(this.f5712f);
        double d = (j2 * 256.0d) / this.f5710d;
        int m92980b = AbstractC5863xp.m92980b(jArr, (long) d, true, true);
        long m99712a = m99712a(m92980b);
        long j3 = jArr[m92980b];
        int i = m92980b + 1;
        long m99712a2 = m99712a(i);
        long j4 = m92980b == 99 ? 256L : jArr[i];
        return m99712a + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (m99712a2 - m99712a));
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return this.f5712f != null;
    }

    /* renamed from: a */
    private long m99712a(int i) {
        return (this.f5709c * i) / 100;
    }
}
