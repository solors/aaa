package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7475VB;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.utils.C7730Fy;

/* loaded from: classes3.dex */
public class JAA extends FrameLayout {

    /* renamed from: WR */
    private static final int f16301WR = (C7475VB.m88729IL("", 0.0f, true)[1] / 2) + 1;

    /* renamed from: eo */
    private static final int f16302eo = (C7475VB.m88729IL("", 0.0f, true)[1] / 2) + 3;

    /* renamed from: IL */
    LinearLayout f16303IL;

    /* renamed from: Kg */
    private float f16304Kg;

    /* renamed from: bX */
    private float f16305bX;

    /* renamed from: bg */
    LinearLayout f16306bg;
    private float eqN;

    /* renamed from: iR */
    private double f16307iR;
    private Drawable ldr;

    /* renamed from: zx */
    private Drawable f16308zx;

    public JAA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16306bg = new LinearLayout(getContext());
        this.f16303IL = new LinearLayout(getContext());
        this.f16306bg.setOrientation(0);
        this.f16306bg.setGravity(GravityCompat.START);
        this.f16303IL.setOrientation(0);
        this.f16303IL.setGravity(GravityCompat.START);
        this.f16308zx = C7730Fy.m87919bX(context, "tt_star_thick");
        this.ldr = C7730Fy.m87919bX(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f16305bX, (int) this.eqN));
        imageView.setPadding(1, f16301WR, 1, f16302eo);
        return imageView;
    }

    /* renamed from: bg */
    public void m88644bg(double d, int i, int i2, int i3) {
        float f = i2;
        this.f16305bX = (int) C7489Kg.m88678bX(getContext(), f);
        this.eqN = (int) C7489Kg.m88678bX(getContext(), f);
        this.f16307iR = d;
        this.f16304Kg = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f16303IL.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f16306bg.addView(starImageView2);
        }
        addView(this.f16306bg);
        addView(this.f16303IL);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.f16308zx;
    }

    public Drawable getStarFillDrawable() {
        return this.ldr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16306bg.measure(i, i2);
        double d = this.f16307iR;
        float f = this.f16305bX;
        this.f16303IL.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f16306bg.getMeasuredHeight(), 1073741824));
        if (this.f16304Kg > 0.0f) {
            LinearLayout linearLayout = this.f16306bg;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.f16304Kg)) / 2, 0, 0);
            this.f16303IL.setPadding(0, ((int) (this.f16306bg.getMeasuredHeight() - this.f16304Kg)) / 2, 0, 0);
        }
    }
}
