package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbx {
    public final int zza;
    private final zzbr zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbx(zzbr zzbrVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i = zzbrVar.zza;
        this.zza = i;
        boolean z3 = true;
        if (i == iArr.length && i == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzcw.zzd(z2);
        this.zzb = zzbrVar;
        this.zzc = (!z || i <= 1) ? false : z3;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbx.class == obj.getClass()) {
            zzbx zzbxVar = (zzbx) obj;
            if (this.zzc == zzbxVar.zzc && this.zzb.equals(zzbxVar.zzb) && Arrays.equals(this.zzd, zzbxVar.zzd) && Arrays.equals(this.zze, zzbxVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzab zzb(int i) {
        return this.zzb.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zze) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zze[i];
    }
}
