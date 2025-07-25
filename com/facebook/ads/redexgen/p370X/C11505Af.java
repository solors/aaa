package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Af */
/* loaded from: assets/audience_network.dex */
public final class C11505Af extends Exception {
    public static byte[] A00;
    public static String[] A01 = {"UWlpQQTiEDwOX7IrpEHWYNMuR1ZHkPvn", "oPg19ZETYULsNUg5O8QefgKam9gehu", "UM9JT6B", "seJxVbuvrp", "iD9akPgxjmJ1fdcDGVkD2Xrn4fmgc2oX", "GCLVfP1zfZau8msNy1BVLwfXpwZzSt58", "1BDf1JBwZX13Qoaiu6bzE", "X7ABsvepXICTkHYCTs3hwoQ4GB6A1sZ"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[6].length() != 21) {
                throw new RuntimeException();
            }
            A01[3] = "df";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{40, SignedBytes.MAX_POWER_OF_TWO, 114, 36, 40, 82, 17, 26, 19, 28, 28, 23, 30, 1, 82, 27, 28, 82, 23, 28, 17, 29, 22, 27, 28, 21, 82, 125, 70, SignedBytes.MAX_POWER_OF_TWO, 73, 70, 76, 68, 77, 76, 8, 78, 71, 90, 69, 73, 92, 18, 8};
    }

    static {
        A01();
    }

    public C11505Af(int i, int i2, int i3) {
        super(A00(27, 18, 97) + i + A00(0, 5, 65) + i2 + A00(5, 22, 59) + i3);
    }
}
