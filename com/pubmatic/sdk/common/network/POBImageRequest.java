package com.pubmatic.sdk.common.network;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBImageRequest extends POBHttpRequest {

    /* renamed from: i */
    private int f70199i;

    /* renamed from: j */
    private int f70200j;
    @Nullable

    /* renamed from: k */
    private ImageView.ScaleType f70201k;
    @Nullable

    /* renamed from: l */
    private Bitmap.Config f70202l;

    @Nullable
    public Bitmap.Config getDecodeConfig() {
        return this.f70202l;
    }

    public int getMaxHeight() {
        return this.f70200j;
    }

    public int getMaxWidth() {
        return this.f70199i;
    }

    @Nullable
    public ImageView.ScaleType getScaleType() {
        return this.f70201k;
    }

    public void setDecodeConfig(@Nullable Bitmap.Config config) {
        this.f70202l = config;
    }

    public void setMaxHeight(int i) {
        this.f70200j = i;
    }

    public void setMaxWidth(int i) {
        this.f70199i = i;
    }

    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
        this.f70201k = scaleType;
    }
}
