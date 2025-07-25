package com.bytedance.sdk.openadsdk.core.p340zx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.bytedance.sdk.openadsdk.core.zx.eqN */
/* loaded from: classes3.dex */
public class C9105eqN extends ImageView {
    public C9105eqN(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(C9102WR.m83538bg(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public C9105eqN(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9105eqN(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
