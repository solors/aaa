package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.common.Kg */
/* loaded from: classes3.dex */
public class C8187Kg extends LinearLayout {
    public C8187Kg(Context context) {
        super(context);
        m86849bg();
    }

    /* renamed from: bg */
    private static ImageView m86848bg(Context context, float f, float f2, float f3, float f4) {
        C9105eqN c9105eqN = new C9105eqN(context);
        c9105eqN.setClickable(true);
        c9105eqN.setFocusable(true);
        c9105eqN.setPadding(ZQc.m82537bX(context, f3), ZQc.m82537bX(context, f4), ZQc.m82537bX(context, f3), ZQc.m82537bX(context, f4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ZQc.m82537bX(context, 40.0f), ZQc.m82537bX(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = ZQc.m82537bX(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = ZQc.m82537bX(context, f2);
        }
        c9105eqN.setLayoutParams(layoutParams);
        return c9105eqN;
    }

    /* renamed from: bg */
    private void m86849bg() {
        Context context = getContext();
        setId(C9514Ta.bOf);
        setLayoutParams(new ViewGroup.LayoutParams(-1, ZQc.m82537bX(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, ZQc.m82537bX(context, 0.5f)));
        C9109zx c9109zx = new C9109zx(context);
        c9109zx.setOrientation(0);
        addView(c9109zx, new LinearLayout.LayoutParams(-1, ZQc.m82537bX(context, 44.0f)));
        ImageView m86848bg = m86848bg(context, 16.0f, 0.0f, 14.75f, 12.5f);
        m86848bg.setId(C9514Ta.f21218kU);
        m86848bg.setImageResource(C7730Fy.eqN(context, "tt_ad_arrow_backward"));
        c9109zx.addView(m86848bg);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        c9109zx.addView(view2, layoutParams);
        ImageView m86848bg2 = m86848bg(context, 8.0f, 0.0f, 14.75f, 12.5f);
        m86848bg2.setId(C9514Ta.f21222qp);
        m86848bg2.setImageResource(C7730Fy.eqN(context, "tt_ad_arrow_forward"));
        c9109zx.addView(m86848bg2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        c9109zx.addView(view3, layoutParams2);
        ImageView m86848bg3 = m86848bg(context, 8.0f, 0.0f, 10.0f, 12.0f);
        m86848bg3.setId(C9514Ta.eDa);
        m86848bg3.setImageResource(C7730Fy.eqN(context, "tt_ad_refresh"));
        c9109zx.addView(m86848bg3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        c9109zx.addView(view4, layoutParams3);
        ImageView m86848bg4 = m86848bg(context, 0.0f, 16.0f, 9.0f, 11.0f);
        m86848bg4.setId(C9514Ta.RFq);
        m86848bg4.setImageResource(C7730Fy.eqN(context, "tt_ad_link"));
        c9109zx.addView(m86848bg4);
    }
}
