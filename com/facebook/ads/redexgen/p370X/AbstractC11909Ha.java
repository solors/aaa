package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ha */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11909Ha {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{36, 55, 46, 30, 43, 36, 45, -41, -22, -31, -47, -28, -41, -42, -37, -28};
    }

    public static long A00(InterfaceC11908HZ interfaceC11908HZ) {
        return interfaceC11908HZ.A6B(A02(0, 7, 127), -1L);
    }

    public static Uri A01(InterfaceC11908HZ interfaceC11908HZ) {
        String A6D = interfaceC11908HZ.A6D(A02(7, 9, 50), null);
        if (A6D == null) {
            return null;
        }
        return Uri.parse(A6D);
    }

    public static void A04(C11910Hb c11910Hb) {
        c11910Hb.A01(A02(7, 9, 50));
    }

    public static void A05(C11910Hb c11910Hb, long j) {
        c11910Hb.A02(A02(0, 7, 127), j);
    }

    public static void A06(C11910Hb c11910Hb, Uri uri) {
        c11910Hb.A03(A02(7, 9, 50), uri.toString());
    }
}
