package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.J9 */
/* loaded from: assets/audience_network.dex */
public enum EnumC12002J9 {
    A05(0),
    A04(1);
    
    public static byte[] A01;
    public static String[] A02 = {"uhTzHy3ANqMm9pT5Vj0y58oueHh5X8x0", "T1n0km6AB0RWROiTt90mCanTjxu0eU9v", "guj8u", "qED7e7UX90QQgnHDR4FxiOt7ONkFhw8M", "ckG7PMHxRgjSmMurQ73wQaofIHipTcek", "kxqjIStyOeZmlNn9xMd3jjfND4aGb7YZ", "8IQX3zoxYaZjanbr90SETWyiMVFv66cT", "UjafbnL"};
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "s0XGUsh";
            strArr2[2] = "eznYh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 35);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-43, -42, -41, -42, -29, -29, -42, -43, -72, -68, -68, -76, -77, -72, -80, -61, -76};
    }

    static {
        A01();
    }

    EnumC12002J9(int i) {
        this.A00 = i;
    }
}
