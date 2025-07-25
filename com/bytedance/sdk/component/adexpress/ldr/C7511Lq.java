package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.utils.C7730Fy;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.Lq */
/* loaded from: classes3.dex */
public class C7511Lq extends FrameLayout {

    /* renamed from: IL */
    private ImageView f16317IL;

    /* renamed from: bX */
    private kMt f16318bX;

    /* renamed from: bg */
    private Context f16319bg;
    private AnimatorSet eqN;

    /* renamed from: zx */
    private boolean f16320zx;

    public C7511Lq(@NonNull Context context) {
        super(context);
        this.f16320zx = true;
        this.f16319bg = context;
        this.eqN = new AnimatorSet();
        m88638bX();
        eqN();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.Lq.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C7511Lq.this.f16317IL.getLayoutParams();
                layoutParams.topMargin = (int) ((C7511Lq.this.f16318bX.getMeasuredHeight() / 2.0f) - C7489Kg.m88675bg(C7511Lq.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((C7511Lq.this.f16318bX.getMeasuredWidth() / 2.0f) - C7489Kg.m88675bg(C7511Lq.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-C7511Lq.this.f16318bX.getMeasuredHeight()) / 2.0f) + C7489Kg.m88675bg(C7511Lq.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-C7511Lq.this.f16318bX.getMeasuredWidth()) / 2.0f) + C7489Kg.m88675bg(C7511Lq.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                C7511Lq.this.f16317IL.setLayoutParams(layoutParams);
            }
        });
    }

    private void eqN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16317IL, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.Lq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (C7511Lq.this.f16320zx) {
                    C7511Lq.this.f16318bX.m88594bg();
                }
                C7511Lq c7511Lq = C7511Lq.this;
                c7511Lq.f16320zx = !c7511Lq.f16320zx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(C7511Lq.this.f16317IL, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                C7511Lq.this.f16317IL.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16317IL, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.eqN.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: bX */
    private void m88638bX() {
        this.f16318bX = new kMt(this.f16319bg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16319bg, 40.0f), (int) C7489Kg.m88675bg(this.f16319bg, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.f16318bX, layoutParams);
        this.f16317IL = new ImageView(this.f16319bg);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16319bg, 62.0f), (int) C7489Kg.m88675bg(this.f16319bg, 62.0f));
        layoutParams2.gravity = 16;
        this.f16317IL.setImageResource(C7730Fy.eqN(this.f16319bg, "tt_splash_hand"));
        addView(this.f16317IL, layoutParams2);
    }

    /* renamed from: IL */
    public void m88640IL() {
        AnimatorSet animatorSet = this.eqN;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        kMt kmt = this.f16318bX;
        if (kmt != null) {
            kmt.m88596IL();
        }
        ImageView imageView = this.f16317IL;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    /* renamed from: bg */
    public void m88636bg() {
        this.eqN.start();
    }
}
