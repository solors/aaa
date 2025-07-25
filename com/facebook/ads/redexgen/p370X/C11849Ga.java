package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ga */
/* loaded from: assets/audience_network.dex */
public final class C11849Ga extends AbstractC13206cm {
    public static byte[] A03;
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{88, 93, 90, 95, 59, 60, 39, 58, 45, 23, 61, 58, 36, 23, 63, 45, 42, 23, 46, 41, 36, 36, 42, 41, 43, 35};
    }

    public C11849Ga(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, Uri uri, Map<String, String> mExtraData) {
        super(c13029Zs, interfaceC12000J7, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public C11849Ga(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, Uri uri, Map<String, String> mExtraData, boolean z) {
        this(c13029Zs, interfaceC12000J7, str, uri, mExtraData);
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC13206cm
    public final EnumC109060g A0D() {
        A0E(this.A00, null);
        return EnumC109060g.A09;
    }

    public final Uri A0G() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return AbstractC12117L5.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, 121);
        return AbstractC12117L5.A00(uri.getQueryParameter(url));
    }
}
