package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;

/* loaded from: classes8.dex */
public final class zf0 implements t20 {

    /* renamed from: b */
    private x02 f88838b;

    /* renamed from: c */
    private boolean f88839c;

    /* renamed from: e */
    private int f88841e;

    /* renamed from: f */
    private int f88842f;

    /* renamed from: a */
    private final cc1 f88837a = new cc1(10);

    /* renamed from: d */
    private long f88840d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26245a(cc1 cc1Var) {
        if (this.f88838b != null) {
            if (this.f88839c) {
                int m35299a = cc1Var.m35299a();
                int i = this.f88842f;
                if (i < 10) {
                    int min = Math.min(m35299a, 10 - i);
                    System.arraycopy(cc1Var.m35291c(), cc1Var.m35289d(), this.f88837a.m35291c(), this.f88842f, min);
                    if (this.f88842f + min == 10) {
                        this.f88837a.m35286e(0);
                        if (73 == this.f88837a.m35270t() && 68 == this.f88837a.m35270t() && 51 == this.f88837a.m35270t()) {
                            this.f88837a.m35284f(3);
                            this.f88841e = this.f88837a.m35271s() + 10;
                        } else {
                            gq0.m33792d("Id3Reader", "Discarding invalid ID3 tag");
                            this.f88839c = false;
                            return;
                        }
                    }
                }
                int min2 = Math.min(m35299a, this.f88841e - this.f88842f);
                this.f88838b.m27709a(min2, cc1Var);
                this.f88842f += min2;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: b */
    public final void mo26243b() {
        int i;
        x02 x02Var = this.f88838b;
        if (x02Var != null) {
            if (this.f88839c && (i = this.f88841e) != 0 && this.f88842f == i) {
                long j = this.f88840d;
                if (j != -9223372036854775807L) {
                    x02Var.mo26069a(j, 1, i, 0, null);
                }
                this.f88839c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26244a(p50 p50Var, k22.C30694d c30694d) {
        c30694d.m32682a();
        x02 mo26223a = p50Var.mo26223a(c30694d.m32680c(), 5);
        this.f88838b = mo26223a;
        mo26223a.mo26064a(new v90.C31640a().m28438b(c30694d.m32681b()).m28426e("application/id3").m28454a());
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26246a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f88839c = true;
        if (j != -9223372036854775807L) {
            this.f88840d = j;
        }
        this.f88841e = 0;
        this.f88842f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26247a() {
        this.f88839c = false;
        this.f88840d = -9223372036854775807L;
    }
}
