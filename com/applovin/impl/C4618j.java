package com.applovin.impl;

import com.applovin.impl.AbstractC4682k;
import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.j */
/* loaded from: classes2.dex */
public final class C4618j implements InterfaceC5107p7 {

    /* renamed from: a */
    private final C5971zg f6992a;

    /* renamed from: b */
    private final C4066ah f6993b;

    /* renamed from: c */
    private final String f6994c;

    /* renamed from: d */
    private String f6995d;

    /* renamed from: e */
    private InterfaceC5209qo f6996e;

    /* renamed from: f */
    private int f6997f;

    /* renamed from: g */
    private int f6998g;

    /* renamed from: h */
    private boolean f6999h;

    /* renamed from: i */
    private long f7000i;

    /* renamed from: j */
    private C4310e9 f7001j;

    /* renamed from: k */
    private int f7002k;

    /* renamed from: l */
    private long f7003l;

    public C4618j() {
        this(null);
    }

    /* renamed from: c */
    private void m98361c() {
        this.f6992a.m92392c(0);
        AbstractC4682k.C4684b m98098a = AbstractC4682k.m98098a(this.f6992a);
        C4310e9 c4310e9 = this.f7001j;
        if (c4310e9 == null || m98098a.f7295d != c4310e9.f5826z || m98098a.f7294c != c4310e9.f5795A || !AbstractC5863xp.m93016a((Object) m98098a.f7292a, (Object) c4310e9.f5813m)) {
            C4310e9 m99632a = new C4310e9.C4312b().m99615c(this.f6995d).m99606f(m98098a.f7292a).m99617c(m98098a.f7295d).m99591n(m98098a.f7294c).m99609e(this.f6994c).m99632a();
            this.f7001j = m99632a;
            this.f6996e.mo96251a(m99632a);
        }
        this.f7002k = m98098a.f7296e;
        this.f7000i = (m98098a.f7297f * 1000000) / this.f7001j.f5795A;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        AbstractC4100b1.m100578b(this.f6996e);
        while (c4066ah.m100797a() > 0) {
            int i = this.f6997f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c4066ah.m100797a(), this.f7002k - this.f6998g);
                        this.f6996e.m96253a(c4066ah, min);
                        int i2 = this.f6998g + min;
                        this.f6998g = i2;
                        int i3 = this.f7002k;
                        if (i2 == i3) {
                            long j = this.f7003l;
                            if (j != -9223372036854775807L) {
                                this.f6996e.mo96254a(j, 1, i3, 0, null);
                                this.f7003l += this.f7000i;
                            }
                            this.f6997f = 0;
                        }
                    }
                } else if (m98363a(c4066ah, this.f6993b.m100787c(), 128)) {
                    m98361c();
                    this.f6993b.m100780f(0);
                    this.f6996e.m96253a(this.f6993b, 128);
                    this.f6997f = 2;
                }
            } else if (m98362b(c4066ah)) {
                this.f6997f = 1;
                this.f6993b.m100787c()[0] = 11;
                this.f6993b.m100787c()[1] = 119;
                this.f6998g = 2;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
    }

    public C4618j(String str) {
        C5971zg c5971zg = new C5971zg(new byte[128]);
        this.f6992a = c5971zg;
        this.f6993b = new C4066ah(c5971zg.f12566a);
        this.f6997f = 0;
        this.f7003l = -9223372036854775807L;
        this.f6994c = str;
    }

    /* renamed from: b */
    private boolean m98362b(C4066ah c4066ah) {
        while (true) {
            if (c4066ah.m100797a() <= 0) {
                return false;
            }
            if (!this.f6999h) {
                this.f6999h = c4066ah.m100762w() == 11;
            } else {
                int m100762w = c4066ah.m100762w();
                if (m100762w == 119) {
                    this.f6999h = false;
                    return true;
                }
                this.f6999h = m100762w == 11;
            }
        }
    }

    /* renamed from: a */
    private boolean m98363a(C4066ah c4066ah, byte[] bArr, int i) {
        int min = Math.min(c4066ah.m100797a(), i - this.f6998g);
        c4066ah.m100790a(bArr, this.f6998g, min);
        int i2 = this.f6998g + min;
        this.f6998g = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        c4283d.m99724a();
        this.f6995d = c4283d.m99723b();
        this.f6996e = interfaceC4760l8.mo97782a(c4283d.m99722c(), 1);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f7003l = j;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f6997f = 0;
        this.f6998g = 0;
        this.f6999h = false;
        this.f7003l = -9223372036854775807L;
    }
}
