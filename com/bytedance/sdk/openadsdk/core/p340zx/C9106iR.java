package com.bytedance.sdk.openadsdk.core.p340zx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.bytedance.sdk.openadsdk.core.zx.iR */
/* loaded from: classes3.dex */
public class C9106iR extends RelativeLayout {
    public C9106iR(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i) {
        super.setGravity(C9102WR.m83539bg(i));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(C9102WR.m83538bg(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public C9106iR(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
