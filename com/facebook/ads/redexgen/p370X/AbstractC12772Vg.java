package com.facebook.ads.redexgen.p370X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Vg */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12772Vg<T> extends AbstractRunnableC12086KY {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vg != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC12772Vg(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vg != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}
