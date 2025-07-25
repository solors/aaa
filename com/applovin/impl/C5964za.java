package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.za */
/* loaded from: classes2.dex */
public final class C5964za implements InterfaceC5107p7 {

    /* renamed from: b */
    private InterfaceC5209qo f12539b;

    /* renamed from: c */
    private boolean f12540c;

    /* renamed from: e */
    private int f12542e;

    /* renamed from: f */
    private int f12543f;

    /* renamed from: a */
    private final C4066ah f12538a = new C4066ah(10);

    /* renamed from: d */
    private long f12541d = -9223372036854775807L;

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        AbstractC4100b1.m100578b(this.f12539b);
        if (this.f12540c) {
            int m100797a = c4066ah.m100797a();
            int i = this.f12543f;
            if (i < 10) {
                int min = Math.min(m100797a, 10 - i);
                System.arraycopy(c4066ah.m100787c(), c4066ah.m100785d(), this.f12538a.m100787c(), this.f12543f, min);
                if (this.f12543f + min == 10) {
                    this.f12538a.m100780f(0);
                    if (73 == this.f12538a.m100762w() && 68 == this.f12538a.m100762w() && 51 == this.f12538a.m100762w()) {
                        this.f12538a.m100778g(3);
                        this.f12542e = this.f12538a.m100763v() + 10;
                    } else {
                        AbstractC5063oc.m96800d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12540c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(m100797a, this.f12542e - this.f12543f);
            this.f12539b.m96253a(c4066ah, min2);
            this.f12543f += min2;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
        int i;
        AbstractC4100b1.m100578b(this.f12539b);
        if (this.f12540c && (i = this.f12542e) != 0 && this.f12543f == i) {
            long j = this.f12541d;
            if (j != -9223372036854775807L) {
                this.f12539b.mo96254a(j, 1, i, 0, null);
            }
            this.f12540c = false;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        c4283d.m99724a();
        InterfaceC5209qo mo97782a = interfaceC4760l8.mo97782a(c4283d.m99722c(), 5);
        this.f12539b = mo97782a;
        mo97782a.mo96251a(new C4310e9.C4312b().m99615c(c4283d.m99723b()).m99606f("application/id3").m99632a());
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f12540c = true;
        if (j != -9223372036854775807L) {
            this.f12541d = j;
        }
        this.f12542e = 0;
        this.f12543f = 0;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f12540c = false;
        this.f12541d = -9223372036854775807L;
    }
}
