package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkj(zzkh zzkhVar, zzki zzkiVar) {
        this.zza = zzkh.zzc(zzkhVar);
        this.zzb = zzkh.zza(zzkhVar);
        this.zzc = zzkh.zzb(zzkhVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkjVar = (zzkj) obj;
        if (this.zza == zzkjVar.zza && this.zzb == zzkjVar.zzb && this.zzc == zzkjVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkh zza() {
        return new zzkh(this, null);
    }
}
