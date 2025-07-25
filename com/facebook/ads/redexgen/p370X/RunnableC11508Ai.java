package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ai */
/* loaded from: assets/audience_network.dex */
public class RunnableC11508Ai implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C11513An A02;
    public final /* synthetic */ String A03;

    public RunnableC11508Ai(C11513An c11513An, String str, long j, long j2) {
        this.A02 = c11513An;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11514Ao interfaceC11514Ao;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11514Ao = this.A02.A01;
            interfaceC11514Ao.ABE(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
