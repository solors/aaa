package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.i */
/* loaded from: classes9.dex */
public final class C33698i extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33700k f92294a;

    /* renamed from: b */
    public final /* synthetic */ C33707r f92295b;

    public C33698i(C33700k c33700k, C33707r c33707r) {
        this.f92294a = c33700k;
        this.f92295b = c33707r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92294a.f92303f.m22815a(this.f92295b);
    }
}
