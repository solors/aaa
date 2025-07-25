package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface RewardedInterstitialAdShowListener extends InterstitialAdShowListener {
    void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd);

    void onRewardedVideoStarted(@NotNull MolocoAd molocoAd);

    void onUserRewarded(@NotNull MolocoAd molocoAd);
}
