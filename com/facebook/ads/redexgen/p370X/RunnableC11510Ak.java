package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ak */
/* loaded from: assets/audience_network.dex */
public class RunnableC11510Ak implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C11513An A03;

    public RunnableC11510Ak(C11513An c11513An, int i, long j, long j2) {
        this.A03 = c11513An;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11514Ao interfaceC11514Ao;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11514Ao = this.A03.A01;
            interfaceC11514Ao.ABJ(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
