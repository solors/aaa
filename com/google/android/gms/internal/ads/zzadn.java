package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzadn {
    public static final zzadn zza = new zzadn(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadn(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadn.class == obj.getClass()) {
            zzadn zzadnVar = (zzadn) obj;
            if (this.zzb == zzadnVar.zzb && this.zzc == zzadnVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + C21114v8.C21123i.f54139e;
    }
}
