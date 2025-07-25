package com.pubmatic.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.nativead.response.POBNativeAdDataResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdImageResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdTitleResponseAsset;
import com.pubmatic.sdk.nativead.views.POBNativeTemplateView;
import java.util.List;

/* loaded from: classes7.dex */
public interface POBNativeAd {
    void destroy();

    @Nullable
    POBNativeAdView getAdView();

    @Nullable
    POBNativeAdDataResponseAsset getDataAssetForId(int i);

    @Nullable
    POBNativeAdImageResponseAsset getImageAssetForId(int i);

    @Nullable
    POBNativeAdTitleResponseAsset getTitleAssetForId(int i);

    void registerViewForInteraction(@NonNull View view, @NonNull List<View> list, @NonNull POBNativeAdListener pOBNativeAdListener);

    void renderAd(@NonNull POBNativeAdListener pOBNativeAdListener);

    void renderAd(@NonNull POBNativeTemplateView pOBNativeTemplateView, @NonNull POBNativeAdListener pOBNativeAdListener);
}
