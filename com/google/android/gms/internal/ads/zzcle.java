package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcle implements zzcla {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcle(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        this.zza.zzv(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
