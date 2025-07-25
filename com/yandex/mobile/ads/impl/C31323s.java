package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C31415t;
import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;

/* renamed from: com.yandex.mobile.ads.impl.s */
/* loaded from: classes8.dex */
public final class C31323s implements t20 {

    /* renamed from: a */
    private final bc1 f84955a;

    /* renamed from: b */
    private final cc1 f84956b;
    @Nullable

    /* renamed from: c */
    private final String f84957c;

    /* renamed from: d */
    private String f84958d;

    /* renamed from: e */
    private x02 f84959e;

    /* renamed from: f */
    private int f84960f;

    /* renamed from: g */
    private int f84961g;

    /* renamed from: h */
    private boolean f84962h;

    /* renamed from: i */
    private long f84963i;

    /* renamed from: j */
    private v90 f84964j;

    /* renamed from: k */
    private int f84965k;

    /* renamed from: l */
    private long f84966l;

    public C31323s() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26245a(cc1 cc1Var) {
        if (this.f84959e != null) {
            while (cc1Var.m35299a() > 0) {
                int i = this.f84960f;
                if (i == 0) {
                    while (true) {
                        if (cc1Var.m35299a() <= 0) {
                            break;
                        } else if (!this.f84962h) {
                            this.f84962h = cc1Var.m35270t() == 11;
                        } else {
                            int m35270t = cc1Var.m35270t();
                            if (m35270t == 119) {
                                this.f84962h = false;
                                this.f84960f = 1;
                                this.f84956b.m35291c()[0] = 11;
                                this.f84956b.m35291c()[1] = 119;
                                this.f84961g = 2;
                                break;
                            }
                            this.f84962h = m35270t == 11;
                        }
                    }
                } else if (i == 1) {
                    byte[] m35291c = this.f84956b.m35291c();
                    int min = Math.min(cc1Var.m35299a(), 128 - this.f84961g);
                    cc1Var.m35294a(m35291c, this.f84961g, min);
                    int i2 = this.f84961g + min;
                    this.f84961g = i2;
                    if (i2 == 128) {
                        this.f84955a.m35499c(0);
                        C31415t.C31416a m29339a = C31415t.m29339a(this.f84955a);
                        v90 v90Var = this.f84964j;
                        if (v90Var == null || m29339a.f85468c != v90Var.f86636z || m29339a.f85467b != v90Var.f86605A || !y32.m27076a(m29339a.f85466a, v90Var.f86623m)) {
                            v90 m28454a = new v90.C31640a().m28438b(this.f84958d).m28426e(m29339a.f85466a).m28436c(m29339a.f85468c).m28409l(m29339a.f85467b).m28430d(this.f84957c).m28454a();
                            this.f84964j = m28454a;
                            this.f84959e.mo26064a(m28454a);
                        }
                        this.f84965k = m29339a.f85469d;
                        this.f84963i = (m29339a.f85470e * 1000000) / this.f84964j.f86605A;
                        this.f84956b.m35286e(0);
                        this.f84959e.m27709a(128, this.f84956b);
                        this.f84960f = 2;
                    }
                } else if (i == 2) {
                    int min2 = Math.min(cc1Var.m35299a(), this.f84965k - this.f84961g);
                    this.f84959e.m27709a(min2, cc1Var);
                    int i3 = this.f84961g + min2;
                    this.f84961g = i3;
                    int i4 = this.f84965k;
                    if (i3 == i4) {
                        long j = this.f84966l;
                        if (j != -9223372036854775807L) {
                            this.f84959e.mo26069a(j, 1, i4, 0, null);
                            this.f84966l += this.f84963i;
                        }
                        this.f84960f = 0;
                    }
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public C31323s(@Nullable String str) {
        byte[] bArr = new byte[128];
        this.f84955a = new bc1(bArr);
        this.f84956b = new cc1(bArr);
        this.f84960f = 0;
        this.f84966l = -9223372036854775807L;
        this.f84957c = str;
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: b */
    public final void mo26243b() {
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26244a(p50 p50Var, k22.C30694d c30694d) {
        c30694d.m32682a();
        this.f84958d = c30694d.m32681b();
        this.f84959e = p50Var.mo26223a(c30694d.m32680c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26246a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f84966l = j;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26247a() {
        this.f84960f = 0;
        this.f84961g = 0;
        this.f84962h = false;
        this.f84966l = -9223372036854775807L;
    }
}
