package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzclc implements zzcla {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzclc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        this.zza.zzu(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
