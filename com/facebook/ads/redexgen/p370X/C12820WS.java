package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WS */
/* loaded from: assets/audience_network.dex */
public class C12820WS implements InterfaceC12537Rr {
    public static byte[] A01;
    public static String[] A02 = {"tUJYxHq8rXjSvzNkaZErPg", "Hl6JSJOVoKK9bKT5jd2Pvq0tZsDPJ0dE", "oSGC6AFXBpr4lbJyv6MQNQ9waO2ute48", "z7WBfzJJ407mMZZPgmkMQfCriHOQCxec", "E0947yqUj", "IMqeF", "h4IMHr5Sq", "nmzUvfQCAff3ThOCongsk2"};
    public final /* synthetic */ C113257j A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-104, -74, -61, 124, -55, 117, -71, -66, -56, -59, -74, -55, -72, -67, 117, -72, -60, -54, -61, -55, -70, -57, -56, -125, 4, 41, 51, 48, 33, 52, 35, 40, 37, 36, -32, 35, 47, 53, 46, 52, 37, 50, 51, -18, -32, 18, 37, 51, 48, 47, 46, 51, 37, -6, -32};
    }

    static {
        A01();
    }

    public C12820WS(C113257j c113257j) {
        this.A00 = c113257j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12537Rr
    public final void ABa(InterfaceC12535Rp interfaceC12535Rp) {
        if (this.A00.A04().A9O() && interfaceC12535Rp != null) {
            String str = A00(24, 31, 122) + interfaceC12535Rp.A6X();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12537Rr
    public final void ABt(Exception exc) {
        String str;
        if (this.A00.A04().A9O()) {
            str = C12011JI.A01;
            String A00 = A00(0, 24, 15);
            String[] strArr = A02;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "IahxZOLaTB1sAAwpoanyBYHnO0M02siA";
            strArr2[3] = "J682L6mt58ljZzHK0luG4OOmc7ySlZqX";
            Log.e(str, A00, exc);
        }
    }
}
