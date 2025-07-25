package com.fyber.inneractive.sdk.click;

/* renamed from: com.fyber.inneractive.sdk.click.n */
/* loaded from: classes4.dex */
public final class RunnableC14303n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14291b f27030a;

    /* renamed from: b */
    public final /* synthetic */ C14307r f27031b;

    public RunnableC14303n(C14307r c14307r, C14291b c14291b) {
        this.f27031b = c14307r;
        this.f27030a = c14291b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC14304o interfaceC14304o = this.f27031b.f27035d;
        if (interfaceC14304o != null) {
            interfaceC14304o.mo77802a(this.f27030a);
        }
    }
}
