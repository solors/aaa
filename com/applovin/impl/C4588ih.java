package com.applovin.impl;

import com.applovin.impl.InterfaceC4279dp;

/* renamed from: com.applovin.impl.ih */
/* loaded from: classes2.dex */
public final class C4588ih implements InterfaceC4279dp {

    /* renamed from: a */
    private final InterfaceC5107p7 f6904a;

    /* renamed from: b */
    private final C5971zg f6905b = new C5971zg(new byte[10]);

    /* renamed from: c */
    private int f6906c = 0;

    /* renamed from: d */
    private int f6907d;

    /* renamed from: e */
    private C4537ho f6908e;

    /* renamed from: f */
    private boolean f6909f;

    /* renamed from: g */
    private boolean f6910g;

    /* renamed from: h */
    private boolean f6911h;

    /* renamed from: i */
    private int f6912i;

    /* renamed from: j */
    private int f6913j;

    /* renamed from: k */
    private boolean f6914k;

    /* renamed from: l */
    private long f6915l;

    public C4588ih(InterfaceC5107p7 interfaceC5107p7) {
        this.f6904a = interfaceC5107p7;
    }

    /* renamed from: b */
    private boolean m98421b() {
        this.f6905b.m92392c(0);
        int m92403a = this.f6905b.m92403a(24);
        if (m92403a != 1) {
            AbstractC5063oc.m96800d("PesReader", "Unexpected start code prefix: " + m92403a);
            this.f6913j = -1;
            return false;
        }
        this.f6905b.m92390d(8);
        int m92403a2 = this.f6905b.m92403a(16);
        this.f6905b.m92390d(5);
        this.f6914k = this.f6905b.m92387f();
        this.f6905b.m92390d(2);
        this.f6909f = this.f6905b.m92387f();
        this.f6910g = this.f6905b.m92387f();
        this.f6905b.m92390d(6);
        int m92403a3 = this.f6905b.m92403a(8);
        this.f6912i = m92403a3;
        if (m92403a2 == 0) {
            this.f6913j = -1;
        } else {
            int i = (m92403a2 - 3) - m92403a3;
            this.f6913j = i;
            if (i < 0) {
                AbstractC5063oc.m96800d("PesReader", "Found negative packet payload size: " + this.f6913j);
                this.f6913j = -1;
            }
        }
        return true;
    }

    /* renamed from: c */
    private void m98420c() {
        this.f6905b.m92392c(0);
        this.f6915l = -9223372036854775807L;
        if (this.f6909f) {
            this.f6905b.m92390d(4);
            this.f6905b.m92390d(1);
            this.f6905b.m92390d(1);
            long m92403a = (this.f6905b.m92403a(3) << 30) | (this.f6905b.m92403a(15) << 15) | this.f6905b.m92403a(15);
            this.f6905b.m92390d(1);
            if (!this.f6911h && this.f6910g) {
                this.f6905b.m92390d(4);
                this.f6905b.m92390d(1);
                this.f6905b.m92390d(1);
                this.f6905b.m92390d(1);
                this.f6908e.m98645b((this.f6905b.m92403a(3) << 30) | (this.f6905b.m92403a(15) << 15) | this.f6905b.m92403a(15));
                this.f6911h = true;
            }
            this.f6915l = this.f6908e.m98645b(m92403a);
        }
    }

    @Override // com.applovin.impl.InterfaceC4279dp
    /* renamed from: a */
    public final void mo98424a(C4066ah c4066ah, int i) {
        AbstractC4100b1.m100578b(this.f6908e);
        if ((i & 1) != 0) {
            int i2 = this.f6906c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    AbstractC5063oc.m96800d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f6913j != -1) {
                        AbstractC5063oc.m96800d("PesReader", "Unexpected start indicator: expected " + this.f6913j + " more bytes");
                    }
                    this.f6904a.mo92452b();
                } else {
                    throw new IllegalStateException();
                }
            }
            m98425a(1);
        }
        while (c4066ah.m100797a() > 0) {
            int i3 = this.f6906c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m98423a(c4066ah, this.f6905b.f12566a, Math.min(10, this.f6912i)) && m98423a(c4066ah, (byte[]) null, this.f6912i)) {
                            m98420c();
                            i |= this.f6914k ? 4 : 0;
                            this.f6904a.mo92455a(this.f6915l, i);
                            m98425a(3);
                        }
                    } else if (i3 == 3) {
                        int m100797a = c4066ah.m100797a();
                        int i4 = this.f6913j;
                        int i5 = i4 != -1 ? m100797a - i4 : 0;
                        if (i5 > 0) {
                            m100797a -= i5;
                            c4066ah.m100782e(c4066ah.m100785d() + m100797a);
                        }
                        this.f6904a.mo92454a(c4066ah);
                        int i6 = this.f6913j;
                        if (i6 != -1) {
                            int i7 = i6 - m100797a;
                            this.f6913j = i7;
                            if (i7 == 0) {
                                this.f6904a.mo92452b();
                                m98425a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m98423a(c4066ah, this.f6905b.f12566a, 9)) {
                    m98425a(m98421b() ? 2 : 0);
                }
            } else {
                c4066ah.m100778g(c4066ah.m100797a());
            }
        }
    }

    /* renamed from: a */
    private boolean m98423a(C4066ah c4066ah, byte[] bArr, int i) {
        int min = Math.min(c4066ah.m100797a(), i - this.f6907d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c4066ah.m100778g(min);
        } else {
            c4066ah.m100790a(bArr, this.f6907d, min);
        }
        int i2 = this.f6907d + min;
        this.f6907d = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.InterfaceC4279dp
    /* renamed from: a */
    public void mo98422a(C4537ho c4537ho, InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        this.f6908e = c4537ho;
        this.f6904a.mo92453a(interfaceC4760l8, c4283d);
    }

    @Override // com.applovin.impl.InterfaceC4279dp
    /* renamed from: a */
    public final void mo98426a() {
        this.f6906c = 0;
        this.f6907d = 0;
        this.f6911h = false;
        this.f6904a.mo92456a();
    }

    /* renamed from: a */
    private void m98425a(int i) {
        this.f6906c = i;
        this.f6907d = 0;
    }
}
