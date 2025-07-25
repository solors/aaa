package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ci1;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class di1 {
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c7 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.ci1.C30095a> m34913a(com.yandex.mobile.ads.impl.cc1 r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.di1.m34913a(com.yandex.mobile.ads.impl.cc1):java.util.ArrayList");
    }

    @Nullable
    /* renamed from: a */
    public static ci1 m34914a(int i, byte[] bArr) {
        ArrayList<ci1.C30095a> arrayList;
        int m35282h;
        cc1 cc1Var = new cc1(bArr);
        try {
            cc1Var.m35284f(4);
            m35282h = cc1Var.m35282h();
            cc1Var.m35286e(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (m35282h == 1886547818) {
            cc1Var.m35284f(8);
            int m35289d = cc1Var.m35289d();
            int m35287e = cc1Var.m35287e();
            while (m35289d < m35287e) {
                int m35282h2 = cc1Var.m35282h() + m35289d;
                if (m35282h2 <= m35289d || m35282h2 > m35287e) {
                    break;
                }
                int m35282h3 = cc1Var.m35282h();
                if (m35282h3 != 2037673328 && m35282h3 != 1836279920) {
                    cc1Var.m35286e(m35282h2);
                    m35289d = m35282h2;
                }
                cc1Var.m35288d(m35282h2);
                arrayList = m34913a(cc1Var);
                break;
            }
            arrayList = null;
        } else {
            arrayList = m34913a(cc1Var);
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            ci1.C30095a c30095a = arrayList.get(0);
            return new ci1(c30095a, c30095a, i);
        } else if (size != 2) {
            return null;
        } else {
            return new ci1(arrayList.get(0), arrayList.get(1), i);
        }
    }
}
