package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.IS */
/* loaded from: assets/audience_network.dex */
public final class C11959IS {
    public static byte[] A02;
    public final int A00;
    public final List<byte[]> A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{44, 89, 89, 86, 89, 7, 87, 72, 89, 90, 80, 85, 78, 7, 47, 44, 61, 42, 7, 74, 86, 85, 77, 80, 78};
    }

    public C11959IS(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    public static C11959IS A00(C11939I4 c11939i4) throws C11464A0 {
        try {
            c11939i4.A0Z(21);
            int A0E = c11939i4.A0E() & 3;
            int A0E2 = c11939i4.A0E();
            int i = 0;
            int A06 = c11939i4.A06();
            for (int i2 = 0; i2 < A0E2; i2++) {
                c11939i4.A0Z(1);
                int csdStartPosition = c11939i4.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c11939i4.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    i += lengthSizeMinusOne;
                    c11939i4.A0Z(numberOfArrays);
                }
            }
            c11939i4.A0Y(A06);
            byte[] bArr = new byte[i];
            int bufferPosition = 0;
            for (int i3 = 0; i3 < A0E2; i3++) {
                c11939i4.A0Z(1);
                int A0I = c11939i4.A0I();
                for (int csdStartPosition2 = 0; csdStartPosition2 < A0I; csdStartPosition2++) {
                    int csdLength2 = c11939i4.A0I();
                    byte[] bArr2 = AbstractC11935I0.A03;
                    int numberOfArrays2 = AbstractC11935I0.A03.length;
                    System.arraycopy(bArr2, 0, bArr, bufferPosition, numberOfArrays2);
                    int lengthSizeMinusOne2 = AbstractC11935I0.A03.length;
                    int bufferPosition2 = bufferPosition + lengthSizeMinusOne2;
                    byte[] bArr3 = c11939i4.A00;
                    int lengthSizeMinusOne3 = c11939i4.A06();
                    System.arraycopy(bArr3, lengthSizeMinusOne3, bArr, bufferPosition2, csdLength2);
                    bufferPosition = bufferPosition2 + csdLength2;
                    c11939i4.A0Z(csdLength2);
                }
            }
            int numberOfArrays3 = A0E + 1;
            return new C11959IS(i == 0 ? null : Collections.singletonList(bArr), numberOfArrays3);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C11464A0(A01(0, 25, 119), e);
        }
    }
}
