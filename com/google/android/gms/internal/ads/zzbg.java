package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbg {
    private final zzx zza;

    static {
        new zzbf().zze();
        Integer.toString(0, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return false;
        }
        return this.zza.equals(((zzbg) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }
}
