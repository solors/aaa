package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.As */
/* loaded from: assets/audience_network.dex */
public final class C11518As extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"9pRqtqi3B", "JLdBJvINcDpXAJRy2UXokirsyAm3AHdF", "frFBuXumqsQze9gDO0obsB6cGwssnn2k", "1OAjkxxII3AJpjsq4Owj5COwKU2yEoCn", "nSdrqNcbm", "RxwVmVtKL", "mcWlkz1DsHXHGDaAhVJHp1I", "BOAhRTYtJ"};
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {81, 101, 116, 121, Byte.MAX_VALUE, 68, 98, 113, 115, 123, 48, 103, 98, 121, 100, 117, 48, 118, 113, 121, 124, 117, 116, 42, 48};
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "fnY9AWebU";
        strArr2[5] = "pcBma8CYl";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C11518As(int i) {
        super(A00(0, 25, 119) + i);
        this.A00 = i;
    }
}
