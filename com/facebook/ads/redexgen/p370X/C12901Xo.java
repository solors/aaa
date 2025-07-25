package com.facebook.ads.redexgen.p370X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xo */
/* loaded from: assets/audience_network.dex */
public final class C12901Xo implements InterfaceC11679DV {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{73, 86, 91, 90, 80, 16, 94, 73, 92};
    }

    public C12901Xo() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final int A6s() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final MediaCodecInfo A6t(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final boolean A9g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 16).equals(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11679DV
    public final boolean AG5() {
        return false;
    }
}
