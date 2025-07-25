package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.utils.C7730Fy;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.zx */
/* loaded from: classes3.dex */
public class C7559zx extends FrameLayout {

    /* renamed from: IL */
    private AnimatorSet f16463IL;

    /* renamed from: bg */
    private ImageView f16464bg;

    public C7559zx(Context context) {
        super(context);
        m88558bX();
        eqN();
    }

    /* renamed from: bX */
    private void m88558bX() {
        ImageView imageView = new ImageView(getContext());
        this.f16464bg = imageView;
        imageView.setImageResource(C7730Fy.eqN(getContext(), "tt_white_hand"));
        int m88675bg = (int) C7489Kg.m88675bg(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m88675bg, m88675bg);
        layoutParams.gravity = 17;
        addView(this.f16464bg, layoutParams);
    }

    private void eqN() {
        this.f16463IL = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16464bg, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16464bg, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f16463IL.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: IL */
    public void m88559IL() {
        AnimatorSet animatorSet = this.f16463IL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: bg */
    public void m88557bg() {
        AnimatorSet animatorSet = this.f16463IL;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
