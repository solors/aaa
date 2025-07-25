package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzad {
    @Nullable
    public final String zza;
    public final String zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzad(@Nullable String str, String str2) {
        this.zza = zzei.zzE(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            if (Objects.equals(this.zza, zzadVar.zza) && Objects.equals(this.zzb, zzadVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
