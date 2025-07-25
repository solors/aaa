package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.a6 */
/* loaded from: assets/audience_network.dex */
public final class C13043a6 {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final InterfaceC1124169 A00;
    public final C112726f A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 115, 100, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, 100, 117, 114, 60, 30, 9, 0, 3, 13, 8, 5, 2, 11, 76, 5, 1, 13, 11, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, 38, 112, 111, 98, 99, 105, 60, 38, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, 100, 123, 103, 103, 51, 111, 123, 55, 100, 55, 101, 123, 100, 55, 100, 55, 51, 100, 50, 52, 53, 53, 51, 98, 55, 53, 34, 33, 34, 51, 36, 47, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
        A04 = C13043a6.class.getSimpleName();
    }

    public C13043a6(InterfaceC1124169 interfaceC1124169, C13028Zr c13028Zr) {
        this.A00 = interfaceC1124169;
        this.A00.A3l(new C13045a8(this));
        this.A01 = new C112726f(c13028Zr);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            InterfaceC1124169 interfaceC1124169 = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(interfaceC1124169.A6Q().size()));
        }
        for (InterfaceC112446C interfaceC112446C : this.A00.A6Q()) {
            switch (C1124068.A00[interfaceC112446C.A8b().ordinal()]) {
                case 1:
                    A04(interfaceC112446C.getUrl());
                    break;
                case 2:
                    A06(interfaceC112446C.getUrl());
                    break;
                case 3:
                    A05(interfaceC112446C.getUrl());
                    break;
            }
        }
        this.A01.A0W(new C13044a7(this), new C112656Y(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        C112706d c112706d = new C112706d(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        c112706d.A01 = A00(117, 8, 106);
        this.A01.A0b(c112706d);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        C112686b c112686b = new C112686b(str, A00(81, 36, 123), A00(125, 7, 50));
        c112686b.A04 = true;
        c112686b.A02 = A00(117, 8, 106);
        this.A01.A0X(c112686b);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        C112686b c112686b = new C112686b(str, A00(81, 36, 123), A00(125, 7, 50));
        c112686b.A04 = false;
        c112686b.A02 = A00(117, 8, 106);
        this.A01.A0a(c112686b);
    }
}
