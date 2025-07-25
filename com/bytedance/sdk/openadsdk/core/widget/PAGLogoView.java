package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9102WR;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* loaded from: classes3.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    private void initView(Context context) {
        ZQc.m82537bX(context, 1.0f);
        int m82537bX = ZQc.m82537bX(context, 2.0f);
        C9105eqN c9105eqN = new C9105eqN(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ZQc.m82537bX(context, 14.0f), ZQc.m82537bX(context, 6.0f));
        layoutParams.leftMargin = m82537bX;
        c9105eqN.setLayoutParams(layoutParams);
        c9105eqN.setImageDrawable(C7730Fy.m87919bX(context, "tt_ad_logo"));
        C9101Kg c9101Kg = new C9101Kg(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = m82537bX;
        layoutParams2.rightMargin = m82537bX;
        c9101Kg.setLayoutParams(layoutParams2);
        c9101Kg.setText(C7730Fy.m87917bg(context, "tt_logo_en"));
        c9101Kg.setTextSize(1, 8.0f);
        c9101Kg.setGravity(17);
        c9101Kg.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(c9105eqN);
        addView(c9101Kg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(m82537bX);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = ZQc.m82537bX(getContext(), 12.0f);
        super.setLayoutParams(C9102WR.m83538bg(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @RequiresApi(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }
}
