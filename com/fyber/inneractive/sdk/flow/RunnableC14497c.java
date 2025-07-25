package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.AbstractC15465p;

/* renamed from: com.fyber.inneractive.sdk.flow.c */
/* loaded from: classes4.dex */
public final class RunnableC14497c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14498d f27444a;

    public RunnableC14497c(C14498d c14498d) {
        this.f27444a = c14498d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15465p.f30612b.post(this.f27444a.f27447c);
    }
}
