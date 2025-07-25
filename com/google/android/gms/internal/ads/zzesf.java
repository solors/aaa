package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzesf implements zzetq {
    @Nullable
    private final String zza;
    @Nullable
    private final Integer zzb;
    @Nullable
    private final String zzc;
    @Nullable
    private final String zzd;
    @Nullable
    private final String zze;
    @Nullable
    private final String zzf;

    public zzesf(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuv) obj).zzb;
        zzfcx.zzc(bundle, "pn", this.zza);
        zzfcx.zzc(bundle, CmcdConfiguration.KEY_DEADLINE, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        zzfcx.zzc(bundle, "pn", this.zza);
        Integer num = this.zzb;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfcx.zzc(bundle, "vnm", this.zzc);
        zzfcx.zzc(bundle, CmcdConfiguration.KEY_DEADLINE, this.zzd);
        zzfcx.zzc(bundle, "ins_pn", this.zze);
        zzfcx.zzc(bundle, "ini_pn", this.zzf);
    }
}
