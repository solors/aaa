package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.f */
/* loaded from: classes9.dex */
public final class C33695f extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33696g f92287a;

    public C33695f(C33696g c33696g) {
        this.f92287a = c33696g;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92287a.f92288a.endConnection();
    }
}
