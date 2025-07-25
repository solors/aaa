package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.38 */
/* loaded from: assets/audience_network.dex */
public final class C1105638 extends C111003r {
    public C11571Bl A00;
    public List<C12442QK> A01;

    public C1105638(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A00 = new C11571Bl(this, 1, null, null, null);
    }

    public final void A1y(C12530Rk c12530Rk) {
        if (this.A00 != null) {
            this.A00.A0c(c12530Rk);
        }
    }

    public C11571Bl getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
