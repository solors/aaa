package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class p20 implements t20 {

    /* renamed from: a */
    private final List<k22.C30691a> f83691a;

    /* renamed from: b */
    private final x02[] f83692b;

    /* renamed from: c */
    private boolean f83693c;

    /* renamed from: d */
    private int f83694d;

    /* renamed from: e */
    private int f83695e;

    /* renamed from: f */
    private long f83696f = -9223372036854775807L;

    public p20(List<k22.C30691a> list) {
        this.f83691a = list;
        this.f83692b = new x02[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26245a(cc1 cc1Var) {
        x02[] x02VarArr;
        if (this.f83693c) {
            if (this.f83694d == 2) {
                if (cc1Var.m35299a() == 0) {
                    return;
                }
                if (cc1Var.m35270t() != 32) {
                    this.f83693c = false;
                }
                this.f83694d--;
                if (!this.f83693c) {
                    return;
                }
            }
            if (this.f83694d == 1) {
                if (cc1Var.m35299a() == 0) {
                    return;
                }
                if (cc1Var.m35270t() != 0) {
                    this.f83693c = false;
                }
                this.f83694d--;
                if (!this.f83693c) {
                    return;
                }
            }
            int m35289d = cc1Var.m35289d();
            int m35299a = cc1Var.m35299a();
            for (x02 x02Var : this.f83692b) {
                cc1Var.m35286e(m35289d);
                x02Var.m27709a(m35299a, cc1Var);
            }
            this.f83695e += m35299a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: b */
    public final void mo26243b() {
        if (this.f83693c) {
            if (this.f83696f != -9223372036854775807L) {
                for (x02 x02Var : this.f83692b) {
                    x02Var.mo26069a(this.f83696f, 1, this.f83695e, 0, null);
                }
            }
            this.f83693c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26244a(p50 p50Var, k22.C30694d c30694d) {
        for (int i = 0; i < this.f83692b.length; i++) {
            k22.C30691a c30691a = this.f83691a.get(i);
            c30694d.m32682a();
            x02 mo26223a = p50Var.mo26223a(c30694d.m32680c(), 3);
            mo26223a.mo26064a(new v90.C31640a().m28438b(c30694d.m32681b()).m28426e("application/dvbsubs").m28445a(Collections.singletonList(c30691a.f81241b)).m28430d(c30691a.f81240a).m28454a());
            this.f83692b[i] = mo26223a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26246a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f83693c = true;
        if (j != -9223372036854775807L) {
            this.f83696f = j;
        }
        this.f83695e = 0;
        this.f83694d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26247a() {
        this.f83693c = false;
        this.f83696f = -9223372036854775807L;
    }
}
