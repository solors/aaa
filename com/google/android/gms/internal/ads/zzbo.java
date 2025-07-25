package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbo {
    @Nullable
    public Object zza;
    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbo.class.equals(obj.getClass())) {
            zzbo zzboVar = (zzbo) obj;
            if (Objects.equals(this.zza, zzboVar.zza) && Objects.equals(this.zzb, zzboVar.zzb) && this.zzc == zzboVar.zzc && this.zzd == zzboVar.zzd && this.zzf == zzboVar.zzf && Objects.equals(this.zzg, zzboVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.zza;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.zzb;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = ((((hashCode + 217) * 31) + i) * 31) + this.zzc;
        long j = this.zzd;
        return (((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }

    public final int zza(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final long zzf(int i, int i2) {
        zza zza = this.zzg.zza(i);
        if (zza.zzb != -1) {
            return zza.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzg(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final long zzh() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final zzbo zzi(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, zzb zzbVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z;
        return this;
    }

    public final boolean zzj(int i) {
        zzb();
        if (i == -1) {
            this.zzg.zzb(-1);
            return false;
        }
        return false;
    }

    public final boolean zzk(int i) {
        boolean z = this.zzg.zza(i).zzh;
        return false;
    }
}
