package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wz */
/* loaded from: assets/audience_network.dex */
public class C12853Wz implements InterfaceC11941I6<String> {
    public static byte[] A00;
    public static String[] A01 = {"uH4cRPiNAtd6hIF4d2nHkiKOYdeJaHzO", "JLNchjpJQuqbhh", "FWMzr4wbAebCjAMdCNncG5waeot5HoRB", "MfzvzGDE906n0IsIni7", "UQ8hk87iKtjST5OwSTOxRTAmcFw5heUv", "WkhjXxlb50SSewekCHh9frN5EhGMAbac", "AG13Y1v", "zPzrjTlkXgIdZhcUl4R5"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-94, -82, -89, -90, -29, -44, -25, -29, -81, -96, -77, -81, 106, -79, -81, -81, -119, 126, 125};
    }

    static {
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11941I6
    /* renamed from: A02 */
    public final boolean A5x(String str) {
        String A0M = AbstractC11953IK.A0M(str);
        if (!TextUtils.isEmpty(A0M) && ((!A0M.contains(A00(4, 4, 100)) || A0M.contains(A00(8, 8, 48))) && !A0M.contains(A00(0, 4, 47)))) {
            boolean contains = A0M.contains(A00(16, 3, 6));
            String[] strArr = A01;
            if (strArr[4].charAt(9) != strArr[0].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "NsSUytDbyDHOAvFQAY0dcpKHGU0KX3yK";
            strArr2[2] = "9aubWKHbvVA5AKhHWjYseXE5rNVVWtMF";
            if (!contains) {
                return true;
            }
        }
        return false;
    }
}
