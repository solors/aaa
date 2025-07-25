package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzef {
    @GuardedBy("this")
    private long zza;
    @GuardedBy("this")
    private long zzb;
    @GuardedBy("this")
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzef(long j) {
        zzi(0L);
    }

    public static long zzg(long j) {
        return zzei.zzu(j, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzh(long j) {
        return zzei.zzu(j, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!zzj()) {
            long j2 = this.zza;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.zzd.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.zzb = j2 - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }

    public final synchronized long zzb(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long zzh = zzh(j2);
            long j3 = (4294967296L + zzh) / 8589934592L;
            long j4 = (((-1) + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - zzh) < Math.abs(j - zzh)) {
                j = j4;
            }
        }
        return zza(zzg(j));
    }

    public final synchronized long zzc(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long zzh = zzh(j2);
            long j3 = zzh / 8589934592L;
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= zzh) {
                j = j4;
            }
        }
        return zza(zzg(j));
    }

    public final synchronized long zzd() {
        long j = this.zza;
        if (j != Long.MAX_VALUE && j != 9223372036854775806L) {
            return j;
        }
        return -9223372036854775807L;
    }

    public final synchronized long zze() {
        long zzd;
        long j = this.zzc;
        if (j != -9223372036854775807L) {
            zzd = j + this.zzb;
        } else {
            zzd = zzd();
        }
        return zzd;
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j) {
        long j2;
        this.zza = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.zzb = j2;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        if (this.zzb != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
