package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzahx implements zzahu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    @Nullable
    private final long[] zzg;

    private zzahx(long j, int i, long j2, int i2, long j3, @Nullable long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    public static zzahx zzb(zzahw zzahwVar, long j) {
        long[] jArr;
        long zza = zzahwVar.zza();
        if (zza == -9223372036854775807L) {
            return null;
        }
        long j2 = zzahwVar.zzc;
        if (j2 != -1 && (jArr = zzahwVar.zzf) != null) {
            zzadf zzadfVar = zzahwVar.zza;
            return new zzahx(j, zzadfVar.zzc, zza, zzadfVar.zzf, j2, jArr);
        }
        zzadf zzadfVar2 = zzahwVar.zza;
        return new zzahx(j, zzadfVar2.zzc, zza, zzadfVar2.zzf, -1L, null);
    }

    private final long zzf(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        long j2;
        double d;
        if (zzh()) {
            long j3 = j - this.zza;
            if (j3 > this.zzb) {
                long[] jArr = this.zzg;
                zzcw.zzb(jArr);
                double d2 = (j3 * 256.0d) / this.zze;
                int zzd = zzei.zzd(jArr, (long) d2, true, true);
                long zzf = zzf(zzd);
                long j4 = jArr[zzd];
                int i = zzd + 1;
                long zzf2 = zzf(i);
                if (zzd == 99) {
                    j2 = 256;
                } else {
                    j2 = jArr[i];
                }
                if (j4 == j2) {
                    d = 0.0d;
                } else {
                    d = (d2 - j4) / (j2 - j4);
                }
                return zzf + Math.round(d * (zzf2 - zzf));
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        double d;
        if (!zzh()) {
            zzadn zzadnVar = new zzadn(0L, this.zza + this.zzb);
            return new zzadk(zzadnVar, zzadnVar);
        }
        long max = Math.max(0L, Math.min(j, this.zzc));
        double d2 = (max * 100.0d) / this.zzc;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.zzg;
                zzcw.zzb(jArr);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        long j2 = this.zze;
        zzadn zzadnVar2 = new zzadn(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d3 / 256.0d) * j2), j2 - 1)));
        return new zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        if (this.zzg != null) {
            return true;
        }
        return false;
    }
}
