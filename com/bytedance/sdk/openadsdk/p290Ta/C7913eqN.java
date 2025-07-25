package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.core.widget.C9057VzQ;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.eqN */
/* loaded from: classes3.dex */
public class C7913eqN extends AbstractC7912eo {
    public C7913eqN(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.p290Ta.AbstractC7912eo
    /* renamed from: bg */
    protected void mo87429bg(Context context) {
        int m82537bX = ZQc.m82537bX(context, 10.0f);
        C9109zx c9109zx = new C9109zx(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        c9109zx.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        c9109zx.setOrientation(1);
        c9109zx.setPadding(m82537bX, m82537bX, m82537bX, m82537bX);
        addView(c9109zx);
        C9103bX c9103bX = new C9103bX(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        c9103bX.setLayoutParams(layoutParams2);
        c9109zx.addView(c9103bX);
        C9103bX m87433zx = m87433zx(context);
        this.f17254bg = m87433zx;
        m87433zx.setId(C9514Ta.f21213hi);
        this.f17254bg.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c9103bX.addView(this.f17254bg);
        C9105eqN ldr = ldr(context);
        this.f17252IL = ldr;
        ldr.setId(C9514Ta.HXG);
        this.f17252IL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c9103bX.addView(this.f17252IL);
        PAGLogoView m87435Kg = m87435Kg(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = m82537bX;
        layoutParams3.topMargin = m82537bX;
        layoutParams3.bottomMargin = m82537bX;
        m87435Kg.setLayoutParams(layoutParams3);
        c9103bX.addView(m87435Kg);
        C9106iR c9106iR = new C9106iR(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        c9106iR.setLayoutParams(layoutParams4);
        c9109zx.addView(c9106iR);
        C9057VzQ m87434iR = m87434iR(context);
        this.f17253bX = m87434iR;
        int i = C9514Ta.ZTq;
        m87434iR.setId(i);
        int m82537bX2 = ZQc.m82537bX(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(m82537bX2, m82537bX2);
        layoutParams5.addRule(15);
        this.f17253bX.setLayoutParams(layoutParams5);
        c9106iR.addView(this.f17253bX);
        C9101Kg mo87432IL = mo87432IL(context);
        this.eqN = mo87432IL;
        mo87432IL.setId(C9514Ta.IEI);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = m82537bX;
        layoutParams6.setMarginStart(m82537bX);
        layoutParams6.addRule(1, i);
        layoutParams6.addRule(17, i);
        this.eqN.setLayoutParams(layoutParams6);
        c9106iR.addView(this.eqN);
        C9101Kg eqN = eqN(context);
        this.ldr = eqN;
        eqN.setId(C9514Ta.gCm);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(ZQc.m82537bX(context, 100.0f), ZQc.m82537bX(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.ldr.setLayoutParams(layoutParams7);
        c9106iR.addView(this.ldr);
    }

    public C7913eqN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7913eqN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
