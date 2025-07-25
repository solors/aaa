package com.applovin.impl;

import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.d7 */
/* loaded from: classes2.dex */
public final class C4235d7 implements InterfaceC5107p7 {

    /* renamed from: b */
    private final String f5502b;

    /* renamed from: c */
    private String f5503c;

    /* renamed from: d */
    private InterfaceC5209qo f5504d;

    /* renamed from: f */
    private int f5506f;

    /* renamed from: g */
    private int f5507g;

    /* renamed from: h */
    private long f5508h;

    /* renamed from: i */
    private C4310e9 f5509i;

    /* renamed from: j */
    private int f5510j;

    /* renamed from: a */
    private final C4066ah f5501a = new C4066ah(new byte[18]);

    /* renamed from: e */
    private int f5505e = 0;

    /* renamed from: k */
    private long f5511k = -9223372036854775807L;

    public C4235d7(String str) {
        this.f5502b = str;
    }

    /* renamed from: c */
    private void m99981c() {
        byte[] m100787c = this.f5501a.m100787c();
        if (this.f5509i == null) {
            C4310e9 m99651a = AbstractC4308e7.m99651a(m100787c, this.f5503c, this.f5502b, null);
            this.f5509i = m99651a;
            this.f5504d.mo96251a(m99651a);
        }
        this.f5510j = AbstractC4308e7.m99652a(m100787c);
        this.f5508h = (int) ((AbstractC4308e7.m99648d(m100787c) * 1000000) / this.f5509i.f5795A);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        AbstractC4100b1.m100578b(this.f5504d);
        while (c4066ah.m100797a() > 0) {
            int i = this.f5505e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c4066ah.m100797a(), this.f5510j - this.f5506f);
                        this.f5504d.m96253a(c4066ah, min);
                        int i2 = this.f5506f + min;
                        this.f5506f = i2;
                        int i3 = this.f5510j;
                        if (i2 == i3) {
                            long j = this.f5511k;
                            if (j != -9223372036854775807L) {
                                this.f5504d.mo96254a(j, 1, i3, 0, null);
                                this.f5511k += this.f5508h;
                            }
                            this.f5505e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m99983a(c4066ah, this.f5501a.m100787c(), 18)) {
                    m99981c();
                    this.f5501a.m100780f(0);
                    this.f5504d.m96253a(this.f5501a, 18);
                    this.f5505e = 2;
                }
            } else if (m99982b(c4066ah)) {
                this.f5505e = 1;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
    }

    /* renamed from: b */
    private boolean m99982b(C4066ah c4066ah) {
        while (c4066ah.m100797a() > 0) {
            int i = this.f5507g << 8;
            this.f5507g = i;
            int m100762w = i | c4066ah.m100762w();
            this.f5507g = m100762w;
            if (AbstractC4308e7.m99654a(m100762w)) {
                byte[] m100787c = this.f5501a.m100787c();
                int i2 = this.f5507g;
                m100787c[0] = (byte) ((i2 >> 24) & 255);
                m100787c[1] = (byte) ((i2 >> 16) & 255);
                m100787c[2] = (byte) ((i2 >> 8) & 255);
                m100787c[3] = (byte) (i2 & 255);
                this.f5506f = 4;
                this.f5507g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m99983a(C4066ah c4066ah, byte[] bArr, int i) {
        int min = Math.min(c4066ah.m100797a(), i - this.f5506f);
        c4066ah.m100790a(bArr, this.f5506f, min);
        int i2 = this.f5506f + min;
        this.f5506f = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        c4283d.m99724a();
        this.f5503c = c4283d.m99723b();
        this.f5504d = interfaceC4760l8.mo97782a(c4283d.m99722c(), 1);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5511k = j;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f5505e = 0;
        this.f5506f = 0;
        this.f5507g = 0;
        this.f5511k = -9223372036854775807L;
    }
}
