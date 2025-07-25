package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.p242bX.C7300bg;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.iR */
/* loaded from: classes3.dex */
public class C7537iR extends C7541rri {

    /* renamed from: IL */
    private View f16409IL;

    /* renamed from: bX */
    private AnimatorSet f16410bX;

    /* renamed from: bg */
    private TextView f16411bg;

    public C7537iR(Context context) {
        super(context);
        this.f16410bX = new AnimatorSet();
        m88597IL(context);
    }

    /* renamed from: IL */
    private void m88597IL(Context context) {
        View m89245bg = C7300bg.m89245bg(context);
        this.f16409IL = m89245bg;
        addView(m89245bg);
        setClipChildren(false);
        this.f16411bg = (TextView) findViewById(2097610748);
    }

    private void eqN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16409IL, "translationY", 0.0f, C7489Kg.m88675bg(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16409IL, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.f16410bX.playTogether(ofFloat, ofFloat2);
        this.f16410bX.setDuration(1000L);
        this.f16410bX.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.C7541rri
    /* renamed from: bg */
    protected void mo88586bg(Context context) {
    }

    public void setButtonText(String str) {
        if (this.f16411bg != null && !TextUtils.isEmpty(str)) {
            this.f16411bg.setText(str);
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
        this.f16410bX.cancel();
    }
}
