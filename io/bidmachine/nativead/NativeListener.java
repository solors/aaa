package io.bidmachine.nativead;

import androidx.annotation.NonNull;
import io.bidmachine.AdListener;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface NativeListener extends AdListener<NativeAd> {
    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdClicked(@NonNull NativeAd nativeAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdExpired(@NonNull NativeAd nativeAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdImpression(@NonNull NativeAd nativeAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoadFailed(@NonNull NativeAd nativeAd, @NonNull BMError bMError);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoaded(@NonNull NativeAd nativeAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdShowFailed(@NonNull NativeAd nativeAd, @NonNull BMError bMError);
}
