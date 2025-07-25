package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.b */
/* loaded from: classes4.dex */
public final class RunnableC14496b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14498d f27443a;

    public RunnableC14496b(C14498d c14498d) {
        this.f27443a = c14498d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m76529a("%s : ContentLoadTimeoutHandler Executing timeout task", IAlog.m76531a(this.f27443a));
        this.f27443a.f27446b.mo77787a();
    }
}
