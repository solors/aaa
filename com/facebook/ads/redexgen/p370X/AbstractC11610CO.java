package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.UnsignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.CO */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11610CO {
    public static byte[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public static final int A0y;
    public static final int A0z;
    public static final int A10;
    public static final int A11;
    public static final int A12;
    public static final int A13;
    public static final int A14;
    public static final int A15;
    public static final int A16;
    public static final int A17;
    public static final int A18;
    public static final int A19;
    public static final int A1A;
    public static final int A1B;
    public static final int A1C;
    public static final int A1D;
    public static final int A1E;
    public static final int A1F;
    public static final int A1G;
    public static final int A1H;
    public static final int A1I;
    public static final int A1J;
    public static final int A1K;
    public static final int A1L;
    public static final int A1M;
    public static final int A1N;
    public static final int A1O;
    public static final int A1P;
    public static final int A1Q;
    public static final int A1R;
    public static final int A1S;
    public static final int A1T;
    public static final int A1U;
    public static final int A1V;
    public static final int A1W;
    public final int A00;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-108, -45, -42, -103, 4, 4, -3, -4, -90, -88, 114, 120, 15, 26, 15, 17, -17, 4, -15, -65, -14, 7, -12, -60, 16, 37, 18, -14, -93, 118, 112, 120, 9, 7, 19, 19, -81, -69, -126, UnsignedBytes.MAX_POWER_OF_TWO, -18, -1, -1, -2, -51, -101, -97, -100, 0, -3, -1, -49, -59, -62, -43, -62, -68, -68, -52, -53, -97, -96, -98, 110, -88, -72, -73, -89, -58, -42, -43, -57, -16, 0, -1, -12, -43, -27, -28, -35, -47, -49, -103, -97, -1, -2, 14, 13, -101, -94, -87, -86, -2, 6, 12, 0, -9, 0, -11, -13, -46, -37, -48, -29, -89, -75, -90, -75, 22, 34, 29, 17, 20, 34, 39, 30, 7, 3, 11, 17, -7, -10, 7, -62, -92, -78, -97, 109, -87, -73, -92, -124, -95, -92, -85, -84, -33, -29, -42, -32, 27, 18, 15, 34, -8, -17, -13, -17, -59, -68, -63, -71, -84, -92, -96, -83, -52, -60, -57, -61, 29, 21, 36, 17, -18, -22, -17, -25, 34, 36, 36, 27, -14, -12, -12, -5, -11, -8, -68, -23, -92, -89, 107, -83, 3, 12, -5, 14, -81, -72, -86, -90, -35, -48, -36, -44, -84, -99, -81, -84, -18, -16, -19, -24, -36, -33, -33, -44, -64, Byte.MAX_VALUE, -125, UnsignedBytes.MAX_POWER_OF_TWO, -39, -57, -49, -43, 39, 21, 29, 46, -57, -75, -63, -58, -17, -35, -13, -34, -44, -61, -56, -47, -30, -46, -41, -40, -18, -34, -29, -24, -54, -68, -59, -70, -65, -77, -68, -80, 31, 21, 16, 36, -84, -94, -89, -97, 8, 4, 12, 9, 10, 11, -54, -5, -41, -40, -58, -48, -56, -55, -72, -60, -47, -46, -50, -50, 8, 9, 8, -8, -22, -21, -22, -37, -9, -8, -9, -9, -75, -74, -75, -68, -30, -29, -29, -30, -17, -16, -10, -82, -59, -56, -123, -74, 15, 0, 9, -2, -3, -17, -19, -3, 17, 3, 5, 1, 25, 16, 13, 9, -17, -19, -36, -31, -24, -26, -43, -33, -86, -88, -101, -82, -66, -68, -65, -72, 33, 37, -32, 20, -10, -27, -11, -30, -24, -24, -36, -41, -72, -81, -86, -90, 27, 21, -43, -35, 28, 22, -42, -33, -32, -38, -51, -83, 15, -7, 14, -3, -30, -31, -33, -33};
    }

    static {
        A04();
        A0U = AbstractC11953IK.A08(A03(112, 4, 120));
        A06 = AbstractC11953IK.A08(A03(16, 4, 88));
        A07 = AbstractC11953IK.A08(A03(20, 4, 91));
        A0X = AbstractC11953IK.A08(A03(124, 4, 6));
        A0W = AbstractC11953IK.A08(A03(120, 4, 91));
        A0s = AbstractC11953IK.A08(A03(208, 4, 23));
        A0D = AbstractC11953IK.A08(A03(44, 4, 51));
        A0b = AbstractC11953IK.A08(A03(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 4, 120));
        A0k = AbstractC11953IK.A08(A03(176, 4, 82));
        A03 = AbstractC11953IK.A08(A03(0, 4, 48));
        A1V = AbstractC11953IK.A08(A03(364, 4, 98));
        A0a = AbstractC11953IK.A08(A03(136, 4, 61));
        A14 = AbstractC11953IK.A08(A03(256, 4, 95));
        A04 = AbstractC11953IK.A08(A03(8, 4, 15));
        A0E = AbstractC11953IK.A08(A03(48, 4, 102));
        A0M = AbstractC11953IK.A08(A03(80, 4, 54));
        A0H = AbstractC11953IK.A08(A03(60, 4, 5));
        A0I = AbstractC11953IK.A08(A03(64, 4, 14));
        A0K = AbstractC11953IK.A08(A03(72, 4, 86));
        A0L = AbstractC11953IK.A08(A03(76, 4, 59));
        A0J = AbstractC11953IK.A08(A03(68, 4, 44));
        A0G = AbstractC11953IK.A08(A03(56, 4, 34));
        A1H = AbstractC11953IK.A08(A03(308, 4, 83));
        A1I = AbstractC11953IK.A08(A03(312, 4, 103));
        A1M = AbstractC11953IK.A08(A03(328, 4, 0));
        A1N = AbstractC11953IK.A08(A03(332, 4, 20));
        A12 = AbstractC11953IK.A08(A03(248, 4, 118));
        A0j = AbstractC11953IK.A08(A03(172, 4, 79));
        A0n = AbstractC11953IK.A08(A03(188, 4, 12));
        A1L = AbstractC11953IK.A08(A03(324, 4, 62));
        A0d = AbstractC11953IK.A08(A03(148, 4, 34));
        A0h = AbstractC11953IK.A08(A03(164, 4, 75));
        A16 = AbstractC11953IK.A08(A03(264, 4, 46));
        A08 = AbstractC11953IK.A08(A03(24, 4, 121));
        A0Y = AbstractC11953IK.A08(A03(128, 4, 11));
        A0S = AbstractC11953IK.A08(A03(104, 4, 12));
        A0i = AbstractC11953IK.A08(A03(168, 4, 127));
        A1K = AbstractC11953IK.A08(A03(320, 4, 69));
        A0m = AbstractC11953IK.A08(A03(184, 4, 96));
        A0f = AbstractC11953IK.A08(A03(156, 4, 41));
        A1J = AbstractC11953IK.A08(A03(316, 4, 111));
        A0N = AbstractC11953IK.A08(A03(84, 4, 100));
        A0O = AbstractC11953IK.A08(A03(88, 4, 0));
        A0c = AbstractC11953IK.A08(A03(144, 4, 85));
        A0V = AbstractC11953IK.A08(A03(116, 4, 105));
        A1A = AbstractC11953IK.A08(A03(280, 4, 65));
        A0r = AbstractC11953IK.A08(A03(204, 4, 54));
        A13 = AbstractC11953IK.A08(A03(252, 4, 3));
        A0z = AbstractC11953IK.A08(A03(236, 4, 69));
        A0y = AbstractC11953IK.A08(A03(232, 4, 57));
        A1G = AbstractC11953IK.A08(A03(304, 4, 101));
        A0R = AbstractC11953IK.A08(A03(100, 4, 55));
        A0Q = AbstractC11953IK.A08(A03(96, 4, 92));
        A0T = AbstractC11953IK.A08(A03(108, 4, 122));
        A0u = AbstractC11953IK.A08(A03(216, 4, 126));
        A0t = AbstractC11953IK.A08(A03(212, 4, 48));
        A0x = AbstractC11953IK.A08(A03(228, 4, 43));
        A11 = AbstractC11953IK.A08(A03(244, 4, 22));
        A1Q = AbstractC11953IK.A08(A03(344, 4, 61));
        A10 = AbstractC11953IK.A08(A03(240, 4, 33));
        A0p = AbstractC11953IK.A08(A03(196, 4, 6));
        A02 = AbstractC11953IK.A08(A03(4, 4, 122));
        A1R = AbstractC11953IK.A08(A03(348, 4, 12));
        A0l = AbstractC11953IK.A08(A03(180, 4, 1));
        A1D = AbstractC11953IK.A08(A03(292, 4, 57));
        A1B = AbstractC11953IK.A08(A03(284, 4, 78));
        A0C = AbstractC11953IK.A08(A03(40, 4, 85));
        A19 = AbstractC11953IK.A08(A03(276, 4, 95));
        A1C = AbstractC11953IK.A08(A03(288, 4, 12));
        A1E = AbstractC11953IK.A08(A03(296, 4, 70));
        A17 = AbstractC11953IK.A08(A03(268, 4, 31));
        A0B = AbstractC11953IK.A08(A03(36, 4, 22));
        A1O = AbstractC11953IK.A08(A03(336, 4, 119));
        A1W = AbstractC11953IK.A08(A03(368, 4, 53));
        A18 = AbstractC11953IK.A08(A03(272, 4, 40));
        A09 = AbstractC11953IK.A08(A03(28, 4, 10));
        A0v = AbstractC11953IK.A08(A03(220, 4, 30));
        A0w = AbstractC11953IK.A08(A03(224, 4, 70));
        A1P = AbstractC11953IK.A08(A03(340, 4, 75));
        A0g = AbstractC11953IK.A08(A03(160, 4, 122));
        A0Z = AbstractC11953IK.A08(A03(132, 4, 2));
        A0e = AbstractC11953IK.A08(A03(ErrorCode.CODE_NOT_TRACK_STATUS, 4, 9));
        A0o = AbstractC11953IK.A08(A03(192, 4, 57));
        A0F = AbstractC11953IK.A08(A03(52, 4, 43));
        A0P = AbstractC11953IK.A08(A03(92, 4, 99));
        A15 = AbstractC11953IK.A08(A03(260, 4, 97));
        A1F = AbstractC11953IK.A08(A03(300, 4, 28));
        A0q = AbstractC11953IK.A08(A03(200, 4, 72));
        A1S = AbstractC11953IK.A08(A03(352, 4, 111));
        A1T = AbstractC11953IK.A08(A03(356, 4, 112));
        A1U = AbstractC11953IK.A08(A03(360, 4, 52));
        A0A = AbstractC11953IK.A08(A03(32, 4, 112));
        A05 = AbstractC11953IK.A08(A03(12, 4, 120));
    }

    public AbstractC11610CO(int i) {
        this.A00 = i;
    }

    public static int A00(int i) {
        return 16777215 & i;
    }

    public static int A01(int i) {
        return (i >> 24) & 255;
    }

    public static String A02(int i) {
        return A03(0, 0, 35) + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return A02(this.A00);
    }
}
