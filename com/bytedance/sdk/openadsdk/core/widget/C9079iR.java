package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.iR */
/* loaded from: classes3.dex */
public class C9079iR extends C9105eqN {

    /* renamed from: IL */
    private int f20267IL;

    /* renamed from: bg */
    private float f20268bg;

    public C9079iR(Context context) {
        super(context);
        this.f20268bg = 2.25f;
        this.f20267IL = 12;
        m83620bg();
    }

    /* renamed from: IL */
    public static C9105eqN m83621IL(Context context) {
        return new C9079iR(context, 28, 5.0f);
    }

    /* renamed from: bg */
    private void m83620bg() {
        setBackground(C9078eqN.m83622bg());
        setImageResource(C7730Fy.eqN(getContext(), "tt_close_btn"));
        int m82537bX = ZQc.m82537bX(getContext(), this.f20268bg);
        setPadding(m82537bX, m82537bX, m82537bX, m82537bX);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int m82537bX = ZQc.m82537bX(getContext(), this.f20267IL);
            layoutParams.width = m82537bX;
            layoutParams.height = m82537bX;
        }
        super.setLayoutParams(layoutParams);
    }

    public C9079iR(Context context, int i, float f) {
        super(context);
        this.f20268bg = f;
        this.f20267IL = i;
        m83620bg();
    }

    /* renamed from: bg */
    public static C9105eqN m83619bg(Context context) {
        return new C9079iR(context);
    }
}
