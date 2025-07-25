package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface InternalAdListener {
    void onAdDestroyed(@NonNull InternalAd internalAd, boolean z);

    void onAdExpired(@NonNull InternalAd internalAd);

    void onAdShown(@NonNull InternalAd internalAd);

    void onPaidEvent(@NonNull InternalAd internalAd);
}
