package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Nz */
/* loaded from: assets/audience_network.dex */
public class RunnableC12297Nz implements Runnable {
    public final /* synthetic */ C12298O0 A00;
    public final /* synthetic */ InterfaceC12299O1 A01;

    public RunnableC12297Nz(C12298O0 c12298o0, InterfaceC12299O1 interfaceC12299O1) {
        this.A00 = c12298o0;
        this.A01 = interfaceC12299O1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ABD();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
