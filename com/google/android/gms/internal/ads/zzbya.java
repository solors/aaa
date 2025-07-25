package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbya implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzbya(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* renamed from: zza */
    public final zzbxz zzb() {
        return new zzbxz((Clock) this.zza.zzb(), (zzbxx) this.zzb.zzb());
    }
}
