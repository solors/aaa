package com.fyber.inneractive.sdk.web;

/* renamed from: com.fyber.inneractive.sdk.web.S */
/* loaded from: classes4.dex */
public final class C15505S {

    /* renamed from: a */
    public final /* synthetic */ C15509W f30684a;

    public C15505S(C15509W c15509w) {
        this.f30684a = c15509w;
    }

    /* renamed from: a */
    public final void m76415a(boolean z) {
        if (this.f30684a.f30712u.compareAndSet(false, true)) {
            C15509W c15509w = this.f30684a;
            c15509w.m76408d("onCancelResult(" + z + ");");
            this.f30684a.f30713v.set(false);
        }
    }
}
