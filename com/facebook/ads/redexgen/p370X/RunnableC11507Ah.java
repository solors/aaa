package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ah */
/* loaded from: assets/audience_network.dex */
public class RunnableC11507Ah implements Runnable {
    public final /* synthetic */ C11513An A00;
    public final /* synthetic */ C11543BH A01;

    public RunnableC11507Ah(C11513An c11513An, C11543BH c11543bh) {
        this.A00 = c11513An;
        this.A01 = c11543bh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11514Ao interfaceC11514Ao;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11514Ao = this.A00.A01;
            interfaceC11514Ao.ABG(this.A01);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
