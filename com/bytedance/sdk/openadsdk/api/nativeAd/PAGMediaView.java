package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class PAGMediaView extends FrameLayout {

    /* renamed from: bg */
    protected Integer f17742bg;

    public PAGMediaView(@NonNull Context context) {
        super(context);
    }

    public void setMrcTrackerKey(Integer num) {
        this.f17742bg = num;
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void close() {
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }
}
