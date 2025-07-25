package com.applovin.impl;

import com.applovin.impl.AbstractC3977a;
import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;
import java.util.Collections;

/* renamed from: com.applovin.impl.ac */
/* loaded from: classes2.dex */
public final class C4003ac implements InterfaceC5107p7 {

    /* renamed from: a */
    private final String f4543a;

    /* renamed from: b */
    private final C4066ah f4544b;

    /* renamed from: c */
    private final C5971zg f4545c;

    /* renamed from: d */
    private InterfaceC5209qo f4546d;

    /* renamed from: e */
    private String f4547e;

    /* renamed from: f */
    private C4310e9 f4548f;

    /* renamed from: g */
    private int f4549g;

    /* renamed from: h */
    private int f4550h;

    /* renamed from: i */
    private int f4551i;

    /* renamed from: j */
    private int f4552j;

    /* renamed from: k */
    private long f4553k;

    /* renamed from: l */
    private boolean f4554l;

    /* renamed from: m */
    private int f4555m;

    /* renamed from: n */
    private int f4556n;

    /* renamed from: o */
    private int f4557o;

    /* renamed from: p */
    private boolean f4558p;

    /* renamed from: q */
    private long f4559q;

    /* renamed from: r */
    private int f4560r;

    /* renamed from: s */
    private long f4561s;

    /* renamed from: t */
    private int f4562t;

    /* renamed from: u */
    private String f4563u;

    public C4003ac(String str) {
        this.f4543a = str;
        C4066ah c4066ah = new C4066ah(1024);
        this.f4544b = c4066ah;
        this.f4545c = new C5971zg(c4066ah.m100787c());
        this.f4553k = -9223372036854775807L;
    }

    /* renamed from: c */
    private int m100997c(C5971zg c5971zg) {
        int m92396b = c5971zg.m92396b();
        AbstractC3977a.C3979b m101088a = AbstractC3977a.m101088a(c5971zg, true);
        this.f4563u = m101088a.f4455c;
        this.f4560r = m101088a.f4453a;
        this.f4562t = m101088a.f4454b;
        return m92396b - c5971zg.m92396b();
    }

    /* renamed from: d */
    private void m100996d(C5971zg c5971zg) {
        int m92403a = c5971zg.m92403a(3);
        this.f4557o = m92403a;
        if (m92403a != 0) {
            if (m92403a != 1) {
                if (m92403a != 3 && m92403a != 4 && m92403a != 5) {
                    if (m92403a != 6 && m92403a != 7) {
                        throw new IllegalStateException();
                    }
                    c5971zg.m92390d(1);
                    return;
                }
                c5971zg.m92390d(6);
                return;
            }
            c5971zg.m92390d(9);
            return;
        }
        c5971zg.m92390d(8);
    }

    /* renamed from: e */
    private int m100995e(C5971zg c5971zg) {
        int m92403a;
        if (this.f4557o == 0) {
            int i = 0;
            do {
                m92403a = c5971zg.m92403a(8);
                i += m92403a;
            } while (m92403a == 255);
            return i;
        }
        throw C4187ch.m100188a(null, null);
    }

