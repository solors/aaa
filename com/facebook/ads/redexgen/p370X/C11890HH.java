package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.HH */
/* loaded from: assets/audience_network.dex */
public final class C11890HH extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-59, -85, -44, -19, -28, -9, -17, -28, -30, -13, -28, -29, -97};
    }

    public C11890HH(Throwable th) {
        super(A00(2, 11, 104) + th.getClass().getSimpleName() + A00(0, 2, 116) + th.getMessage(), th);
    }
}
