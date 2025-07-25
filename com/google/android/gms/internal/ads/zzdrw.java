package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdrw {
    private final zzdsb zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdrw(zzdsb zzdsbVar, Executor executor) {
        this.zza = zzdsbVar;
        this.zzc = zzdsbVar.zza();
        this.zzb = executor;
    }

    public final zzdrv zza() {
        zzdrv zzdrvVar = new zzdrv(this);
        zzdrv.zza(zzdrvVar);
        return zzdrvVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlw)).booleanValue()) {
            return;
        }
        zzdrv zza = zza();
        zza.zzb("action", "pecr");
        zza.zzg();
    }
}
