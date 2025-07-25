package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.L7 */
/* loaded from: assets/audience_network.dex */
public final class C12119L7 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, 124, -64, -61, -68, -68, -73, -68, -75, -83, -77, UnsignedBytes.MAX_POWER_OF_TWO, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        synchronized (C12119L7.class) {
            if (A04()) {
                return System.getProperty(A00(0, 7, 115) + str);
            }
            return null;
        }
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        boolean z;
        synchronized (C12119L7.class) {
            if (!A00) {
                A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
                A00 = true;
            }
            z = A01;
        }
        return z;
    }

    public static synchronized boolean A05(String str) {
        boolean z;
        synchronized (C12119L7.class) {
            z = !TextUtils.isEmpty(A01(str));
        }
        return z;
    }
}
