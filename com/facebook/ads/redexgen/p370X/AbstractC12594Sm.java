package com.facebook.ads.redexgen.p370X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Sm */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12594Sm extends RelativeLayout implements InterfaceC12477Qt {
    public C12614T7 A00;

    public AbstractC12594Sm(C13029Zs c13029Zs) {
        super(c13029Zs);
    }

    public AbstractC12594Sm(C13029Zs c13029Zs, AttributeSet attributeSet, int i) {
        super(c13029Zs, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12477Qt
    public final void A9r(C12614T7 c12614t7) {
        this.A00 = c12614t7;
        A07();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12477Qt
    public final void AHD(C12614T7 c12614t7) {
        A08();
        this.A00 = null;
    }

    public C12614T7 getVideoView() {
        return this.A00;
    }
}
