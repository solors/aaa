package com.monetization.ads.mediation.nativeads;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedNativeAdapterListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdOpened();

    void onAppInstallAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd);

    void onContentAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd);
}
