package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public abstract class CountDownView extends FrameLayout {
    public CountDownView(Context context) {
        super(context);
    }

    public abstract void setProgress(int i, int i2);

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
