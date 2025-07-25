package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcrn implements zzgcd {
    final /* synthetic */ zzgcd zza;
    final /* synthetic */ zzcro zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrn(zzcro zzcroVar, zzgcd zzgcdVar) {
        this.zza = zzgcdVar;
        this.zzb = zzcroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcri
            {
                zzcro.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcro.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcri
            {
                zzcro.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcro.this.zzd();
            }
        });
        this.zza.zzb((zzcqz) obj);
    }
}
