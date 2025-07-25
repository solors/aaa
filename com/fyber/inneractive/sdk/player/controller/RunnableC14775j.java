package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.mediaplayer.C15174o;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.controller.j */
/* loaded from: classes4.dex */
public final class RunnableC14775j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Exception f28021a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC14782q f28022b;

    public RunnableC14775j(AbstractC14782q abstractC14782q, C15174o c15174o) {
        this.f28022b = abstractC14782q;
        this.f28021a = c15174o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC14782q abstractC14782q = this.f28022b;
        if (abstractC14782q.f28036g) {
            return;
        }
        try {
            Iterator it = abstractC14782q.f28031b.iterator();
            while (it.hasNext()) {
                ((InterfaceC14781p) it.next()).mo77097a((C15174o) this.f28021a);
            }
        } catch (Exception e) {
            if (IAlog.f30554a <= 3) {
                AbstractC14782q abstractC14782q2 = this.f28022b;
                abstractC14782q2.getClass();
                IAlog.m76530a("%sonPlayerError callback threw an exception!", e, IAlog.m76531a(abstractC14782q2));
            }
        }
    }
}
