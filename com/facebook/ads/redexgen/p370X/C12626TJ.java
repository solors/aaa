package com.facebook.ads.redexgen.p370X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.TJ */
/* loaded from: assets/audience_network.dex */
public final class C12626TJ extends AbstractC111464c<C12624TH> {
    public final int A00;
    public final C13029Zs A01;
    public final View$OnClickListenerC12713Ui A02;
    public final List<String> A03;

    public C12626TJ(C13029Zs c13029Zs, List<String> screenshotUrls, int i, View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c13029Zs;
        this.A02 = view$OnClickListenerC12713Ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC111464c
    /* renamed from: A02 */
    public final C12624TH A0C(ViewGroup viewGroup, int i) {
        C12625TI c12625ti = new C12625TI(this.A01);
        if (C11979Im.A17(this.A01)) {
            c12625ti.setOnClickListener(new View$OnClickListenerC12459Qb(this));
        }
        return new C12624TH(c12625ti);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC111464c
    /* renamed from: A03 */
    public final void A0D(C12624TH c12624th, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        c12624th.A0j().setLayoutParams(marginLayoutParams);
        c12624th.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111464c
    public final int A0E() {
        return this.A03.size();
    }
}
