package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcrp {
    private final zzfca zza;
    private final zzfbo zzb;
    private final String zzc;

    public zzcrp(zzfca zzfcaVar, zzfbo zzfboVar, @Nullable String str) {
        this.zza = zzfcaVar;
        this.zzb = zzfboVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfbo zza() {
        return this.zzb;
    }

    public final zzfbr zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfca zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
