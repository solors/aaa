package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.n */
/* loaded from: classes9.dex */
public final class C33703n extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33705p f92310a;

    /* renamed from: b */
    public final /* synthetic */ C33700k f92311b;

    public C33703n(C33705p c33705p, C33700k c33700k) {
        this.f92310a = c33705p;
        this.f92311b = c33700k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92310a.f92319e.m22815a(this.f92311b);
    }
}
