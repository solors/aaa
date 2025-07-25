package com.facebook.ads.redexgen.p370X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.3T */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC110773T {
    public static final C110763S A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C109030d() { // from class: com.facebook.ads.redexgen.X.0U
            };
        } else if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C109030d();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C109381D();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C109721l();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C110232a();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C110663I();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C112816o();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C11787Fa();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C13103b6();
        } else {
            A00 = new C110763S();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(View view) {
        return A00.A07(view);
    }

    public static C110933k A05(View view, C110933k c110933k) {
        return A00.A08(view, c110933k);
    }

    public static C110933k A06(View view, C110933k c110933k) {
        return A00.A09(view, c110933k);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i) {
        A00.A0C(view, i);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, AbstractC1105537 abstractC1105537) {
        A00.A0E(view, abstractC1105537);
    }

    public static void A0C(View view, InterfaceC110613D interfaceC110613D) {
        A00.A0F(view, interfaceC110613D);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j) {
        A00.A0H(view, runnable, j);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
