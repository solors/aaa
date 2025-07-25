package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzefz implements zzgcd {
    final /* synthetic */ zzfbo zza;
    final /* synthetic */ zzega zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefz(zzega zzegaVar, zzfbo zzfboVar) {
        this.zza = zzfboVar;
        this.zzb = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzegb zzegbVar;
        zzegb zzegbVar2;
        zzegb zzegbVar3;
        synchronized (this.zzb) {
            zzegbVar = this.zzb.zzh;
            zzegbVar.zzb(th, this.zza);
            zzegbVar2 = this.zzb.zzh;
            zzfbo zza = zzegbVar2.zza();
            if (this.zza.zzav) {
                while (zza != null) {
                    this.zzb.zze(zza);
                    zzegbVar3 = this.zzb.zzh;
                    zza = zzegbVar3.zza();
                }
            } else if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegb zzegbVar;
        zzegb zzegbVar2;
        zzegr zzegrVar = (zzegr) obj;
        synchronized (this.zzb) {
            zzegbVar = this.zzb.zzh;
            zzegbVar.zzc(zzegrVar, this.zza);
            zzegbVar2 = this.zzb.zzh;
            zzfbo zza = zzegbVar2.zza();
            if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }
}
