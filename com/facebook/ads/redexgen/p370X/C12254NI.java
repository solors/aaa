package com.facebook.ads.redexgen.p370X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.NI */
/* loaded from: assets/audience_network.dex */
public final class C12254NI extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (AbstractC12137LP.A02 * 16.0f);
    public static final int A05 = (int) (AbstractC12137LP.A02 * 12.0f);
    public static final int A06 = (int) (AbstractC12137LP.A02 * 12.0f);
    public static final int A03 = (int) (AbstractC12137LP.A02 * 16.0f);

    public C12254NI(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A00 = false;
        setOrientation(0);
        setPadding(A04, A05, A04, A05);
        this.A01 = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A03, A03);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, textViewParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        AbstractC12177M3.A0S(this, gradientDrawable);
        AbstractC12177M3.A0Y(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, EnumC12185MB enumC12185MB) {
        this.A02.setText(str);
        if (enumC12185MB != null) {
            this.A01.setImageBitmap(AbstractC12186MC.A01(enumC12185MB));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}
