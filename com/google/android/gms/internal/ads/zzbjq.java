package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbjq implements zzbjp {
    private final zzduv zza;

    public zzbjq(zzduv zzduvVar) {
        Preconditions.checkNotNull(zzduvVar, "The Inspector Manager must not be null");
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.zza.zzj((String) map.get("persistentData"));
        }
    }
}
