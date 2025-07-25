package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.common.eo */
/* loaded from: classes3.dex */
public class C8214eo extends RelativeLayout {
    public C8214eo(Context context) {
        super(context);
        m86782bg();
    }

    /* renamed from: bg */
    private void m86782bg() {
        Context context = getContext();
        int m82537bX = ZQc.m82537bX(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, ZQc.m82537bX(context, 44.0f)));
        setBackgroundColor(-1);
        C9105eqN c9105eqN = new C9105eqN(context);
        c9105eqN.setId(520093720);
        c9105eqN.setClickable(true);
        c9105eqN.setFocusable(true);
        c9105eqN.setImageDrawable(C9503Kg.m82632bg(context, "tt_leftbackicon_selector"));
        int m82537bX2 = ZQc.m82537bX(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m82537bX2, m82537bX2);
        layoutParams.leftMargin = m82537bX;
        layoutParams.addRule(15);
        addView(c9105eqN, layoutParams);
        C9105eqN c9105eqN2 = new C9105eqN(context);
        c9105eqN2.setId(520093716);
        c9105eqN2.setClickable(true);
        c9105eqN2.setFocusable(true);
        c9105eqN2.setImageDrawable(C9503Kg.m82632bg(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m82537bX2, m82537bX2);
        layoutParams2.leftMargin = m82537bX;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(c9105eqN2, layoutParams2);
        C9105eqN c9105eqN3 = new C9105eqN(context);
        int i = C9514Ta.hff;
        c9105eqN3.setId(i);
        c9105eqN3.setImageDrawable(C7730Fy.m87919bX(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(m82537bX2, m82537bX2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = m82537bX;
        addView(c9105eqN3, layoutParams3);
        C9101Kg c9101Kg = new C9101Kg(context);
        c9101Kg.setId(C9514Ta.xFs);
        c9101Kg.setSingleLine(true);
        c9101Kg.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c9101Kg.setGravity(17);
        c9101Kg.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c9101Kg.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ZQc.m82537bX(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i);
        int m82537bX3 = ZQc.m82537bX(context, 25.0f);
        layoutParams4.rightMargin = m82537bX3;
        layoutParams4.leftMargin = m82537bX3;
        addView(c9101Kg, layoutParams4);
    }
}
