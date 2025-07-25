package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcpc implements zzher {
    private final zzcot zza;
    private final zzhfj zzb;

    public zzcpc(zzcot zzcotVar, zzhfj zzhfjVar) {
        this.zza = zzcotVar;
        this.zzb = zzhfjVar;
    }

    public static Set zza(zzcot zzcotVar, zzcqo zzcqoVar) {
        Set singleton = Collections.singleton(new zzddk(zzcqoVar, zzbzw.zzg));
        zzhez.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcqo) this.zzb.zzb());
    }
}
