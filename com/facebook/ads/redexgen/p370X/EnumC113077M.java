package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.7M */
/* loaded from: assets/audience_network.dex */
public final class EnumC113077M {
    public static byte[] A00;
    public static String[] A01 = {"DEtwtGzSxOHfmsYE0nJutNtLbuPgZxnp", "HEN1zAi3Yn4iHVof3jMUFUQ", "m8f1TG9WFPBUvQLDx3K0MLj2Za0d4Euo", "A4PZagHoSRM8cM4mqm2KVFoT1GUYa0fw", "0QxzD8ZSXkCRRI3ROeoKuabFTd70p3Eq", "xILcHU0IM590zH2kPS2o7", "opJvnU19Lwme99brEfR2F", "9Gp2VR68AX"};
    public static final /* synthetic */ EnumC113077M[] A02;
    public static final EnumC113077M A03;
    public static final EnumC113077M A04;
    public static final EnumC113077M A05;
    public static final EnumC113077M A06;
    public static final EnumC113077M A07;
    public static final EnumC113077M A08;
    public static final EnumC113077M A09;
    public static final EnumC113077M A0A;
    public static final EnumC113077M A0B;
    public static final EnumC113077M A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-37, -26, -26, -21, -8, -8, -11, -18, -22, -9, -66, -61, -68, -51, -63, -52, -46, -65, -55, -62, -17, -11, -8, -22, -3, 29, 34, 40, -29, -26, -27, -34, 45, 52, 43, 43, 24, 26, 17, 21, 17, 28, 17, 30, 13, -23, -22, -24, -33, -28, -35};
        if (A01[2].charAt(8) != 'F') {
            throw new RuntimeException();
        }
        A01[2] = "JRHKMDEWFLpt4s2hfuCsUWWHTwNaAfzC";
        A00 = bArr;
    }

    static {
        A01();
        A0A = new EnumC113077M(A00(32, 4, 100), 0);
        A08 = new EnumC113077M(A00(25, 3, 89), 1);
        A09 = new EnumC113077M(A00(28, 4, 28), 2);
        A07 = new EnumC113077M(A00(20, 5, 46), 3);
        A06 = new EnumC113077M(A00(14, 6, 2), 4);
        A04 = new EnumC113077M(A00(3, 7, 46), 5);
        A05 = new EnumC113077M(A00(10, 4, 0), 6);
        A0C = new EnumC113077M(A00(45, 6, 27), 7);
        A03 = new EnumC113077M(A00(0, 3, 31), 8);
        A0B = new EnumC113077M(A00(36, 9, 77), 9);
        A02 = A02();
    }

    public EnumC113077M(String str, int i) {
    }

    public static /* synthetic */ EnumC113077M[] A02() {
        EnumC113077M[] enumC113077MArr = new EnumC113077M[10];
        enumC113077MArr[0] = A0A;
        enumC113077MArr[1] = A08;
        enumC113077MArr[2] = A09;
        enumC113077MArr[3] = A07;
        enumC113077MArr[4] = A06;
        enumC113077MArr[5] = A04;
        enumC113077MArr[6] = A05;
        enumC113077MArr[7] = A0C;
        if (A01[1].length() != 27) {
            A01[1] = "WetVKWfSjesX";
            enumC113077MArr[8] = A03;
            enumC113077MArr[9] = A0B;
            return enumC113077MArr;
        }
        throw new RuntimeException();
    }

    public static EnumC113077M valueOf(String str) {
        return (EnumC113077M) Enum.valueOf(EnumC113077M.class, str);
    }

    public static EnumC113077M[] values() {
        return (EnumC113077M[]) A02.clone();
    }
}
