package com.fyber.inneractive.sdk.web;

/* renamed from: com.fyber.inneractive.sdk.web.T */
/* loaded from: classes4.dex */
public final class RunnableC15506T implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15509W f30685a;

    public RunnableC15506T(C15509W c15509w) {
        this.f30685a = c15509w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30685a.f30712u.compareAndSet(false, true)) {
            this.f30685a.m76408d("onCancelResult(true);");
            this.f30685a.f30713v.set(false);
        }
    }
}
