package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vp */
/* loaded from: assets/audience_network.dex */
public class C12781Vp extends AbstractRunnableC12086KY {
    public static byte[] A01;
    public static String[] A02 = {"s6McyFvuEc1XiqBn", "hcEKpUAFoi0", "Uxw7Yfkl7Y0EbUXumb1zp", "2eIZNGpCiZfiyfWjpoEHXYEZ89sKOMjU", "P6wJZ5NPzNm0cd9T3B6a4kCxx00um", "avjdKGQRQHprL3nlmChXTO66aPxw1Ezk", "jTYXriUGWk0Q5Onqj2MBy1ZRmPDEVS5l", "vP4DO0q8Z4bTalFPzqbCoE7Mp2WJV4fR"};
    public final /* synthetic */ Context A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[3].charAt(28) == 'p') {
                throw new RuntimeException();
            }
            A02[3] = "yencg2WQyjWgLr4Htapu7BwNwN3x2Tit";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-127, -80, -80, -115, -87, -82, -109, -92, -85, -106, -91, -78, -77, -87, -81, -82};
    }

    static {
        A02();
    }

    public C12781Vp(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        int A022;
        if (AbstractC12126LE.A04 == EnumC12125LD.A02) {
            return;
        }
        SharedPreferences A00 = AbstractC12071KJ.A00(this.A00);
        String A002 = A00(0, 16, 4);
        int i = A00.getInt(A002, -1);
        if (i != -1) {
            int unused = AbstractC12126LE.A00 = i;
            EnumC12125LD enumC12125LD = EnumC12125LD.A02;
            String[] strArr = A02;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[5] = "hUCmhtQ8p32Ulvvxz3h93PNa760nZTZ8";
            AbstractC12126LE.A04 = enumC12125LD;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A022 = AbstractC12126LE.A03(this.A00);
        } else {
            A022 = AbstractC12126LE.A02(this.A00);
        }
        int unused2 = AbstractC12126LE.A00 = A022;
        A00.edit().putInt(A002, A022).commit();
        AbstractC12126LE.A04 = EnumC12125LD.A02;
    }
}
