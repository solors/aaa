package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.JZ */
/* loaded from: assets/audience_network.dex */
public final class EnumC12028JZ {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC12028JZ[] A02;
    public static final EnumC12028JZ A03;
    public static final EnumC12028JZ A04;
    public static final EnumC12028JZ A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{88, 89, 90, 93, 73, 80, 72, 98, 107, 107, 2, 3};
    }

    static {
        A02();
        A03 = new EnumC12028JZ(A01(0, 7, 61), 0);
        A05 = new EnumC12028JZ(A01(10, 2, 108), 1);
        A04 = new EnumC12028JZ(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC12028JZ(String str, int i) {
    }

    public static VideoAutoplayBehavior A00(EnumC12028JZ enumC12028JZ) {
        if (enumC12028JZ == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (enumC12028JZ) {
            case A03:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case A05:
                return VideoAutoplayBehavior.ON;
            case A04:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ EnumC12028JZ[] A03() {
        EnumC12028JZ[] enumC12028JZArr = new EnumC12028JZ[3];
        enumC12028JZArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC12028JZArr[1] = A05;
        enumC12028JZArr[2] = A04;
        return enumC12028JZArr;
    }

    public static EnumC12028JZ valueOf(String str) {
        return (EnumC12028JZ) Enum.valueOf(EnumC12028JZ.class, str);
    }

    public static EnumC12028JZ[] values() {
        return (EnumC12028JZ[]) A02.clone();
    }
}
