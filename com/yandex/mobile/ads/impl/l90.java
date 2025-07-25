package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.ps1;

/* loaded from: classes8.dex */
public final class l90 implements ps1 {

    /* renamed from: a */
    private final m90 f81747a;

    /* renamed from: b */
    private final long f81748b;

    public l90(m90 m90Var, long j) {
        this.f81747a = m90Var;
        this.f81748b = j;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f81747a.m32070b();
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        m90 m90Var = this.f81747a;
        m90.C30835a c30835a = m90Var.f82094k;
        if (c30835a != null) {
            long[] jArr = c30835a.f82096a;
            long[] jArr2 = c30835a.f82097b;
            int m27056b = y32.m27056b(jArr, m90Var.m32074a(j), false);
            long j2 = m27056b == -1 ? 0L : jArr[m27056b];
            long j3 = m27056b != -1 ? jArr2[m27056b] : 0L;
            long j4 = this.f81747a.f82088e;
            long j5 = (j2 * 1000000) / j4;
            long j6 = this.f81748b;
            rs1 rs1Var = new rs1(j5, j3 + j6);
            if (j5 != j && m27056b != jArr.length - 1) {
                int i = m27056b + 1;
                return new ps1.C31150a(rs1Var, new rs1((jArr[i] * 1000000) / j4, j6 + jArr2[i]));
            }
            return new ps1.C31150a(rs1Var, rs1Var);
        }
        throw new IllegalStateException();
    }
}
