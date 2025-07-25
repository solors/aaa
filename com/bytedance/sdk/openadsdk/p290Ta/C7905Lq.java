package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.Lq */
/* loaded from: classes3.dex */
public class C7905Lq extends C9106iR {
    public C7905Lq(Context context) {
        this(context, null);
    }

    /* renamed from: bg */
    private void m87438bg(Context context) {
        setId(C9514Ta.aMs);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        C9101Kg c9101Kg = new C9101Kg(context);
        int i = C9514Ta.f21180IE;
        c9101Kg.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        c9101Kg.setLayoutParams(layoutParams);
        c9101Kg.setIncludeFontPadding(false);
        c9101Kg.setText(C7730Fy.m87917bg(context, "tt_video_without_wifi_tips"));
        c9101Kg.setTextColor(Color.parseColor("#cacaca"));
        c9101Kg.setTextSize(2, 14.0f);
        addView(c9101Kg);
        C9106iR c9106iR = new C9106iR(context);
        c9106iR.setId(C9514Ta.f21201Vm);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i);
        layoutParams2.addRule(13);
        c9106iR.setLayoutParams(layoutParams2);
        addView(c9106iR);
        C9105eqN c9105eqN = new C9105eqN(context);
        c9105eqN.setId(C9514Ta.IGR);
        int m82537bX = ZQc.m82537bX(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(m82537bX, m82537bX);
        layoutParams3.addRule(15);
        c9105eqN.setLayoutParams(layoutParams3);
        c9105eqN.setImageDrawable(C7730Fy.m87919bX(context, "tt_new_play_video"));
        c9105eqN.setScaleType(ImageView.ScaleType.FIT_XY);
        c9106iR.addView(c9105eqN);
    }

    public C7905Lq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7905Lq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m87438bg(context);
    }
}
