package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.g0 */
/* loaded from: classes9.dex */
interface InternalInterstitialAdListener extends InternalAdLoadListener<InternalInterstitialAd>, InternalFullscreenAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    /* synthetic */ void onAdClosed();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    /* synthetic */ void onAdComplete();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    /* synthetic */ void onAdLoaded(@NonNull InternalInterstitialAd internalInterstitialAd);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShown();
}
