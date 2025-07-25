package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;
import java.util.List;

/* renamed from: com.applovin.impl.vp */
/* loaded from: classes2.dex */
final class C5717vp {

    /* renamed from: a */
    private final List f11521a;

    /* renamed from: b */
    private final InterfaceC5209qo[] f11522b;

    public C5717vp(List list) {
        this.f11521a = list;
        this.f11522b = new InterfaceC5209qo[list.size()];
    }

    /* renamed from: a */
    public void m93827a(long j, C4066ah c4066ah) {
        if (c4066ah.m100797a() < 9) {
            return;
        }
        int m100775j = c4066ah.m100775j();
        int m100775j2 = c4066ah.m100775j();
        int m100762w = c4066ah.m100762w();
        if (m100775j == 434 && m100775j2 == 1195456820 && m100762w == 3) {
            AbstractC4160c3.m100274b(j, c4066ah, this.f11522b);
        }
    }

    /* renamed from: a */
    public void m93826a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        for (int i = 0; i < this.f11522b.length; i++) {
            c4283d.m99724a();
            InterfaceC5209qo mo97782a = interfaceC4760l8.mo97782a(c4283d.m99722c(), 3);
            C4310e9 c4310e9 = (C4310e9) this.f11521a.get(i);
            String str = c4310e9.f5813m;
            AbstractC4100b1.m100579a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            mo97782a.mo96251a(new C4310e9.C4312b().m99615c(c4283d.m99723b()).m99606f(str).m99589o(c4310e9.f5805d).m99609e(c4310e9.f5804c).m99630a(c4310e9.f5799E).m99623a(c4310e9.f5815o).m99632a());
            this.f11522b[i] = mo97782a;
        }
    }
}
