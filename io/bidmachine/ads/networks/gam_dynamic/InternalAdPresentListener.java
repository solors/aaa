package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface InternalAdPresentListener {
    void onAdClicked();

    void onAdExpired();

    void onAdShowFailed(@NonNull BMError bMError);

    void onAdShown();
}
