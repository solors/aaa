package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5a */
/* loaded from: assets/audience_network.dex */
public final class C112065a {
    public static byte[] A07;
    public static String[] A08 = {"WrVVpIlV0mVOOesXyJjac9RJgGDEsYiy", "55KqVxwk4ItPenJ0PbzoYHpl7VLiDDoF", "", "85Uc86a0UVsoWW8LIwye7frNycSrKuPv", "TRaam", "0wWSnm1p2XMm3vcxH", "", "BPzoua9RAnM56oYN7Gpf0cmvKga9OU"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AudienceNetworkActivity A04;
    public final AudienceNetworkActivityApi A05;
    public final C13029Zs A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-78, -19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -21, -18, -4, -17, -6, -7, -4, -2, -13, -8, -15, -72, -48, -45, -40, -45, -35, -46, -23, -53, -50, -23, -36, -49, -38, -39, -36, -34, -45, -40, -47, -23, -48, -42, -39, -31, 28, 40, 38, -25, 31, 26, 28, 30, 27, 40, 40, 36, -25, 26, 29, 44, -25, 34, 39, 45, 30, 43, 44, 45, 34, 45, 34, 26, 37, -25, 26, 28, 45, 34, 47, 34, 45, 50, 24, 29, 30, 44, 45, 43, 40, 50, 30, 29, 16, 28, 26, -37, 19, 14, 16, 18, 15, 28, 28, 24, -37, 14, 17, 32, -37, 22, 27, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 17, 22, 32, 26, 22, 32, 32, 18, 17, 46, 58, 56, -7, 49, 44, 46, 48, 45, 58, 58, 54, -7, 44, 47, 62, -7, 52, 57, 63, 48, 61, 62, 63, 52, 63, 52, 44, 55, -7, 48, 61, 61, 58, 61, -39, -27, -29, -92, -36, -41, -39, -37, -40, -27, -27, -31, -92, -41, -38, -23, -92, -33, -28, -22, -37, -24, -23, -22, -33, -22, -33, -41, -30, -92, -36, -33, -28, -33, -23, -34, -43, -41, -39, -22, -33, -20, -33, -22, -17, -4, 8, 6, -57, -1, -6, -4, -2, -5, 8, 8, 4, -57, -6, -3, 12, -57, 2, 7, 13, -2, 11, 12, 13, 2, 13, 2, -6, 5, -57, 2, 6, 9, 11, -2, 12, 12, 2, 8, 7, -57, 5, 8, 0, 0, -2, -3, 14, 31, 14, 23, 29};
    }

    static {
        A01();
    }

    public C112065a(AudienceNetworkActivityApi audienceNetworkActivityApi, C13029Zs c13029Zs, AudienceNetworkActivity audienceNetworkActivity) {
        this.A05 = audienceNetworkActivityApi;
        this.A06 = c13029Zs;
        this.A04 = audienceNetworkActivity;
    }

    private final void A02(boolean z) {
        this.A03 = z;
    }

    private final boolean A03(EnumC12069KG enumC12069KG) {
        if (enumC12069KG != EnumC12069KG.A0H && enumC12069KG != EnumC12069KG.A0G) {
            EnumC12069KG enumC12069KG2 = EnumC12069KG.A08;
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "QK9lt";
            strArr2[5] = "71ldustRCfnIbk6ZF";
            if (enumC12069KG != enumC12069KG2 && enumC12069KG != EnumC12069KG.A05 && enumC12069KG != EnumC12069KG.A0F) {
                return false;
            }
        }
        return true;
    }

    public final void A04(EnumC12069KG enumC12069KG, String str) {
        boolean z = !this.A03 || C11979Im.A1t(this.A06);
        boolean shouldCallOnDestroy = this.A02;
        if (!shouldCallOnDestroy && z) {
            boolean shouldCallOnDestroy2 = A03(enumC12069KG);
            if (shouldCallOnDestroy2) {
                A09(EnumC12479Qv.A03.A03(), str);
            } else {
                A09(A00(54, 48, 103), str);
            }
            this.A02 = true;
        }
    }

    public final void A05(EnumC12069KG enumC12069KG, String str) {
        if (A03(enumC12069KG)) {
            A09(EnumC12479Qv.A09.A03(), str);
        } else {
            A09(A00(ErrorCode.CODE_INIT_DEVICE_ERROR, 35, 121), str);
        }
    }

    public final void A06(EnumC12069KG enumC12069KG, String str) {
        if (A03(enumC12069KG)) {
            A09(EnumC12479Qv.A05.A03(), str);
        } else {
            A09(A00(102, 39, 91), str);
        }
        A02(true);
        A04(enumC12069KG, str);
    }

    public final void A07(EnumC12069KG enumC12069KG, String str) {
        if (C11979Im.A1n(this.A06) && !this.A01 && !this.A00) {
            InterfaceC108920S A0E = this.A06.A0E();
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ERQ6CJuvlb3tCwq1OYCzpUpdhNPz9IsE";
            strArr2[0] = "fdli8mgwNbZyMwMFsZ54k8DyiigEG2Sx";
            A0E.AAx();
            A05(enumC12069KG, str);
        }
    }

    public final void A08(String str, C113988v c113988v, String str2) {
        Intent intent = new Intent(str + A00(0, 1, 38) + str2);
        if (c113988v != null) {
            intent.putExtra(A00(268, 5, 87), c113988v);
        }
        C110372o.A00(this.A04).A07(intent);
    }

    public final void A09(String str, String str2) {
        if (A00(221, 47, 71).equals(str) || EnumC12479Qv.A0A.A03().equals(str)) {
            this.A01 = true;
        }
        boolean equals = A00(ErrorCode.CODE_INIT_DEVICE_ERROR, 35, 121).equals(str);
        if (A08[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "q8Yu3i76ZTlYqxP4qtQeXX4gnui9AJbb";
        strArr[0] = "UYbwc2QJiguNdyXAgiRTefqPyIZvniQg";
        if (equals || EnumC12479Qv.A09.A03().equals(str)) {
            this.A00 = true;
        }
        if (A00(1, 53, 56).equals(str)) {
            this.A05.finish(9);
        } else if (A00(176, 45, 36).equals(str)) {
            this.A05.finish(10);
        } else {
            A08(str, null, str2);
        }
    }
}
