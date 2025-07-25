package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kg */
/* loaded from: assets/audience_network.dex */
public final class C12094Kg {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static SharedPreferences A00(C113257j c113257j) {
        return c113257j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 40, 89), c113257j), 0);
    }

    public final int A03(C113257j c113257j, String str, int i) {
        return A00(c113257j).getInt(str, i);
    }

    public final String A04(C113257j c113257j, String str, String str2) {
        return A00(c113257j).getString(str, str2);
    }

    public final void A05(C113257j c113257j, String str, int i) {
        SharedPreferences btSP = A00(c113257j);
        btSP.edit().putInt(str, i).apply();
    }

    public final void A06(C113257j c113257j, String str, String str2) {
        SharedPreferences btSP = A00(c113257j);
        btSP.edit().putString(str, str2).apply();
    }
}
