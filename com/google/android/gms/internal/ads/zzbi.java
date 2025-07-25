package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbi {
    @Nullable
    public final Object zza;
    public final int zzb;
    @Nullable
    public final zzar zzc;
    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbi(@Nullable Object obj, int i, @Nullable zzar zzarVar, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzarVar;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbi.class == obj.getClass()) {
            zzbi zzbiVar = (zzbi) obj;
            if (this.zzb == zzbiVar.zzb && this.zze == zzbiVar.zze && this.zzf == zzbiVar.zzf && this.zzg == zzbiVar.zzg && this.zzh == zzbiVar.zzh && this.zzi == zzbiVar.zzi && zzfuk.zza(this.zzc, zzbiVar.zzc) && zzfuk.zza(this.zza, zzbiVar.zza) && zzfuk.zza(this.zzd, zzbiVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
