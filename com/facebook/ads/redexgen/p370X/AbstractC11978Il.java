package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Il */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11978Il {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 59, 49, 40, 0, 60, 48, 49, 57, 54, 56, 0, 44, 58, 49, 59, 0, 57, 61, 51, 48, 56, 54, 49, 0, 62, 44, 54, 59, Byte.MAX_VALUE, 122, 112, 105, 65, 119, 122, 120, Byte.MAX_VALUE, 65, 108, 123, 120, 108, 123, 109, 118, 65, 106, 119, 115, 123, 65, 115, 109, 94, 91, 81, 72, 96, 76, 87, 80, 74, 83, 91, 96, 76, 90, 81, 91, 96, 94, 79, 79, 96, 86, 81, 89, 80, 96, 86, 81, 96, 74, 76, 90, 77, 96, 94, 88, 90, 81, 75, 1, 4, 14, 23, 63, 21, 19, 5, 63, 6, 2, 84, 1, 63, 9, 4, 122, Byte.MAX_VALUE, 117, 108, 68, 110, 104, 126, 68, 125, 121, 47, 122, 68, 114, Byte.MAX_VALUE, 68, 125, 114, 105, 104, 111, SignedBytes.MAX_POWER_OF_TWO, 69, 79, 86, 126, 84, 82, 68, 83, 126, SignedBytes.MAX_POWER_OF_TWO, 70, 68, 79, 85, 126, 83, 68, 71, 83, 68, 82, 73, 126, 85, 72, 76, 68, 126, 76, 82};
    }

    public static long A00(Context context) {
        return C11979Im.A0T(context).A2q(A02(29, 25, 32), -1L);
    }

    public static long A01(Context context) {
        return C11979Im.A0T(context).A2q(A02(131, 31, 31), -1L);
    }

    public static boolean A04(Context context) {
        return C11979Im.A0T(context).A2v(A02(54, 39, 1), true);
    }

    public static boolean A05(Context context) {
        return C11979Im.A0T(context).A2v(A02(0, 29, 97), false);
    }

    public static boolean A06(Context context) {
        return C11979Im.A0T(context).A2v(A02(93, 16, 94), false);
    }

    public static boolean A07(Context context) {
        return C11979Im.A0T(context).A2v(A02(109, 22, 37), false);
    }
}
