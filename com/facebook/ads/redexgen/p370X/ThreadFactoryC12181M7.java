package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.redexgen.X.M7 */
/* loaded from: assets/audience_network.dex */
public class ThreadFactoryC12181M7 implements ThreadFactory {
    public static byte[] A03;
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ ExecutorC12182M8 A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, 116, -127, 109, 88, -90, 83, 86, 88, -105};
    }

    public ThreadFactoryC12181M7(ExecutorC12182M8 executorC12182M8, String str) {
        this.A01 = executorC12182M8;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format(Locale.US, A00(0, 10, 44), this.A02, Integer.valueOf(this.A00.getAndIncrement())));
    }
}
