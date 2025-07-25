package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.43 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1111243 {
    public static final C1111142 A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C13094aw();
        } else {
            A00 = new C1111142();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f, float f2) {
        A00.A00(edgeEffect, f, f2);
    }
}
