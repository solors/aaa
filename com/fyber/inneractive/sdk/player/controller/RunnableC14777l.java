package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.controller.l */
/* loaded from: classes4.dex */
public final class RunnableC14777l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28025a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC14782q f28026b;

    public RunnableC14777l(AbstractC14782q abstractC14782q, int i) {
        this.f28026b = abstractC14782q;
        this.f28025a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f28026b.f28032c.iterator();
            while (it.hasNext()) {
                ((InterfaceC14780o) it.next()).mo77105a(this.f28025a);
            }
        } catch (Exception e) {
            if (IAlog.f30554a <= 3) {
                AbstractC14782q abstractC14782q = this.f28026b;
                abstractC14782q.getClass();
                IAlog.m76530a("%sonPlayerProgress callback threw an exception!", e, IAlog.m76531a(abstractC14782q));
            }
        }
    }
}
