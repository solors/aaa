package com.applovin.impl;

import androidx.core.view.InputDeviceCompat;
import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.hj */
/* loaded from: classes2.dex */
public final class C4529hj implements InterfaceC4279dp {

    /* renamed from: a */
    private final InterfaceC4472gj f6653a;

    /* renamed from: b */
    private final C4066ah f6654b = new C4066ah(32);

    /* renamed from: c */
    private int f6655c;

    /* renamed from: d */
    private int f6656d;

    /* renamed from: e */
    private boolean f6657e;

    /* renamed from: f */
    private boolean f6658f;

    public C4529hj(InterfaceC4472gj interfaceC4472gj) {
        this.f6653a = interfaceC4472gj;
    }

    @Override // com.applovin.impl.InterfaceC4279dp
    /* renamed from: a */
    public void mo98424a(C4066ah c4066ah, int i) {
        boolean z = (i & 1) != 0;
        int m100785d = z ? c4066ah.m100785d() + c4066ah.m100762w() : -1;
        if (this.f6658f) {
            if (!z) {
                return;
            }
            this.f6658f = false;
            c4066ah.m100780f(m100785d);
            this.f6656d = 0;
        }
        while (c4066ah.m100797a() > 0) {
            int i2 = this.f6656d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int m100762w = c4066ah.m100762w();
                    c4066ah.m100780f(c4066ah.m100785d() - 1);
                    if (m100762w == 255) {
                        this.f6658f = true;
                        return;
                    }
                }
                int min = Math.min(c4066ah.m100797a(), 3 - this.f6656d);
                c4066ah.m100790a(this.f6654b.m100787c(), this.f6656d, min);
                int i3 = this.f6656d + min;
                this.f6656d = i3;
                if (i3 == 3) {
                    this.f6654b.m100780f(0);
                    this.f6654b.m100782e(3);
                    this.f6654b.m100778g(1);
                    int m100762w2 = this.f6654b.m100762w();
                    int m100762w3 = this.f6654b.m100762w();
                    this.f6657e = (m100762w2 & 128) != 0;
                    this.f6655c = (((m100762w2 & 15) << 8) | m100762w3) + 3;
                    int m100789b = this.f6654b.m100789b();
                    int i4 = this.f6655c;
                    if (m100789b < i4) {
                        this.f6654b.m100795a(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, this.f6654b.m100789b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c4066ah.m100797a(), this.f6655c - this.f6656d);
                c4066ah.m100790a(this.f6654b.m100787c(), this.f6656d, min2);
                int i5 = this.f6656d + min2;
                this.f6656d = i5;
                int i6 = this.f6655c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f6657e) {
                        if (AbstractC5863xp.m93005a(this.f6654b.m100787c(), 0, this.f6655c, -1) != 0) {
                            this.f6658f = true;
                            return;
                        }
                        this.f6654b.m100782e(this.f6655c - 4);
                    } else {
                        this.f6654b.m100782e(i6);
                    }
                    this.f6654b.m100780f(0);
                    this.f6653a.mo98929a(this.f6654b);
                    this.f6656d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4279dp
    /* renamed from: a */
    public void mo98422a(C4537ho c4537ho, InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        this.f6653a.mo98928a(c4537ho, interfaceC4760l8, c4283d);
        this.f6658f = true;
    }

    @Override // com.applovin.impl.InterfaceC4279dp
    /* renamed from: a */
    public void mo98426a() {
        this.f6658f = true;
    }
}
