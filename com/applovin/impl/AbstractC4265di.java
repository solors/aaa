package com.applovin.impl;

import com.applovin.impl.C4188ci;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* renamed from: com.applovin.impl.di */
/* loaded from: classes2.dex */
abstract class AbstractC4265di {
    /* renamed from: a */
    private static int m99762a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: b */
    private static C4188ci.C4189a m99759b(C4066ah c4066ah) {
        int m100775j = c4066ah.m100775j();
        if (m100775j > 10000) {
            return null;
        }
        float[] fArr = new float[m100775j];
        for (int i = 0; i < m100775j; i++) {
            fArr[i] = c4066ah.m100776i();
        }
        int m100775j2 = c4066ah.m100775j();
        if (m100775j2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(m100775j * 2.0d) / log);
        C5971zg c5971zg = new C5971zg(c4066ah.m100787c());
        int i2 = 8;
        c5971zg.m92392c(c4066ah.m100785d() * 8);
        float[] fArr2 = new float[m100775j2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < m100775j2) {
            int i6 = 0;
            while (i6 < i3) {
                int m99762a = iArr[i6] + m99762a(c5971zg.m92403a(ceil));
                if (m99762a >= m100775j || m99762a < 0) {
                    return null;
                }
                fArr2[i5] = fArr[m99762a];
                iArr[i6] = m99762a;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        c5971zg.m92392c((c5971zg.m92389e() + 7) & (-8));
        int i7 = 32;
        int m92403a = c5971zg.m92403a(32);
        C4188ci.C4190b[] c4190bArr = new C4188ci.C4190b[m92403a];
        int i8 = 0;
        while (i8 < m92403a) {
            int m92403a2 = c5971zg.m92403a(i2);
            int m92403a3 = c5971zg.m92403a(i2);
            int m92403a4 = c5971zg.m92403a(i7);
            if (m92403a4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(m100775j2 * d) / log);
            float[] fArr3 = new float[m92403a4 * 3];
            float[] fArr4 = new float[m92403a4 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < m92403a4; i10++) {
                i9 += m99762a(c5971zg.m92403a(ceil2));
                if (i9 < 0 || i9 >= m100775j2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            c4190bArr[i8] = new C4188ci.C4190b(m92403a2, fArr3, fArr4, m92403a3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new C4188ci.C4189a(c4190bArr);
    }

    /* renamed from: c */
    private static ArrayList m99758c(C4066ah c4066ah) {
        if (c4066ah.m100762w() != 0) {
            return null;
        }
        c4066ah.m100778g(7);
        int m100775j = c4066ah.m100775j();
        if (m100775j == 1684433976) {
            C4066ah c4066ah2 = new C4066ah();
            Inflater inflater = new Inflater(true);
            try {
                if (!AbstractC5863xp.m93023a(c4066ah, c4066ah2, inflater)) {
                    return null;
                }
                inflater.end();
                c4066ah = c4066ah2;
            } finally {
                inflater.end();
            }
        } else if (m100775j != 1918990112) {
            return null;
        }
        return m99756e(c4066ah);
    }

    /* renamed from: d */
    private static ArrayList m99757d(C4066ah c4066ah) {
        int m100775j;
        c4066ah.m100778g(8);
        int m100785d = c4066ah.m100785d();
        int m100783e = c4066ah.m100783e();
        while (m100785d < m100783e && (m100775j = c4066ah.m100775j() + m100785d) > m100785d && m100775j <= m100783e) {
            int m100775j2 = c4066ah.m100775j();
            if (m100775j2 != 2037673328 && m100775j2 != 1836279920) {
                c4066ah.m100780f(m100775j);
                m100785d = m100775j;
            } else {
                c4066ah.m100782e(m100775j);
                return m99758c(c4066ah);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static ArrayList m99756e(C4066ah c4066ah) {
        ArrayList arrayList = new ArrayList();
        int m100785d = c4066ah.m100785d();
        int m100783e = c4066ah.m100783e();
        while (m100785d < m100783e) {
            int m100775j = c4066ah.m100775j() + m100785d;
            if (m100775j <= m100785d || m100775j > m100783e) {
                return null;
            }
            if (c4066ah.m100775j() == 1835365224) {
                C4188ci.C4189a m99759b = m99759b(c4066ah);
                if (m99759b == null) {
                    return null;
                }
                arrayList.add(m99759b);
            }
            c4066ah.m100780f(m100775j);
            m100785d = m100775j;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m99761a(C4066ah c4066ah) {
        c4066ah.m100778g(4);
        int m100775j = c4066ah.m100775j();
        c4066ah.m100780f(0);
        return m100775j == 1886547818;
    }

    /* renamed from: a */
    public static C4188ci m99760a(byte[] bArr, int i) {
        ArrayList arrayList;
        C4066ah c4066ah = new C4066ah(bArr);
        try {
            arrayList = m99761a(c4066ah) ? m99757d(c4066ah) : m99758c(c4066ah);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new C4188ci((C4188ci.C4189a) arrayList.get(0), (C4188ci.C4189a) arrayList.get(1), i);
        }
        return new C4188ci((C4188ci.C4189a) arrayList.get(0), i);
    }
}
