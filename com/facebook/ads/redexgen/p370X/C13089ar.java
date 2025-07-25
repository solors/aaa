package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ar */
/* loaded from: assets/audience_network.dex */
public class C13089ar extends AbstractC111424Y {
    public C13089ar(AbstractC111584o abstractC111584o) {
        super(abstractC111584o, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C111594p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0D(View view) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        return this.A02.A0m(view) + c111594p.leftMargin + c111594p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0E(View view) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        return this.A02.A0l(view) + c111594p.topMargin + c111594p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C111594p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111424Y
    public final void A0J(int i) {
        this.A02.A0z(i);
    }
}
