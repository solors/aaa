package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.VM */
/* loaded from: assets/audience_network.dex */
public final class C12753VM extends AbstractC12216Mg {
    public final C12303O5 A00;

    public C12753VM(C13029Zs c13029Zs, View.OnClickListener onClickListener) {
        super(c13029Zs, onClickListener);
        this.A00 = new C12303O5(c13029Zs);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final C12753VM A0F(String str) {
        new AsyncTaskC12718Un(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C12754VN(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12216Mg
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
