package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfhf implements zzgcd {
    final /* synthetic */ zzfhh zza;
    final /* synthetic */ zzfgw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhf(zzfhh zzfhhVar, zzfgw zzfgwVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfgw zzfgwVar = this.zzb;
        zzfgwVar.zzh(th);
        zzfgwVar.zzg(false);
        this.zza.zza(zzfgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object obj) {
    }
}
