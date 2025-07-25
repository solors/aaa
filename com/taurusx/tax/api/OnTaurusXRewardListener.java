package com.taurusx.tax.api;

import com.taurusx.tax.api.TaurusXRewardedAds;

/* loaded from: classes7.dex */
public interface OnTaurusXRewardListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShowFailed(TaurusXAdError taurusXAdError);

    void onAdShown();

    void onRewardFailed();

    void onRewarded(TaurusXRewardedAds.RewardItem rewardItem);

    void onVideoCompleted();

    void onVideoStart();
}
