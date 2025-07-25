package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j */
/* loaded from: classes9.dex */
public final class RunnableC34628j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f94644a;

    /* renamed from: b */
    public final /* synthetic */ C34682l f94645b;

    public RunnableC34628j(C34682l c34682l, Activity activity) {
        this.f94645b = c34682l;
        this.f94644a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f94645b.m21467a(this.f94644a);
    }
}
