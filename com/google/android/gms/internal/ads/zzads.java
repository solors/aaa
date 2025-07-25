package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzads {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzads(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzads.class == obj.getClass()) {
            zzads zzadsVar = (zzads) obj;
            if (this.zza == zzadsVar.zza && this.zzc == zzadsVar.zzc && this.zzd == zzadsVar.zzd && Arrays.equals(this.zzb, zzadsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
