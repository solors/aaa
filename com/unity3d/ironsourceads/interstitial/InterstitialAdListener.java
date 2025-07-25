package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface InterstitialAdListener {
    void onInterstitialAdClicked(@NotNull InterstitialAd interstitialAd);

    void onInterstitialAdDismissed(@NotNull InterstitialAd interstitialAd);

    void onInterstitialAdFailedToShow(@NotNull InterstitialAd interstitialAd, @NotNull IronSourceError ironSourceError);

    void onInterstitialAdShown(@NotNull InterstitialAd interstitialAd);
}
