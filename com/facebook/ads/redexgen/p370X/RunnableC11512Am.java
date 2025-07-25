package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Am */
/* loaded from: assets/audience_network.dex */
public class RunnableC11512Am implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C11513An A01;

    public RunnableC11512Am(C11513An c11513An, int i) {
        this.A01 = c11513An;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11514Ao interfaceC11514Ao;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11514Ao = this.A01.A01;
            interfaceC11514Ao.ABI(this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
