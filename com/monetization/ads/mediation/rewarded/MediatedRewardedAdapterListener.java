package com.monetization.ads.mediation.rewarded;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedRewardedAdapterListener {
    void onAdImpression();

    void onRewarded(@Nullable MediatedReward mediatedReward);

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError);

    void onRewardedAdLeftApplication();

    void onRewardedAdLoaded();

    void onRewardedAdShown();
}
