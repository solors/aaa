package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfra {
    private final String zza;
    private final long zzb;

    public zzfra() {
        this.zza = null;
        this.zzb = -1L;
    }

    public final long zza() {
        return this.zzb;
    }

    @Nullable
    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        if (this.zza != null && this.zzb > 0) {
            return true;
        }
        return false;
    }

    public zzfra(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }
}
