package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.LA */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12122LA {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC12036Jj, EnumC12038Jl> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC12036Jj.A09, EnumC12038Jl.A0D);
        A02.put(EnumC12036Jj.A07, EnumC12038Jl.A0F);
        A02.put(EnumC12036Jj.A06, EnumC12038Jl.A0E);
    }

    public static AdSize A00(EnumC12036Jj enumC12036Jj) {
        return AdSize.fromWidthAndHeight(enumC12036Jj.A04(), enumC12036Jj.A03());
    }

    public static AdSize A01(EnumC12038Jl enumC12038Jl) {
        for (Map.Entry<EnumC12036Jj, EnumC12038Jl> entry : A02.entrySet()) {
            if (entry.getValue() == enumC12038Jl) {
                EnumC12036Jj key = entry.getKey();
                if (A01[3].charAt(31) != 'z') {
                    String[] strArr = A01;
                    strArr[5] = "vUJqh";
                    strArr[7] = "m1G2X";
                    return A00(key);
                }
                throw new RuntimeException();
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC12036Jj A02(int i) {
        switch (i) {
            case 4:
                return EnumC12036Jj.A05;
            case 5:
                return EnumC12036Jj.A06;
            case 6:
                return EnumC12036Jj.A07;
            case 7:
                return EnumC12036Jj.A09;
            case 100:
                return EnumC12036Jj.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static EnumC12036Jj A03(int i, int i2) {
        if (EnumC12036Jj.A08.A03() == i2 && EnumC12036Jj.A08.A04() == i) {
            return EnumC12036Jj.A08;
        }
        if (EnumC12036Jj.A05.A03() == i2) {
            int A04 = EnumC12036Jj.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (A04 == i) {
                return EnumC12036Jj.A05;
            }
        }
        if (EnumC12036Jj.A06.A03() == i2 && EnumC12036Jj.A06.A04() == i) {
            return EnumC12036Jj.A06;
        }
        if (EnumC12036Jj.A07.A03() == i2 && EnumC12036Jj.A07.A04() == i) {
            return EnumC12036Jj.A07;
        }
        if (EnumC12036Jj.A09.A03() == i2) {
            EnumC12036Jj enumC12036Jj = EnumC12036Jj.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC12036Jj.A04() == i) {
                return EnumC12036Jj.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC12036Jj A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC12038Jl A05(EnumC12036Jj enumC12036Jj) {
        EnumC12038Jl adTemplate = A02.get(enumC12036Jj);
        if (adTemplate == null) {
            return EnumC12038Jl.A0G;
        }
        return adTemplate;
    }
}
