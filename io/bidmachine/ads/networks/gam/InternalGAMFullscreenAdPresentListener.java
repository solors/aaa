package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface InternalGAMFullscreenAdPresentListener extends InternalGAMAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdClicked();

    void onAdClosed();

    void onAdComplete();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShown();
}
