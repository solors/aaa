package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ie */
/* loaded from: assets/audience_network.dex */
public class RunnableC11971Ie implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C11974Ih A04;

    public RunnableC11971Ie(C11974Ih c11974Ih, int i, int i2, int i3, float f) {
        this.A04 = c11974Ih;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11975Ii interfaceC11975Ii;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11975Ii = this.A04.A01;
            interfaceC11975Ii.AE8(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
