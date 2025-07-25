package io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.e */
/* loaded from: classes9.dex */
class C35455e extends FullScreenContentCallback {
    @NonNull

    /* renamed from: a */
    private final InternalFullscreenAdPresentListener f96180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C35455e(@NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        this.f96180a = internalFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f96180a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f96180a.onAdComplete();
        this.f96180a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.f96180a.onAdShowFailed(C35471n.m20453a(BMError.InternalUnknownError, adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f96180a.onAdShown();
    }
}
