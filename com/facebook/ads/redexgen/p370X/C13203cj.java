package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.cj */
/* loaded from: assets/audience_network.dex */
public class C13203cj extends AbstractRunnableC12086KY {
    public final /* synthetic */ C109210w A00;

    public C13203cj(C109210w c109210w) {
        this.A00 = c109210w;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C109200v c109200v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c109200v = this.A00.A02;
        c109200v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
