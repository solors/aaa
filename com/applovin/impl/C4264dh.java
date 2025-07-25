package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.dh */
/* loaded from: classes2.dex */
public final class C4264dh implements InterfaceC4472gj {

    /* renamed from: a */
    private C4310e9 f5650a;

    /* renamed from: b */
    private C4537ho f5651b;

    /* renamed from: c */
    private InterfaceC5209qo f5652c;

    public C4264dh(String str) {
        this.f5650a = new C4310e9.C4312b().m99606f(str).m99632a();
    }

    /* renamed from: a */
    private void m99763a() {
        AbstractC4100b1.m100578b(this.f5651b);
        AbstractC5863xp.m93017a(this.f5652c);
    }

    @Override // com.applovin.impl.InterfaceC4472gj
    /* renamed from: a */
    public void mo98929a(C4066ah c4066ah) {
        m99763a();
        long m98646b = this.f5651b.m98646b();
        long m98644c = this.f5651b.m98644c();
        if (m98646b == -9223372036854775807L || m98644c == -9223372036854775807L) {
            return;
        }
        C4310e9 c4310e9 = this.f5650a;
        if (m98644c != c4310e9.f5817q) {
            C4310e9 m99632a = c4310e9.m99645a().m99629a(m98644c).m99632a();
            this.f5650a = m99632a;
            this.f5652c.mo96251a(m99632a);
        }
        int m100797a = c4066ah.m100797a();
        this.f5652c.m96253a(c4066ah, m100797a);
        this.f5652c.mo96254a(m98646b, 1, m100797a, 0, null);
    }

    @Override // com.applovin.impl.InterfaceC4472gj
    /* renamed from: a */
    public void mo98928a(C4537ho c4537ho, InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        this.f5651b = c4537ho;
        c4283d.m99724a();
        InterfaceC5209qo mo97782a = interfaceC4760l8.mo97782a(c4283d.m99722c(), 5);
        this.f5652c = mo97782a;
        mo97782a.mo96251a(this.f5650a);
    }
}
