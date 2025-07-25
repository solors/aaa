package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.controller.n */
/* loaded from: classes4.dex */
public final class RunnableC14779n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14782q f28029a;

    public RunnableC14779n(AbstractC14782q abstractC14782q) {
        this.f28029a = abstractC14782q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f28029a.f28031b.iterator();
            while (it.hasNext()) {
                ((InterfaceC14781p) it.next()).mo77095d();
            }
        } catch (Exception e) {
            if (IAlog.f30554a <= 3) {
                AbstractC14782q abstractC14782q = this.f28029a;
                abstractC14782q.getClass();
                IAlog.m76530a("%sonDrawnToSurface callback threw an exception!", e, IAlog.m76531a(abstractC14782q));
            }
        }
    }
}
