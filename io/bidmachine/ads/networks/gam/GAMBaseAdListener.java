package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam.b */
/* loaded from: classes9.dex */
abstract class GAMBaseAdListener<GAMAdType extends InternalGAMAd, UnifiedAdCallbackType extends UnifiedAdCallback> implements InternalGAMAdLoadListener<GAMAdType>, InternalGAMAdPresentListener {
    @NonNull
    private final UnifiedAdCallbackType callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GAMBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    public void onAdLoadFailed(@NonNull BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener, io.bidmachine.ads.networks.gam.InternalGAMBannerAdListener
    public abstract /* synthetic */ void onAdLoaded(@NonNull GAMAdType gamadtype);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShowFailed(@NonNull BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }
}
