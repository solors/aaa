package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15478v0;
import com.fyber.inneractive.sdk.util.HandlerC15474t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.J */
/* loaded from: classes4.dex */
public final class RunnableC14483J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f27413a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC14487N f27414b;

    public RunnableC14483J(AbstractC14487N abstractC14487N, long j) {
        this.f27414b = abstractC14487N;
        this.f27413a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f27414b.mo76623G()) {
            AbstractC14487N abstractC14487N = this.f27414b;
            abstractC14487N.f27421n = new RunnableC14482I(this);
            long mo76614a = abstractC14487N.mo76614a(this.f27413a);
            AbstractC14487N abstractC14487N2 = this.f27414b;
            abstractC14487N2.getClass();
            C15478v0 c15478v0 = new C15478v0(TimeUnit.MILLISECONDS, mo76614a);
            abstractC14487N2.f27422o = c15478v0;
            c15478v0.f30627e = new C14486M(abstractC14487N2);
            HandlerC15474t0 handlerC15474t0 = new HandlerC15474t0(c15478v0);
            c15478v0.f30625c = handlerC15474t0;
            c15478v0.f30626d = false;
            handlerC15474t0.sendEmptyMessage(1932593528);
            AbstractC14487N abstractC14487N3 = this.f27414b;
            abstractC14487N3.getClass();
            IAlog.m76529a("%sad contains custom close. Will show transparent x in %d", IAlog.m76531a(abstractC14487N3), Long.valueOf(mo76614a));
            this.f27414b.f27419l = null;
        } else {
            AbstractC14487N abstractC14487N4 = this.f27414b;
            abstractC14487N4.getClass();
            IAlog.m76529a("%sad does not contain custom close. Showing close button", IAlog.m76531a(abstractC14487N4));
            this.f27414b.m77868d(false);
        }
        Runnable runnable = this.f27414b.f27419l;
        if (runnable != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnable);
            this.f27414b.f27419l = null;
        }
    }
}
