package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OA */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12308OA implements View.OnClickListener {
    public float A00;
    public float A01;
    public View.OnClickListener A02;

    public View$OnClickListenerC12308OA(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public final void A00(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            int diff = Math.abs(width - height) / 2;
            if (width == height || ((width > height && this.A00 >= diff && this.A00 <= width - diff) || (height > width && this.A01 >= diff && this.A01 <= height - diff))) {
                this.A02.onClick(view);
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
