package com.yandex.mobile.ads.interstitial;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InterstitialAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(@NotNull AdError adError);

    void onAdImpression(@Nullable ImpressionData impressionData);

    void onAdShown();
}
