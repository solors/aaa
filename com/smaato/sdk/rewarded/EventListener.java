package com.smaato.sdk.rewarded;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface EventListener {
    void onAdClicked(@NonNull RewardedInterstitialAd rewardedInterstitialAd);

    void onAdClosed(@NonNull RewardedInterstitialAd rewardedInterstitialAd);

    void onAdError(@NonNull RewardedInterstitialAd rewardedInterstitialAd, @NonNull RewardedError rewardedError);

    void onAdFailedToLoad(@NonNull RewardedRequestError rewardedRequestError);

    void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd);

    void onAdReward(@NonNull RewardedInterstitialAd rewardedInterstitialAd);

    void onAdStarted(@NonNull RewardedInterstitialAd rewardedInterstitialAd);

    void onAdTTLExpired(@NonNull RewardedInterstitialAd rewardedInterstitialAd);
}
