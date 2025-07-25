package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30559ik;
import java.io.IOException;

/* loaded from: classes8.dex */
final class h22 extends AbstractC30559ik {

    /* renamed from: com.yandex.mobile.ads.impl.h22$a */
    /* loaded from: classes8.dex */
    private static final class C30433a implements AbstractC30559ik.InterfaceC30565f {

        /* renamed from: a */
        private final n02 f79857a;

        /* renamed from: b */
        private final cc1 f79858b = new cc1();

        /* renamed from: c */
        private final int f79859c;

        /* renamed from: d */
        private final int f79860d;

        public C30433a(int i, n02 n02Var, int i2) {
            this.f79859c = i;
            this.f79857a = n02Var;
            this.f79860d = i2;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30565f
        /* renamed from: a */
        public final void mo30044a() {
            this.f79858b.m35295a(y32.f88015f);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30565f
        /* renamed from: a */
        public final AbstractC30559ik.C30564e mo30043a(C30513hy c30513hy, long j) throws IOException {
            long mo27622a = c30513hy.mo27622a();
            int min = (int) Math.min(this.f79860d, c30513hy.mo27618b() - mo27622a);
            this.f79858b.m35290c(min);
            c30513hy.mo27615b(this.f79858b.m35291c(), 0, min, false);
            cc1 cc1Var = this.f79858b;
            int m35287e = cc1Var.m35287e();
            long j2 = -1;
            long j3 = -1;
            long j4 = -9223372036854775807L;
            while (cc1Var.m35299a() >= 188) {
                byte[] m35291c = cc1Var.m35291c();
                int m35289d = cc1Var.m35289d();
                while (m35289d < m35287e && m35291c[m35289d] != 71) {
                    m35289d++;
                }
                int i = m35289d + 188;
                if (i > m35287e) {
                    break;
                }
                long m32362a = l22.m32362a(m35289d, this.f79859c, cc1Var);
                if (m32362a != -9223372036854775807L) {
                    long m31718b = this.f79857a.m31718b(m32362a);
                    if (m31718b > j) {
                        if (j4 == -9223372036854775807L) {
                            return AbstractC30559ik.C30564e.m33224a(m31718b, mo27622a);
                        }
                        return AbstractC30559ik.C30564e.m33225a(mo27622a + j3);
                    } else if (100000 + m31718b > j) {
                        return AbstractC30559ik.C30564e.m33225a(mo27622a + m35289d);
                    } else {
                        j4 = m31718b;
                        j3 = m35289d;
                    }
                }
                cc1Var.m35286e(i);
                j2 = i;
            }
            if (j4 != -9223372036854775807L) {
                return AbstractC30559ik.C30564e.m33222b(j4, mo27622a + j2);
            }
            return AbstractC30559ik.C30564e.f80509d;
        }
    }

    public h22(n02 n02Var, long j, long j2, int i, int i2) {
        super(new AbstractC30559ik.C30561b(), new C30433a(i, n02Var, i2), j, j + 1, 0L, j2, 188L, 940);
    }
}
