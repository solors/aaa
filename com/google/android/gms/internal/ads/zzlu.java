package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzlu {
    public final long zza;
    public final zzbq zzb;
    public final int zzc;
    @Nullable
    public final zzug zzd;
    public final long zze;
    public final zzbq zzf;
    public final int zzg;
    @Nullable
    public final zzug zzh;
    public final long zzi;
    public final long zzj;

    public zzlu(long j, zzbq zzbqVar, int i, @Nullable zzug zzugVar, long j2, zzbq zzbqVar2, int i2, @Nullable zzug zzugVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbqVar;
        this.zzc = i;
        this.zzd = zzugVar;
        this.zze = j2;
        this.zzf = zzbqVar2;
        this.zzg = i2;
        this.zzh = zzugVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlu.class == obj.getClass()) {
            zzlu zzluVar = (zzlu) obj;
            if (this.zza == zzluVar.zza && this.zzc == zzluVar.zzc && this.zze == zzluVar.zze && this.zzg == zzluVar.zzg && this.zzi == zzluVar.zzi && this.zzj == zzluVar.zzj && zzfuk.zza(this.zzb, zzluVar.zzb) && zzfuk.zza(this.zzd, zzluVar.zzd) && zzfuk.zza(this.zzf, zzluVar.zzf) && zzfuk.zza(this.zzh, zzluVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
