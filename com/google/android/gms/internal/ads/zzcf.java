package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcf {
    public static final zzcf zza = new zzcf(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcf(int i, int i2, int i3) {
        int i4;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        if (zzei.zzJ(i3)) {
            i4 = zzei.zzk(i3) * i2;
        } else {
            i4 = -1;
        }
        this.zze = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcf)) {
            return false;
        }
        zzcf zzcfVar = (zzcf) obj;
        if (this.zzb == zzcfVar.zzb && this.zzc == zzcfVar.zzc && this.zzd == zzcfVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + C21114v8.C21123i.f54139e;
    }
}
