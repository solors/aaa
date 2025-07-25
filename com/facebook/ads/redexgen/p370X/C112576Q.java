package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6Q */
/* loaded from: assets/audience_network.dex */
public final class C112576Q {
    public static InterfaceC112586R A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C112576Q.class) {
            if (A00 == null) {
                return;
            }
            C113578F c113578f = new C113578F(A00.AFi());
            c113578f.A05(1);
            C13028Zr A002 = AbstractC113247i.A00();
            if (A002 != null) {
                A002.A07().AA0(A00(0, 9, 49), 3401, c113578f);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C13038a1();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.6S
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (AbstractC12078KQ.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C112576Q.A01();
                        } catch (Throwable th) {
                            AbstractC12078KQ.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
