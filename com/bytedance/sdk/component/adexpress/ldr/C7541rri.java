package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.p242bX.C7300bg;
import com.bytedance.sdk.component.utils.C7741PX;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.rri */
/* loaded from: classes3.dex */
public class C7541rri extends RelativeLayout {

    /* renamed from: IL */
    private ImageView f16418IL;

    /* renamed from: Kg */
    private AnimatorSet f16419Kg;

    /* renamed from: VB */
    private int f16420VB;

    /* renamed from: WR */
    private AnimatorSet f16421WR;

    /* renamed from: bX */
    private ImageView f16422bX;

    /* renamed from: bg */
    private ImageView f16423bg;

    /* renamed from: eo */
    private String f16424eo;
    private TextView eqN;

    /* renamed from: iR */
    private AnimatorSet f16425iR;
    private AnimatorSet ldr;

    /* renamed from: zx */
    private TextView f16426zx;

    public C7541rri(Context context) {
        super(context);
        this.ldr = new AnimatorSet();
        this.f16425iR = new AnimatorSet();
        this.f16419Kg = new AnimatorSet();
        this.f16421WR = new AnimatorSet();
        this.f16420VB = 100;
        mo88586bg(context);
    }

    /* renamed from: bX */
    public void m88588bX() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16423bg, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16423bg, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f16423bg, "translationY", 0.0f, C7489Kg.m88675bg(getContext(), -this.f16420VB));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) C7489Kg.m88675bg(getContext(), this.f16420VB));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.rri.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C7541rri.this.f16422bX != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C7541rri.this.f16422bX.getLayoutParams();
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    C7541rri.this.f16422bX.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f16422bX, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f16422bX, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f16418IL, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f16418IL, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f16418IL, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f16418IL, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f16418IL, "translationY", 0.0f, C7489Kg.m88675bg(getContext(), -this.f16420VB));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f16425iR.setDuration(50L);
        this.f16421WR.setDuration(1500L);
        this.f16419Kg.setDuration(50L);
        this.f16425iR.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.f16419Kg.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.f16421WR.playTogether(ofFloat3, ofInt, ofFloat10);
        this.ldr.playSequentially(this.f16419Kg, this.f16421WR, this.f16425iR);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.ldr;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo88590IL();
    }

    public void setGuideText(String str) {
        TextView textView = this.eqN;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.f16426zx != null) {
            if (TextUtils.isEmpty(str)) {
                this.f16426zx.setText("");
            } else {
                this.f16426zx.setText(str);
            }
        }
    }

    /* renamed from: IL */
    public void mo88590IL() {
        try {
            AnimatorSet animatorSet = this.ldr;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f16419Kg;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f16425iR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.f16421WR;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            C7741PX.m87880IL(e.getMessage());
        }
    }

    /* renamed from: bg */
    protected void mo88586bg(Context context) {
        if (context == null) {
            context = C7487eqN.m88683bg();
        }
        if ("5".equals(this.f16424eo)) {
            addView(C7300bg.ldr(context));
            this.f16420VB = (int) (this.f16420VB * 1.25d);
        } else {
            addView(C7300bg.m89243zx(context));
        }
        this.f16423bg = (ImageView) findViewById(2097610734);
        this.f16418IL = (ImageView) findViewById(2097610735);
        this.eqN = (TextView) findViewById(2097610730);
        this.f16422bX = (ImageView) findViewById(2097610733);
        this.f16426zx = (TextView) findViewById(2097610731);
    }

    public C7541rri(Context context, String str) {
        super(context);
        this.ldr = new AnimatorSet();
        this.f16425iR = new AnimatorSet();
        this.f16419Kg = new AnimatorSet();
        this.f16421WR = new AnimatorSet();
        this.f16420VB = 100;
        setClipChildren(false);
        this.f16424eo = str;
        mo88586bg(context);
    }

    /* renamed from: bg */
    public void mo88587bg() {
        m88588bX();
        this.ldr.start();
        this.ldr.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ldr.rri.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C7541rri.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.rri.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C7541rri.this.ldr.start();
                    }
                }, 200L);
            }
        });
    }
}
