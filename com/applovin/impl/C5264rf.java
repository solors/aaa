package com.applovin.impl;

import com.applovin.impl.AbstractC5512sf;
import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.rf */
/* loaded from: classes2.dex */
public final class C5264rf implements InterfaceC5107p7 {

    /* renamed from: a */
    private final C4066ah f9419a;

    /* renamed from: b */
    private final AbstractC5512sf.C5513a f9420b;

    /* renamed from: c */
    private final String f9421c;

    /* renamed from: d */
    private InterfaceC5209qo f9422d;

    /* renamed from: e */
    private String f9423e;

    /* renamed from: f */
    private int f9424f;

    /* renamed from: g */
    private int f9425g;

    /* renamed from: h */
    private boolean f9426h;

    /* renamed from: i */
    private boolean f9427i;

    /* renamed from: j */
    private long f9428j;

    /* renamed from: k */
    private int f9429k;

    /* renamed from: l */
    private long f9430l;

    public C5264rf() {
        this(null);
    }

    /* renamed from: c */
    private void m95902c(C4066ah c4066ah) {
        int min = Math.min(c4066ah.m100797a(), this.f9429k - this.f9425g);
        this.f9422d.m96253a(c4066ah, min);
        int i = this.f9425g + min;
        this.f9425g = i;
        int i2 = this.f9429k;
        if (i < i2) {
            return;
        }
        long j = this.f9430l;
        if (j != -9223372036854775807L) {
            this.f9422d.mo96254a(j, 1, i2, 0, null);
            this.f9430l += this.f9428j;
        }
        this.f9425g = 0;
        this.f9424f = 0;
    }

    /* renamed from: d */
    private void m95901d(C4066ah c4066ah) {
        int min = Math.min(c4066ah.m100797a(), 4 - this.f9425g);
        c4066ah.m100790a(this.f9419a.m100787c(), this.f9425g, min);
        int i = this.f9425g + min;
        this.f9425g = i;
        if (i < 4) {
            return;
        }
        this.f9419a.m100780f(0);
        if (!this.f9420b.m94618a(this.f9419a.m100775j())) {
            this.f9425g = 0;
            this.f9424f = 1;
            return;
        }
        AbstractC5512sf.C5513a c5513a = this.f9420b;
        this.f9429k = c5513a.f10345c;
        if (!this.f9426h) {
            this.f9428j = (c5513a.f10349g * 1000000) / c5513a.f10346d;
            this.f9422d.mo96251a(new C4310e9.C4312b().m99615c(this.f9423e).m99606f(this.f9420b.f10344b).m99601i(4096).m99617c(this.f9420b.f10347e).m99591n(this.f9420b.f10346d).m99609e(this.f9421c).m99632a());
            this.f9426h = true;
        }
        this.f9419a.m100780f(0);
        this.f9422d.m96253a(this.f9419a, 4);
        this.f9424f = 2;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        AbstractC4100b1.m100578b(this.f9422d);
        while (c4066ah.m100797a() > 0) {
            int i = this.f9424f;
            if (i == 0) {
                m95903b(c4066ah);
            } else if (i == 1) {
                m95901d(c4066ah);
            } else if (i == 2) {
                m95902c(c4066ah);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
    }

    public C5264rf(String str) {
        this.f9424f = 0;
        C4066ah c4066ah = new C4066ah(4);
        this.f9419a = c4066ah;
        c4066ah.m100787c()[0] = -1;
        this.f9420b = new AbstractC5512sf.C5513a();
        this.f9430l = -9223372036854775807L;
        this.f9421c = str;
    }

    /* renamed from: b */
    private void m95903b(C4066ah c4066ah) {
        byte[] m100787c = c4066ah.m100787c();
        int m100783e = c4066ah.m100783e();
        for (int m100785d = c4066ah.m100785d(); m100785d < m100783e; m100785d++) {
            byte b = m100787c[m100785d];
            boolean z = (b & 255) == 255;
            boolean z2 = this.f9427i && (b & 224) == 224;
            this.f9427i = z;
            if (z2) {
                c4066ah.m100780f(m100785d + 1);
                this.f9427i = false;
                this.f9419a.m100787c()[1] = m100787c[m100785d];
                this.f9425g = 2;
                this.f9424f = 1;
                return;
            }
        }
        c4066ah.m100780f(m100783e);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        c4283d.m99724a();
        this.f9423e = c4283d.m99723b();
        this.f9422d = interfaceC4760l8.mo97782a(c4283d.m99722c(), 1);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f9430l = j;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f9424f = 0;
        this.f9425g = 0;
        this.f9427i = false;
        this.f9430l = -9223372036854775807L;
    }
}
