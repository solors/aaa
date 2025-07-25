package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mg */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12216Mg extends RelativeLayout {
    public boolean A00;
    public final C13029Zs A01;
    public final C12215Mf A02;
    public static final int A04 = (int) (AbstractC12137LP.A02 * 4.0f);
    public static final int A05 = (int) (AbstractC12137LP.A02 * 40.0f);
    public static final int A03 = (int) (AbstractC12137LP.A02 * 24.0f);

    public abstract int getMediaViewId();

    public AbstractC12216Mg(C13029Zs c13029Zs, View.OnClickListener onClickListener) {
        super(c13029Zs);
        this.A00 = true;
        this.A01 = c13029Zs;
        this.A02 = new C12215Mf(this.A01);
        this.A02.setOnClickListener(onClickListener);
    }

    public final RelativeLayout.LayoutParams A00(boolean z, boolean z2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A05, A03);
        layoutParams.setMargins(A04, A04, A04, A04);
        if (this.A00) {
            layoutParams.addRule(z ? 12 : 10);
            layoutParams.addRule(z2 ? 11 : 9);
        } else {
            int mediaViewId = getMediaViewId();
            layoutParams.addRule(z ? 8 : 6, mediaViewId);
            layoutParams.addRule(z2 ? 7 : 5, mediaViewId);
        }
        return layoutParams;
    }

    public void A0A() {
    }

    public void A0B() {
    }

    public void A0C() {
        AbstractC12177M3.A0J(this.A02);
        this.A02.setLayoutParams(A00(false, true));
        addView(this.A02);
    }

    public boolean A0D() {
        return true;
    }

    public boolean A0E() {
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean A0E = A0E();
        boolean newShouldLayoutButtonsRelativeToParent = this.A00;
        if (A0E != newShouldLayoutButtonsRelativeToParent) {
            this.A00 = A0E;
            A0C();
        }
    }
}
