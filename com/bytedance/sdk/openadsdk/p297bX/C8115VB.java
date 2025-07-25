package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.bX.VB */
/* loaded from: classes3.dex */
public class C8115VB extends View {

    /* renamed from: bg */
    private final int f17770bg;

    public C8115VB(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.f17770bg);
    }

    public C8115VB(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.f17770bg = ZQc.m82537bX(getContext(), 0.66f);
    }
}
