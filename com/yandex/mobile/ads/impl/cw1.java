package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
final class cw1 {

    /* renamed from: a */
    private static final int[] f77786a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m35146a(C30513hy c30513hy) throws IOException {
        return m35144a(c30513hy, true, false);
    }

    /* renamed from: a */
    private static boolean m35144a(o50 o50Var, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        long mo27618b = o50Var.mo27618b();
        long j = -1;
        int i2 = (mo27618b > (-1L) ? 1 : (mo27618b == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && mo27618b <= 4096) {
            j2 = mo27618b;
        }
        int i3 = (int) j2;
        cc1 cc1Var = new cc1(64);
        boolean z7 = false;
        int i4 = 0;
        boolean z8 = false;
        while (i4 < i3) {
            cc1Var.m35290c(8);
            if (!o50Var.mo27615b(cc1Var.m35291c(), z7 ? 1 : 0, 8, true)) {
                break;
            }
            long m35268v = cc1Var.m35268v();
            int m35282h = cc1Var.m35282h();
            if (m35268v == 1) {
                o50Var.mo27620a(cc1Var.m35291c(), 8, 8);
                cc1Var.m35288d(16);
                i = 16;
                m35268v = cc1Var.m35274p();
            } else {
                if (m35268v == 0) {
                    long mo27618b2 = o50Var.mo27618b();
                    if (mo27618b2 != j) {
                        m35268v = (mo27618b2 - o50Var.mo27613d()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (m35268v < j3) {
                return z7;
            }
            i4 += i;
            if (m35282h == 1836019574) {
                i3 += (int) m35268v;
                if (i2 != 0 && i3 > mo27618b) {
                    i3 = (int) mo27618b;
                }
            } else if (m35282h == 1836019558 || m35282h == 1836475768) {
                z3 = z7 ? 1 : 0;
                z4 = true;
                z5 = true;
                break;
            } else {
                int i5 = i2;
                if ((i4 + m35268v) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (m35268v - j3);
                i4 += i6;
                if (m35282h != 1718909296) {
                    z6 = false;
                    z8 = z8;
                    if (i6 != 0) {
                        o50Var.mo27617b(i6);
                        z8 = z8;
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    cc1Var.m35290c(i6);
                    o50Var.mo27620a(cc1Var.m35291c(), 0, i6);
                    int i7 = i6 / 4;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (i8 == 1) {
                            cc1Var.m35284f(4);
                        } else {
                            int m35282h2 = cc1Var.m35282h();
                            if ((m35282h2 >>> 8) != 3368816 && (m35282h2 != 1751476579 || !z2)) {
                                int[] iArr = f77786a;
                                for (int i9 = 0; i9 < 29; i9++) {
                                    if (iArr[i9] != m35282h2) {
                                    }
                                }
                                continue;
                            }
                            z8 = true;
                            break;
                        }
                    }
                    z6 = false;
                    z8 = z8;
                    if (!z8) {
                        return false;
                    }
                }
                z7 = z6;
                i2 = i5;
            }
            j = -1;
            z8 = z8;
        }
        z3 = z7 ? 1 : 0;
        z4 = true;
        z5 = z3;
        return (z8 && z == z5) ? z4 : z3;
    }

    /* renamed from: a */
    public static boolean m35145a(o50 o50Var, boolean z) throws IOException {
        return m35144a(o50Var, false, z);
    }
}
