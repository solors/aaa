package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Id */
/* loaded from: assets/audience_network.dex */
public class RunnableC11970Id implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C11974Ih A02;

    public RunnableC11970Id(C11974Ih c11974Ih, int i, long j) {
        this.A02 = c11974Ih;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11975Ii interfaceC11975Ii;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11975Ii = this.A02.A01;
            interfaceC11975Ii.ABo(this.A00, this.A01);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
