package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Qc */
/* loaded from: classes9.dex */
public final class C34159Qc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C34206Sc f93398a;

    /* renamed from: b */
    public final /* synthetic */ int f93399b;

    /* renamed from: c */
    public final /* synthetic */ String f93400c;

    public C34159Qc(C34206Sc c34206Sc, int i, String str) {
        this.f93398a = c34206Sc;
        this.f93399b = i;
        this.f93400c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C34206Sc.m22285a(this.f93398a).mo21514a(new C33840D9(this.f93399b, this.f93400c));
    }
}
