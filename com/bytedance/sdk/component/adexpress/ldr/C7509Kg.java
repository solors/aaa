package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p242bX.C7300bg;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.Kg */
/* loaded from: classes3.dex */
public class C7509Kg extends C7541rri {

    /* renamed from: IL */
    private ImageView f16312IL;

    /* renamed from: bX */
    private ImageView f16313bX;

    /* renamed from: bg */
    private TextView f16314bg;
    private ImageView eqN;
    private AnimatorSet ldr;

    /* renamed from: zx */
    private int f16315zx;

    public C7509Kg(Context context) {
        super(context);
        this.ldr = new AnimatorSet();
        m88642IL(context);
    }

    /* renamed from: IL */
    private void m88642IL(Context context) {
        addView(C7300bg.m89249IL(context));
        this.f16312IL = (ImageView) findViewById(2097610751);
        this.f16313bX = (ImageView) findViewById(2097610750);
        this.eqN = (ImageView) findViewById(2097610749);
        this.f16314bg = (TextView) findViewById(2097610748);
    }

    private void eqN() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.C7541rri
    /* renamed from: bg */
    protected void mo88586bg(Context context) {
    }

    public float getAlphaColor() {
        return this.f16315zx;
    }

    public void setAlphaColor(int i) {
        if (i >= 0 && i <= 60) {
            int i2 = i + 195;
            this.eqN.setColorFilter(Color.rgb(i2, i2, i2), PorterDuff.Mode.SRC_IN);
            int i3 = ((i + 20) % 60) + 195;
            this.f16313bX.setColorFilter(Color.rgb(i3, i3, i3), PorterDuff.Mode.SRC_IN);
            int i4 = ((i + 40) % 60) + 195;
            this.f16312IL.setColorFilter(Color.rgb(i4, i4, i4), PorterDuff.Mode.SRC_IN);
        }
    }

    public void setButtonText(String str) {
        if (this.f16314bg != null && !TextUtils.isEmpty(str)) {
            this.f16314bg.setText(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.C7541rri
    /* renamed from: bg */
    public void mo88587bg() {
        eqN();
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.C7541rri
    /* renamed from: IL */
    public void mo88590IL() {
        this.ldr.cancel();
    }
}
