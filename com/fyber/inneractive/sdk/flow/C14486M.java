package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15478v0;
import com.fyber.inneractive.sdk.util.InterfaceC15476u0;

/* renamed from: com.fyber.inneractive.sdk.flow.M */
/* loaded from: classes4.dex */
public final class C14486M implements InterfaceC15476u0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14487N f27417a;

    public C14486M(AbstractC14487N abstractC14487N) {
        this.f27417a = abstractC14487N;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15476u0
    /* renamed from: a */
    public final void mo76451a() {
        Runnable runnable = this.f27417a.f27421n;
        if (runnable != null) {
            AbstractC15465p.f30612b.post(runnable);
        }
        AbstractC14487N abstractC14487N = this.f27417a;
        C15478v0 c15478v0 = abstractC14487N.f27422o;
        if (c15478v0 != null) {
            c15478v0.f30627e = null;
            abstractC14487N.f27422o = null;
        }
    }
}
