package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.nativead.NativeNetworkAdapter;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface UnifiedNativeAdCallback extends UnifiedAdCallback {
    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@NonNull NativeNetworkAdapter nativeNetworkAdapter);

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdShown();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
