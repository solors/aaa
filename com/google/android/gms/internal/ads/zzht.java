package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzht {
    public final String zza;
    public final zzab zzb;
    public final zzab zzc;
    public final int zzd;
    public final int zze;

    public zzht(String str, zzab zzabVar, zzab zzabVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzcw.zzd(z);
        zzcw.zzc(str);
        this.zza = str;
        this.zzb = zzabVar;
        zzabVar2.getClass();
        this.zzc = zzabVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzht.class == obj.getClass()) {
            zzht zzhtVar = (zzht) obj;
            if (this.zzd == zzhtVar.zzd && this.zze == zzhtVar.zze && this.zza.equals(zzhtVar.zza) && this.zzb.equals(zzhtVar.zzb) && this.zzc.equals(zzhtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
