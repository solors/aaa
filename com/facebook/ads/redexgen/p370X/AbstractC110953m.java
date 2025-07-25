package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3m */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC110953m {
    public static final C110943l A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C11785FY();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C13099b1();
        } else {
            A00 = new C110943l();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
