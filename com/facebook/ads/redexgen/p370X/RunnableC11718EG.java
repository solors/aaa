package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.EG */
/* loaded from: assets/audience_network.dex */
public class RunnableC11718EG implements Runnable {
    public final /* synthetic */ RunnableC11719EI A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC11718EG(RunnableC11719EI runnableC11719EI, Throwable th) {
        this.A00 = runnableC11719EI;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A0I;
        boolean A0H;
        boolean A0H2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A0I = this.A00.A0I(1, this.A01 != null ? 4 : 2, this.A01);
            if (A0I) {
                return;
            }
            A0H = this.A00.A0H(6, 3);
            if (A0H) {
                return;
            }
            A0H2 = this.A00.A0H(7, 0);
            if (!A0H2) {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
