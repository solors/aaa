package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzclq implements zzcla {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzclq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
            boolean parseBoolean = Boolean.parseBoolean(str);
            zzgVar.zzD(parseBoolean);
            if (parseBoolean) {
                com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
            }
        }
    }
}
