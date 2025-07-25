package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.ps1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.r */
/* loaded from: classes8.dex */
public final class C31249r implements n50 {

    /* renamed from: a */
    private final C31323s f84598a = new C31323s();

    /* renamed from: b */
    private final cc1 f84599b = new cc1(2786);

    /* renamed from: c */
    private boolean f84600c;

    static {
        new r50() { // from class: com.yandex.mobile.ads.impl.yu2
            @Override // com.yandex.mobile.ads.impl.r50
            /* renamed from: a */
            public final n50[] mo25982a() {
                n50[] m30177a;
                m30177a = C31249r.m30177a();
                return m30177a;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28384a(p50 p50Var) {
        this.f84598a.mo26244a(p50Var, new k22.C30694d(Integer.MIN_VALUE, 0, 1));
        p50Var.mo26225a();
        p50Var.mo26218a(new ps1.C31151b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final int mo28385a(o50 o50Var, of1 of1Var) throws IOException {
        int read = ((C30513hy) o50Var).read(this.f84599b.m35291c(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f84599b.m35286e(0);
        this.f84599b.m35288d(read);
        if (!this.f84600c) {
            this.f84598a.mo26246a(4, 0L);
            this.f84600c = true;
        }
        this.f84598a.mo26245a(this.f84599b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28388a(long j, long j2) {
        this.f84600c = false;
        this.f84598a.mo26247a();
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void release() {
    }

    /* renamed from: a */
    public static /* synthetic */ n50[] m30177a() {
        return new n50[]{new C31249r()};
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final boolean mo28386a(o50 o50Var) throws IOException {
        C30513hy c30513hy;
        cc1 cc1Var = new cc1(10);
        int i = 0;
        while (true) {
            c30513hy = (C30513hy) o50Var;
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 10, false);
            cc1Var.m35286e(0);
            if (cc1Var.m35267w() != 4801587) {
                break;
            }
            cc1Var.m35284f(3);
            int m35271s = cc1Var.m35271s();
            i += m35271s + 10;
            c30513hy.m33444a(false, m35271s);
        }
        c30513hy.mo27614c();
        c30513hy.m33444a(false, i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 6, false);
            cc1Var.m35286e(0);
            if (cc1Var.m35264z() != 2935) {
                c30513hy.mo27614c();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                c30513hy.m33444a(false, i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int m29336a = C31415t.m29336a(cc1Var.m35291c());
                if (m29336a == -1) {
                    return false;
                }
                c30513hy.m33444a(false, m29336a - 6);
            }
        }
    }
}
