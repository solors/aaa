package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdfn implements zzher {
    private final zzdeu zza;
    private final zzhfj zzb;

    public zzdfn(zzdeu zzdeuVar, zzhfj zzhfjVar) {
        this.zza = zzdeuVar;
        this.zzb = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
