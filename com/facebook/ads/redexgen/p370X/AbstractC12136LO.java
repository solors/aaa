package com.facebook.ads.redexgen.p370X;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.LO */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12136LO {
    public static final AtomicReference<DisplayMetrics> A00 = new AtomicReference<>();

    public static DisplayMetrics A00() {
        if (A00.get() != null) {
            return A00.get();
        }
        return AbstractC12137LP.A03;
    }
}
