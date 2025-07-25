package com.bytedance.sdk.openadsdk.component.p306WR;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.widget.C9078eqN;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.component.WR.iR */
/* loaded from: classes3.dex */
public class C8256iR extends C9106iR {

    /* renamed from: IL */
    private final C9105eqN f18077IL;

    /* renamed from: bg */
    private final C9105eqN f18078bg;

    public C8256iR(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        ZQc.m82537bX(context, 12.0f);
        int m82537bX = ZQc.m82537bX(context, 16.0f);
        int m82537bX2 = ZQc.m82537bX(context, 20.0f);
        ZQc.m82537bX(context, 24.0f);
        int m82537bX3 = ZQc.m82537bX(context, 28.0f);
        C9105eqN c9105eqN = new C9105eqN(context);
        this.f18078bg = c9105eqN;
        c9105eqN.setId(520093713);
        int m82537bX4 = ZQc.m82537bX(getContext(), 5.0f);
        c9105eqN.setPadding(m82537bX4, m82537bX4, m82537bX4, m82537bX4);
        c9105eqN.setScaleType(ImageView.ScaleType.CENTER);
        c9105eqN.setBackground(C9078eqN.m83622bg());
        c9105eqN.setImageResource(C7730Fy.eqN(C8838VzQ.m84740bg(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m82537bX3, m82537bX3);
        layoutParams.topMargin = m82537bX2;
        layoutParams.leftMargin = m82537bX;
        layoutParams.setMarginStart(m82537bX);
        c9105eqN.setLayoutParams(layoutParams);
        C9105eqN c9105eqN2 = new C9105eqN(context);
        this.f18077IL = c9105eqN2;
        c9105eqN2.setId(520093714);
        c9105eqN2.setPadding(m82537bX4, m82537bX4, m82537bX4, m82537bX4);
        c9105eqN2.setScaleType(ImageView.ScaleType.CENTER);
        c9105eqN2.setBackground(C9078eqN.m83622bg());
        c9105eqN2.setImageResource(C7730Fy.eqN(C8838VzQ.m84740bg(), "tt_close_btn"));
        if (c9105eqN2.getDrawable() != null) {
            c9105eqN2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m82537bX3, m82537bX3);
        layoutParams2.topMargin = m82537bX2;
        layoutParams2.rightMargin = m82537bX;
        layoutParams2.setMarginEnd(m82537bX);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        c9105eqN2.setLayoutParams(layoutParams2);
        addView(c9105eqN);
        addView(c9105eqN2);
    }

    public View getTopDislike() {
        return this.f18078bg;
    }

    public C9105eqN getTopSkip() {
        return this.f18077IL;
    }
}
