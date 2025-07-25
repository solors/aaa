package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzadk {
    public final zzadn zza;
    public final zzadn zzb;

    public zzadk(zzadn zzadnVar, zzadn zzadnVar2) {
        this.zza = zzadnVar;
        this.zzb = zzadnVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (this.zza.equals(zzadkVar.zza) && this.zzb.equals(zzadkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String concat;
        zzadn zzadnVar = this.zza;
        zzadn zzadnVar2 = this.zzb;
        String obj = zzadnVar.toString();
        if (zzadnVar.equals(zzadnVar2)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return C21114v8.C21123i.f54137d + obj + concat + C21114v8.C21123i.f54139e;
    }
}
