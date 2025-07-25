package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzacb implements zzadm {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacb(long j, long j2, int i, int i2, boolean z) {
        long zzc;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzc = zzc(j, j2, i);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long j2 = this.zzd;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (i != 0) {
            long j3 = this.zzc;
            long j4 = (((this.zze * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.zzb + Math.max(j4, 0L);
            long zzb = zzb(max);
            zzadn zzadnVar = new zzadn(zzb, max);
            if (this.zzd != -1 && zzb < j) {
                long j5 = max + this.zzc;
                if (j5 < this.zza) {
                    return new zzadk(zzadnVar, new zzadn(zzb(j5), j5));
                }
            }
            return new zzadk(zzadnVar, zzadnVar);
        }
        zzadn zzadnVar2 = new zzadn(0L, this.zzb);
        return new zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        if (this.zzd == -1) {
            return false;
        }
        return true;
    }
}
