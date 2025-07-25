package com.five_corp.p372ad;

import androidx.annotation.NonNull;

/* renamed from: com.five_corp.ad.FiveAdInterstitialEventListener */
/* loaded from: classes4.dex */
public interface FiveAdInterstitialEventListener {
    void onViewError(@NonNull FiveAdInterstitial fiveAdInterstitial, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onClick(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onFullScreenClose(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onFullScreenOpen(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onImpression(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onPause(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onPlay(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onViewThrough(@NonNull FiveAdInterstitial fiveAdInterstitial) {
    }
}
