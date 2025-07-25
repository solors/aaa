package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdnx implements zzbkg {
    private final zzcxa zza;
    @Nullable
    private final zzbwi zzb;
    private final String zzc;
    private final String zzd;

    public zzdnx(zzcxa zzcxaVar, zzfbo zzfboVar) {
        this.zza = zzcxaVar;
        this.zzb = zzfboVar.zzl;
        this.zzc = zzfboVar.zzj;
        this.zzd = zzfboVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza(zzbwi zzbwiVar) {
        int i;
        String str;
        zzbwi zzbwiVar2 = this.zzb;
        if (zzbwiVar2 != null) {
            zzbwiVar = zzbwiVar2;
        }
        if (zzbwiVar != null) {
            str = zzbwiVar.zza;
            i = zzbwiVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbvt(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzc() {
        this.zza.zzf();
    }
}
