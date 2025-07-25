package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C30213e;
import com.yandex.mobile.ads.impl.fz1;
import com.yandex.mobile.ads.impl.v90;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.impl.ch */
/* loaded from: classes8.dex */
final class C30093ch extends fz1 {

    /* renamed from: e */
    private static final int[] f77625e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f77626b;

    /* renamed from: c */
    private boolean f77627c;

    /* renamed from: d */
    private int f77628d;

    public C30093ch(x02 x02Var) {
        super(x02Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m35232a(cc1 cc1Var) throws fz1.C30348a {
        if (!this.f77626b) {
            int m35270t = cc1Var.m35270t();
            int i = (m35270t >> 4) & 15;
            this.f77628d = i;
            if (i == 2) {
                this.f79378a.mo26064a(new v90.C31640a().m28426e("audio/mpeg").m28436c(1).m28409l(f77625e[(m35270t >> 2) & 3]).m28454a());
                this.f77627c = true;
            } else if (i == 7 || i == 8) {
                this.f79378a.mo26064a(new v90.C31640a().m28426e(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m28436c(1).m28409l(8000).m28454a());
                this.f77627c = true;
            } else if (i != 10) {
                throw new fz1.C30348a("Audio format not supported: " + this.f77628d);
            }
            this.f77626b = true;
        } else {
            cc1Var.m35284f(1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m35233a(long j, cc1 cc1Var) throws gc1 {
        if (this.f77628d == 2) {
            int m35299a = cc1Var.m35299a();
            this.f79378a.m27709a(m35299a, cc1Var);
            this.f79378a.mo26069a(j, 1, m35299a, 0, null);
            return true;
        }
        int m35270t = cc1Var.m35270t();
        if (m35270t == 0 && !this.f77627c) {
            int m35299a2 = cc1Var.m35299a();
            byte[] bArr = new byte[m35299a2];
            cc1Var.m35294a(bArr, 0, m35299a2);
            C30213e.C30214a m34737a = C30213e.m34737a(new bc1(m35299a2, bArr), false);
            this.f79378a.mo26064a(new v90.C31640a().m28426e("audio/mp4a-latm").m28446a(m34737a.f78393c).m28436c(m34737a.f78392b).m28409l(m34737a.f78391a).m28445a(Collections.singletonList(bArr)).m28454a());
            this.f77627c = true;
            return false;
        } else if (this.f77628d != 10 || m35270t == 1) {
            int m35299a3 = cc1Var.m35299a();
            this.f79378a.m27709a(m35299a3, cc1Var);
            this.f79378a.mo26069a(j, 1, m35299a3, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
