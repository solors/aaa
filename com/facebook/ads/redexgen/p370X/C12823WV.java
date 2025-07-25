package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.WV */
/* loaded from: assets/audience_network.dex */
public final class C12823WV implements InterfaceC12000J7 {
    public static InterfaceC12000J7 A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C13028Zr A00;
    public final InterfaceC1140491 A01;
    public final InterfaceC11999J6 A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, 18, 26, 7, 3, 30, 25, 16, 87, 3, 24, 87, 27, 24, 16, 87, 22, 25, 87, 30, 25, 1, 22, 27, 30, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, 29, 16, 25, 12};
    }

    static {
        A03();
        A05 = C12823WV.class.getSimpleName();
        A06 = false;
    }

    public C12823WV(C13028Zr c13028Zr) {
        InterfaceC11998J5 dispatchCallback;
        this.A00 = c13028Zr;
        if (AbstractC11981Io.A0T(c13028Zr)) {
            this.A01 = AbstractC114028z.A00(c13028Zr);
            dispatchCallback = AbstractC12005JC.A00(c13028Zr, this.A01);
        } else {
            C11732Ef A01 = AbstractC114028z.A01(c13028Zr);
            dispatchCallback = AbstractC12005JC.A01(c13028Zr, A01);
            this.A01 = A01;
        }
        this.A02 = new C12826WY(c13028Zr, dispatchCallback);
        ExecutorC12182M8.A08.execute(new C12825WX(this));
        A04(c13028Zr);
    }

    public static synchronized InterfaceC12000J7 A01(C13028Zr c13028Zr) {
        InterfaceC12000J7 interfaceC12000J7;
        synchronized (C12823WV.class) {
            if (A03 == null) {
                A03 = new C12823WV(c13028Zr);
            }
            interfaceC12000J7 = A03;
        }
        return interfaceC12000J7;
    }

    public static synchronized void A04(C13028Zr c13028Zr) {
        synchronized (C12823WV.class) {
            if (A06) {
                return;
            }
            c13028Zr.A03().AB3();
            A06 = true;
        }
    }

    private void A05(C11997J4 c11997j4) {
        if (!c11997j4.A0A()) {
            Log.e(A05, A02(7, 29, 55) + c11997j4.A06() + A02(0, 7, 82));
            return;
        }
        A06(c11997j4);
        this.A01.AHh(c11997j4, new C12824WW(this, c11997j4));
    }

    private void A06(C11997J4 c11997j4) {
        switch (C12001J8.A00[c11997j4.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C113578F c113578f = new C113578F(new Exception(A02(36, 5, 86)));
                c113578f.A05(1);
                try {
                    c113578f.A07(new JSONObject().put(A02(48, 4, 41), c11997j4.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().AA1(A02(41, 7, 112), AbstractC113568E.A1H, c113578f);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void A9t(String str, Map<String, String> data) {
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void A9v(String str, Map<String, String> data) {
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void A9w(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A07).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void A9x(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A08).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void A9z(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AA3(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AA6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0D).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AA7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AA8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0F).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AA9(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0K).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAI(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0H).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAK(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A0J).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAL(String str, Map<String, String> data, String str2, EnumC12002J9 enumC12002J9) {
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(enumC12002J9).A02(EnumC12003JA.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAM(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C11997J4 adEvent = new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAQ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0N).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAR(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0O).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0h)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAT(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(EnumC12002J9.A04).A02(EnumC12003JA.A0P).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAU(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A04).A02(EnumC12003JA.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAY(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0Q).A06(AbstractC12010JH.A0A(str, EnumC12007JE.A0m)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAZ(String str, Map<String, String> data) {
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AAb(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C11996J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC12002J9.A05).A02(EnumC12003JA.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12000J7
    public final void AEU(String str) {
        new AsyncTaskC12556SA(this.A00).execute(str);
    }
}
