package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbq {
    public static final zzbq zza = new zzbn();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return false;
        }
        zzbq zzbqVar = (zzbq) obj;
        if (zzbqVar.zzc() == zzc() && zzbqVar.zzb() == zzb()) {
            zzbp zzbpVar = new zzbp();
            zzbo zzboVar = new zzbo();
            zzbp zzbpVar2 = new zzbp();
            zzbo zzboVar2 = new zzbo();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzbpVar, 0L).equals(zzbqVar.zze(i, zzbpVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzboVar, true).equals(zzbqVar.zzd(i2, zzboVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzbqVar.zzg(true) && (zzh = zzh(true)) == zzbqVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzbqVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbp zzbpVar = new zzbp();
        zzbo zzboVar = new zzbo();
        int zzc = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = zzc * 31;
            if (i2 >= zzc()) {
                break;
            }
            zzc = i + zze(i2, zzbpVar, 0L).hashCode();
            i2++;
        }
        int zzb = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            zzb = (zzb * 31) + zzd(i3, zzboVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb = (zzb * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbo zzd(int i, zzbo zzboVar, boolean z);

    public abstract zzbp zze(int i, zzbp zzbpVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        if (zzo()) {
            return -1;
        }
        return 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzbo zzboVar, zzbp zzbpVar, int i2, boolean z) {
        int i3 = zzd(i, zzboVar, false).zzc;
        if (zze(i3, zzbpVar, 0L).zzo == i) {
            int zzj = zzj(i3, i2, z);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzbpVar, 0L).zzn;
        }
        return i + 1;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == zzh(z)) {
                        return zzg(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == zzh(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzbp zzbpVar, zzbo zzboVar, int i, long j) {
        Pair zzm = zzm(zzbpVar, zzboVar, i, j, 0L);
        zzm.getClass();
        return zzm;
    }

    @Nullable
    public final Pair zzm(zzbp zzbpVar, zzbo zzboVar, int i, long j, long j2) {
        zzcw.zza(i, 0, zzc());
        zze(i, zzbpVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzbpVar.zzl;
            j = 0;
        }
        int i2 = zzbpVar.zzn;
        zzd(i2, zzboVar, false);
        while (i2 < zzbpVar.zzo) {
            long j4 = zzboVar.zze;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzd(i4, zzboVar, false).zze;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzd(i2, zzboVar, true);
        long j6 = zzboVar.zze;
        long j7 = zzboVar.zzd;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzboVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbo zzn(Object obj, zzbo zzboVar) {
        return zzd(zza(obj), zzboVar, true);
    }

    public final boolean zzo() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }
}
