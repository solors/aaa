package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Lb */
/* loaded from: assets/audience_network.dex */
public final class C12149Lb {
    public static byte[] A02;
    public long A00;
    public long A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-52, -15, -7, -28, -17, -20, -25, -93, -15, -8, -16, -27, -24, -11, -93, -14, -23, -93, -15, -28, -15, -14, -10, -24, -26, -14, -15, -25, -10, -93, -23, -14, -11, -93, -9, -21, -24, -93, -9, -20, -16, -24, -11, -67, -93, -88, -25};
    }

    public C12149Lb(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(0, 47, 115), Long.valueOf(j)));
        }
        this.A01 = j;
        this.A00 = System.nanoTime() + j;
    }

    public final synchronized void A02() {
        this.A00 = System.nanoTime();
        notifyAll();
    }

    public final synchronized void A03() {
        this.A00 = System.nanoTime() + this.A01;
    }

    public final synchronized void A04() throws InterruptedException {
        while (!A05()) {
            long max = Math.max(this.A00 - System.nanoTime(), 1L);
            wait(max / 1000000, (int) (max % 1000000));
        }
    }

    public final synchronized boolean A05() {
        return System.nanoTime() >= this.A00;
    }
}
