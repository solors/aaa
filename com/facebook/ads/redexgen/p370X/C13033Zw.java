package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zw */
/* loaded from: assets/audience_network.dex */
public class C13033Zw implements InterfaceC108850L {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C13028Zr A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C13033Zw(C13028Zr c13028Zr) {
        this.A00 = c13028Zr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108850L
    public final void A9u(Throwable th) {
        this.A00.A07().AA0(A00(0, 5, 39), AbstractC113568E.A1e, new C113578F(th));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108850L
    public final void AA5(Throwable th) {
        this.A00.A07().AA0(A00(0, 5, 39), AbstractC113568E.A1g, new C113578F(th));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108850L
    public final void AEs(String str, int i, String str2, Long l, Long l2, C1087006 c1087006) {
        C112756i.A05(this.A00, c1087006.A06, c1087006.A08, c1087006.A09, c1087006.A07, c1087006.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108850L
    public final void AEt(String str, boolean z, C1087006 c1087006) {
        C112756i.A04(this.A00, new C112746h(c1087006.A06, c1087006.A08, c1087006.A07, c1087006.A03, str), z);
    }
}
