package com.fyber.inneractive.sdk.player.p376ui;

/* renamed from: com.fyber.inneractive.sdk.player.ui.k */
/* loaded from: classes4.dex */
public final class RunnableC15193k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC15194l f30057a;

    public RunnableC15193k(AbstractC15194l abstractC15194l) {
        this.f30057a = abstractC15194l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15194l abstractC15194l = this.f30057a;
        int i = abstractC15194l.f30065G + (abstractC15194l.f30121i / abstractC15194l.f30122j);
        abstractC15194l.f30065G = i;
        abstractC15194l.mo77078a(i);
        AbstractC15194l abstractC15194l2 = this.f30057a;
        if (abstractC15194l2.f30065G == abstractC15194l2.f30066H) {
            abstractC15194l2.f30064F = null;
            abstractC15194l2.f30065G = 0;
            abstractC15194l2.f30066H = 0;
            return;
        }
        abstractC15194l2.postDelayed(abstractC15194l2.f30064F, abstractC15194l2.f30123k);
    }
}
