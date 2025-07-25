package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface InternalLoadListener {
    void onAdLoadFailed(@NonNull InternalAd internalAd, @NonNull BMError bMError);

    void onAdLoaded(@NonNull InternalAd internalAd, @Nullable InternalAdLoadData internalAdLoadData);
}
