package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.zx */
/* loaded from: classes3.dex */
public class C7917zx extends AbstractC7912eo {

    /* renamed from: Kg */
    private C9101Kg f17256Kg;

    /* renamed from: iR */
    private C9105eqN f17257iR;

    public C7917zx(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.p290Ta.AbstractC7912eo
    /* renamed from: bg */
    protected void mo87429bg(Context context) {
        int m82537bX = ZQc.m82537bX(context, 6.0f);
        setPadding(m82537bX, m82537bX, m82537bX, m82537bX);
        C9103bX m87433zx = m87433zx(context);
        this.f17254bg = m87433zx;
        m87433zx.setId(C9514Ta.f21213hi);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int m82537bX2 = ZQc.m82537bX(context, 26.0f);
        layoutParams.topMargin = m82537bX2;
        this.f17254bg.setLayoutParams(layoutParams);
        addView(this.f17254bg);
        C9105eqN c9105eqN = new C9105eqN(context);
        this.f17257iR = c9105eqN;
        c9105eqN.setId(C9514Ta.f21209eK);
        this.f17257iR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = m82537bX2;
        this.f17257iR.setLayoutParams(layoutParams2);
        addView(this.f17257iR);
        PAGLogoView m87435Kg = m87435Kg(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int m82537bX3 = ZQc.m82537bX(context, 10.0f);
        layoutParams3.leftMargin = m82537bX3;
        layoutParams3.topMargin = m82537bX3;
        layoutParams3.bottomMargin = m82537bX3;
        m87435Kg.setLayoutParams(layoutParams3);
        addView(m87435Kg);
        C9109zx c9109zx = new C9109zx(context);
        c9109zx.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        c9109zx.setOrientation(0);
        c9109zx.setGravity(17);
        addView(c9109zx);
        C9101Kg c9101Kg = new C9101Kg(context);
        this.f17256Kg = c9101Kg;
        c9101Kg.setId(C9514Ta.rgo);
        this.f17256Kg.setEllipsize(TextUtils.TruncateAt.END);
        this.f17256Kg.setMaxLines(1);
        this.f17256Kg.setTextColor(-1);
        this.f17256Kg.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.f17256Kg.setLayoutParams(layoutParams4);
        c9109zx.addView(this.f17256Kg);
    }

    public C9101Kg getTtBuDescTV() {
        return this.f17256Kg;
    }

    public C9105eqN getTtBuImg() {
        return this.f17257iR;
    }

    public C7917zx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7917zx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
