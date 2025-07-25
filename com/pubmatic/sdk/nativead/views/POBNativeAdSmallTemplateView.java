package com.pubmatic.sdk.nativead.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.nativead.R$layout;

/* loaded from: classes7.dex */
public class POBNativeAdSmallTemplateView extends POBNativeTemplateView {
    public POBNativeAdSmallTemplateView(@NonNull Context context) {
        super(context, R$layout.pob_small_template);
    }

    public POBNativeAdSmallTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public POBNativeAdSmallTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public POBNativeAdSmallTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
