package io.bidmachine.ads.networks.gam.versions.v23_0_0;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam.versions.v23_0_0.b */
/* loaded from: classes9.dex */
class C35340b extends FullScreenContentCallback {
    @NonNull

    /* renamed from: a */
    private final InternalGAMFullscreenAdPresentListener f96066a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C35340b(@NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        this.f96066a = internalGAMFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f96066a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f96066a.onAdComplete();
        this.f96066a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.f96066a.onAdShowFailed(new BMError(BMError.InternalUnknownError, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f96066a.onAdShown();
    }
}
