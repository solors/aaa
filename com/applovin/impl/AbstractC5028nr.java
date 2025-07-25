package com.applovin.impl;

import android.util.Pair;

/* renamed from: com.applovin.impl.nr */
/* loaded from: classes2.dex */
abstract class AbstractC5028nr {

    /* renamed from: com.applovin.impl.nr$a */
    /* loaded from: classes2.dex */
    private static final class C5029a {

        /* renamed from: a */
        public final int f8672a;

        /* renamed from: b */
        public final long f8673b;

        private C5029a(int i, long j) {
            this.f8672a = i;
            this.f8673b = j;
        }

        /* renamed from: a */
        public static C5029a m96905a(InterfaceC4703k8 interfaceC4703k8, C4066ah c4066ah) {
            interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, 8);
            c4066ah.m100780f(0);
            return new C5029a(c4066ah.m100775j(), c4066ah.m100769p());
        }
    }

    /* renamed from: a */
    public static C4970mr m96907a(InterfaceC4703k8 interfaceC4703k8) {
        boolean z;
        byte[] bArr;
        AbstractC4100b1.m100583a(interfaceC4703k8);
        C4066ah c4066ah = new C4066ah(16);
        if (C5029a.m96905a(interfaceC4703k8, c4066ah).f8672a != 1380533830) {
            return null;
        }
        interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, 4);
        c4066ah.m100780f(0);
        int m100775j = c4066ah.m100775j();
        if (m100775j != 1463899717) {
            AbstractC5063oc.m96805b("WavHeaderReader", "Unsupported RIFF format: " + m100775j);
            return null;
        }
        C5029a m96905a = C5029a.m96905a(interfaceC4703k8, c4066ah);
        while (m96905a.f8672a != 1718449184) {
            interfaceC4703k8.mo98003c((int) m96905a.f8673b);
            m96905a = C5029a.m96905a(interfaceC4703k8, c4066ah);
        }
        if (m96905a.f8673b >= 16) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, 16);
        c4066ah.m100780f(0);
        int m100767r = c4066ah.m100767r();
        int m100767r2 = c4066ah.m100767r();
        int m100768q = c4066ah.m100768q();
        int m100768q2 = c4066ah.m100768q();
        int m100767r3 = c4066ah.m100767r();
        int m100767r4 = c4066ah.m100767r();
        int i = ((int) m96905a.f8673b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            interfaceC4703k8.mo98002c(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = AbstractC5863xp.f12156f;
        }
        return new C4970mr(m100767r, m100767r2, m100768q, m100768q2, m100767r3, m100767r4, bArr);
    }

    /* renamed from: b */
    public static Pair m96906b(InterfaceC4703k8 interfaceC4703k8) {
        AbstractC4100b1.m100583a(interfaceC4703k8);
        interfaceC4703k8.mo98007b();
        C4066ah c4066ah = new C4066ah(8);
        C5029a m96905a = C5029a.m96905a(interfaceC4703k8, c4066ah);
        while (true) {
            int i = m96905a.f8672a;
            if (i != 1684108385) {
                if (i != 1380533830 && i != 1718449184) {
                    AbstractC5063oc.m96800d("WavHeaderReader", "Ignoring unknown WAV chunk: " + m96905a.f8672a);
                }
                long j = m96905a.f8673b + 8;
                if (m96905a.f8672a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    interfaceC4703k8.mo98010a((int) j);
                    m96905a = C5029a.m96905a(interfaceC4703k8, c4066ah);
                } else {
                    throw C4187ch.m100189a("Chunk is too large (~2GB+) to skip; id: " + m96905a.f8672a);
                }
            } else {
                interfaceC4703k8.mo98010a(8);
                long mo97999f = interfaceC4703k8.mo97999f();
                long j2 = m96905a.f8673b + mo97999f;
                long mo98011a = interfaceC4703k8.mo98011a();
                if (mo98011a != -1 && j2 > mo98011a) {
                    AbstractC5063oc.m96800d("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + mo98011a);
                    j2 = mo98011a;
                }
                return Pair.create(Long.valueOf(mo97999f), Long.valueOf(j2));
            }
        }
    }
}
