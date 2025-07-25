package io.bidmachine.interstitial;

import androidx.annotation.NonNull;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface InterstitialListener extends AdListener<InterstitialAd>, AdFullScreenListener<InterstitialAd> {
    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdClicked(@NonNull InterstitialAd interstitialAd);

    /* synthetic */ void onAdClosed(@NonNull IAd iAd, boolean z);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdExpired(@NonNull InterstitialAd interstitialAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdImpression(@NonNull InterstitialAd interstitialAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoadFailed(@NonNull InterstitialAd interstitialAd, @NonNull BMError bMError);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoaded(@NonNull InterstitialAd interstitialAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdShowFailed(@NonNull InterstitialAd interstitialAd, @NonNull BMError bMError);
}
