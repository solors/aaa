package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7a */
/* loaded from: assets/audience_network.dex */
public enum EnumC113177a {
    A03,
    A04,
    A0I,
    A0B,
    A0D,
    A05,
    A0A,
    A07,
    A0L,
    A0E,
    A0F,
    A02,
    A06,
    A08,
    A0J,
    A0M,
    A0H,
    A09,
    A0G,
    A0K,
    A0C;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{1, 18, 18, 1, 25, -77, -64, -64, -67, -74, -78, -65, -13, 10, 5, -10, -56, -51, -58, -41, -70, -69, -71, -62, -73, -56, -69, -70, -3, 8, 14, -5, 5, -2, -80, -67, -67, -70, -67, -77, -58, -77, -79, -61, -62, -81, -80, -70, -77, -7, -1, 2, -12, 7, -80, -75, -69, -18, -13, -7, -22, -9, -8, -22, -24, -7, -18, -12, -13, -97, -94, -95, -102, 21, 22, 21, 12, -28, -21, -30, -30, 10, 15, 3, 0, 13, -85, -100, -98, -90, -100, -94, -96, -82, -93, -86, -83, -81, -44, -39, -48, -59, -42, -63, -46, -2, -9, -14, -8, -9, 22, 15, 9, 4, 9, -5, -2, -10, -11, -13, 4, -10};
    }

    static {
        A01();
    }
}
