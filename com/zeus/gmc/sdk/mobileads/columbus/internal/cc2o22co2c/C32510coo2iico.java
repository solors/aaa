package com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.coo2iico */
/* loaded from: classes8.dex */
public class C32510coo2iico extends TextureView {
    private int coi222o222;
    private int coo2iico;

    public C32510coo2iico(Context context) {
        super(context);
    }

    public void coo2iico(int i, int i2) {
        if (this.coi222o222 != i || this.coo2iico != i2) {
            this.coi222o222 = i;
            this.coo2iico = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }

    public C32510coo2iico(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
