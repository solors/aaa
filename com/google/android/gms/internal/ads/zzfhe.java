package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfhe implements zzgcd {
    final /* synthetic */ zzfhh zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhe(zzfhh zzfhhVar, zzfgw zzfgwVar, boolean z) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfgw zzfgwVar = this.zzb;
        if (zzfgwVar.zzk()) {
            zzfhh zzfhhVar = this.zza;
            zzfgwVar.zzh(th);
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object obj) {
        zzfgw zzfgwVar = this.zzb;
        zzfgwVar.zzg(true);
        this.zza.zza(zzfgwVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
