package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;
import java.util.List;

/* loaded from: classes8.dex */
final class x32 {

    /* renamed from: a */
    private final List<v90> f87537a;

    /* renamed from: b */
    private final x02[] f87538b;

    public x32(List<v90> list) {
        this.f87537a = list;
        this.f87538b = new x02[list.size()];
    }

    /* renamed from: a */
    public final void m27672a(long j, cc1 cc1Var) {
        if (cc1Var.m35299a() < 9) {
            return;
        }
        int m35282h = cc1Var.m35282h();
        int m35282h2 = cc1Var.m35282h();
        int m35270t = cc1Var.m35270t();
        if (m35282h == 434 && m35282h2 == 1195456820 && m35270t == 3) {
            C30104cn.m35216b(j, cc1Var, this.f87538b);
        }
    }

    /* renamed from: a */
    public final void m27671a(p50 p50Var, k22.C30694d c30694d) {
        for (int i = 0; i < this.f87538b.length; i++) {
            c30694d.m32682a();
            x02 mo26223a = p50Var.mo26223a(c30694d.m32680c(), 3);
            v90 v90Var = this.f87537a.get(i);
            String str = v90Var.f86623m;
            C30937nf.m31568a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            mo26223a.mo26064a(new v90.C31640a().m28438b(c30694d.m32681b()).m28426e(str).m28407m(v90Var.f86615e).m28430d(v90Var.f86614d).m28452a(v90Var.f86609E).m28445a(v90Var.f86625o).m28454a());
            this.f87538b[i] = mo26223a;
        }
    }
}