    /* renamed from: f */
    private void m100994f(C5971zg c5971zg) {
        int i;
        boolean m92387f;
        int m92403a = c5971zg.m92403a(1);
        if (m92403a == 1) {
            i = c5971zg.m92403a(1);
        } else {
            i = 0;
        }
        this.f4555m = i;
        if (i == 0) {
            if (m92403a == 1) {
                m101000a(c5971zg);
            }
            if (c5971zg.m92387f()) {
                this.f4556n = c5971zg.m92403a(6);
                int m92403a2 = c5971zg.m92403a(4);
                int m92403a3 = c5971zg.m92403a(3);
                if (m92403a2 == 0 && m92403a3 == 0) {
                    if (m92403a == 0) {
                        int m92389e = c5971zg.m92389e();
                        int m100997c = m100997c(c5971zg);
                        c5971zg.m92392c(m92389e);
                        byte[] bArr = new byte[(m100997c + 7) / 8];
                        c5971zg.m92397a(bArr, 0, m100997c);
                        C4310e9 m99632a = new C4310e9.C4312b().m99615c(this.f4547e).m99606f("audio/mp4a-latm").m99624a(this.f4563u).m99617c(this.f4562t).m99591n(this.f4560r).m99623a(Collections.singletonList(bArr)).m99609e(this.f4543a).m99632a();
                        if (!m99632a.equals(this.f4548f)) {
                            this.f4548f = m99632a;
                            this.f4561s = 1024000000 / m99632a.f5795A;
                            this.f4546d.mo96251a(m99632a);
                        }
                    } else {
                        c5971zg.m92390d(((int) m101000a(c5971zg)) - m100997c(c5971zg));
                    }
                    m100996d(c5971zg);
                    boolean m92387f2 = c5971zg.m92387f();
                    this.f4558p = m92387f2;
                    this.f4559q = 0L;
                    if (m92387f2) {
                        if (m92403a == 1) {
                            this.f4559q = m101000a(c5971zg);
                        } else {
                            do {
                                m92387f = c5971zg.m92387f();
                                this.f4559q = (this.f4559q << 8) + c5971zg.m92403a(8);
                            } while (m92387f);
                        }
                    }
                    if (c5971zg.m92387f()) {
                        c5971zg.m92390d(8);
                        return;
                    }
                    return;
                }
                throw C4187ch.m100188a(null, null);
            }
            throw C4187ch.m100188a(null, null);
        }
        throw C4187ch.m100188a(null, null);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        AbstractC4100b1.m100578b(this.f4546d);
        while (c4066ah.m100797a() > 0) {
            int i = this.f4549g;
            if (i != 0) {
                if (i == 1) {
                    int m100762w = c4066ah.m100762w();
                    if ((m100762w & 224) == 224) {
                        this.f4552j = m100762w;
                        this.f4549g = 2;
                    } else if (m100762w != 86) {
                        this.f4549g = 0;
                    }
                } else if (i == 2) {
                    int m100762w2 = ((this.f4552j & (-225)) << 8) | c4066ah.m100762w();
                    this.f4551i = m100762w2;
                    if (m100762w2 > this.f4544b.m100787c().length) {
                        m101001a(this.f4551i);
                    }
                    this.f4550h = 0;
                    this.f4549g = 3;
                } else if (i == 3) {
                    int min = Math.min(c4066ah.m100797a(), this.f4551i - this.f4550h);
                    c4066ah.m100790a(this.f4545c.f12566a, this.f4550h, min);
                    int i2 = this.f4550h + min;
                    this.f4550h = i2;
                    if (i2 == this.f4551i) {
                        this.f4545c.m92392c(0);
                        m100998b(this.f4545c);
                        this.f4549g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (c4066ah.m100762w() == 86) {
                this.f4549g = 1;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
    }

    /* renamed from: b */
    private void m100998b(C5971zg c5971zg) {
        if (!c5971zg.m92387f()) {
            this.f4554l = true;
            m100994f(c5971zg);
        } else if (!this.f4554l) {
            return;
        }
        if (this.f4555m == 0) {
            if (this.f4556n == 0) {
                m100999a(c5971zg, m100995e(c5971zg));
                if (this.f4558p) {
                    c5971zg.m92390d((int) this.f4559q);
                    return;
                }
                return;
            }
            throw C4187ch.m100188a(null, null);
        }
        throw C4187ch.m100188a(null, null);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        c4283d.m99724a();
        this.f4546d = interfaceC4760l8.mo97782a(c4283d.m99722c(), 1);
        this.f4547e = c4283d.m99723b();
    }

    /* renamed from: a */
    private static long m101000a(C5971zg c5971zg) {
        return c5971zg.m92403a((c5971zg.m92403a(2) + 1) * 8);
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f4553k = j;
        }
    }

    /* renamed from: a */
    private void m100999a(C5971zg c5971zg, int i) {
        int m92389e = c5971zg.m92389e();
        if ((m92389e & 7) == 0) {
            this.f4544b.m100780f(m92389e >> 3);
        } else {
            c5971zg.m92397a(this.f4544b.m100787c(), 0, i * 8);
            this.f4544b.m100780f(0);
        }
        this.f4546d.m96253a(this.f4544b, i);
        long j = this.f4553k;
        if (j != -9223372036854775807L) {
            this.f4546d.mo96254a(j, 1, i, 0, null);
            this.f4553k += this.f4561s;
        }
    }

    /* renamed from: a */
    private void m101001a(int i) {
        this.f4544b.m100784d(i);
        this.f4545c.m92399a(this.f4544b.m100787c());
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f4549g = 0;
        this.f4553k = -9223372036854775807L;
        this.f4554l = false;
    }
}
