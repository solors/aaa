package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.eqN */
/* loaded from: classes3.dex */
public class C9078eqN {
    /* renamed from: IL */
    public static Drawable m83623IL() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ZQc.m82537bX(C8838VzQ.m84740bg(), 44.0f));
        gradientDrawable.setStroke(ZQc.m82537bX(C8838VzQ.m84740bg(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    /* renamed from: bg */
    public static Drawable m83622bg() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(ZQc.m82537bX(C8838VzQ.m84740bg(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}
