package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaig implements zzaid {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaig(zzeo zzeoVar, zzab zzabVar) {
        zzdy zzdyVar = zzeoVar.zza;
        this.zzc = zzdyVar;
        zzdyVar.zzL(12);
        int zzp = zzdyVar.zzp();
        if ("audio/raw".equals(zzabVar.zzo)) {
            int zzk = zzei.zzk(zzabVar.zzF) * zzabVar.zzD;
            if (zzp == 0 || zzp % zzk != 0) {
                zzdo.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzp);
                zzp = zzk;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzdyVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzc() {
        int i = this.zza;
        if (i == -1) {
            return this.zzc.zzp();
        }
        return i;
    }
}
