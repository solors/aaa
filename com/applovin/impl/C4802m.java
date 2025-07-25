package com.applovin.impl;

import com.applovin.impl.AbstractC4979n;
import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.m */
/* loaded from: classes2.dex */
public final class C4802m implements InterfaceC5107p7 {

    /* renamed from: a */
    private final C5971zg f7843a;

    /* renamed from: b */
    private final C4066ah f7844b;

    /* renamed from: c */
    private final String f7845c;

    /* renamed from: d */
    private String f7846d;

    /* renamed from: e */
    private InterfaceC5209qo f7847e;

    /* renamed from: f */
    private int f7848f;

    /* renamed from: g */
    private int f7849g;

    /* renamed from: h */
    private boolean f7850h;

    /* renamed from: i */
    private boolean f7851i;

    /* renamed from: j */
    private long f7852j;

    /* renamed from: k */
    private C4310e9 f7853k;

    /* renamed from: l */
    private int f7854l;

    /* renamed from: m */
    private long f7855m;

    public C4802m() {
        this(null);
    }

    /* renamed from: c */
    private void m97618c() {
        this.f7843a.m92392c(0);
        AbstractC4979n.C4981b m97050a = AbstractC4979n.m97050a(this.f7843a);
        C4310e9 c4310e9 = this.f7853k;
        if (c4310e9 == null || m97050a.f8483c != c4310e9.f5826z || m97050a.f8482b != c4310e9.f5795A || !"audio/ac4".equals(c4310e9.f5813m)) {
            C4310e9 m99632a = new C4310e9.C4312b().m99615c(this.f7846d).m99606f("audio/ac4").m99617c(m97050a.f8483c).m99591n(m97050a.f8482b).m99609e(this.f7845c).m99632a();
            this.f7853k = m99632a;
            this.f7847e.mo96251a(m99632a);
        }
        this.f7854l = m97050a.f8484d;
        this.f7852j = (m97050a.f8485e * 1000000) / this.f7853k.f5795A;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        AbstractC4100b1.m100578b(this.f7847e);
        while (c4066ah.m100797a() > 0) {
            int i = this.f7848f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c4066ah.m100797a(), this.f7854l - this.f7849g);
                        this.f7847e.m96253a(c4066ah, min);
                        int i2 = this.f7849g + min;
                        this.f7849g = i2;
                        int i3 = this.f7854l;
                        if (i2 == i3) {
                            long j = this.f7855m;
                            if (j != -9223372036854775807L) {
                                this.f7847e.mo96254a(j, 1, i3, 0, null);
                                this.f7855m += this.f7852j;
                            }
                            this.f7848f = 0;
                        }
                    }
                } else if (m97620a(c4066ah, this.f7844b.m100787c(), 16)) {
                    m97618c();
                    this.f7844b.m100780f(0);
                    this.f7847e.m96253a(this.f7844b, 16);
                    this.f7848f = 2;
                }
            } else if (m97619b(c4066ah)) {
                this.f7848f = 1;
                this.f7844b.m100787c()[0] = -84;
                this.f7844b.m100787c()[1] = (byte) (this.f7851i ? 65 : 64);
                this.f7849g = 2;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
    }

    public C4802m(String str) {
        C5971zg c5971zg = new C5971zg(new byte[16]);
        this.f7843a = c5971zg;
        this.f7844b = new C4066ah(c5971zg.f12566a);
        this.f7848f = 0;
        this.f7849g = 0;
        this.f7850h = false;
        this.f7851i = false;
        this.f7855m = -9223372036854775807L;
        this.f7845c = str;
    }

    /* renamed from: b */
    private boolean m97619b(C4066ah c4066ah) {
        int m100762w;
        while (true) {
            if (c4066ah.m100797a() <= 0) {
                return false;
            }
            if (!this.f7850h) {
                this.f7850h = c4066ah.m100762w() == 172;
            } else {
                m100762w = c4066ah.m100762w();
                this.f7850h = m100762w == 172;
                if (m100762w == 64 || m100762w == 65) {
                    break;
                }
            }
        }
        this.f7851i = m100762w == 65;
        return true;
    }

    /* renamed from: a */
    private boolean m97620a(C4066ah c4066ah, byte[] bArr, int i) {
        int min = Math.min(c4066ah.m100797a(), i - this.f7849g);
        c4066ah.m100790a(bArr, this.f7849g, min);
        int i2 = this.f7849g + min;
        this.f7849g = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        c4283d.m99724a();
        this.f7846d = c4283d.m99723b();
        this.f7847e = interfaceC4760l8.mo97782a(c4283d.m99722c(), 1);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f7855m = j;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f7848f = 0;
        this.f7849g = 0;
        this.f7850h = false;
        this.f7851i = false;
        this.f7855m = -9223372036854775807L;
    }
}
