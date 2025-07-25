package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.widget.C9063bg;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.PX */
/* loaded from: classes3.dex */
public class C7906PX extends C9106iR {
    public C7906PX(Context context) {
        this(context, null);
    }

    /* renamed from: bg */
    private void m87437bg(Context context) {
        setId(C9514Ta.ovC);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        C9105eqN c9105eqN = new C9105eqN(getContext());
        c9105eqN.setId(C9514Ta.f21233zU);
        c9105eqN.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c9105eqN.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        c9105eqN.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        c9105eqN.setBackgroundColor(Color.parseColor("#7f000000"));
        c9105eqN.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(c9105eqN);
        C9106iR c9106iR = new C9106iR(context);
        c9106iR.setId(C9514Ta.ews);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        c9106iR.setLayoutParams(layoutParams);
        addView(c9106iR);
        int m82537bX = ZQc.m82537bX(context, 44.0f);
        C9063bg c9063bg = new C9063bg(context);
        int i = C9514Ta.f21221qC;
        c9063bg.setId(i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m82537bX, m82537bX);
        layoutParams2.addRule(14);
        c9063bg.setLayoutParams(layoutParams2);
        c9063bg.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c9106iR.addView(c9063bg);
        C9101Kg c9101Kg = new C9101Kg(context);
        c9101Kg.setId(C9514Ta.Dxa);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(m82537bX, m82537bX);
        layoutParams3.addRule(8, i);
        layoutParams3.addRule(19, i);
        layoutParams3.addRule(5, i);
        layoutParams3.addRule(7, i);
        layoutParams3.addRule(18, i);
        layoutParams3.addRule(6, i);
        layoutParams3.addRule(14);
        c9101Kg.setLayoutParams(layoutParams3);
        c9101Kg.setBackground(C9503Kg.m82632bg(context, "tt_circle_solid_mian"));
        c9101Kg.setGravity(17);
        c9101Kg.setTextColor(-1);
        c9101Kg.setTextSize(2, 19.0f);
        c9101Kg.setTypeface(Typeface.defaultFromStyle(1));
        c9101Kg.setVisibility(8);
        c9106iR.addView(c9101Kg);
        C9101Kg c9101Kg2 = new C9101Kg(context);
        int i2 = C9514Ta.f21204bN;
        c9101Kg2.setId(i2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = ZQc.m82537bX(context, 6.0f);
        c9101Kg2.setLayoutParams(layoutParams4);
        c9101Kg2.setEllipsize(TextUtils.TruncateAt.END);
        c9101Kg2.setMaxLines(1);
        c9101Kg2.setTextColor(-1);
        c9101Kg2.setTextSize(2, 12.0f);
        c9106iR.addView(c9101Kg2);
        C9101Kg c9101Kg3 = new C9101Kg(context);
        c9101Kg3.setId(C9514Ta.f21217jz);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ZQc.m82537bX(context, 100.0f), ZQc.m82537bX(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i2);
        layoutParams5.topMargin = ZQc.m82537bX(context, 20.0f);
        c9101Kg3.setLayoutParams(layoutParams5);
        c9101Kg3.setMinWidth(ZQc.m82537bX(context, 72.0f));
        c9101Kg3.setMaxLines(1);
        c9101Kg3.setEllipsize(TextUtils.TruncateAt.END);
        c9101Kg3.setTextColor(-1);
        c9101Kg3.setTextSize(2, 14.0f);
        c9101Kg3.setBackground(C9503Kg.m82632bg(context, "tt_ad_cover_btn_begin_bg"));
        c9101Kg3.setGravity(17);
        int m82537bX2 = ZQc.m82537bX(context, 10.0f);
        int m82537bX3 = ZQc.m82537bX(context, 2.0f);
        c9101Kg3.setPadding(m82537bX2, m82537bX3, m82537bX2, m82537bX3);
        c9101Kg3.setVisibility(8);
        c9106iR.addView(c9101Kg3);
    }

    public C7906PX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7906PX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m87437bg(context);
    }
}
