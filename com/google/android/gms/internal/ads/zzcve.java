package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcve implements zzher {
    private final zzcvc zza;
    private final zzhfj zzb;

    public zzcve(zzcvc zzcvcVar, zzhfj zzhfjVar) {
        this.zza = zzcvcVar;
        this.zzb = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzb = this.zza.zzb(((zzche) this.zzb).zza());
        zzhez.zzb(zzb);
        return zzb;
    }
}
