package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzby {
    public static final zzby zza = new zzby(zzfxn.zzn());
    private final zzfxn zzb;

    static {
        Integer.toString(0, 36);
    }

    public zzby(List list) {
        this.zzb = zzfxn.zzl(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            return this.zzb.equals(((zzby) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfxn zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzbx zzbxVar = (zzbx) this.zzb.get(i2);
            if (zzbxVar.zzc() && zzbxVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
