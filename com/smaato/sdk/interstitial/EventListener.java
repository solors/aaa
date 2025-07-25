package com.smaato.sdk.interstitial;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface EventListener {
    void onAdClicked(@NonNull InterstitialAd interstitialAd);

    void onAdClosed(@NonNull InterstitialAd interstitialAd);

    void onAdError(@NonNull InterstitialAd interstitialAd, @NonNull InterstitialError interstitialError);

    void onAdFailedToLoad(@NonNull InterstitialRequestError interstitialRequestError);

    void onAdImpression(@NonNull InterstitialAd interstitialAd);

    void onAdLoaded(@NonNull InterstitialAd interstitialAd);

    void onAdOpened(@NonNull InterstitialAd interstitialAd);

    void onAdTTLExpired(@NonNull InterstitialAd interstitialAd);
}
