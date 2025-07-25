package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bq */
/* loaded from: assets/audience_network.dex */
public final class C11576Bq extends C12614T7 {
    public C11576Bq(C13029Zs c13029Zs) {
        super(c13029Zs);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int newWidthSpec = View.MeasureSpec.getMode(i);
        if (newWidthSpec == 1073741824) {
            i2 = i;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i2);
            if (newWidthSpec2 == 1073741824) {
                i = i2;
            }
        }
        super.onMeasure(i, i2);
    }
}
