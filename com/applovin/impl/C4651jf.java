package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.jf */
/* loaded from: classes2.dex */
final class C4651jf implements InterfaceC4780lj {

    /* renamed from: a */
    private final long[] f7199a;

    /* renamed from: b */
    private final long[] f7200b;

    /* renamed from: c */
    private final long f7201c;

    private C4651jf(long[] jArr, long[] jArr2, long j) {
        this.f7199a = jArr;
        this.f7200b = jArr2;
        this.f7201c = j == -9223372036854775807L ? AbstractC5538t2.m94555a(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static C4651jf m98183a(long j, C4585if c4585if, long j2) {
        int length = c4585if.f6891f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += c4585if.f6889c + c4585if.f6891f[i3];
            j3 += c4585if.f6890d + c4585if.f6892g[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C4651jf(jArr, jArr2, j2);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: c */
    public long mo96502c() {
        return -1L;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f7201c;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        Pair m98182a = m98182a(AbstractC5538t2.m94552b(AbstractC5863xp.m92990b(j, 0L, this.f7201c)), this.f7200b, this.f7199a);
        return new InterfaceC4591ij.C4592a(new C4719kj(AbstractC5538t2.m94555a(((Long) m98182a.first).longValue()), ((Long) m98182a.second).longValue()));
    }

    @Override // com.applovin.impl.InterfaceC4780lj
    /* renamed from: a */
    public long mo96504a(long j) {
        return AbstractC5538t2.m94555a(((Long) m98182a(j, this.f7199a, this.f7200b).second).longValue());
    }

    /* renamed from: a */
    private static Pair m98182a(long j, long[] jArr, long[] jArr2) {
        int m92980b = AbstractC5863xp.m92980b(jArr, j, true, true);
        long j2 = jArr[m92980b];
        long j3 = jArr2[m92980b];
        int i = m92980b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
