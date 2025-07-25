package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzciy implements zzdth {
    private final Context zza;
    private final zzbko zzb;
    private final zzcih zzc;
    private final zzciy zzd = this;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzciy(zzcih zzcihVar, Context context, zzbko zzbkoVar, zzcjm zzcjmVar) {
        this.zzc = zzcihVar;
        this.zza = context;
        this.zzb = zzbkoVar;
        zzher zza = zzhes.zza(this);
        this.zze = zza;
        zzher zza2 = zzhes.zza(zzbkoVar);
        this.zzf = zza2;
        zzdtd zzdtdVar = new zzdtd(zza2);
        this.zzg = zzdtdVar;
        this.zzh = zzheq.zzc(new zzdtf(zza, zzdtdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public final zzdsy zzb() {
        return new zzciv(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public final zzdte zzd() {
        return (zzdte) this.zzh.zzb();
    }
}
