package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.I7 */
/* loaded from: assets/audience_network.dex */
public class C11942I7 extends IOException {
    public static byte[] A00;
    public static String[] A01 = {"Par4AxgKHuADzZajYCYNv8eTOybwGgE2", "HOlKa3VqrZNKzXakTySiImjoYLF1tZiN", "sTSFXoUHOi5oDtfYDlzbl5cXoLl4KFeB", "BEd4Yr8LrEpTvBWaPpQjQteHmdcbjxPt", "vX3nZ4LKyiX8ravoL0WOyW1E36Z0Tdtf", "vpWWQ4wUWg0aqGuW9hPs7ZH", "ICpSMLm3FgqRzKio0CYh0", "tdB"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(17) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "DyR";
            strArr[6] = "x1HJO6sm0oZLnlsePqFvX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{32, 44, 100, 101, 107, 100, 105, Byte.MAX_VALUE, 120, 49, 76, 110, 117, 115, 110, 117, 104, 101, 60, 104, 115, 115, 60, 112, 115, 107, 60, 71, 108, 110, 117, 115, 110, 117, 104, 101, 33, 111};
    }

    static {
        A01();
    }

    public C11942I7(int i, int i2) {
        super(A00(10, 27, 69) + i + A00(0, 10, 85) + i2 + A00(37, 1, 107));
    }
}
