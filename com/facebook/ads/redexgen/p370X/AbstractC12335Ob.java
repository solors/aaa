package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Ob */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12335Ob {
    public static final int A00 = AbstractC12177M3.A00();

    public static void A00(C13029Zs c13029Zs, ViewGroup viewGroup, String str) {
        new AsyncTaskC12718Un(viewGroup, c13029Zs).A07(str);
        View view = new View(c13029Zs);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC12177M3.A0R(view, c13029Zs);
        viewGroup.addView(view, 0);
    }
}
