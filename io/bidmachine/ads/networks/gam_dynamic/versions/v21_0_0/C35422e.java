package io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.e */
/* loaded from: classes9.dex */
class C35422e extends FullScreenContentCallback {
    @NonNull

    /* renamed from: a */
    private final InternalFullscreenAdPresentListener f96141a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C35422e(@NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        this.f96141a = internalFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f96141a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f96141a.onAdComplete();
        this.f96141a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.f96141a.onAdShowFailed(C35438n.m20492a(BMError.InternalUnknownError, adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f96141a.onAdShown();
    }
}
