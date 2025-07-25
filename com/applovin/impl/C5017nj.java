package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;
import java.util.List;

/* renamed from: com.applovin.impl.nj */
/* loaded from: classes2.dex */
public final class C5017nj {

    /* renamed from: a */
    private final List f8602a;

    /* renamed from: b */
    private final InterfaceC5209qo[] f8603b;

    public C5017nj(List list) {
        this.f8602a = list;
        this.f8603b = new InterfaceC5209qo[list.size()];
    }

    /* renamed from: a */
    public void m96954a(long j, C4066ah c4066ah) {
        AbstractC4160c3.m100276a(j, c4066ah, this.f8603b);
    }

    /* renamed from: a */
    public void m96953a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        for (int i = 0; i < this.f8603b.length; i++) {
            c4283d.m99724a();
            InterfaceC5209qo mo97782a = interfaceC4760l8.mo97782a(c4283d.m99722c(), 3);
            C4310e9 c4310e9 = (C4310e9) this.f8602a.get(i);
            String str = c4310e9.f5813m;
            AbstractC4100b1.m100579a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = c4310e9.f5802a;
            if (str2 == null) {
                str2 = c4283d.m99723b();
            }
            mo97782a.mo96251a(new C4310e9.C4312b().m99615c(str2).m99606f(str).m99589o(c4310e9.f5805d).m99609e(c4310e9.f5804c).m99630a(c4310e9.f5799E).m99623a(c4310e9.f5815o).m99632a());
            this.f8603b[i] = mo97782a;
        }
    }
}
