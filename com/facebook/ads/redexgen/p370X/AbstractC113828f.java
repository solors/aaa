package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8f */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC113828f {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{6, 6, 19, 7, -7, 6, 10, -3, -9, -7, 19, -7, 12, 8, 6, -11, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -4, -19, -12, 8, -1, -18, -5, -4, -14, -8, -9};
    }

    public static String A01(C13028Zr c13028Zr) {
        return AbstractC12071KJ.A00(c13028Zr).getString(A00(0, 17, 75), null);
    }

    public static String A02(C13028Zr c13028Zr) {
        return AbstractC12071KJ.A00(c13028Zr).getString(A00(17, 22, 64), null);
    }

    public static void A04(C13028Zr c13028Zr) {
        AbstractC12071KJ.A00(c13028Zr).edit().remove(A00(17, 22, 64)).apply();
    }

    public static void A05(C13028Zr c13028Zr, String str, String str2) {
        AbstractC12071KJ.A00(c13028Zr).edit().putString(A00(17, 22, 64), str).putString(A00(0, 17, 75), str2).apply();
    }
}
