package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.LY */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12146LY {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static String A01(long j) {
        String sb2;
        String A002 = A00(0, 0, 78);
        if (j < 1000) {
            sb2 = j + A002;
        } else {
            String A003 = A00(0, 4, 79);
            if (j < 1000000) {
                StringBuilder sb3 = new StringBuilder();
                String formattedNumber = String.format(Locale.US, A003, Double.valueOf(j / 1000.0d));
                StringBuilder append = sb3.append(formattedNumber);
                String formattedNumber2 = A00(8, 1, 55);
                sb2 = append.append(formattedNumber2).toString();
            } else if (j < 1000000000) {
                StringBuilder sb4 = new StringBuilder();
                String formattedNumber3 = String.format(Locale.US, A003, Double.valueOf(j / 1000000.0d));
                StringBuilder append2 = sb4.append(formattedNumber3);
                String formattedNumber4 = A00(9, 1, 46);
                sb2 = append2.append(formattedNumber4).toString();
            } else {
                StringBuilder sb5 = new StringBuilder();
                String formattedNumber5 = String.format(Locale.US, A003, Double.valueOf(j / 1.0E9d));
                StringBuilder append3 = sb5.append(formattedNumber5);
                String formattedNumber6 = A00(7, 1, 67);
                sb2 = append3.append(formattedNumber6).toString();
            }
        }
        String A004 = A00(4, 3, 1);
        if (sb2.contains(A004)) {
            return sb2.replace(A004, A002);
        }
        return sb2;
    }
}
