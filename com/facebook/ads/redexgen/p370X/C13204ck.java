package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ck */
/* loaded from: assets/audience_network.dex */
public final class C13204ck extends AbstractC109070h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, 63, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C13204ck.class.getSimpleName();
    }

    public C13204ck(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, Uri uri) {
        super(c13029Zs, interfaceC12000J7, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109070h
    public final EnumC109060g A0C() {
        try {
            C12114L2.A0D(new C12114L2(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC109060g.A09;
    }
}
