package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.al */
/* loaded from: assets/audience_network.dex */
public class C13083al implements InterfaceC1117959 {
    public final /* synthetic */ AbstractC111584o A00;

    public C13083al(AbstractC111584o abstractC111584o) {
        this.A00 = abstractC111584o;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final View A6k(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A6m(View view) {
        return this.A00.A0n(view) + ((C111594p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A6n(View view) {
        return this.A00.A0k(view) - ((C111594p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A7y() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A7z() {
        return this.A00.A0e();
    }
}
