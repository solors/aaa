package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzdxp implements zzgcd {
    final /* synthetic */ Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxp(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        if (((Boolean) zzbed.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbbv.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdyi zzdyiVar = (zzdyi) obj;
        if (((Boolean) zzbed.zzj.zze()).booleanValue()) {
            zzbbv.zze(this.zza);
        }
    }
}
