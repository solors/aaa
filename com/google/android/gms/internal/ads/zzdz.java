package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdz {
    public static final zzdz zza = new zzdz(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzdz(0, 0);
    }

    public zzdz(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdz) {
            zzdz zzdzVar = (zzdz) obj;
            if (this.zzb == zzdzVar.zzb && this.zzc == zzdzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return ((i >>> 16) | (i << 16)) ^ this.zzc;
    }

    public final String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}
