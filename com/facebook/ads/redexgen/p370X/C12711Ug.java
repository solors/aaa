package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ug */
/* loaded from: assets/audience_network.dex */
public class C12711Ug extends AbstractRunnableC12086KY {
    public final /* synthetic */ AbstractC12319OL A00;

    public C12711Ug(AbstractC12319OL abstractC12319OL) {
        this.A00 = abstractC12319OL;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC12319OL abstractC12319OL = this.A00;
        runnable = this.A00.A08;
        i = this.A00.A07;
        abstractC12319OL.postOnAnimationDelayed(runnable, i);
    }
}
