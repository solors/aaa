package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.2B */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC109982B {
    public static HandlerC109972A A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC109972A A00(C13028Zr c13028Zr) {
        if (A00 == null) {
            A00 = new HandlerC109972A(c13028Zr);
        }
        return A00;
    }

    public static void A01(C13028Zr c13028Zr) {
        if (AbstractC11982Ip.A0B(c13028Zr)) {
            A03(c13028Zr);
        }
    }

    public static void A02(C13028Zr c13028Zr) {
        if (AbstractC11982Ip.A0A(c13028Zr)) {
            A03(c13028Zr);
        }
    }

    public static void A03(C13028Zr c13028Zr) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC12171Lx.A01.execute(new C13122bQ(c13028Zr));
        }
    }
}
