package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.In */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11980In {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 58, 55, 55, 52, 44, 4, 50, 58, 57, 4, 56, 52, 53, 47, 62, 35, 47, 4, 44, 41, 58, 43, 43, 62, 41, 4, 56, 41, 62, 58, 47, 50, 52, 53, 32, 37, 47, 54, 30, 32, 47, 37, 51, 46, 40, 37, 30, 36, 47, 32, 35, 45, 36, 30, 40, 47, 30, 32, 49, 49, 30, 35, 51, 46, 54, 50, 36, 51, 30, 39, 40, 45, 36, 30, 34, 41, 46, 46, 50, 36, 51, 11, 14, 4, 29, 53, 11, 4, 14, 24, 5, 3, 14, 53, 15, 4, 11, 8, 6, 15, 53, 3, 4, 53, 11, 26, 26, 53, 8, 24, 5, 29, 25, 15, 24, 53, 4, 11, 28, 3, 13, 11, 30, 3, 5, 4, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 106, 105, 84, 98, 102, 123, 121, 100, 125, 110, 84, 105, 121, 100, 124, 120, 98, 101, 108, 84, 104, 106, 123, 106, 105, 98, 103, 98, Byte.MAX_VALUE, 98, 110, 120, 93, 88, 82, 75, 99, 89, 82, 93, 94, 80, 89, 99, 85, 93, 94};
    }

    public static boolean A02(Context context) {
        return C11979Im.A0T(context).A2v(A00(0, 47, 121), true);
    }

    public static boolean A03(Context context) {
        return C11979Im.A0T(context).A2v(A00(47, 47, 99), false);
    }

    public static boolean A04(Context context) {
        return C11979Im.A0T(context).A2v(A00(139, 46, 41), false);
    }

    public static boolean A05(Context context) {
        return Build.VERSION.SDK_INT >= 19 && C11979Im.A0T(context).A2v(A00(185, 15, 30), false);
    }

    public static boolean A06(Context context) {
        return C11979Im.A0T(context).A2v(A00(94, 45, 72), false);
    }
}
