package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzetc implements zzetq {
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    @Nullable
    public final Long zze;

    public zzetc(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfcx.zzc(((zzcuv) obj).zzb, "fbs_aeid", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        zzfcx.zzc(bundle, "gmp_app_id", this.zza);
        zzfcx.zzc(bundle, "fbs_aiid", this.zzb);
        zzfcx.zzc(bundle, "fbs_aeid", this.zzc);
        zzfcx.zzc(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
