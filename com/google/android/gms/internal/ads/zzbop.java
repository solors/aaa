package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbop {
    private final zzbns zza;
    private ListenableFuture zzb;

    public zzbop(zzbns zzbnsVar) {
        this.zza = zzbnsVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcab zzcabVar = new zzcab();
            this.zzb = zzcabVar;
            this.zza.zzb(null).zzj(new zzcaf() { // from class: com.google.android.gms.internal.ads.zzbom
                @Override // com.google.android.gms.internal.ads.zzcaf
                public final void zza(Object obj) {
                    zzcabVar.zzc((zzbnt) obj);
                }
            }, new zzcad() { // from class: com.google.android.gms.internal.ads.zzbon
                @Override // com.google.android.gms.internal.ads.zzcad
                public final void zza() {
                    zzcabVar.zzd(new zzbnv("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbos zza(String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        zzd();
        return new zzbos(this.zzb, "google.afma.activeView.handleUpdate", zzbnzVar, zzbnyVar);
    }

    public final void zzb(final String str, final zzbjp zzbjpVar) {
        zzd();
        this.zzb = zzgch.zzn(this.zzb, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzboo
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                zzbnt zzbntVar = (zzbnt) obj;
                zzbntVar.zzq(str, zzbjpVar);
                return zzgch.zzh(zzbntVar);
            }
        }, zzbzw.zzg);
    }

    public final void zzc(final String str, final zzbjp zzbjpVar) {
        this.zzb = zzgch.zzm(this.zzb, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzbol
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                zzbnt zzbntVar = (zzbnt) obj;
                zzbntVar.zzr(str, zzbjpVar);
                return zzbntVar;
            }
        }, zzbzw.zzg);
    }
}
