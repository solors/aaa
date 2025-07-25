package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.ads.redexgen.X.M6 */
/* loaded from: assets/audience_network.dex */
public final class ThreadFactoryC12180M6 implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{25, 21, 23, 84, 28, 27, 25, 31, 24, 21, 21, 17, 84, 27, 30, 9, 90, 14, 18, 8, 31, 27, 30, 87, 95, 30, 90, 95, 14, 60, 90, 95, 70, 14, 46};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
