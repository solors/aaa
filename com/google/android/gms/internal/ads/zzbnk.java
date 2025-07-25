package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbnk implements zzcaf {
    final /* synthetic */ zzbnm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnk(zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnr zzbnrVar;
        zzbnt zzbntVar = (zzbnt) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbnrVar = this.zza.zzb;
        zzbnrVar.zzd();
    }
}
