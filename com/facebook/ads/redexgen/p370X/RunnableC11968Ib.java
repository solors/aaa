package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ib */
/* loaded from: assets/audience_network.dex */
public class RunnableC11968Ib implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C11974Ih A02;
    public final /* synthetic */ String A03;

    public RunnableC11968Ib(C11974Ih c11974Ih, String str, long j, long j2) {
        this.A02 = c11974Ih;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11975Ii interfaceC11975Ii;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11975Ii = this.A02.A01;
            interfaceC11975Ii.ADx(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
