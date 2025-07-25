package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cl */
/* loaded from: assets/audience_network.dex */
public final class C13205cl extends AbstractC109070h {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, 61, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C13205cl.class.getSimpleName();
    }

    public C13205cl(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, Uri uri, Map<String, String> mExtraData) {
        super(c13029Zs, interfaceC12000J7, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109070h
    public final EnumC109060g A0C() {
        EnumC12002J9 enumC12002J9 = EnumC12002J9.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                enumC12002J9 = EnumC12002J9.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        super.A01.AAL(this.A02, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), enumC12002J9);
        return EnumC109060g.A09;
    }
}
