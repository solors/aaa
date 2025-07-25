package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;
import com.yandex.mobile.ads.impl.yy0;

/* loaded from: classes8.dex */
public final class xy0 implements t20 {

    /* renamed from: a */
    private final cc1 f87932a;

    /* renamed from: b */
    private final yy0.C31938a f87933b;
    @Nullable

    /* renamed from: c */
    private final String f87934c;

    /* renamed from: d */
    private x02 f87935d;

    /* renamed from: e */
    private String f87936e;

    /* renamed from: f */
    private int f87937f = 0;

    /* renamed from: g */
    private int f87938g;

    /* renamed from: h */
    private boolean f87939h;

    /* renamed from: i */
    private boolean f87940i;

    /* renamed from: j */
    private long f87941j;

    /* renamed from: k */
    private int f87942k;

    /* renamed from: l */
    private long f87943l;

    public xy0(@Nullable String str) {
        cc1 cc1Var = new cc1(4);
        this.f87932a = cc1Var;
        cc1Var.m35291c()[0] = -1;
        this.f87933b = new yy0.C31938a();
        this.f87943l = -9223372036854775807L;
        this.f87934c = str;
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26245a(cc1 cc1Var) {
        yy0.C31938a c31938a;
        if (this.f87935d != null) {
            while (cc1Var.m35299a() > 0) {
                int i = this.f87937f;
                if (i == 0) {
                    byte[] m35291c = cc1Var.m35291c();
                    int m35289d = cc1Var.m35289d();
                    int m35287e = cc1Var.m35287e();
                    while (true) {
                        if (m35289d < m35287e) {
                            byte b = m35291c[m35289d];
                            boolean z = (b & 255) == 255;
                            boolean z2 = this.f87940i && (b & 224) == 224;
                            this.f87940i = z;
                            if (z2) {
                                cc1Var.m35286e(m35289d + 1);
                                this.f87940i = false;
                                this.f87932a.m35291c()[1] = m35291c[m35289d];
                                this.f87938g = 2;
                                this.f87937f = 1;
                                break;
                            }
                            m35289d++;
                        } else {
                            cc1Var.m35286e(m35287e);
                            break;
                        }
                    }
                } else if (i == 1) {
                    int min = Math.min(cc1Var.m35299a(), 4 - this.f87938g);
                    cc1Var.m35294a(this.f87932a.m35291c(), this.f87938g, min);
                    int i2 = this.f87938g + min;
                    this.f87938g = i2;
                    if (i2 >= 4) {
                        this.f87932a.m35286e(0);
                        if (!this.f87933b.m26531a(this.f87932a.m35282h())) {
                            this.f87938g = 0;
                            this.f87937f = 1;
                        } else {
                            this.f87942k = this.f87933b.f88620c;
                            if (!this.f87939h) {
                                this.f87941j = (c31938a.f88624g * 1000000) / c31938a.f88621d;
                                this.f87935d.mo26064a(new v90.C31640a().m28438b(this.f87936e).m28426e(this.f87933b.f88619b).m28418h(4096).m28436c(this.f87933b.f88622e).m28409l(this.f87933b.f88621d).m28430d(this.f87934c).m28454a());
                                this.f87939h = true;
                            }
                            this.f87932a.m35286e(0);
                            this.f87935d.m27709a(4, this.f87932a);
                            this.f87937f = 2;
                        }
                    }
                } else if (i == 2) {
                    int min2 = Math.min(cc1Var.m35299a(), this.f87942k - this.f87938g);
                    this.f87935d.m27709a(min2, cc1Var);
                    int i3 = this.f87938g + min2;
                    this.f87938g = i3;
                    int i4 = this.f87942k;
                    if (i3 >= i4) {
                        long j = this.f87943l;
                        if (j != -9223372036854775807L) {
                            this.f87935d.mo26069a(j, 1, i4, 0, null);
                            this.f87943l += this.f87941j;
                        }
                        this.f87938g = 0;
                        this.f87937f = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: b */
    public final void mo26243b() {
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26244a(p50 p50Var, k22.C30694d c30694d) {
        c30694d.m32682a();
        this.f87936e = c30694d.m32681b();
        this.f87935d = p50Var.mo26223a(c30694d.m32680c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26246a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f87943l = j;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26247a() {
        this.f87937f = 0;
        this.f87938g = 0;
        this.f87940i = false;
        this.f87943l = -9223372036854775807L;
    }
}
