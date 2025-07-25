package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.b */
/* loaded from: classes9.dex */
public final class C33691b extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33693d f92275a;

    /* renamed from: b */
    public final /* synthetic */ C33705p f92276b;

    public C33691b(C33693d c33693d, C33705p c33705p) {
        this.f92275a = c33693d;
        this.f92276b = c33705p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92275a.f92283d.m22815a(this.f92276b);
    }
}
