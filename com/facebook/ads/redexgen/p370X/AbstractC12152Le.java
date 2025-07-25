package com.facebook.ads.redexgen.p370X;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Le */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12152Le {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-33, -41, -38, -31, -41, -39};
    }

    public static Bundle A00(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC110092M.A01, A01(0, 6, 102));
        bundle.putString(AbstractC110092M.A00, str);
        return bundle;
    }
}
