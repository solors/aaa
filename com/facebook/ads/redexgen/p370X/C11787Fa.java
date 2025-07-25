package com.facebook.ads.redexgen.p370X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fa */
/* loaded from: assets/audience_network.dex */
public class C11787Fa extends C13103b6 {
    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final int A03(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final int A05(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final int A06(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final void A0A(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public void A0C(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final void A0D(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final void A0G(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final void A0H(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
