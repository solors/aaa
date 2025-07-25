package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C7730Fy;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.IL */
/* loaded from: classes3.dex */
public class C7506IL extends FrameLayout {

    /* renamed from: IL */
    private ObjectAnimator f16292IL;

    /* renamed from: Kg */
    private int f16293Kg;

    /* renamed from: WR */
    private int f16294WR;

    /* renamed from: bX */
    private boolean f16295bX;

    /* renamed from: bg */
    private AnimatorSet f16296bg;

    /* renamed from: eo */
    private Context f16297eo;
    private View eqN;

    /* renamed from: iR */
    private ImageView f16298iR;
    private View ldr;

    /* renamed from: zx */
    private View f16299zx;

    public C7506IL(Context context, int i, int i2) {
        super(context);
        this.f16295bX = false;
        this.f16296bg = new AnimatorSet();
        this.f16293Kg = i;
        this.f16294WR = i2;
        this.f16297eo = context;
        m88650bX();
        eqN();
    }

    private void eqN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.eqN, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.eqN, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f16299zx, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f16299zx, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.ldr, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.ldr, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f16298iR, "rotation", 0.0f, -20.0f, 0.0f);
        this.f16292IL = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.f16296bg.setDuration(1500L);
        this.f16296bg.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f16296bg.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.f16296bg.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.IL.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C7506IL.this.f16295bX = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (C7506IL.this.f16295bX) {
                    return;
                }
                C7506IL.this.f16292IL.start();
                C7506IL.this.f16296bg.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    /* renamed from: bX */
    private void m88650bX() {
        View view = new View(this.f16297eo);
        this.eqN = view;
        view.setBackground(m88645bg("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.f16293Kg * 0.45d), (int) (this.f16294WR * 0.45d));
        layoutParams.gravity = 17;
        this.eqN.setLayoutParams(layoutParams);
        addView(this.eqN);
        View view2 = new View(this.f16297eo);
        this.f16299zx = view2;
        view2.setBackground(m88645bg("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.f16293Kg * 0.25d), (int) (this.f16294WR * 0.25d));
        layoutParams2.gravity = 17;
        this.f16299zx.setLayoutParams(layoutParams2);
        addView(this.f16299zx);
        View view3 = new View(this.f16297eo);
        this.ldr = view3;
        view3.setBackground(m88645bg("#807BBEFF", "#FF7BBEFF"));
        int i = this.f16293Kg;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i * 0.25d), (int) (i * 0.25d));
        layoutParams3.gravity = 17;
        this.ldr.setLayoutParams(layoutParams3);
        addView(this.ldr);
        ImageView imageView = new ImageView(this.f16297eo);
        this.f16298iR = imageView;
        imageView.setImageResource(C7730Fy.eqN(getContext(), "tt_blue_hand"));
        this.f16298iR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.f16293Kg * 0.62d), (int) (this.f16294WR * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.f16298iR.setLayoutParams(layoutParams4);
        addView(this.f16298iR);
    }

    /* renamed from: IL */
    public void m88652IL() {
        this.f16295bX = true;
        ObjectAnimator objectAnimator = this.f16292IL;
        if (objectAnimator == null || this.f16296bg == null) {
            return;
        }
        objectAnimator.cancel();
        this.f16296bg.cancel();
    }

    /* renamed from: bg */
    private GradientDrawable m88645bg(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    /* renamed from: bg */
    public void m88648bg() {
        this.f16295bX = false;
        ObjectAnimator objectAnimator = this.f16292IL;
        if (objectAnimator == null || this.f16296bg == null) {
            return;
        }
        objectAnimator.start();
        this.f16296bg.start();
    }
}
