package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9107ldr;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.common.WR */
/* loaded from: classes3.dex */
public class C8205WR extends RelativeLayout {
    public C8205WR(Context context) {
        super(context);
        m86809bg();
    }

    /* renamed from: bg */
    private void m86809bg() {
        setId(C9514Ta.f21203Ys);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, ZQc.m82537bX(context, 44.0f)));
        C9105eqN c9105eqN = new C9105eqN(context);
        int i = C9514Ta.f21208dS;
        c9105eqN.setId(i);
        c9105eqN.setClickable(true);
        c9105eqN.setFocusable(true);
        c9105eqN.setPadding(ZQc.m82537bX(context, 12.0f), ZQc.m82537bX(context, 14.0f), ZQc.m82537bX(context, 12.0f), ZQc.m82537bX(context, 14.0f));
        c9105eqN.setImageResource(C7730Fy.eqN(context, "tt_ad_xmark"));
        addView(c9105eqN, new RelativeLayout.LayoutParams(ZQc.m82537bX(context, 40.0f), ZQc.m82537bX(context, 44.0f)));
        C9105eqN c9105eqN2 = new C9105eqN(context);
        int i2 = C9514Ta.f21173Dt;
        c9105eqN2.setId(i2);
        c9105eqN2.setPadding(ZQc.m82537bX(context, 8.0f), ZQc.m82537bX(context, 10.0f), ZQc.m82537bX(context, 8.0f), ZQc.m82537bX(context, 10.0f));
        c9105eqN2.setImageResource(C7730Fy.eqN(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ZQc.m82537bX(context, 40.0f), ZQc.m82537bX(context, 44.0f));
        layoutParams.addRule(11);
        addView(c9105eqN2, layoutParams);
        C9101Kg c9101Kg = new C9101Kg(context);
        c9101Kg.setId(C9514Ta.RiO);
        c9101Kg.setSingleLine(true);
        c9101Kg.setEllipsize(TextUtils.TruncateAt.END);
        c9101Kg.setGravity(17);
        c9101Kg.setTextColor(Color.parseColor("#222222"));
        c9101Kg.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ZQc.m82537bX(context, 191.0f), ZQc.m82537bX(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i2);
        layoutParams2.addRule(1, i);
        int m82537bX = ZQc.m82537bX(context, 10.0f);
        layoutParams2.leftMargin = m82537bX;
        layoutParams2.rightMargin = m82537bX;
        addView(c9101Kg, layoutParams2);
        C9107ldr c9107ldr = new C9107ldr(context, null, 16973855);
        c9107ldr.setId(C9514Ta.f21190Ny);
        c9107ldr.setProgress(1);
        c9107ldr.setProgressDrawable(C9503Kg.m82632bg(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, ZQc.m82537bX(context, 2.0f));
        layoutParams3.addRule(12);
        addView(c9107ldr, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, ZQc.m82537bX(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
