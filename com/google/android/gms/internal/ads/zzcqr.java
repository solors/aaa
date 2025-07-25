package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcqr {
    private final zzcyl zza;
    @Nullable
    private final zzdar zzb;

    public zzcqr(zzcyl zzcylVar, @Nullable zzdar zzdarVar) {
        this.zza = zzcylVar;
        this.zzb = zzdarVar;
    }

    public final zzcyl zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final zzdar zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzddk zzc() {
        zzdar zzdarVar = this.zzb;
        if (zzdarVar != null) {
            return new zzddk(zzdarVar, zzbzw.zzg);
        }
        return new zzddk(new zzcqq(this), zzbzw.zzg);
    }
}
