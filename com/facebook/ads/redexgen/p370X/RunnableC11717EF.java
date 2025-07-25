package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.EF */
/* loaded from: assets/audience_network.dex */
public class RunnableC11717EF implements Runnable {
    public final /* synthetic */ RunnableC11719EI A00;

    public RunnableC11717EF(RunnableC11719EI runnableC11719EI) {
        this.A00 = runnableC11719EI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(5, 3);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
