package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes8.dex */
class NonScrollImageView extends AppCompatImageView {
    public NonScrollImageView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }

    public NonScrollImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
