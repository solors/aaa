package com.facebook.ads.redexgen.p370X;

import com.pubmatic.sdk.video.player.POBPlayer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kr */
/* loaded from: assets/audience_network.dex */
public class RunnableC12105Kr implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C13029Zs A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + POBPlayer.MEDIA_DISPLAY_ERROR);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -50, -51, -58, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC12105Kr(C13029Zs c13029Zs) {
        this.A00 = c13029Zs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            C113578F otsl = new C113578F(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A07().AA1(A00(4, 7, 44), AbstractC113568E.A1Y, otsl);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
