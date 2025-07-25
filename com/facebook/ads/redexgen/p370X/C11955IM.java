package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.IM */
/* loaded from: assets/audience_network.dex */
public final class C11955IM {
    public static byte[] A05;
    public static String[] A06 = {"CKr41w14t1O2cryEh3ikvT7i7pEP9", "bEGBJQHGeZKUb4WdZIGxqLwvmRBgZ", "WJDScLHbi8oxsdfQony1oDJlSLfJGxpw", "pOlO7zhgFKlhBGXLhLjwOcF", "rLNLh63NT4PjFgFvGilm0aaXO1", "ZBDxHqybdlnYnJoT5A", "oQHJZTGiGZIE4PPH2KMpxcomJFI3fhl6", "Q2Q9yYe5Vhv4fwSqVMC8JpXgrnkYYd7U"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11955IM A00(C11939I4 c11939i4) throws C11464A0 {
        try {
            c11939i4.A0Z(4);
            int A0E = (c11939i4.A0E() & 3) + 1;
            if (A0E != 3) {
                ArrayList arrayList = new ArrayList();
                int A0E2 = c11939i4.A0E() & 31;
                for (int i = 0; i < A0E2; i++) {
                    arrayList.add(A03(c11939i4));
                }
                int A0E3 = c11939i4.A0E();
                for (int i2 = 0; i2 < A0E3; i2++) {
                    arrayList.add(A03(c11939i4));
                }
                int i3 = -1;
                int i4 = -1;
                float f = 1.0f;
                if (A0E2 > 0) {
                    C11934Hz A062 = AbstractC11935I0.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                    i3 = A062.A06;
                    i4 = A062.A02;
                    f = A062.A00;
                    String[] strArr = A06;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A06;
                    strArr2[0] = "iF8GnQ9Q0rYocX5fL90VsceL3jxlg";
                    strArr2[1] = "Hokd8PUOGTr7ZNbLj7TXmfqAgif2w";
                }
                return new C11955IM(arrayList, A0E, i3, i4, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C11464A0(A01(0, 24, 113), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{36, 19, 19, 14, 19, 65, 17, 0, 19, 18, 8, 15, 6, 65, 32, 55, 34, 65, 2, 14, 15, 7, 8, 6};
    }

    static {
        A02();
    }

    public C11955IM(List<byte[]> initializationData, int i, int i2, int i3, float f) {
        this.A04 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
    }

    public static byte[] A03(C11939I4 c11939i4) {
        int A0I = c11939i4.A0I();
        int offset = c11939i4.A06();
        c11939i4.A0Z(A0I);
        return AbstractC11918Hj.A08(c11939i4.A00, offset, A0I);
    }
}
