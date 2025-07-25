package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.RE */
/* loaded from: assets/audience_network.dex */
public enum EnumC12498RE {
    A03,
    A02,
    A05,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{28, 19, 20, 16, 28, 9, 24, 25, 107, 100, 99, 103, 107, 126, 99, 100, 109, 107, 124, 111, 124, 107, 106, 124, 102, 120, 119, 112, 116, 120, 109, 124, 125, 91, 76, 95, 76, 91, 90, 76, 86, 72, 71, SignedBytes.MAX_POWER_OF_TWO, 68, 72, 93, SignedBytes.MAX_POWER_OF_TWO, 71, 78};
    }

    static {
        A01();
    }
}
