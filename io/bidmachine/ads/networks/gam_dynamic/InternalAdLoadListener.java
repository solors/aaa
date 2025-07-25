package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.d0 */
/* loaded from: classes9.dex */
interface InternalAdLoadListener<InternalAdType extends InternalAd> {
    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@NonNull InternalAdType internaladtype);
}
