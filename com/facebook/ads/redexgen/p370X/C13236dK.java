package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0002\b\u0002J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dK */
/* loaded from: assets/audience_network.dex */
public final class C13236dK {
    public static byte[] A00;
    public static String[] A01 = {"e7AwhByPjRPUw6TPvHQ97hdZd1", "BA53CFSFXKNaueAmPJEc9hkRINMpWiHX", "eg", "BOBLIBOzzfVObnmt242WmA3oiPmYKJxA", "5X54btT7YSWi6fK", "vwsHu7ibsWkpW0OsiHz", "pfFn7t8nBopYri9", "k"};
    public static final C13236dK A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "yY0Pcbq111zueav";
            strArr2[6] = "lktBBxSgK8ahxIm";
            copyOfRange[i4] = (byte) (i5 ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 31, 4, 28, 25, 30, 94, 37, 30, 25, 4};
    }

    static {
        A01();
        A02 = new C13236dK();
    }

    public final String toString() {
        return A00(0, 11, 33);
    }
}
