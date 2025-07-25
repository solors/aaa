package com.applovin.impl;

import com.applovin.impl.AbstractC4556i2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.gi */
/* loaded from: classes2.dex */
public final class C4469gi extends AbstractC4556i2 {

    /* renamed from: com.applovin.impl.gi$b */
    /* loaded from: classes2.dex */
    private static final class C4471b implements AbstractC4556i2.InterfaceC4562f {

        /* renamed from: a */
        private final C4537ho f6411a;

        /* renamed from: b */
        private final C4066ah f6412b;

        private C4471b(C4537ho c4537ho) {
            this.f6411a = c4537ho;
            this.f6412b = new C4066ah();
        }

        @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4562f
        /* renamed from: a */
        public void mo98555a() {
            this.f6412b.m100792a(AbstractC5863xp.f12156f);
        }

        /* renamed from: a */
        private AbstractC4556i2.C4561e m98930a(C4066ah c4066ah, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (c4066ah.m100797a() >= 4) {
                if (C4469gi.m98932b(c4066ah.m100787c(), c4066ah.m100785d()) != 442) {
                    c4066ah.m100778g(1);
                } else {
                    c4066ah.m100778g(4);
                    long m98671c = C4528hi.m98671c(c4066ah);
                    if (m98671c != -9223372036854775807L) {
                        long m98645b = this.f6411a.m98645b(m98671c);
                        if (m98645b > j) {
                            if (j3 == -9223372036854775807L) {
                                return AbstractC4556i2.C4561e.m98560a(m98645b, j2);
                            }
                            return AbstractC4556i2.C4561e.m98561a(j2 + i2);
                        } else if (100000 + m98645b > j) {
                            return AbstractC4556i2.C4561e.m98561a(j2 + c4066ah.m100785d());
                        } else {
                            i2 = c4066ah.m100785d();
                            j3 = m98645b;
                        }
                    }
                    m98931a(c4066ah);
                    i = c4066ah.m100785d();
                }
            }
            if (j3 != -9223372036854775807L) {
                return AbstractC4556i2.C4561e.m98558b(j3, j2 + i);
            }
            return AbstractC4556i2.C4561e.f6769d;
        }

        @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4562f
        /* renamed from: a */
        public AbstractC4556i2.C4561e mo94528a(InterfaceC4703k8 interfaceC4703k8, long j) {
            long mo97999f = interfaceC4703k8.mo97999f();
            int min = (int) Math.min(20000L, interfaceC4703k8.mo98011a() - mo97999f);
            this.f6412b.m100784d(min);
            interfaceC4703k8.mo98002c(this.f6412b.m100787c(), 0, min);
            return m98930a(this.f6412b, j, mo97999f);
        }

        /* renamed from: a */
        private static void m98931a(C4066ah c4066ah) {
            int m98932b;
            int m100783e = c4066ah.m100783e();
            if (c4066ah.m100797a() < 10) {
                c4066ah.m100780f(m100783e);
                return;
            }
            c4066ah.m100778g(9);
            int m100762w = c4066ah.m100762w() & 7;
            if (c4066ah.m100797a() < m100762w) {
                c4066ah.m100780f(m100783e);
                return;
            }
            c4066ah.m100778g(m100762w);
            if (c4066ah.m100797a() >= 4) {
                if (C4469gi.m98932b(c4066ah.m100787c(), c4066ah.m100785d()) == 443) {
                    c4066ah.m100778g(4);
                    int m100799C = c4066ah.m100799C();
                    if (c4066ah.m100797a() < m100799C) {
                        c4066ah.m100780f(m100783e);
                        return;
                    }
                    c4066ah.m100778g(m100799C);
                }
                while (c4066ah.m100797a() >= 4 && (m98932b = C4469gi.m98932b(c4066ah.m100787c(), c4066ah.m100785d())) != 442 && m98932b != 441 && (m98932b >>> 8) == 1) {
                    c4066ah.m100778g(4);
                    if (c4066ah.m100797a() < 2) {
                        c4066ah.m100780f(m100783e);
                        return;
                    }
                    c4066ah.m100780f(Math.min(c4066ah.m100783e(), c4066ah.m100785d() + c4066ah.m100799C()));
                }
                return;
            }
            c4066ah.m100780f(m100783e);
        }
    }

    public C4469gi(C4537ho c4537ho, long j, long j2) {
        super(new AbstractC4556i2.C4558b(), new C4471b(c4537ho), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m98932b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
