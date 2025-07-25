package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface InterstitialAdLoaderListener {
    void onInterstitialAdLoadFailed(@NotNull IronSourceError ironSourceError);

    void onInterstitialAdLoaded(@NotNull InterstitialAd interstitialAd);
}
