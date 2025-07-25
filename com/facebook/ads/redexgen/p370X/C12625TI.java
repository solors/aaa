package com.facebook.ads.redexgen.p370X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.TI */
/* loaded from: assets/audience_network.dex */
public final class C12625TI extends C12329OV {
    public final ImageView A00;
    public final C13029Zs A01;

    public C12625TI(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A01 = c13029Zs;
        this.A00 = new ImageView(c13029Zs);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC12718Un downloadImageTask = new AsyncTaskC12718Un(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
