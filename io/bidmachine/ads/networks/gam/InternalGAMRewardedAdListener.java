package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam.c0 */
/* loaded from: classes9.dex */
interface InternalGAMRewardedAdListener extends InternalGAMAdLoadListener<InternalGAMRewardedAd>, InternalGAMFullscreenAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    /* synthetic */ void onAdClosed();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    /* synthetic */ void onAdComplete();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener, io.bidmachine.ads.networks.gam.InternalGAMBannerAdListener
    /* synthetic */ void onAdLoaded(@NonNull InternalGAMRewardedAd internalGAMRewardedAd);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShown();
}
