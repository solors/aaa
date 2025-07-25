package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdsp implements zzher {
    private final zzdsl zza;
    private final zzhfj zzb;

    public zzdsp(zzdsl zzdslVar, zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzdslVar;
        this.zzb = zzhfjVar;
    }

    public static Set zza(zzdsl zzdslVar, zzdsv zzdsvVar, Executor executor) {
        Set zzd = zzdsl.zzd(zzdsvVar, executor);
        zzhez.zzb(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgcs zzc = zzffh.zzc();
        return zza(this.zza, (zzdsv) this.zzb.zzb(), zzc);
    }
}
