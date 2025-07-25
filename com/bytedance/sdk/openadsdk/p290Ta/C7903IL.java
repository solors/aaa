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

/* renamed from: com.bytedance.sdk.openadsdk.Ta.IL */
/* loaded from: classes3.dex */
public class C7903IL extends AbstractC7912eo {
    public C7903IL(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.p290Ta.AbstractC7912eo
    /* renamed from: IL */
    public C9101Kg mo87432IL(Context context) {
        C9101Kg mo87432IL = super.mo87432IL(context);
        mo87432IL.setTextColor(-1);
        mo87432IL.setTextSize(2, 13.0f);
        mo87432IL.setText("Pangle");
        return mo87432IL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.p290Ta.AbstractC7912eo
    /* renamed from: bX */
    public C9101Kg mo87431bX(Context context) {
        C9101Kg mo87431bX = super.mo87431bX(context);
        mo87431bX.setTextColor(-1);
        return mo87431bX;
    }

    @Override // com.bytedance.sdk.openadsdk.p290Ta.AbstractC7912eo
    /* renamed from: bg */
    protected void mo87429bg(Context context) {
        C9109zx c9109zx = new C9109zx(context);
        c9109zx.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c9109zx.setOrientation(1);
        addView(c9109zx);
        C9103bX c9103bX = new C9103bX(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        c9103bX.setLayoutParams(layoutParams);
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
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int m82537bX = ZQc.m82537bX(context, 10.0f);
        layoutParams2.leftMargin = m82537bX;
        layoutParams2.topMargin = m82537bX;
        layoutParams2.bottomMargin = m82537bX;
        m87435Kg.setLayoutParams(layoutParams2);
        c9103bX.addView(m87435Kg);
        C9109zx c9109zx2 = new C9109zx(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        c9109zx2.setLayoutParams(layoutParams3);
        c9109zx2.setOrientation(1);
        c9109zx2.setGravity(81);
        int m82537bX2 = ZQc.m82537bX(context, 16.0f);
        c9109zx2.setPadding(m82537bX2, m82537bX2, m82537bX2, m82537bX2);
        c9109zx.addView(c9109zx2);
        C9106iR c9106iR = new C9106iR(context);
        c9106iR.setId(C9514Ta.f21223rr);
        c9106iR.setLayoutParams(new LinearLayout.LayoutParams(-2, ZQc.m82537bX(context, 40.0f)));
        c9106iR.setGravity(17);
        c9109zx2.addView(c9106iR);
        C9057VzQ m87434iR = m87434iR(context);
        this.f17253bX = m87434iR;
        m87434iR.setId(C9514Ta.ZTq);
        int m82537bX3 = ZQc.m82537bX(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(m82537bX3, m82537bX3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.f17253bX.setLayoutParams(layoutParams4);
        c9106iR.addView(this.f17253bX);
        C9101Kg mo87432IL = mo87432IL(context);
        this.eqN = mo87432IL;
        mo87432IL.setId(C9514Ta.IEI);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, m82537bX * 2);
        int m82537bX4 = ZQc.m82537bX(context, 6.0f);
        layoutParams5.leftMargin = m82537bX4;
        layoutParams5.setMarginStart(m82537bX4);
        layoutParams5.addRule(1, this.f17253bX.getId());
        layoutParams5.addRule(17, this.f17253bX.getId());
        this.eqN.setLayoutParams(layoutParams5);
        c9106iR.addView(this.eqN);
        C9101Kg mo87431bX = mo87431bX(context);
        this.f17255zx = mo87431bX;
        mo87431bX.setId(C9514Ta.f21207bu);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, ZQc.m82537bX(context, 20.0f));
        layoutParams6.addRule(3, this.eqN.getId());
        layoutParams6.addRule(8, this.f17253bX.getId());
        layoutParams6.addRule(17, this.f17253bX.getId());
        layoutParams6.addRule(1, this.f17253bX.getId());
        layoutParams6.leftMargin = m82537bX4;
        layoutParams6.setMarginStart(m82537bX4);
        this.f17255zx.setLayoutParams(layoutParams6);
        c9106iR.addView(this.f17255zx);
        C9101Kg eqN = eqN(context);
        this.ldr = eqN;
        eqN.setId(C9514Ta.gCm);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ZQc.m82537bX(context, 22.0f));
        layoutParams7.topMargin = m82537bX2;
        this.ldr.setLayoutParams(layoutParams7);
        c9109zx2.addView(this.ldr);
    }

    public C7903IL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7903IL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
