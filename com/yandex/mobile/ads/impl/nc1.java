package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;

/* loaded from: classes8.dex */
public final class nc1 implements ns1 {

    /* renamed from: a */
    private v90 f82691a;

    /* renamed from: b */
    private n02 f82692b;

    /* renamed from: c */
    private x02 f82693c;

    public nc1(String str) {
        this.f82691a = new v90.C31640a().m28426e(str).m28454a();
    }

    @Override // com.yandex.mobile.ads.impl.ns1
    /* renamed from: a */
    public final void mo31319a(cc1 cc1Var) {
        n02 n02Var = this.f82692b;
        if (n02Var != null) {
            int i = y32.f88010a;
            long m31719b = n02Var.m31719b();
            long m31717c = this.f82692b.m31717c();
            if (m31719b == -9223372036854775807L || m31717c == -9223372036854775807L) {
                return;
            }
            v90 v90Var = this.f82691a;
            if (m31717c != v90Var.f86627q) {
                v90 m28454a = v90Var.m28486a().m28451a(m31717c).m28454a();
                this.f82691a = m28454a;
                this.f82693c.mo26064a(m28454a);
            }
            int m35299a = cc1Var.m35299a();
            this.f82693c.m27709a(m35299a, cc1Var);
            this.f82693c.mo26069a(m31719b, 1, m35299a, 0, null);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.ns1
    /* renamed from: a */
    public final void mo31318a(n02 n02Var, p50 p50Var, k22.C30694d c30694d) {
        this.f82692b = n02Var;
        c30694d.m32682a();
        x02 mo26223a = p50Var.mo26223a(c30694d.m32680c(), 5);
        this.f82693c = mo26223a;
        mo26223a.mo26064a(this.f82691a);
    }
}
