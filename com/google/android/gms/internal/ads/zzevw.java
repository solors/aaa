package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzevw(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevu(zzckr.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzche) this.zzb).zza());
    }
}
