package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.KY */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC12086KY implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC12076KO> A04;
    public final C12074KM A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{44, 11, 16, 16, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, 42, 22, 12, 27, 31, 26, 68, 94};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC12086KY() {
        if (A03.get()) {
            this.A00 = C12091Kd.A01(new C12090Kc(A01(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC12076KO interfaceC12076KO) {
        A02.set(z);
        A04.set(interfaceC12076KO);
    }

    public final C12074KM A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C12091Kd.A03(this);
            }
            A06();
            if (A03.get()) {
                C12091Kd.A04(this);
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
