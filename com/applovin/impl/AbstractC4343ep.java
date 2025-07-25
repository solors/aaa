package com.applovin.impl;

/* renamed from: com.applovin.impl.ep */
/* loaded from: classes2.dex */
public abstract class AbstractC4343ep {
    /* renamed from: a */
    public static int m99465a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m99464a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static long m99467a(C4066ah c4066ah, int i, int i2) {
        c4066ah.m100780f(i);
        if (c4066ah.m100797a() < 5) {
            return -9223372036854775807L;
        }
        int m100775j = c4066ah.m100775j();
        if ((8388608 & m100775j) == 0 && ((2096896 & m100775j) >> 8) == i2 && (m100775j & 32) != 0 && c4066ah.m100762w() >= 7 && c4066ah.m100797a() >= 7 && (c4066ah.m100762w() & 16) == 16) {
            byte[] bArr = new byte[6];
            c4066ah.m100790a(bArr, 0, 6);
            return m99466a(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m99466a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
