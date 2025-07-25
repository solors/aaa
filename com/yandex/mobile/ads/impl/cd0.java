package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.x01;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class cd0 {

    /* renamed from: a */
    public final List<byte[]> f77601a;

    /* renamed from: b */
    public final int f77602b;

    /* renamed from: c */
    public final float f77603c;
    @Nullable

    /* renamed from: d */
    public final String f77604d;

    private cd0(List list, int i, float f, @Nullable String str) {
        this.f77601a = list;
        this.f77602b = i;
        this.f77603c = f;
        this.f77604d = str;
    }

    /* renamed from: a */
    public static cd0 m35247a(cc1 cc1Var) throws gc1 {
        List singletonList;
        int i;
        try {
            cc1Var.m35284f(21);
            int m35270t = cc1Var.m35270t() & 3;
            int m35270t2 = cc1Var.m35270t();
            int m35289d = cc1Var.m35289d();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < m35270t2; i4++) {
                cc1Var.m35284f(1);
                int m35264z = cc1Var.m35264z();
                for (int i5 = 0; i5 < m35264z; i5++) {
                    int m35264z2 = cc1Var.m35264z();
                    i3 += m35264z2 + 4;
                    cc1Var.m35284f(m35264z2);
                }
            }
            cc1Var.m35286e(m35289d);
            byte[] bArr = new byte[i3];
            float f = 1.0f;
            String str = null;
            int i6 = 0;
            int i7 = 0;
            while (i6 < m35270t2) {
                int m35270t3 = cc1Var.m35270t() & 127;
                int m35264z3 = cc1Var.m35264z();
                int i8 = i2;
                while (i8 < m35264z3) {
                    int m35264z4 = cc1Var.m35264z();
                    System.arraycopy(x01.f87454a, i2, bArr, i7, 4);
                    int i9 = i7 + 4;
                    System.arraycopy(cc1Var.m35291c(), cc1Var.m35289d(), bArr, i9, m35264z4);
                    if (m35270t3 == 33 && i8 == 0) {
                        x01.C31782a m27713a = x01.m27713a(bArr, i9, i9 + m35264z4);
                        float f2 = m27713a.f87464g;
                        i = m35270t2;
                        str = C30575ip.m33158a(m27713a.f87458a, m27713a.f87459b, m27713a.f87460c, m27713a.f87461d, m27713a.f87462e, m27713a.f87463f);
                        f = f2;
                    } else {
                        i = m35270t2;
                    }
                    i7 = i9 + m35264z4;
                    cc1Var.m35284f(m35264z4);
                    i8++;
                    m35270t2 = i;
                    i2 = 0;
                }
                i6++;
                i2 = 0;
            }
            if (i3 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new cd0(singletonList, m35270t + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw gc1.m33885a("Error parsing HEVC config", e);
        }
    }
}
