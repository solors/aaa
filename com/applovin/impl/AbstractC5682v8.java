package com.applovin.impl;

/* renamed from: com.applovin.impl.v8 */
/* loaded from: classes2.dex */
public abstract class AbstractC5682v8 {

    /* renamed from: com.applovin.impl.v8$a */
    /* loaded from: classes2.dex */
    public static final class C5683a {

        /* renamed from: a */
        public long f11472a;
    }

    /* renamed from: a */
    private static boolean m93956a(C4066ah c4066ah, C5960z8 c5960z8, int i) {
        int m93950b = m93950b(c4066ah, i);
        return m93950b != -1 && m93950b <= c5960z8.f12521b;
    }

    /* renamed from: b */
    private static boolean m93949b(C4066ah c4066ah, C5960z8 c5960z8, int i) {
        int i2 = c5960z8.f12524e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == c5960z8.f12525f;
        } else if (i == 12) {
            return c4066ah.m100762w() * 1000 == i2;
        } else if (i <= 14) {
            int m100799C = c4066ah.m100799C();
            if (i == 14) {
                m100799C *= 10;
            }
            return m100799C == i2;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m93957a(C4066ah c4066ah, int i) {
        return c4066ah.m100762w() == AbstractC5863xp.m92981b(c4066ah.m100787c(), i, c4066ah.m100785d() - 1, 0);
    }

    /* renamed from: b */
    private static boolean m93951b(int i, C5960z8 c5960z8) {
        return i <= 7 ? i == c5960z8.f12526g - 1 : i <= 10 && c5960z8.f12526g == 2;
    }

    /* renamed from: a */
    private static boolean m93954a(C4066ah c4066ah, C5960z8 c5960z8, boolean z, C5683a c5683a) {
        try {
            long m100798D = c4066ah.m100798D();
            if (!z) {
                m100798D *= c5960z8.f12521b;
            }
            c5683a.f11472a = m100798D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m93950b(C4066ah c4066ah, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c4066ah.m100762w() + 1;
            case 7:
                return c4066ah.m100799C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static boolean m93955a(C4066ah c4066ah, C5960z8 c5960z8, int i, C5683a c5683a) {
        int m100785d = c4066ah.m100785d();
        long m100760y = c4066ah.m100760y();
        long j = m100760y >>> 16;
        if (j != i) {
            return false;
        }
        return m93951b((int) ((m100760y >> 4) & 15), c5960z8) && m93958a((int) ((m100760y >> 1) & 7), c5960z8) && !(((m100760y & 1) > 1L ? 1 : ((m100760y & 1) == 1L ? 0 : -1)) == 0) && m93954a(c4066ah, c5960z8, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, c5683a) && m93956a(c4066ah, c5960z8, (int) ((m100760y >> 12) & 15)) && m93949b(c4066ah, c5960z8, (int) ((m100760y >> 8) & 15)) && m93957a(c4066ah, m100785d);
    }

    /* renamed from: a */
    private static boolean m93958a(int i, C5960z8 c5960z8) {
        return i == 0 || i == c5960z8.f12528i;
    }

    /* renamed from: a */
    public static boolean m93952a(InterfaceC4703k8 interfaceC4703k8, C5960z8 c5960z8, int i, C5683a c5683a) {
        long mo98001d = interfaceC4703k8.mo98001d();
        byte[] bArr = new byte[2];
        interfaceC4703k8.mo98002c(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC4703k8.mo98007b();
            interfaceC4703k8.mo98003c((int) (mo98001d - interfaceC4703k8.mo97999f()));
            return false;
        }
        C4066ah c4066ah = new C4066ah(16);
        System.arraycopy(bArr, 0, c4066ah.m100787c(), 0, 2);
        c4066ah.m100782e(AbstractC4823m8.m97562a(interfaceC4703k8, c4066ah.m100787c(), 2, 14));
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98003c((int) (mo98001d - interfaceC4703k8.mo97999f()));
        return m93955a(c4066ah, c5960z8, i, c5683a);
    }

    /* renamed from: a */
    public static long m93953a(InterfaceC4703k8 interfaceC4703k8, C5960z8 c5960z8) {
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98003c(1);
        byte[] bArr = new byte[1];
        interfaceC4703k8.mo98002c(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        interfaceC4703k8.mo98003c(2);
        int i = z ? 7 : 6;
        C4066ah c4066ah = new C4066ah(i);
        c4066ah.m100782e(AbstractC4823m8.m97562a(interfaceC4703k8, c4066ah.m100787c(), 0, i));
        interfaceC4703k8.mo98007b();
        C5683a c5683a = new C5683a();
        if (m93954a(c4066ah, c5960z8, z, c5683a)) {
            return c5683a.f11472a;
        }
        throw C4187ch.m100188a(null, null);
    }
}
