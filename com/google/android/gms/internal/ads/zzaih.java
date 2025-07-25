package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaih implements zzaid {
    private final zzdy zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaih(zzeo zzeoVar) {
        zzdy zzdyVar = zzeoVar.zza;
        this.zza = zzdyVar;
        zzdyVar.zzL(12);
        this.zzc = zzdyVar.zzp() & 255;
        this.zzb = zzdyVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzm();
        }
        if (i == 16) {
            return this.zza.zzq();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 == 0) {
            int zzm = this.zza.zzm();
            this.zze = zzm;
            return (zzm & 240) >> 4;
        }
        return this.zze & 15;
    }
}
