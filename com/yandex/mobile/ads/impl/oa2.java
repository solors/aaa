package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fz1;
import com.yandex.mobile.ads.impl.v90;

/* loaded from: classes8.dex */
final class oa2 extends fz1 {

    /* renamed from: b */
    private final cc1 f83383b;

    /* renamed from: c */
    private final cc1 f83384c;

    /* renamed from: d */
    private int f83385d;

    /* renamed from: e */
    private boolean f83386e;

    /* renamed from: f */
    private boolean f83387f;

    /* renamed from: g */
    private int f83388g;

    public oa2(x02 x02Var) {
        super(x02Var);
        this.f83383b = new cc1(x01.f87454a);
        this.f83384c = new cc1(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m31119a(cc1 cc1Var) throws fz1.C30348a {
        int m35270t = cc1Var.m35270t();
        int i = (m35270t >> 4) & 15;
        int i2 = m35270t & 15;
        if (i2 == 7) {
            this.f83388g = i;
            return i != 5;
        }
        throw new fz1.C30348a(C31736wd.m27978a("Video format not supported: ", i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m31120a(long j, cc1 cc1Var) throws gc1 {
        int m35270t = cc1Var.m35270t();
        long m35281i = (cc1Var.m35281i() * 1000) + j;
        if (m35270t == 0 && !this.f83386e) {
            cc1 cc1Var2 = new cc1(new byte[cc1Var.m35299a()]);
            cc1Var.m35294a(cc1Var2.m35291c(), 0, cc1Var.m35299a());
            C31284rh m30050a = C31284rh.m30050a(cc1Var2);
            this.f83385d = m30050a.f84757b;
            this.f79378a.mo26064a(new v90.C31640a().m28426e("video/avc").m28446a(m30050a.f84761f).m28403o(m30050a.f84758c).m28424f(m30050a.f84759d).m28441b(m30050a.f84760e).m28445a(m30050a.f84756a).m28454a());
            this.f83386e = true;
            return false;
        } else if (m35270t == 1 && this.f83386e) {
            int i = this.f83388g == 1 ? 1 : 0;
            if (this.f83387f || i != 0) {
                byte[] m35291c = this.f83384c.m35291c();
                m35291c[0] = 0;
                m35291c[1] = 0;
                m35291c[2] = 0;
                int i2 = 4 - this.f83385d;
                int i3 = 0;
                while (cc1Var.m35299a() > 0) {
                    cc1Var.m35294a(this.f83384c.m35291c(), i2, this.f83385d);
                    this.f83384c.m35286e(0);
                    int m35266x = this.f83384c.m35266x();
                    this.f83383b.m35286e(0);
                    this.f79378a.m27709a(4, this.f83383b);
                    this.f79378a.m27709a(m35266x, cc1Var);
                    i3 = i3 + 4 + m35266x;
                }
                this.f79378a.mo26069a(m35281i, i, i3, 0, null);
                this.f83387f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
