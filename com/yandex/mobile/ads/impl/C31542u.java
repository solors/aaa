package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.ps1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.u */
/* loaded from: classes8.dex */
public final class C31542u implements n50 {

    /* renamed from: a */
    private final C31621v f86035a = new C31621v();

    /* renamed from: b */
    private final cc1 f86036b = new cc1(16384);

    /* renamed from: c */
    private boolean f86037c;

    static {
        new r50() { // from class: com.yandex.mobile.ads.impl.ty2
            @Override // com.yandex.mobile.ads.impl.r50
            /* renamed from: a */
            public final n50[] mo25982a() {
                n50[] m28923a;
                m28923a = C31542u.m28923a();
                return m28923a;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28384a(p50 p50Var) {
        this.f86035a.mo26244a(p50Var, new k22.C30694d(Integer.MIN_VALUE, 0, 1));
        p50Var.mo26225a();
        p50Var.mo26218a(new ps1.C31151b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final int mo28385a(o50 o50Var, of1 of1Var) throws IOException {
        int read = ((C30513hy) o50Var).read(this.f86036b.m35291c(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f86036b.m35286e(0);
        this.f86036b.m35288d(read);
        if (!this.f86037c) {
            this.f86035a.mo26246a(4, 0L);
            this.f86037c = true;
        }
        this.f86035a.mo26245a(this.f86036b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28388a(long j, long j2) {
        this.f86037c = false;
        this.f86035a.mo26247a();
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void release() {
    }

    /* renamed from: a */
    public static /* synthetic */ n50[] m28923a() {
        return new n50[]{new C31542u()};
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final boolean mo28386a(o50 o50Var) throws IOException {
        C30513hy c30513hy;
        int i;
        cc1 cc1Var = new cc1(10);
        int i2 = 0;
        while (true) {
            c30513hy = (C30513hy) o50Var;
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 10, false);
            cc1Var.m35286e(0);
            if (cc1Var.m35267w() != 4801587) {
                break;
            }
            cc1Var.m35284f(3);
            int m35271s = cc1Var.m35271s();
            i2 += m35271s + 10;
            c30513hy.m33444a(false, m35271s);
        }
        c30513hy.mo27614c();
        c30513hy.m33444a(false, i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 7, false);
            cc1Var.m35286e(0);
            int m35264z = cc1Var.m35264z();
            if (m35264z == 44096 || m35264z == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] m35291c = cc1Var.m35291c();
                if (m35291c.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((m35291c[2] & 255) << 8) | (m35291c[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((m35291c[4] & 255) << 16) | ((m35291c[5] & 255) << 8) | (m35291c[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (m35264z == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                c30513hy.m33444a(false, i - 7);
            } else {
                c30513hy.mo27614c();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                c30513hy.m33444a(false, i4);
                i3 = 0;
            }
        }
    }
}
