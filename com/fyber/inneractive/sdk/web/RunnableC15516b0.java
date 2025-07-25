package com.fyber.inneractive.sdk.web;

/* renamed from: com.fyber.inneractive.sdk.web.b0 */
/* loaded from: classes4.dex */
public final class RunnableC15516b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15518c0 f30732a;

    public RunnableC15516b0(C15518c0 c15518c0) {
        this.f30732a = c15518c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30732a.f30736a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
