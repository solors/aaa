package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k22;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.va */
/* loaded from: classes8.dex */
public final class C31641va implements n50 {

    /* renamed from: d */
    private final cc1 f86670d;

    /* renamed from: e */
    private final bc1 f86671e;

    /* renamed from: f */
    private p50 f86672f;

    /* renamed from: g */
    private long f86673g;

    /* renamed from: j */
    private boolean f86676j;

    /* renamed from: k */
    private boolean f86677k;

    /* renamed from: l */
    private boolean f86678l;

    /* renamed from: a */
    private final int f86667a = 0;

    /* renamed from: b */
    private final C31731wa f86668b = new C31731wa();

    /* renamed from: c */
    private final cc1 f86669c = new cc1(2048);

    /* renamed from: i */
    private int f86675i = -1;

    /* renamed from: h */
    private long f86674h = -1;

    static {
        new r50() { // from class: com.yandex.mobile.ads.impl.oz2
            @Override // com.yandex.mobile.ads.impl.r50
            /* renamed from: a */
            public final n50[] mo25982a() {
                n50[] m28389a;
                m28389a = C31641va.m28389a();
                return m28389a;
            }
        };
    }

    public C31641va() {
        cc1 cc1Var = new cc1(10);
        this.f86670d = cc1Var;
        this.f86671e = new bc1(cc1Var.m35291c());
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28384a(p50 p50Var) {
        this.f86672f = p50Var;
        this.f86668b.mo26244a(p50Var, new k22.C30694d(Integer.MIN_VALUE, 0, 1));
        p50Var.mo26225a();
    }

    /* renamed from: a */
    private int m28387a(C30513hy c30513hy) throws IOException {
        int i = 0;
        while (true) {
            c30513hy.mo27615b(this.f86670d.m35291c(), 0, 10, false);
            this.f86670d.m35286e(0);
            if (this.f86670d.m35267w() != 4801587) {
                break;
            }
            this.f86670d.m35284f(3);
            int m35271s = this.f86670d.m35271s();
            i += m35271s + 10;
            c30513hy.m33444a(false, m35271s);
        }
        c30513hy.mo27614c();
        c30513hy.m33444a(false, i);
        if (this.f86674h == -1) {
            this.f86674h = i;
        }
        return i;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0090, code lost:
        r18.f86676j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0099, code lost:
        throw com.yandex.mobile.ads.impl.gc1.m33885a("Malformed ADTS stream", (java.lang.Exception) null);
     */
    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo28385a(com.yandex.mobile.ads.impl.o50 r19, com.yandex.mobile.ads.impl.of1 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31641va.mo28385a(com.yandex.mobile.ads.impl.o50, com.yandex.mobile.ads.impl.of1):int");
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28388a(long j, long j2) {
        this.f86677k = false;
        this.f86668b.mo26247a();
        this.f86673g = j2;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final boolean mo28386a(o50 o50Var) throws IOException {
        C30513hy c30513hy = (C30513hy) o50Var;
        int m28387a = m28387a(c30513hy);
        int i = m28387a;
        int i2 = 0;
        int i3 = 0;
        do {
            c30513hy.mo27615b(this.f86670d.m35291c(), 0, 2, false);
            this.f86670d.m35286e(0);
            if ((this.f86670d.m35264z() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c30513hy.mo27615b(this.f86670d.m35291c(), 0, 4, false);
                this.f86671e.m35499c(14);
                int m35502b = this.f86671e.m35502b(13);
                if (m35502b <= 6) {
                    i++;
                    c30513hy.mo27614c();
                    c30513hy.m33444a(false, i);
                } else {
                    c30513hy.m33444a(false, m35502b - 6);
                    i3 += m35502b;
                }
            } else {
                i++;
                c30513hy.mo27614c();
                c30513hy.m33444a(false, i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - m28387a < 8192);
        return false;
    }

    /* renamed from: a */
    public static n50[] m28389a() {
        return new n50[]{new C31641va()};
    }
}
