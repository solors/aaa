package io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.e */
/* loaded from: classes9.dex */
class C35488e extends FullScreenContentCallback {
    @NonNull

    /* renamed from: a */
    private final InternalFullscreenAdPresentListener f96219a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C35488e(@NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        this.f96219a = internalFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f96219a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f96219a.onAdComplete();
        this.f96219a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.f96219a.onAdShowFailed(C35504n.m20414a(BMError.InternalUnknownError, adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f96219a.onAdShown();
    }
}
