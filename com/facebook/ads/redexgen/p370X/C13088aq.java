package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aq */
/* loaded from: assets/audience_network.dex */
public class C13088aq extends AbstractC111424Y {
    public C13088aq(AbstractC111584o abstractC111584o) {
        super(abstractC111584o, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C111594p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0D(View view) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        return this.A02.A0l(view) + c111594p.topMargin + c111594p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0E(View view) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        return this.A02.A0m(view) + c111594p.leftMargin + c111594p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C111594p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
