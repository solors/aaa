package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhi extends zzbq {
    private final int zzb;
    private final zzwb zzc;

    public zzhi(boolean z, zzwb zzwbVar) {
        this.zzc = zzwbVar;
        this.zzb = zzwbVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzc.zzd(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzc.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzboVar, z);
        zzboVar.zzc += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzboVar.zzb;
            obj.getClass();
            zzboVar.zzb = Pair.create(zzv, obj);
        }
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int i, zzbp zzbpVar, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzbpVar, j);
        Object zzv = zzv(zzr);
        if (!zzbp.zza.equals(zzbpVar.zzb)) {
            zzv = Pair.create(zzv, zzbpVar.zzb);
        }
        zzbpVar.zzb = zzv;
        zzbpVar.zzn += zzs;
        zzbpVar.zzo += zzs;
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzg(boolean z) {
        int i;
        if (this.zzb == 0) {
            return -1;
        }
        if (z) {
            i = this.zzc.zza();
        } else {
            i = 0;
        }
        while (zzu(i).zzo()) {
            i = zzw(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return zzt(i) + zzu(i).zzg(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzh(boolean z) {
        int i;
        int i2 = this.zzb;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            i = this.zzc.zzb();
        } else {
            i = i2 - 1;
        }
        while (zzu(i).zzo()) {
            i = zzx(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return zzt(i) + zzu(i).zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzj(int i, int i2, boolean z) {
        int i3;
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        zzbq zzu = zzu(zzr);
        int i4 = i - zzt;
        if (i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        int zzj = zzu.zzj(i4, i3, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return zzg(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzk(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx == -1) {
            return -1;
        }
        return zzt(zzx) + zzu(zzx).zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzn(Object obj, zzbo zzboVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzboVar);
        zzboVar.zzc += zzt;
        zzboVar.zzb = obj;
        return zzboVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzbq zzu(int i);

    protected abstract Object zzv(int i);
}
