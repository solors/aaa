package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.MU */
/* loaded from: assets/audience_network.dex */
public class RunnableC12204MU implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ View$OnClickListenerC11604CI A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, UnsignedBytes.MAX_POWER_OF_TWO, -125, -106, -121, -121, -122, -109, -122, -123, UnsignedBytes.MAX_POWER_OF_TWO, -124, -115, -118, -124, -116, UnsignedBytes.MAX_POWER_OF_TWO, -126, -121, -107, -122, -109, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -115, -126, -102};
    }

    public RunnableC12204MU(View$OnClickListenerC11604CI view$OnClickListenerC11604CI) {
        this.A00 = view$OnClickListenerC11604CI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 20));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
