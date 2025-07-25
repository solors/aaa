package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Pc */
/* loaded from: classes9.dex */
public final class C34135Pc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C34206Sc f93333a;

    /* renamed from: b */
    public final /* synthetic */ ModuleEvent f93334b;

    public C34135Pc(C34206Sc c34206Sc, ModuleEvent moduleEvent) {
        this.f93333a = c34206Sc;
        this.f93334b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C34206Sc.m22285a(this.f93333a).reportEvent(this.f93334b);
    }
}
