package com.facebook.ads.redexgen.p370X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xn */
/* loaded from: assets/audience_network.dex */
public final class C12900Xn implements InterfaceC11679DV {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{33, 55, 49, 39, 32, 55, Byte.MAX_VALUE, 34, 62, 51, 43, 48, 51, 49, 57};
    }

    public C12900Xn(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final int A6s() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final MediaCodecInfo A6t(int i) {
        A01();
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final boolean A9g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 95));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final boolean AG5() {
        return true;
    }
}
