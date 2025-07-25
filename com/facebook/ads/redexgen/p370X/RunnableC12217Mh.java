package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mh */
/* loaded from: assets/audience_network.dex */
public class RunnableC12217Mh implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ C11578Bs A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, 13, 21, 14, 13, 15, 7, 41, 30, 30, 3, 30};
    }

    static {
        A01();
    }

    public RunnableC12217Mh(C11578Bs c11578Bs) {
        this.A00 = c11578Bs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12614T7 c12614t7;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            c12614t7 = this.A00.A00.A06;
            c12614t7.A0Z(10);
            ((AbstractC12216Mg) this.A00.A00).A01.A0E().A3L(A00(0, 18, 115));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
