package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.os.Trace;

/* renamed from: com.facebook.ads.redexgen.X.2q */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC110392q {
    public static void A00() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
