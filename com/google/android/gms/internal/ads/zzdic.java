package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdic {
    @Nullable
    private zzbft zza;

    public zzdic(zzdhn zzdhnVar) {
        this.zza = zzdhnVar;
    }

    @Nullable
    public final synchronized zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbft zzbftVar) {
        this.zza = zzbftVar;
    }
}
