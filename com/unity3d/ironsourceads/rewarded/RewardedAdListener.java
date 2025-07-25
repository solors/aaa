package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface RewardedAdListener {
    void onRewardedAdClicked(@NotNull RewardedAd rewardedAd);

    void onRewardedAdDismissed(@NotNull RewardedAd rewardedAd);

    void onRewardedAdFailedToShow(@NotNull RewardedAd rewardedAd, @NotNull IronSourceError ironSourceError);

    void onRewardedAdShown(@NotNull RewardedAd rewardedAd);

    void onUserEarnedReward(@NotNull RewardedAd rewardedAd);
}
