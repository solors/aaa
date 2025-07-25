package com.applovin.impl;

/* renamed from: com.applovin.impl.lk */
/* loaded from: classes2.dex */
abstract class AbstractC4782lk {

    /* renamed from: a */
    private static final int[] f7773a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m97671a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f7773a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m97670a(InterfaceC4703k8 interfaceC4703k8) {
        return m97668a(interfaceC4703k8, true, false);
    }

    /* renamed from: a */
    private static boolean m97668a(InterfaceC4703k8 interfaceC4703k8, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long mo98011a = interfaceC4703k8.mo98011a();
        long j = -1;
        int i2 = (mo98011a > (-1L) ? 1 : (mo98011a == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && mo98011a <= 4096) {
            j2 = mo98011a;
        }
        int i3 = (int) j2;
        C4066ah c4066ah = new C4066ah(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (i4 < i3) {
            c4066ah.m100784d(8);
            if (!interfaceC4703k8.mo98004b(c4066ah.m100787c(), z8 ? 1 : 0, 8, true)) {
                break;
            }
            long m100760y = c4066ah.m100760y();
            int m100775j = c4066ah.m100775j();
            if (m100760y == 1) {
                interfaceC4703k8.mo98002c(c4066ah.m100787c(), 8, 8);
                c4066ah.m100782e(16);
                i = 16;
                m100760y = c4066ah.m100766s();
            } else {
                if (m100760y == 0) {
                    long mo98011a2 = interfaceC4703k8.mo98011a();
                    if (mo98011a2 != j) {
                        m100760y = (mo98011a2 - interfaceC4703k8.mo98001d()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (m100760y < j3) {
                return z8;
            }
            i4 += i;
            if (m100775j == 1836019574) {
                i3 += (int) m100760y;
                if (i2 != 0 && i3 > mo98011a) {
                    i3 = (int) mo98011a;
                }
            } else if (m100775j == 1836019558 || m100775j == 1836475768) {
                z3 = z8 ? 1 : 0;
                z4 = true;
                z5 = true;
                break;
            } else {
                int i5 = i2;
                if ((i4 + m100760y) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (m100760y - j3);
                i4 += i6;
                if (m100775j != 1718909296) {
                    z6 = false;
                    z9 = z9;
                    if (i6 != 0) {
                        interfaceC4703k8.mo98003c(i6);
                        z9 = z9;
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    c4066ah.m100784d(i6);
                    interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            z7 = z9;
                            break;
                        }
                        if (i8 == 1) {
                            c4066ah.m100778g(4);
                        } else if (m97671a(c4066ah.m100775j(), z2)) {
                            z7 = true;
                            break;
                        }
                        i8++;
                    }
                    z6 = false;
                    z9 = z7;
                    if (!z7) {
                        return false;
                    }
                }
                z8 = z6;
                i2 = i5;
            }
            j = -1;
            z9 = z9;
        }
        z3 = z8 ? 1 : 0;
        z4 = true;
        z5 = z3;
        return (z9 && z == z5) ? z4 : z3;
    }

    /* renamed from: a */
    public static boolean m97669a(InterfaceC4703k8 interfaceC4703k8, boolean z) {
        return m97668a(interfaceC4703k8, false, z);
    }
}
