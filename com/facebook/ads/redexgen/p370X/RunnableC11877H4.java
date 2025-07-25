package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.H4 */
/* loaded from: assets/audience_network.dex */
public class RunnableC11877H4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C12860X6 A03;

    public RunnableC11877H4(C12860X6 c12860x6, int i, long j, long j2) {
        this.A03 = c12860x6;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11866Gt interfaceC11866Gt;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11866Gt = this.A03.A07;
            interfaceC11866Gt.ABM(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
