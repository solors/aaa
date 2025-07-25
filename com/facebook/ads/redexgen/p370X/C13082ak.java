package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ak */
/* loaded from: assets/audience_network.dex */
public class C13082ak implements InterfaceC1117959 {
    public final /* synthetic */ AbstractC111584o A00;

    public C13082ak(AbstractC111584o abstractC111584o) {
        this.A00 = abstractC111584o;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final View A6k(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A6m(View view) {
        return this.A00.A0j(view) + ((C111594p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A6n(View view) {
        return this.A00.A0o(view) - ((C111594p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A7y() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117959
    public final int A7z() {
        return this.A00.A0g();
    }
}
