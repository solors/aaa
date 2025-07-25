package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.util.process.ProcessUtils;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2T */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC110162T {
    public static C110152S A00;
    public static byte[] A01;
    public static String[] A02 = {"g", "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = POBNativeConstants.NATIVE_IMAGE_WIDTH;
            strArr2[0] = "P";
            copyOfRange[i4] = (byte) (i5 ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, 27, 83, 84, 86, 80, 87, 90, 90, 94, 27, 84, 81, 70, 27, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static C110152S A00(C13028Zr c13028Zr) {
        if (A00 == null) {
            synchronized (C110152S.class) {
                if (A00 == null) {
                    A00 = new C110152S(new C13113bH(c13028Zr.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c13028Zr), 0)));
                }
            }
        }
        return A00;
    }
}
