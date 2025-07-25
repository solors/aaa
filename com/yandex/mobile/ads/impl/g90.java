package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30559ik;
import com.yandex.mobile.ads.impl.i90;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes8.dex */
final class g90 extends AbstractC30559ik {

    /* renamed from: com.yandex.mobile.ads.impl.g90$a */
    /* loaded from: classes8.dex */
    private static final class C30371a implements AbstractC30559ik.InterfaceC30565f {

        /* renamed from: a */
        private final m90 f79574a;

        /* renamed from: b */
        private final int f79575b;

        /* renamed from: c */
        private final i90.C30539a f79576c;

        /* renamed from: a */
        private long m33903a(C30513hy c30513hy) throws IOException {
            int m33441c;
            while (c30513hy.mo27613d() < c30513hy.mo27618b() - 6) {
                m90 m90Var = this.f79574a;
                int i = this.f79575b;
                i90.C30539a c30539a = this.f79576c;
                long mo27613d = c30513hy.mo27613d();
                byte[] bArr = new byte[2];
                c30513hy.mo27615b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                    c30513hy.mo27614c();
                    c30513hy.m33444a(false, (int) (mo27613d - c30513hy.mo27622a()));
                } else {
                    cc1 cc1Var = new cc1(16);
                    System.arraycopy(bArr, 0, cc1Var.m35291c(), 0, 2);
                    byte[] m35291c = cc1Var.m35291c();
                    int i2 = 0;
                    for (int i3 = 2; i2 < 14 && (m33441c = c30513hy.m33441c(m35291c, i3 + i2, 14 - i2)) != -1; i3 = 2) {
                        i2 += m33441c;
                    }
                    cc1Var.m35288d(i2);
                    c30513hy.mo27614c();
                    c30513hy.m33444a(false, (int) (mo27613d - c30513hy.mo27622a()));
                    if (i90.m33343a(cc1Var, m90Var, i, c30539a)) {
                        break;
                    }
                }
                c30513hy.m33444a(false, 1);
            }
            if (c30513hy.mo27613d() >= c30513hy.mo27618b() - 6) {
                c30513hy.m33444a(false, (int) (c30513hy.mo27618b() - c30513hy.mo27613d()));
                return this.f79574a.f82093j;
            }
            return this.f79576c.f80371a;
        }

        private C30371a(int i, m90 m90Var) {
            this.f79574a = m90Var;
            this.f79575b = i;
            this.f79576c = new i90.C30539a();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30565f
        /* renamed from: a */
        public final AbstractC30559ik.C30564e mo30043a(C30513hy c30513hy, long j) throws IOException {
            long mo27622a = c30513hy.mo27622a();
            long m33903a = m33903a(c30513hy);
            long mo27613d = c30513hy.mo27613d();
            c30513hy.m33444a(false, Math.max(6, this.f79574a.f82086c));
            long m33903a2 = m33903a(c30513hy);
            long mo27613d2 = c30513hy.mo27613d();
            if (m33903a > j || m33903a2 <= j) {
                if (m33903a2 <= j) {
                    return AbstractC30559ik.C30564e.m33222b(m33903a2, mo27613d2);
                }
                return AbstractC30559ik.C30564e.m33224a(m33903a, mo27622a);
            }
            return AbstractC30559ik.C30564e.m33225a(mo27613d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(final m90 m90Var, int i, long j, long j2) {
        super(new AbstractC30559ik.InterfaceC30563d() { // from class: com.yandex.mobile.ads.impl.bp2
            @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30563d
            /* renamed from: a */
            public final long mo33226a(long j3) {
                return m90Var.m32074a(j3);
            }
        }, new C30371a(i, m90Var), m90Var.m32070b(), m90Var.f82093j, j, j2, m90Var.m32076a(), Math.max(6, m90Var.f82086c));
        Objects.requireNonNull(m90Var);
    }
}
