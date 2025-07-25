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

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.yDt */
/* loaded from: classes3.dex */
public class C7556yDt extends FrameLayout {

    /* renamed from: IL */
    private ImageView f16457IL;

    /* renamed from: bX */
    private C7536eqN f16458bX;

    /* renamed from: bg */
    private Context f16459bg;
    private AnimatorSet eqN;
    private TextView ldr;

    /* renamed from: zx */
    private boolean f16460zx;

    public C7556yDt(@NonNull Context context) {
        super(context);
        this.f16460zx = true;
        this.f16459bg = context;
        this.eqN = new AnimatorSet();
        m88564bX();
        eqN();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.yDt.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C7556yDt.this.f16457IL.getLayoutParams();
                layoutParams.topMargin = ((int) ((C7556yDt.this.f16458bX.getMeasuredHeight() / 2.0f) - C7489Kg.m88675bg(C7556yDt.this.getContext(), 5.0f))) + ((int) C7489Kg.m88675bg(C7556yDt.this.f16459bg, 20.0f));
                layoutParams.leftMargin = ((int) ((C7556yDt.this.f16458bX.getMeasuredWidth() / 2.0f) - C7489Kg.m88675bg(C7556yDt.this.getContext(), 5.0f))) + ((int) C7489Kg.m88675bg(C7556yDt.this.f16459bg, 20.0f));
                layoutParams.bottomMargin = (int) (((-C7556yDt.this.f16458bX.getMeasuredHeight()) / 2.0f) + C7489Kg.m88675bg(C7556yDt.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-C7556yDt.this.f16458bX.getMeasuredWidth()) / 2.0f) + C7489Kg.m88675bg(C7556yDt.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                C7556yDt.this.f16457IL.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.ldr.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.ldr.setTextColor(i);
    }

    /* renamed from: bX */
    private void m88564bX() {
        this.f16458bX = new C7536eqN(this.f16459bg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16459bg, 80.0f), (int) C7489Kg.m88675bg(this.f16459bg, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) C7489Kg.m88675bg(this.f16459bg, 20.0f);
        int m88675bg = (int) C7489Kg.m88675bg(this.f16459bg, 20.0f);
        layoutParams.leftMargin = m88675bg;
        layoutParams.setMarginStart(m88675bg);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f16458bX, layoutParams);
        this.f16458bX.m88598bg();
        this.f16457IL = new ImageView(this.f16459bg);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16459bg, 80.0f), (int) C7489Kg.m88675bg(this.f16459bg, 80.0f));
        this.f16457IL.setImageResource(C7730Fy.eqN(this.f16459bg, "tt_splash_hand"));
        addView(this.f16457IL, layoutParams2);
        TextView textView = new TextView(this.f16459bg);
        this.ldr = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C7489Kg.m88675bg(this.f16459bg, 10.0f);
        addView(this.ldr, layoutParams3);
    }

    private void eqN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16457IL, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.yDt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (C7556yDt.this.f16460zx) {
                    C7556yDt.this.f16458bX.m88598bg();
                    C7556yDt.this.f16458bX.setAlpha(1.0f);
                } else {
                    C7556yDt.this.f16458bX.m88600IL();
                    C7556yDt.this.f16458bX.setAlpha(0.0f);
                }
                C7556yDt c7556yDt = C7556yDt.this;
                c7556yDt.f16460zx = !c7556yDt.f16460zx;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(C7556yDt.this.f16457IL, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                C7556yDt.this.f16457IL.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16457IL, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.eqN.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: IL */
    public void m88566IL() {
        AnimatorSet animatorSet = this.eqN;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C7536eqN c7536eqN = this.f16458bX;
        if (c7536eqN != null) {
            c7536eqN.m88600IL();
        }
    }

    /* renamed from: bg */
    public void m88562bg() {
        this.eqN.start();
    }
}
