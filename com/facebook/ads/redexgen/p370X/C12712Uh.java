package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Uh */
/* loaded from: assets/audience_network.dex */
public class C12712Uh extends AbstractRunnableC12086KY {
    public final /* synthetic */ AbstractC12319OL A00;

    public C12712Uh(AbstractC12319OL abstractC12319OL) {
        this.A00 = abstractC12319OL;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC12319OL abstractC12319OL = this.A00;
            i = this.A00.A07;
            abstractC12319OL.postDelayed(this, i);
            return;
        }
        this.A00.setPressed(true);
        AbstractC12319OL abstractC12319OL2 = this.A00;
        runnable = this.A00.A09;
        abstractC12319OL2.postOnAnimationDelayed(runnable, 250L);
    }
}
