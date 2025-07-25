package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;

/* renamed from: io.bidmachine.ads.networks.gam.c */
/* loaded from: classes9.dex */
class GAMFullscreenAdListener<GAMAdType extends InternalGAMFullscreenAd> extends GAMBaseAdListener<GAMAdType, UnifiedFullscreenAdCallback> implements InternalGAMFullscreenAdPresentListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GAMFullscreenAdListener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        super(unifiedFullscreenAdCallback);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.ads.networks.gam.GAMBaseAdListener, io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener, io.bidmachine.ads.networks.gam.InternalGAMBannerAdListener
    public /* bridge */ /* synthetic */ void onAdLoaded(@NonNull InternalGAMAd internalGAMAd) {
        onAdLoaded((GAMFullscreenAdListener<GAMAdType>) ((InternalGAMFullscreenAd) internalGAMAd));
    }

    public void onAdLoaded(@NonNull GAMAdType gamadtype) {
        getCallback().onAdLoaded();
    }
}
