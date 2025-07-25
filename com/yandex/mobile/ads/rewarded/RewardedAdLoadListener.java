package com.yandex.mobile.ads.rewarded;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface RewardedAdLoadListener {
    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded(@NotNull RewardedAd rewardedAd);
}
