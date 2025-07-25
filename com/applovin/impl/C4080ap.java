package com.applovin.impl;

import com.applovin.impl.AbstractC4556i2;

/* renamed from: com.applovin.impl.ap */
/* loaded from: classes2.dex */
final class C4080ap extends AbstractC4556i2 {

    /* renamed from: com.applovin.impl.ap$a */
    /* loaded from: classes2.dex */
    private static final class C4081a implements AbstractC4556i2.InterfaceC4562f {

        /* renamed from: a */
        private final C4537ho f4807a;

        /* renamed from: b */
        private final C4066ah f4808b = new C4066ah();

        /* renamed from: c */
        private final int f4809c;

        /* renamed from: d */
        private final int f4810d;

        public C4081a(int i, C4537ho c4537ho, int i2) {
            this.f4809c = i;
            this.f4807a = c4537ho;
            this.f4810d = i2;
        }

        @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4562f
        /* renamed from: a */
        public void mo98555a() {
            this.f4808b.m100792a(AbstractC5863xp.f12156f);
        }

        /* renamed from: a */
        private AbstractC4556i2.C4561e m100677a(C4066ah c4066ah, long j, long j2) {
            int m99465a;
            int m99465a2;
            int m100783e = c4066ah.m100783e();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (c4066ah.m100797a() >= 188 && (m99465a2 = (m99465a = AbstractC4343ep.m99465a(c4066ah.m100787c(), c4066ah.m100785d(), m100783e)) + 188) <= m100783e) {
                long m99467a = AbstractC4343ep.m99467a(c4066ah, m99465a, this.f4809c);
                if (m99467a != -9223372036854775807L) {
                    long m98645b = this.f4807a.m98645b(m99467a);
                    if (m98645b > j) {
                        if (j5 == -9223372036854775807L) {
                            return AbstractC4556i2.C4561e.m98560a(m98645b, j2);
                        }
                        return AbstractC4556i2.C4561e.m98561a(j2 + j4);
                    } else if (100000 + m98645b > j) {
                        return AbstractC4556i2.C4561e.m98561a(j2 + m99465a);
                    } else {
                        j4 = m99465a;
                        j5 = m98645b;
                    }
                }
                c4066ah.m100780f(m99465a2);
                j3 = m99465a2;
            }
            if (j5 != -9223372036854775807L) {
                return AbstractC4556i2.C4561e.m98558b(j5, j2 + j3);
            }
            return AbstractC4556i2.C4561e.f6769d;
        }

        @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4562f
        /* renamed from: a */
        public AbstractC4556i2.C4561e mo94528a(InterfaceC4703k8 interfaceC4703k8, long j) {
            long mo97999f = interfaceC4703k8.mo97999f();
            int min = (int) Math.min(this.f4810d, interfaceC4703k8.mo98011a() - mo97999f);
            this.f4808b.m100784d(min);
            interfaceC4703k8.mo98002c(this.f4808b.m100787c(), 0, min);
            return m100677a(this.f4808b, j, mo97999f);
        }
    }

    public C4080ap(C4537ho c4537ho, long j, long j2, int i, int i2) {
        super(new AbstractC4556i2.C4558b(), new C4081a(i, c4537ho, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
