package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m90;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class j90 {
    /* renamed from: a */
    public static m90.C30835a m33018a(cc1 cc1Var) {
        cc1Var.m35284f(1);
        int m35267w = cc1Var.m35267w();
        long m35289d = cc1Var.m35289d() + m35267w;
        int i = m35267w / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m35274p = cc1Var.m35274p();
            if (m35274p == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m35274p;
            jArr2[i2] = cc1Var.m35274p();
            cc1Var.m35284f(2);
            i2++;
        }
        cc1Var.m35284f((int) (m35289d - cc1Var.m35289d()));
        return new m90.C30835a(jArr, jArr2);
    }
}
