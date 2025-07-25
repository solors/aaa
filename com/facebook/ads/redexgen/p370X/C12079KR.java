package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.KR */
/* loaded from: assets/audience_network.dex */
public final class C12079KR implements InterfaceC12552S6 {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, 14, 48, 28, 29, 7, 22, 29, 7, 73, 83, 42, 29, 27, 29, 17, 14, 29, 88, 13, 10, 20, 66, 88, 30, 57, 44, 57, 56, 62, 119, 109};
    }

    public C12079KR(boolean z) {
        this.A00 = z;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12552S6
    public final boolean A9X() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12552S6
    public final void AAO(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12552S6
    public final void AAP(InterfaceC12535Rp interfaceC12535Rp) {
        if (interfaceC12535Rp != null) {
            String str = A00(11, 13, 6) + interfaceC12535Rp.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC12535Rp.A8R();
            A02(interfaceC12535Rp.A7X());
        }
    }
}
