package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface InternalLoadListener {
    void onAdLoadFailed(@NonNull InternalGAMAd internalGAMAd, @NonNull BMError bMError);

    void onAdLoaded(@NonNull InternalGAMAd internalGAMAd);
}
