package io.bidmachine.rewarded;

import androidx.annotation.NonNull;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRewardedListener;
import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface RewardedListener extends AdListener<RewardedAd>, AdFullScreenListener<RewardedAd>, AdRewardedListener<RewardedAd> {
    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdClicked(@NonNull RewardedAd rewardedAd);

    /* synthetic */ void onAdClosed(@NonNull IAd iAd, boolean z);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdExpired(@NonNull RewardedAd rewardedAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdImpression(@NonNull RewardedAd rewardedAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoadFailed(@NonNull RewardedAd rewardedAd, @NonNull BMError bMError);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoaded(@NonNull RewardedAd rewardedAd);

    /* synthetic */ void onAdRewarded(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdShowFailed(@NonNull RewardedAd rewardedAd, @NonNull BMError bMError);
}
