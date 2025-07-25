package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.En */
/* loaded from: assets/audience_network.dex */
public class RunnableC11740En implements Runnable {
    public final /* synthetic */ C11688Dg A00;

    public RunnableC11740En(C11688Dg c11688Dg) {
        this.A00 = c11688Dg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
