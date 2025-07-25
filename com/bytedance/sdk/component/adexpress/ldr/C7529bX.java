package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7490WR;
import com.bytedance.sdk.component.utils.C7737Ja;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.bX */
/* loaded from: classes3.dex */
public class C7529bX extends FrameLayout {

    /* renamed from: IL */
    private ImageView f16373IL;

    /* renamed from: bX */
    private ImageView f16374bX;

    /* renamed from: bg */
    private Context f16375bg;
    private TextView eqN;
    private AnimatorSet ldr;

    /* renamed from: zx */
    private C7525VzQ f16376zx;

    public C7529bX(@NonNull Context context) {
        super(context);
        this.ldr = new AnimatorSet();
        this.f16375bg = context;
        m88608zx();
        ldr();
    }

    private void ldr() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16374bX, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16374bX, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ldr.setDuration(800L);
        this.ldr.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: zx */
    private void m88608zx() {
        FrameLayout frameLayout = new FrameLayout(this.f16375bg);
        this.f16376zx = new C7525VzQ(this.f16375bg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16375bg, 95.0f), (int) C7489Kg.m88675bg(this.f16375bg, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f16376zx, layoutParams);
        this.f16373IL = new ImageView(this.f16375bg);
        int m87902bg = C7737Ja.m87902bg(this.f16375bg, 60.0f);
        this.f16373IL.setImageDrawable(C7490WR.m88673bg(1, null, null, new int[]{m87902bg, m87902bg}, Integer.valueOf(C7737Ja.m87902bg(this.f16375bg, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16375bg, 75.0f), (int) C7489Kg.m88675bg(this.f16375bg, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f16373IL, layoutParams2);
        this.f16374bX = new ImageView(this.f16375bg);
        int m87902bg2 = C7737Ja.m87902bg(this.f16375bg, 50.0f);
        this.f16374bX.setImageDrawable(C7490WR.m88673bg(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{m87902bg2, m87902bg2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(this.f16375bg, 63.0f), (int) C7489Kg.m88675bg(this.f16375bg, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f16374bX, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f16375bg);
        this.eqN = textView;
        textView.setTextColor(-1);
        this.eqN.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.eqN, layoutParams4);
    }

    /* renamed from: IL */
    public void m88611IL() {
        this.ldr.cancel();
    }

    /* renamed from: bX */
    public void m88610bX() {
        this.f16376zx.m88615bg();
    }

    /* renamed from: bg */
    public void m88609bg() {
        this.ldr.start();
    }

    public void eqN() {
        this.f16376zx.m88617IL();
        this.f16376zx.m88616bX();
    }

    public void setGuideText(String str) {
        this.eqN.setText(str);
    }
}
