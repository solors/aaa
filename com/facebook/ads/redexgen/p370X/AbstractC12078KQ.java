package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.KQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12078KQ {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC12076KO> A02 = new AtomicReference<>();

    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            AbstractC12093Kf.A00().A9s(3306, th);
            InterfaceC12076KO contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AFg(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, InterfaceC12076KO interfaceC12076KO) {
        A01.set(z);
        A02.set(interfaceC12076KO);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
