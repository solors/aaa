package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes8.dex */
final class rd2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.rd2$a */
    /* loaded from: classes8.dex */
    public static final class C31277a {

        /* renamed from: a */
        public final int f84727a;

        /* renamed from: b */
        public final long f84728b;

        private C31277a(int i, long j) {
            this.f84727a = i;
            this.f84728b = j;
        }

        /* renamed from: a */
        public static C31277a m30067a(C30513hy c30513hy, cc1 cc1Var) throws IOException {
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 8, false);
            cc1Var.m35286e(0);
            return new C31277a(cc1Var.m35282h(), cc1Var.m35276n());
        }
    }

    /* renamed from: a */
    public static boolean m30070a(C30513hy c30513hy) throws IOException {
        cc1 cc1Var = new cc1(8);
        int i = C31277a.m30067a(c30513hy, cc1Var).f84727a;
        if (i == 1380533830 || i == 1380333108) {
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 4, false);
            cc1Var.m35286e(0);
            int m35282h = cc1Var.m35282h();
            if (m35282h != 1463899717) {
                gq0.m33795b("WavHeaderReader", "Unsupported form type: " + m35282h);
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static qd2 m30069b(C30513hy c30513hy) throws IOException {
        byte[] bArr;
        cc1 cc1Var = new cc1(16);
        C31277a m30071a = m30071a(1718449184, c30513hy, cc1Var);
        if (m30071a.f84728b >= 16) {
            c30513hy.mo27615b(cc1Var.m35291c(), 0, 16, false);
            cc1Var.m35286e(0);
            int m35275o = cc1Var.m35275o();
            int m35275o2 = cc1Var.m35275o();
            int m35279k = cc1Var.m35279k();
            if (m35279k >= 0) {
                int m35279k2 = cc1Var.m35279k();
                if (m35279k2 >= 0) {
                    int m35275o3 = cc1Var.m35275o();
                    int m35275o4 = cc1Var.m35275o();
                    int i = ((int) m30071a.f84728b) - 16;
                    if (i > 0) {
                        byte[] bArr2 = new byte[i];
                        c30513hy.mo27615b(bArr2, 0, i, false);
                        bArr = bArr2;
                    } else {
                        bArr = y32.f88015f;
                    }
                    c30513hy.mo27621a((int) (c30513hy.mo27613d() - c30513hy.mo27622a()));
                    return new qd2(m35275o, m35275o2, m35279k, m35275o3, m35275o4, bArr);
                }
                throw new IllegalStateException(C31736wd.m27978a("Top bit not zero: ", m35279k2));
            }
            throw new IllegalStateException(C31736wd.m27978a("Top bit not zero: ", m35279k));
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public static Pair m30068c(C30513hy c30513hy) throws IOException {
        c30513hy.mo27614c();
        C31277a m30071a = m30071a(1684108385, c30513hy, new cc1(8));
        c30513hy.mo27621a(8);
        return Pair.create(Long.valueOf(c30513hy.mo27622a()), Long.valueOf(m30071a.f84728b));
    }

    /* renamed from: a */
    private static C31277a m30071a(int i, C30513hy c30513hy, cc1 cc1Var) throws IOException {
        C31277a m30067a = C31277a.m30067a(c30513hy, cc1Var);
        while (m30067a.f84727a != i) {
            gq0.m33792d("WavHeaderReader", "Ignoring unknown WAV chunk: " + m30067a.f84727a);
            long j = m30067a.f84728b + 8;
            if (j <= 2147483647L) {
                c30513hy.mo27621a((int) j);
                m30067a = C31277a.m30067a(c30513hy, cc1Var);
            } else {
                throw gc1.m33886a("Chunk is too large (~2GB+) to skip; id: " + m30067a.f84727a);
            }
        }
        return m30067a;
    }
}
