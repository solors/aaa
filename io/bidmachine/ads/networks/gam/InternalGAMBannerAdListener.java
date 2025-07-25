package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam.z */
/* loaded from: classes9.dex */
interface InternalGAMBannerAdListener extends InternalGAMAdLoadListener<InternalGAMBannerAd>, InternalGAMAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // 
    /* synthetic */ void onAdLoaded(@NonNull InternalGAMBannerAd internalGAMBannerAd);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShown();
}
