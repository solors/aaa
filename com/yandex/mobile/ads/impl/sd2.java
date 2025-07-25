package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;

/* loaded from: classes8.dex */
final class sd2 implements ps1 {

    /* renamed from: a */
    private final qd2 f85195a;

    /* renamed from: b */
    private final int f85196b;

    /* renamed from: c */
    private final long f85197c;

    /* renamed from: d */
    private final long f85198d;

    /* renamed from: e */
    private final long f85199e;

    public sd2(qd2 qd2Var, int i, long j, long j2) {
        this.f85195a = qd2Var;
        this.f85196b = i;
        this.f85197c = j;
        long j3 = (j2 - j) / qd2Var.f84307d;
        this.f85198d = j3;
        this.f85199e = m29640c(j3);
    }

    /* renamed from: c */
    private long m29640c(long j) {
        return y32.m27088a(j * this.f85196b, 1000000L, this.f85195a.f84306c);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        int i = y32.f88010a;
        long max = Math.max(0L, Math.min((this.f85195a.f84306c * j) / (this.f85196b * 1000000), this.f85198d - 1));
        long j2 = (this.f85195a.f84307d * max) + this.f85197c;
        long m29640c = m29640c(max);
        rs1 rs1Var = new rs1(m29640c, j2);
        if (m29640c < j && max != this.f85198d - 1) {
            long j3 = max + 1;
            return new ps1.C31150a(rs1Var, new rs1(m29640c(j3), (this.f85195a.f84307d * j3) + this.f85197c));
        }
        return new ps1.C31150a(rs1Var, rs1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f85199e;
    }
}
