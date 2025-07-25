package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzajj implements zzajo {
    private final zzacy zza;
    private final zzacx zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajj(zzacy zzacyVar, zzacx zzacxVar) {
        this.zza = zzacyVar;
        this.zzb = zzacxVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zzd(zzaco zzacoVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final zzadm zze() {
        boolean z;
        if (this.zzc != -1) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        return new zzacw(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzei.zzd(jArr, j, true, true)];
    }
}
