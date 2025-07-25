package com.applovin.impl;

import com.applovin.impl.AbstractC4556i2;
import com.applovin.impl.AbstractC5682v8;
import java.util.Objects;

/* renamed from: com.applovin.impl.t8 */
/* loaded from: classes2.dex */
final class C5544t8 extends AbstractC4556i2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5544t8(final C5960z8 c5960z8, int i, long j, long j2) {
        super(new AbstractC4556i2.InterfaceC4560d() { // from class: com.applovin.impl.g50
            @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4560d
            /* renamed from: a */
            public final long mo98562a(long j3) {
                return c5960z8.m92467a(j3);
            }
        }, new C5546b(c5960z8, i), c5960z8.m92461b(), 0L, c5960z8.f12529j, j, j2, c5960z8.m92469a(), Math.max(6, c5960z8.f12522c));
        Objects.requireNonNull(c5960z8);
    }

    /* renamed from: com.applovin.impl.t8$b */
    /* loaded from: classes2.dex */
    private static final class C5546b implements AbstractC4556i2.InterfaceC4562f {

        /* renamed from: a */
        private final C5960z8 f10829a;

        /* renamed from: b */
        private final int f10830b;

        /* renamed from: c */
        private final AbstractC5682v8.C5683a f10831c;

        private C5546b(C5960z8 c5960z8, int i) {
            this.f10829a = c5960z8;
            this.f10830b = i;
            this.f10831c = new AbstractC5682v8.C5683a();
        }

        /* renamed from: a */
        private long m94529a(InterfaceC4703k8 interfaceC4703k8) {
            while (interfaceC4703k8.mo98001d() < interfaceC4703k8.mo98011a() - 6 && !AbstractC5682v8.m93952a(interfaceC4703k8, this.f10829a, this.f10830b, this.f10831c)) {
                interfaceC4703k8.mo98003c(1);
            }
            if (interfaceC4703k8.mo98001d() >= interfaceC4703k8.mo98011a() - 6) {
                interfaceC4703k8.mo98003c((int) (interfaceC4703k8.mo98011a() - interfaceC4703k8.mo98001d()));
                return this.f10829a.f12529j;
            }
            return this.f10831c.f11472a;
        }

        @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4562f
        /* renamed from: a */
        public AbstractC4556i2.C4561e mo94528a(InterfaceC4703k8 interfaceC4703k8, long j) {
            long mo97999f = interfaceC4703k8.mo97999f();
            long m94529a = m94529a(interfaceC4703k8);
            long mo98001d = interfaceC4703k8.mo98001d();
            interfaceC4703k8.mo98003c(Math.max(6, this.f10829a.f12522c));
            long m94529a2 = m94529a(interfaceC4703k8);
            long mo98001d2 = interfaceC4703k8.mo98001d();
            if (m94529a > j || m94529a2 <= j) {
                if (m94529a2 <= j) {
                    return AbstractC4556i2.C4561e.m98558b(m94529a2, mo98001d2);
                }
                return AbstractC4556i2.C4561e.m98560a(m94529a, mo97999f);
            }
            return AbstractC4556i2.C4561e.m98561a(mo98001d);
        }
    }
}
