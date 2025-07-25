package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;

/* loaded from: classes8.dex */
final class ei0 implements ss1 {

    /* renamed from: a */
    private final long f78620a;

    /* renamed from: b */
    private final iq0 f78621b;

    /* renamed from: c */
    private final iq0 f78622c;

    /* renamed from: d */
    private long f78623d;

    public ei0(long j, long j2, long j3) {
        this.f78623d = j;
        this.f78620a = j3;
        iq0 iq0Var = new iq0();
        this.f78621b = iq0Var;
        iq0 iq0Var2 = new iq0();
        this.f78622c = iq0Var2;
        iq0Var.m33151a(0L);
        iq0Var2.m33151a(j2);
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28948a() {
        return this.f78620a;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f78623d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m34563d(long j) {
        this.f78623d = j;
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28947a(long j) {
        return this.f78621b.m33152a(y32.m27079a(this.f78622c, j));
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        int m27079a = y32.m27079a(this.f78621b, j);
        long m33152a = this.f78621b.m33152a(m27079a);
        rs1 rs1Var = new rs1(m33152a, this.f78622c.m33152a(m27079a));
        if (m33152a != j && m27079a != this.f78621b.m33153a() - 1) {
            int i = m27079a + 1;
            return new ps1.C31150a(rs1Var, new rs1(this.f78621b.m33152a(i), this.f78622c.m33152a(i)));
        }
        return new ps1.C31150a(rs1Var, rs1Var);
    }

    /* renamed from: c */
    public final boolean m34564c(long j) {
        iq0 iq0Var = this.f78621b;
        return j - iq0Var.m33152a(iq0Var.m33153a() - 1) < 100000;
    }

    /* renamed from: a */
    public final void m34565a(long j, long j2) {
        if (m34564c(j)) {
            return;
        }
        this.f78621b.m33151a(j);
        this.f78622c.m33151a(j2);
    }
}
