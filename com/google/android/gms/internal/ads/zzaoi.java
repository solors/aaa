package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaoi implements zzadm {
    private final zzaof zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoi(zzaof zzaofVar, int i, long j, long j2) {
        this.zza = zzaofVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzaofVar.zzd;
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzei.zzu(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadn zzadnVar = new zzadn(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb < j && max != this.zzd - 1) {
            long j2 = max + 1;
            return new zzadk(zzadnVar, new zzadn(zzb(j2), this.zzc + (j2 * this.zza.zzd)));
        }
        return new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
