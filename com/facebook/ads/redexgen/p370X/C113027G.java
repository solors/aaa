package com.facebook.ads.redexgen.p370X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7G */
/* loaded from: assets/audience_network.dex */
public final class C113027G extends AbstractC12594Sm {
    public final Paint A00;
    public final C13029Zs A01;
    public final C12008JF A02;
    public final AbstractC12591Sj A03;
    public final AbstractC12585Sd A04;
    public final AbstractC12533Rn A05;
    public final C12497RD A06;

    public C113027G(C13029Zs c13029Zs, boolean z, C12008JF c12008jf) {
        super(c13029Zs);
        this.A04 = new AbstractC12585Sd() { // from class: com.facebook.ads.redexgen.X.7K
            {
                C113027G.this = this;
            }

            @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
            /* renamed from: A00 */
            public final void A03(C114289P c114289p) {
                C12497RD c12497rd;
                c12497rd = C113027G.this.A06;
                c12497rd.setChecked(true);
            }
        };
        this.A05 = new AbstractC12533Rn() { // from class: com.facebook.ads.redexgen.X.7I
            {
                C113027G.this = this;
            }

            @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
            /* renamed from: A00 */
            public final void A03(C12581SZ c12581sz) {
                C12497RD c12497rd;
                c12497rd = C113027G.this.A06;
                c12497rd.setChecked(false);
            }
        };
        this.A03 = new AbstractC12591Sj() { // from class: com.facebook.ads.redexgen.X.7H
            {
                C113027G.this = this;
            }

            @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
            /* renamed from: A00 */
            public final void A03(C114309R c114309r) {
                C12497RD c12497rd;
                c12497rd = C113027G.this.A06;
                c12497rd.setChecked(true);
            }
        };
        this.A02 = c12008jf;
        this.A01 = c13029Zs;
        this.A06 = new C12497RD(c13029Zs, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        AbstractC12177M3.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        AbstractC12177M3.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12594Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new View$OnClickListenerC12494RA(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC12594Sm
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
