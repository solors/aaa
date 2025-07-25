package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DU */
/* loaded from: assets/audience_network.dex */
public class C11678DU extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -24, -20, -36, -23, -16, -105, -20, -27, -37, -36, -23, -29, -16, -32, -27, -34, -105, -28, -36, -37, -32, -40, -105, -38, -26, -37, -36, -38, -22};
    }

    public C11678DU(Throwable th) {
        super(A00(0, 39, 115), th);
    }
}
