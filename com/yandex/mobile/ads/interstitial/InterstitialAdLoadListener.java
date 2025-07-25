package com.yandex.mobile.ads.interstitial;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InterstitialAdLoadListener {
    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded(@NotNull InterstitialAd interstitialAd);
}
