package com.applovin.impl;

import com.applovin.impl.AbstractC5855xl;
import com.applovin.impl.C4310e9;

/* renamed from: com.applovin.impl.yq */
/* loaded from: classes2.dex */
final class C5929yq extends AbstractC5855xl {

    /* renamed from: b */
    private final C4066ah f12382b;

    /* renamed from: c */
    private final C4066ah f12383c;

    /* renamed from: d */
    private int f12384d;

    /* renamed from: e */
    private boolean f12385e;

    /* renamed from: f */
    private boolean f12386f;

    /* renamed from: g */
    private int f12387g;

    public C5929yq(InterfaceC5209qo interfaceC5209qo) {
        super(interfaceC5209qo);
        this.f12382b = new C4066ah(AbstractC5912yf.f12322a);
        this.f12383c = new C4066ah(4);
    }

    @Override // com.applovin.impl.AbstractC5855xl
    /* renamed from: a */
    protected boolean mo92617a(C4066ah c4066ah) {
        int m100762w = c4066ah.m100762w();
        int i = (m100762w >> 4) & 15;
        int i2 = m100762w & 15;
        if (i2 == 7) {
            this.f12387g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new AbstractC5855xl.C5856a("Video format not supported: " + i2);
    }

    @Override // com.applovin.impl.AbstractC5855xl
    /* renamed from: b */
    protected boolean mo92616b(C4066ah c4066ah, long j) {
        int i;
        int m100762w = c4066ah.m100762w();
        long m100774k = j + (c4066ah.m100774k() * 1000);
        if (m100762w == 0 && !this.f12385e) {
            C4066ah c4066ah2 = new C4066ah(new byte[c4066ah.m100797a()]);
            c4066ah.m100790a(c4066ah2.m100787c(), 0, c4066ah.m100797a());
            C5737w1 m93754b = C5737w1.m93754b(c4066ah2);
            this.f12384d = m93754b.f11591b;
            this.f12126a.mo96251a(new C4310e9.C4312b().m99606f("video/avc").m99624a(m93754b.f11595f).m99585q(m93754b.f11592c).m99605g(m93754b.f11593d).m99621b(m93754b.f11594e).m99623a(m93754b.f11590a).m99632a());
            this.f12385e = true;
            return false;
        } else if (m100762w != 1 || !this.f12385e) {
            return false;
        } else {
            if (this.f12387g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f12386f && i == 0) {
                return false;
            }
            byte[] m100787c = this.f12383c.m100787c();
            m100787c[0] = 0;
            m100787c[1] = 0;
            m100787c[2] = 0;
            int i2 = 4 - this.f12384d;
            int i3 = 0;
            while (c4066ah.m100797a() > 0) {
                c4066ah.m100790a(this.f12383c.m100787c(), i2, this.f12384d);
                this.f12383c.m100780f(0);
                int m100801A = this.f12383c.m100801A();
                this.f12382b.m100780f(0);
                this.f12126a.m96253a(this.f12382b, 4);
                this.f12126a.m96253a(c4066ah, m100801A);
                i3 = i3 + 4 + m100801A;
            }
            this.f12126a.mo96254a(m100774k, i, i3, 0, null);
            this.f12386f = true;
            return true;
        }
    }
}
