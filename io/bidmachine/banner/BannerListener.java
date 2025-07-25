package io.bidmachine.banner;

import androidx.annotation.NonNull;
import io.bidmachine.AdListener;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface BannerListener extends AdListener<BannerView> {
    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdClicked(@NonNull BannerView bannerView);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdExpired(@NonNull BannerView bannerView);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdImpression(@NonNull BannerView bannerView);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoadFailed(@NonNull BannerView bannerView, @NonNull BMError bMError);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoaded(@NonNull BannerView bannerView);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdShowFailed(@NonNull BannerView bannerView, @NonNull BMError bMError);
}
