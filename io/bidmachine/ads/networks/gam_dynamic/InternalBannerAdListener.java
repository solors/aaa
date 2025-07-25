package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.e0 */
/* loaded from: classes9.dex */
interface InternalBannerAdListener extends InternalAdLoadListener<InternalBannerAd>, InternalAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    /* synthetic */ void onAdLoaded(@NonNull InternalBannerAd internalBannerAd);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShown();
}
