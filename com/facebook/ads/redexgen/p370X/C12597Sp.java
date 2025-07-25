package com.facebook.ads.redexgen.p370X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sp */
/* loaded from: assets/audience_network.dex */
public class C12597Sp extends AbstractC110122P {
    public final /* synthetic */ C12596So A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12597Sp(C12596So c12596So, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c12596So;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC110122P
    public final void A00(boolean z, boolean z2, C110142R c110142r) {
        boolean z3;
        String str;
        Map A0I;
        if (z2) {
            z3 = this.A00.A0A;
            if (!z3) {
                this.A00.A0A = true;
                C12596So c12596So = this.A00;
                str = this.A00.A0J;
                A0I = this.A00.A0I(EnumC12470Qm.A0B);
                c12596So.A0Q(str, A0I);
            }
        }
    }
}
