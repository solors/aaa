package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.utils.C7730Fy;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.xxp */
/* loaded from: classes3.dex */
public class C7553xxp extends FrameLayout {

    /* renamed from: IL */
    private ImageView f16451IL;

    /* renamed from: bX */
    private kMt f16452bX;

    /* renamed from: bg */
    private Context f16453bg;
    private AnimatorSet eqN;
    private TextView ldr;

    /* renamed from: zx */
    private boolean f16454zx;

    public C7553xxp(@NonNull Context context) {
        super(context);
        this.f16454zx = true;
        this.f16453bg = context;
        this.eqN = new AnimatorSet();
        m88571bX();
        eqN();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.xxp.1
            @Override // java.lang.Runnable
            public void run() {
                int m88675bg = (int) C7489Kg.m88675bg(C7553xxp.this.f16453bg, 50.0f);
                int m88675bg2 = (int) C7489Kg.m88675bg(C7553xxp.this.f16453bg, 50.0f);
                if (C7553xxp.this.f16452bX.getMeasuredHeight() > 0) {
                    m88675bg = C7553xxp.this.f16452bX.getMeasuredHeight();
                }
                if (C7553xxp.this.f16452bX.getMeasuredWidth() > 0) {
                    m88675bg2 = C7553xxp.this.f16452bX.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C7553xxp.this.f16451IL.getLayoutParams();
                layoutParams.topMargin = ((int) ((m88675bg / 2.0f) - C7489Kg.m88675bg(C7553xxp.this.getContext(), 5.0f))) + ((int) C7489Kg.m88675bg(C7553xxp.this.f16453bg, 40.0f));
                layoutParams.leftMargin = ((int) ((m88675bg2 / 2.0f) - C7489Kg.m88675bg(C7553xxp.this.getContext(), 5.0f))) + ((int) C7489Kg.m88675bg(C7553xxp.this.f16453bg, 20.0f));
                layoutParams.bottomMargin = (int) (((-m88675bg) / 2.0f) + C7489Kg.m88675bg(C7553xxp.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-m88675bg2) / 2.0f) + C7489Kg.m88675bg(C7553xxp.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                C7553xxp.this.f16451IL.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.ldr.setVisibility(0);
        this.ldr.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.ldr.setTextColor(i);
    }

    /* renamed from: bX */
    private void m88571bX() {
        this.f16452bX = new kMt(this.f16453bg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16453bg, 50.0f), (int) C7489Kg.m88675bg(this.f16453bg, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) C7489Kg.m88675bg(this.f16453bg, 40.0f);
        int m88675bg = (int) C7489Kg.m88675bg(this.f16453bg, 20.0f);
        layoutParams.leftMargin = m88675bg;
        layoutParams.setMarginStart(m88675bg);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f16452bX, layoutParams);
        this.f16451IL = new ImageView(this.f16453bg);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16453bg, 78.0f), (int) C7489Kg.m88675bg(this.f16453bg, 78.0f));
        this.f16451IL.setImageResource(C7730Fy.eqN(this.f16453bg, "tt_splash_hand"));
        addView(this.f16451IL, layoutParams2);
        TextView textView = new TextView(this.f16453bg);
        this.ldr = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C7489Kg.m88675bg(this.f16453bg, 10.0f);
        addView(this.ldr, layoutParams3);
        this.ldr.setVisibility(8);
    }

    private void eqN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16451IL, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.xxp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (C7553xxp.this.f16454zx) {
                    C7553xxp.this.f16452bX.m88594bg();
                }
                C7553xxp c7553xxp = C7553xxp.this;
                c7553xxp.f16454zx = !c7553xxp.f16454zx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(C7553xxp.this.f16451IL, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                C7553xxp.this.f16451IL.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16451IL, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat2.setDuration(600L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.eqN.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: IL */
    public void m88573IL() {
        AnimatorSet animatorSet = this.eqN;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        kMt kmt = this.f16452bX;
        if (kmt != null) {
            kmt.m88596IL();
        }
        ImageView imageView = this.f16451IL;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    /* renamed from: bg */
    public void m88569bg() {
        this.eqN.start();
    }
}
