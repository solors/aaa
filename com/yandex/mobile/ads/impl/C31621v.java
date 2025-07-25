package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C31712w;
import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;

/* renamed from: com.yandex.mobile.ads.impl.v */
/* loaded from: classes8.dex */
public final class C31621v implements t20 {

    /* renamed from: a */
    private final bc1 f86503a;

    /* renamed from: b */
    private final cc1 f86504b;
    @Nullable

    /* renamed from: c */
    private final String f86505c;

    /* renamed from: d */
    private String f86506d;

    /* renamed from: e */
    private x02 f86507e;

    /* renamed from: f */
    private int f86508f;

    /* renamed from: g */
    private int f86509g;

    /* renamed from: h */
    private boolean f86510h;

    /* renamed from: i */
    private boolean f86511i;

    /* renamed from: j */
    private long f86512j;

    /* renamed from: k */
    private v90 f86513k;

    /* renamed from: l */
    private int f86514l;

    /* renamed from: m */
    private long f86515m;

    public C31621v() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26245a(cc1 cc1Var) {
        if (this.f86507e != null) {
            while (cc1Var.m35299a() > 0) {
                int i = this.f86508f;
                if (i == 0) {
                    while (cc1Var.m35299a() > 0) {
                        if (!this.f86510h) {
                            this.f86510h = cc1Var.m35270t() == 172;
                        } else {
                            int m35270t = cc1Var.m35270t();
                            this.f86510h = m35270t == 172;
                            if (m35270t == 64 || m35270t == 65) {
                                this.f86511i = m35270t == 65;
                                this.f86508f = 1;
                                this.f86504b.m35291c()[0] = -84;
                                this.f86504b.m35291c()[1] = (byte) (this.f86511i ? 65 : 64);
                                this.f86509g = 2;
                            }
                        }
                    }
                } else if (i == 1) {
                    byte[] m35291c = this.f86504b.m35291c();
                    int min = Math.min(cc1Var.m35299a(), 16 - this.f86509g);
                    cc1Var.m35294a(m35291c, this.f86509g, min);
                    int i2 = this.f86509g + min;
                    this.f86509g = i2;
                    if (i2 == 16) {
                        this.f86503a.m35499c(0);
                        C31712w.C31713a m28090a = C31712w.m28090a(this.f86503a);
                        v90 v90Var = this.f86513k;
                        if (v90Var == null || 2 != v90Var.f86636z || m28090a.f87066a != v90Var.f86605A || !"audio/ac4".equals(v90Var.f86623m)) {
                            v90 m28454a = new v90.C31640a().m28438b(this.f86506d).m28426e("audio/ac4").m28436c(2).m28409l(m28090a.f87066a).m28430d(this.f86505c).m28454a();
                            this.f86513k = m28454a;
                            this.f86507e.mo26064a(m28454a);
                        }
                        this.f86514l = m28090a.f87067b;
                        this.f86512j = (m28090a.f87068c * 1000000) / this.f86513k.f86605A;
                        this.f86504b.m35286e(0);
                        this.f86507e.m27709a(16, this.f86504b);
                        this.f86508f = 2;
                    }
                } else if (i == 2) {
                    int min2 = Math.min(cc1Var.m35299a(), this.f86514l - this.f86509g);
                    this.f86507e.m27709a(min2, cc1Var);
                    int i3 = this.f86509g + min2;
                    this.f86509g = i3;
                    int i4 = this.f86514l;
                    if (i3 == i4) {
                        long j = this.f86515m;
                        if (j != -9223372036854775807L) {
                            this.f86507e.mo26069a(j, 1, i4, 0, null);
                            this.f86515m += this.f86512j;
                        }
                        this.f86508f = 0;
                    }
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public C31621v(@Nullable String str) {
        byte[] bArr = new byte[16];
        this.f86503a = new bc1(bArr);
        this.f86504b = new cc1(bArr);
        this.f86508f = 0;
        this.f86509g = 0;
        this.f86510h = false;
        this.f86511i = false;
        this.f86515m = -9223372036854775807L;
        this.f86505c = str;
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: b */
    public final void mo26243b() {
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26244a(p50 p50Var, k22.C30694d c30694d) {
        c30694d.m32682a();
        this.f86506d = c30694d.m32681b();
        this.f86507e = p50Var.mo26223a(c30694d.m32680c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26246a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f86515m = j;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26247a() {
        this.f86508f = 0;
        this.f86509g = 0;
        this.f86510h = false;
        this.f86511i = false;
        this.f86515m = -9223372036854775807L;
    }
}
