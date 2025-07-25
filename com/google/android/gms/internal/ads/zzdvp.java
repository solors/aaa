package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdvp extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdvs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvp(zzdvs zzdvsVar, String str) {
        this.zza = str;
        this.zzb = zzdvsVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdvs zzdvsVar = this.zzb;
        zzl = zzdvs.zzl(loadAdError);
        zzdvsVar.zzm(zzl, this.zza);
    }
}
