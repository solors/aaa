package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Wa */
/* loaded from: assets/audience_network.dex */
public class C12828Wa extends AbstractRunnableC12086KY {
    public final /* synthetic */ C12826WY A00;

    public C12828Wa(C12826WY c12826wy) {
        this.A00 = c12826wy;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        long j;
        long j2;
        C12826WY.A00(this.A00);
        j = this.A00.A01;
        if (j > 0) {
            try {
                j2 = this.A00.A01;
                Thread.sleep(j2);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
