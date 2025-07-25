package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.utils.C7730Fy;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.tC */
/* loaded from: classes3.dex */
public class C7545tC extends FrameLayout {

    /* renamed from: IL */
    private ImageView f16430IL;

    /* renamed from: Kg */
    private AnimatorSet f16431Kg;

    /* renamed from: WR */
    private AnimatorSet f16432WR;

    /* renamed from: bX */
    private ImageView f16433bX;

    /* renamed from: bg */
    private Context f16434bg;
    private ImageView eqN;

    /* renamed from: iR */
    private AnimatorSet f16435iR;
    private AnimatorSet ldr;

    /* renamed from: zx */
    private TextView f16436zx;

    public C7545tC(@NonNull Context context) {
        super(context);
        this.ldr = new AnimatorSet();
        this.f16435iR = new AnimatorSet();
        this.f16431Kg = new AnimatorSet();
        this.f16432WR = new AnimatorSet();
        this.f16434bg = context;
        m88582bX();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setGuideText(String str) {
        this.f16436zx.setText(str);
    }

    /* renamed from: bX */
    private void m88582bX() {
        ImageView imageView = new ImageView(this.f16434bg);
        this.eqN = imageView;
        imageView.setBackgroundResource(C7730Fy.eqN(this.f16434bg, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) C7489Kg.m88675bg(this.f16434bg, 30.0f);
        addView(this.eqN, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f16434bg);
        this.f16433bX = imageView2;
        imageView2.setImageResource(C7730Fy.eqN(this.f16434bg, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16434bg, 50.0f), (int) C7489Kg.m88675bg(this.f16434bg, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) C7489Kg.m88675bg(this.f16434bg, 30.0f);
        addView(this.f16433bX, layoutParams2);
        ImageView imageView3 = new ImageView(this.f16434bg);
        this.f16430IL = imageView3;
        imageView3.setImageResource(C7730Fy.eqN(this.f16434bg, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16434bg, 80.0f), (int) C7489Kg.m88675bg(this.f16434bg, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) C7489Kg.m88675bg(this.f16434bg, 30.0f);
        addView(this.f16430IL, layoutParams3);
        TextView textView = new TextView(this.f16434bg);
        this.f16436zx = textView;
        textView.setTextColor(-1);
        this.f16436zx.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f16436zx, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) C7545tC.this.f16430IL.getLayoutParams();
                layoutParams5.topMargin = (int) ((C7545tC.this.f16433bX.getMeasuredHeight() / 2.0f) - C7489Kg.m88675bg(C7545tC.this.getContext(), 7.0f));
                int m88675bg = (-C7545tC.this.f16433bX.getMeasuredWidth()) + ((int) C7489Kg.m88675bg(C7545tC.this.f16434bg, 30.0f));
                layoutParams5.leftMargin = m88675bg;
                layoutParams5.setMarginStart(m88675bg);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                C7545tC.this.f16430IL.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) C7545tC.this.eqN.getLayoutParams();
                layoutParams6.topMargin = (int) ((C7545tC.this.f16433bX.getMeasuredHeight() / 2.0f) - C7489Kg.m88675bg(C7545tC.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((C7545tC.this.f16433bX.getMeasuredWidth() / 2.0f) + ((int) C7489Kg.m88675bg(C7545tC.this.f16434bg, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                C7545tC.this.eqN.setLayoutParams(layoutParams6);
            }
        });
    }

    private void eqN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16430IL, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16433bX, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f16433bX, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.eqN, "alpha", 0.0f, 1.0f);
        this.f16431Kg.setDuration(300L);
        this.f16431Kg.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f16430IL, "translationX", 0.0f, C7489Kg.m88675bg(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) C7489Kg.m88675bg(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C7545tC.this.eqN.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C7545tC.this.eqN.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f16433bX, "translationX", 0.0f, C7489Kg.m88675bg(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f16432WR.setDuration(1500L);
        this.f16432WR.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f16430IL, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.eqN, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f16433bX, "alpha", 1.0f, 0.0f);
        this.f16435iR.setDuration(50L);
        this.f16435iR.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.ldr.playSequentially(this.f16431Kg, this.f16432WR, this.f16435iR);
    }

    /* renamed from: IL */
    public void m88584IL() {
        try {
            AnimatorSet animatorSet = this.ldr;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f16431Kg;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f16432WR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.f16435iR;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public void m88580bg() {
        eqN();
        this.ldr.start();
        this.ldr.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C7545tC.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C7545tC.this.ldr.start();
                    }
                }, 200L);
            }
        });
    }
}
