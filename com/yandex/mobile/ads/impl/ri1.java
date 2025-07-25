package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30559ik;
import java.io.IOException;

/* loaded from: classes8.dex */
final class ri1 extends AbstractC30559ik {

    /* renamed from: com.yandex.mobile.ads.impl.ri1$a */
    /* loaded from: classes8.dex */
    private static final class C31286a implements AbstractC30559ik.InterfaceC30565f {

        /* renamed from: a */
        private final n02 f84767a;

        /* renamed from: b */
        private final cc1 f84768b;

        @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30565f
        /* renamed from: a */
        public final void mo30044a() {
            this.f84768b.m35295a(y32.f88015f);
        }

        private C31286a(n02 n02Var) {
            this.f84767a = n02Var;
            this.f84768b = new cc1();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30565f
        /* renamed from: a */
        public final AbstractC30559ik.C30564e mo30043a(C30513hy c30513hy, long j) throws IOException {
            long mo27622a = c30513hy.mo27622a();
            int min = (int) Math.min(20000L, c30513hy.mo27618b() - mo27622a);
            this.f84768b.m35290c(min);
            c30513hy.mo27615b(this.f84768b.m35291c(), 0, min, false);
            cc1 cc1Var = this.f84768b;
            int i = -1;
            int i2 = -1;
            long j2 = -9223372036854775807L;
            while (cc1Var.m35299a() >= 4) {
                if (ri1.m30046a(cc1Var.m35289d(), cc1Var.m35291c()) != 442) {
                    cc1Var.m35284f(1);
                } else {
                    cc1Var.m35284f(4);
                    long m29600a = si1.m29600a(cc1Var);
                    if (m29600a != -9223372036854775807L) {
                        long m31718b = this.f84767a.m31718b(m29600a);
                        if (m31718b > j) {
                            if (j2 == -9223372036854775807L) {
                                return AbstractC30559ik.C30564e.m33224a(m31718b, mo27622a);
                            }
                            return AbstractC30559ik.C30564e.m33225a(mo27622a + i2);
                        } else if (100000 + m31718b > j) {
                            return AbstractC30559ik.C30564e.m33225a(mo27622a + cc1Var.m35289d());
                        } else {
                            i2 = cc1Var.m35289d();
                            j2 = m31718b;
                        }
                    }
                    int m35287e = cc1Var.m35287e();
                    if (cc1Var.m35299a() < 10) {
                        cc1Var.m35286e(m35287e);
                    } else {
                        cc1Var.m35284f(9);
                        int m35270t = cc1Var.m35270t() & 7;
                        if (cc1Var.m35299a() < m35270t) {
                            cc1Var.m35286e(m35287e);
                        } else {
                            cc1Var.m35284f(m35270t);
                            if (cc1Var.m35299a() < 4) {
                                cc1Var.m35286e(m35287e);
                            } else {
                                if (ri1.m30046a(cc1Var.m35289d(), cc1Var.m35291c()) == 443) {
                                    cc1Var.m35284f(4);
                                    int m35264z = cc1Var.m35264z();
                                    if (cc1Var.m35299a() < m35264z) {
                                        cc1Var.m35286e(m35287e);
                                    } else {
                                        cc1Var.m35284f(m35264z);
                                    }
                                }
                                while (true) {
                                    if (cc1Var.m35299a() < 4) {
                                        break;
                                    }
                                    int m30046a = ri1.m30046a(cc1Var.m35289d(), cc1Var.m35291c());
                                    if (m30046a == 442 || m30046a == 441 || (m30046a >>> 8) != 1) {
                                        break;
                                    }
                                    cc1Var.m35284f(4);
                                    if (cc1Var.m35299a() < 2) {
                                        cc1Var.m35286e(m35287e);
                                        break;
                                    }
                                    cc1Var.m35286e(Math.min(cc1Var.m35287e(), cc1Var.m35289d() + cc1Var.m35264z()));
                                }
                            }
                        }
                    }
                    i = cc1Var.m35289d();
                }
            }
            if (j2 != -9223372036854775807L) {
                return AbstractC30559ik.C30564e.m33222b(j2, mo27622a + i);
            }
            return AbstractC30559ik.C30564e.f80509d;
        }
    }

    public ri1(n02 n02Var, long j, long j2) {
        super(new AbstractC30559ik.C30561b(), new C31286a(n02Var), j, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static int m30046a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
