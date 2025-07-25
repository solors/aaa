package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfgc implements zzgcd {
    final /* synthetic */ zzfft zza;
    final /* synthetic */ zzfgd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgc(zzfgd zzfgdVar, zzfft zzfftVar) {
        this.zza = zzfftVar;
        this.zzb = zzfgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfgg zzfggVar;
        zzfggVar = this.zzb.zza.zzd;
        zzfggVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object obj) {
        zzfgg zzfggVar;
        zzfggVar = this.zzb.zza.zzd;
        zzfggVar.zzd(this.zza);
    }
}
