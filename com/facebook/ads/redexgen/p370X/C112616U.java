package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6U */
/* loaded from: assets/audience_network.dex */
public final class C112616U {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C112626V A00;
    public final C112636W A01;
    public final C13028Zr A02;
    public final InterfaceC12561SF A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C112616U.class.getSimpleName();
    }

    public C112616U(C13028Zr c13028Zr, InterfaceC12049Jw interfaceC12049Jw, C112626V c112626v, C112636W c112636w) {
        this.A02 = c13028Zr;
        this.A03 = interfaceC12049Jw.A54(EnumC12562SG.A06);
        this.A00 = c112626v;
        this.A01 = c112636w;
        this.A03.A3n(new C13037a0(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        if (!this.A03.A9b()) {
            this.A02.A04().A9O();
            return;
        }
        String btExtras = this.A03.A75().optString(A00(0, 9, 7));
        if (!TextUtils.isEmpty(btExtras)) {
            this.A00.A04(this.A02, btExtras);
            if (!A04 || C11979Im.A0h(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
