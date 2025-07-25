package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzah {
    @IntRange(from = 0)
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;

    static {
        new zzah(new zzag());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        long j = ((zzah) obj).zza;
        return true;
    }

    public final int hashCode() {
        return ((int) (-9223372034707292160L)) * 29791;
    }

    private zzah(zzag zzagVar) {
        int i = zzei.zza;
        this.zza = 0L;
        this.zzb = Long.MIN_VALUE;
        this.zzc = false;
        this.zzd = false;
        this.zze = false;
    }
}
