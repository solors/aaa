package com.bytedance.adsdk.ugeno.p207WR.p212zx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import com.bytedance.adsdk.ugeno.p222iR.C7120eqN;

/* renamed from: com.bytedance.adsdk.ugeno.WR.zx.bg */
/* loaded from: classes3.dex */
public class C7031bg extends FrameLayout {

    /* renamed from: IL */
    private float f15070IL;

    /* renamed from: Kg */
    private InterfaceC7032bX f15071Kg;

    /* renamed from: bX */
    private double f15072bX;

    /* renamed from: bg */
    private float f15073bg;
    private float eqN;

    /* renamed from: iR */
    private Context f15074iR;
    private LinearLayout ldr;

    /* renamed from: zx */
    private LinearLayout f15075zx;

    public C7031bg(Context context) {
        super(context);
        this.f15074iR = context;
        this.f15075zx = new LinearLayout(context);
        this.ldr = new LinearLayout(context);
        this.f15075zx.setOrientation(0);
        this.f15075zx.setGravity(GravityCompat.START);
        this.ldr.setOrientation(0);
        this.ldr.setGravity(GravityCompat.START);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.f15073bg, (int) this.f15070IL);
        float f = this.eqN;
        layoutParams.leftMargin = (int) f;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* renamed from: bg */
    public void m90231bg(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.f15075zx.removeAllViews();
        this.ldr.removeAllViews();
        this.f15073bg = (int) C7114Kg.m90009bg(this.f15074iR, f);
        this.f15070IL = (int) C7114Kg.m90009bg(this.f15074iR, f);
        this.f15072bX = d;
        this.eqN = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(C7120eqN.m89991bg(this.f15074iR, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.ldr.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(C7120eqN.m89991bg(this.f15074iR, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i2);
            this.f15075zx.addView(starImageView2);
        }
        addView(this.f15075zx);
        addView(this.ldr);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15071Kg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90223iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15071Kg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90228Kg();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC7032bX interfaceC7032bX = this.f15071Kg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90226bg(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC7032bX interfaceC7032bX = this.f15071Kg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90227bg(i, i2);
        }
        super.onMeasure(i, i2);
        this.f15075zx.measure(i, i2);
        double floor = Math.floor(this.f15072bX);
        float f = this.eqN;
        float f2 = this.f15073bg;
        this.ldr.measure(View.MeasureSpec.makeMeasureSpec((int) (((f + f + f2) * floor) + f + ((this.f15072bX - floor) * f2)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f15075zx.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7032bX interfaceC7032bX = this.f15071Kg;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90229IL(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: bg */
    public void m90230bg(InterfaceC7032bX interfaceC7032bX) {
        this.f15071Kg = interfaceC7032bX;
    }
}
