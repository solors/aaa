package com.pubmatic.sdk.nativead.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.nativead.R$layout;

/* loaded from: classes7.dex */
public class POBNativeAdMediumTemplateView extends POBNativeTemplateView {
    public POBNativeAdMediumTemplateView(@NonNull Context context) {
        super(context, R$layout.pob_medium_template);
    }

    @Override // com.pubmatic.sdk.nativead.views.POBNativeTemplateView
    @Nullable
    public ImageView getMainImage() {
        return this.mainImage;
    }

    @Override // com.pubmatic.sdk.nativead.views.POBNativeTemplateView
    public void setMainImage(@Nullable ImageView imageView) {
        this.mainImage = imageView;
    }

    public POBNativeAdMediumTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public POBNativeAdMediumTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public POBNativeAdMediumTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
