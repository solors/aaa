package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wy */
/* loaded from: assets/audience_network.dex */
public final class C12852Wy extends C11882H9 {
    public static byte[] A01;
    public static String[] A02 = {"oXD3w3tUVJHNPl", "GdV70Wcz8", "", "DzmyP9XSV", "ggRTYYsXaYFY6DcFpfUTDxKOGTV0t8hM", "gCu8mLRj1GKWx9K1TPcxrUR4JUG", "r1pVudNzCyG", "yxqMOZmEiVbhC7e6Vd9eEudE3"};
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 46;
            if (A02[6].length() == 27) {
                throw new RuntimeException();
            }
            A02[6] = "lZqD6G";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 18, 10, 29, 16, 21, 24, 92, 31, 19, 18, 8, 25, 18, 8, 92, 8, 5, 12, 25, 70, 92};
    }

    static {
        A01();
    }

    public C12852Wy(String str, C11876H3 c11876h3) {
        super(A00(0, 22, 82) + str, c11876h3, 1);
        this.A00 = str;
    }
}
