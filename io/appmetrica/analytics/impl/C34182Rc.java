package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Rc */
/* loaded from: classes9.dex */
public final class C34182Rc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C34206Sc f93446a;

    /* renamed from: b */
    public final /* synthetic */ String f93447b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f93448c;

    public C34182Rc(C34206Sc c34206Sc, String str, byte[] bArr) {
        this.f93446a = c34206Sc;
        this.f93447b = str;
        this.f93448c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C34206Sc.m22285a(this.f93446a).setSessionExtra(this.f93447b, this.f93448c);
    }
}
