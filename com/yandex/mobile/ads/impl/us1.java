package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;
import java.util.List;

/* loaded from: classes8.dex */
public final class us1 {

    /* renamed from: a */
    private final List<v90> f86398a;

    /* renamed from: b */
    private final x02[] f86399b;

    public us1(List<v90> list) {
        this.f86398a = list;
        this.f86399b = new x02[list.size()];
    }

    /* renamed from: a */
    public final void m28641a(long j, cc1 cc1Var) {
        C30104cn.m35217a(j, cc1Var, this.f86399b);
    }

    /* renamed from: a */
    public final void m28640a(p50 p50Var, k22.C30694d c30694d) {
        for (int i = 0; i < this.f86399b.length; i++) {
            c30694d.m32682a();
            x02 mo26223a = p50Var.mo26223a(c30694d.m32680c(), 3);
            v90 v90Var = this.f86398a.get(i);
            String str = v90Var.f86623m;
            C30937nf.m31568a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = v90Var.f86612b;
            if (str2 == null) {
                str2 = c30694d.m32681b();
            }
            mo26223a.mo26064a(new v90.C31640a().m28438b(str2).m28426e(str).m28407m(v90Var.f86615e).m28430d(v90Var.f86614d).m28452a(v90Var.f86609E).m28445a(v90Var.f86625o).m28454a());
            this.f86399b[i] = mo26223a;
        }
    }
}
