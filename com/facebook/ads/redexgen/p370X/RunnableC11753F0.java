package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.F0 */
/* loaded from: assets/audience_network.dex */
public class RunnableC11753F0 implements Runnable {
    public final /* synthetic */ C11759F6 A00;
    public final /* synthetic */ C11760F7 A01;
    public final /* synthetic */ C11761F8 A02;
    public final /* synthetic */ InterfaceC11762F9 A03;

    public RunnableC11753F0(C11759F6 c11759f6, InterfaceC11762F9 interfaceC11762F9, C11760F7 c11760f7, C11761F8 c11761f8) {
        this.A00 = c11759f6;
        this.A03 = interfaceC11762F9;
        this.A01 = c11760f7;
        this.A02 = c11761f8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A03.ACP(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
