package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;

/* loaded from: classes8.dex */
public final class tx1 implements p50 {

    /* renamed from: b */
    private final long f85986b;

    /* renamed from: c */
    private final p50 f85987c;

    public tx1(long j, p50 p50Var) {
        this.f85986b = j;
        this.f85987c = p50Var;
    }

    /* renamed from: com.yandex.mobile.ads.impl.tx1$a */
    /* loaded from: classes8.dex */
    final class C31538a implements ps1 {

        /* renamed from: a */
        final /* synthetic */ ps1 f85988a;

        C31538a(ps1 ps1Var) {
            this.f85988a = ps1Var;
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final ps1.C31150a mo28594b(long j) {
            ps1.C31150a mo28594b = this.f85988a.mo28594b(j);
            rs1 rs1Var = mo28594b.f84067a;
            long j2 = rs1Var.f84871a;
            long j3 = rs1Var.f84872b;
            long j4 = tx1.this.f85986b;
            rs1 rs1Var2 = new rs1(j2, j3 + j4);
            rs1 rs1Var3 = mo28594b.f84068b;
            return new ps1.C31150a(rs1Var2, new rs1(rs1Var3.f84871a, rs1Var3.f84872b + j4));
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: c */
        public final long mo28592c() {
            return this.f85988a.mo28592c();
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final boolean mo28595b() {
            return this.f85988a.mo28595b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.p50
    /* renamed from: a */
    public final void mo26225a() {
        this.f85987c.mo26225a();
    }

    @Override // com.yandex.mobile.ads.impl.p50
    /* renamed from: a */
    public final void mo26218a(ps1 ps1Var) {
        this.f85987c.mo26218a(new C31538a(ps1Var));
    }

    @Override // com.yandex.mobile.ads.impl.p50
    /* renamed from: a */
    public final x02 mo26223a(int i, int i2) {
        return this.f85987c.mo26223a(i, i2);
    }
}
