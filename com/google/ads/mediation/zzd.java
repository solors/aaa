package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@VisibleForTesting
/* loaded from: classes4.dex */
final class zzd extends FullScreenContentCallback {
    @VisibleForTesting

    /* renamed from: b */
    final AbstractAdViewAdapter f30846b;
    @VisibleForTesting

    /* renamed from: c */
    final MediationInterstitialListener f30847c;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f30846b = abstractAdViewAdapter;
        this.f30847c = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f30847c.onAdClosed(this.f30846b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f30847c.onAdOpened(this.f30846b);
    }
}
