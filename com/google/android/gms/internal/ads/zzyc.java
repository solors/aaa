package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzyc {
    public final int zza;
    public final zzln[] zzb;
    public final zzxv[] zzc;
    public final zzby zzd;
    @Nullable
    public final Object zze;

    public zzyc(zzln[] zzlnVarArr, zzxv[] zzxvVarArr, zzby zzbyVar, @Nullable Object obj) {
        boolean z;
        int length = zzlnVarArr.length;
        if (length == zzxvVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        this.zzb = zzlnVarArr;
        this.zzc = (zzxv[]) zzxvVarArr.clone();
        this.zzd = zzbyVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(@Nullable zzyc zzycVar, int i) {
        if (zzycVar == null || !Objects.equals(this.zzb[i], zzycVar.zzb[i]) || !Objects.equals(this.zzc[i], zzycVar.zzc[i])) {
            return false;
        }
        return true;
    }

    public final boolean zzb(int i) {
        if (this.zzb[i] != null) {
            return true;
        }
        return false;
    }
}
