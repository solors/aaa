package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kf */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12093Kf {
    public static final AtomicReference<InterfaceC12092Ke> A00 = new AtomicReference<>(null);

    public static InterfaceC12092Ke A00() {
        InterfaceC12092Ke errorLogger = A00.get();
        if (errorLogger == null) {
            return new C12784Vs();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC12092Ke interfaceC12092Ke) {
        A00.set(interfaceC12092Ke);
    }
}
