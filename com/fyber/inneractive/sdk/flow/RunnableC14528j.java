package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.j */
/* loaded from: classes4.dex */
public final class RunnableC14528j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14529k f27515a;

    public RunnableC14528j(AbstractC14529k abstractC14529k) {
        this.f27515a = abstractC14529k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC14529k abstractC14529k = this.f27515a;
        abstractC14529k.getClass();
        IAlog.m76529a("%s : IAAdContentLoaderImpl : retry load ad task started execution", IAlog.m76531a(abstractC14529k));
        this.f27515a.mo77786b();
    }
}
