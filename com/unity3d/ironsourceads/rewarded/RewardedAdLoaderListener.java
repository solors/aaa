package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface RewardedAdLoaderListener {
    void onRewardedAdLoadFailed(@NotNull IronSourceError ironSourceError);

    void onRewardedAdLoaded(@NotNull RewardedAd rewardedAd);
}
