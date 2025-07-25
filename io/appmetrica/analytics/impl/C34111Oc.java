package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Oc */
/* loaded from: classes9.dex */
public final class C34111Oc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C34206Sc f93298a;

    /* renamed from: b */
    public final /* synthetic */ AdRevenue f93299b;

    /* renamed from: c */
    public final /* synthetic */ boolean f93300c;

    public C34111Oc(C34206Sc c34206Sc, AdRevenue adRevenue, boolean z) {
        this.f93298a = c34206Sc;
        this.f93299b = adRevenue;
        this.f93300c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C34206Sc.m22285a(this.f93298a).reportAdRevenue(this.f93299b, this.f93300c);
    }
}
