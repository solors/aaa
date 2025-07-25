package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzboh implements zzcaf {
    final /* synthetic */ zzbnm zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcab zzc;
    final /* synthetic */ zzbok zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboh(zzbok zzbokVar, zzbnm zzbnmVar, Object obj, zzcab zzcabVar) {
        this.zza = zzbnmVar;
        this.zzb = obj;
        this.zzc = zzcabVar;
        this.zzd = zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcab zzcabVar = this.zzc;
        zzbok.zzd(this.zzd, this.zza, (zzbnt) obj, obj2, zzcabVar);
    }
}
