package io.bidmachine.ads.networks.gam.versions.v22_0_0;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam.versions.v22_0_0.b */
/* loaded from: classes9.dex */
class C35320b extends FullScreenContentCallback {
    @NonNull

    /* renamed from: a */
    private final InternalGAMFullscreenAdPresentListener f96047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C35320b(@NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        this.f96047a = internalGAMFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f96047a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f96047a.onAdComplete();
        this.f96047a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.f96047a.onAdShowFailed(new BMError(BMError.InternalUnknownError, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f96047a.onAdShown();
    }
}
