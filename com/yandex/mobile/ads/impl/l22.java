package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class l22 {
    /* renamed from: a */
    public static long m32362a(int i, int i2, cc1 cc1Var) {
        cc1Var.m35286e(i);
        if (cc1Var.m35299a() < 5) {
            return -9223372036854775807L;
        }
        int m35282h = cc1Var.m35282h();
        if ((8388608 & m35282h) != 0 || ((2096896 & m35282h) >> 8) != i2 || (m35282h & 32) == 0 || cc1Var.m35270t() < 7 || cc1Var.m35299a() < 7 || (cc1Var.m35270t() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        cc1Var.m35294a(bArr, 0, 6);
        return ((255 & bArr[4]) >> 7) | ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1);
    }
}
