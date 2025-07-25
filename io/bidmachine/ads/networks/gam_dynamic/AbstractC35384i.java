package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

/* compiled from: GAMBaseAdListener.java */
/* renamed from: io.bidmachine.ads.networks.gam_dynamic.i */
/* loaded from: classes9.dex */
abstract class AbstractC35384i<InternalAdType extends InternalAd, UnifiedAdCallbackType extends UnifiedAdCallback> implements InternalAdLoadListener<InternalAdType>, InternalAdPresentListener {
    @NonNull
    private final UnifiedAdCallbackType callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC35384i(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    public void onAdLoadFailed(@NonNull BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    public abstract /* synthetic */ void onAdLoaded(@NonNull InternalAdType internaladtype);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShowFailed(@NonNull BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }
}
