package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcol implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcol(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    public static zzcyl zzc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return new zzcyl(scheduledExecutorService, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* renamed from: zza */
    public final zzcyl zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
