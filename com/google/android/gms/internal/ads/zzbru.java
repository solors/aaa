package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbru implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ zzbrw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbru(zzbrw zzbrwVar) {
        this.zza = zzbrwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.zza;
        mediationInterstitialListener = zzbrwVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.zza;
        mediationInterstitialListener = zzbrwVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }
}
