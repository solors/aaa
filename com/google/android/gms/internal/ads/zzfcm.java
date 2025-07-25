package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfcm {
    private final JSONObject zza;

    public zzfcm(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Nullable
    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        zzbcc zzbccVar = zzbcl.zzfh;
        return this.zza.optBoolean((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar), true);
    }

    public final int zzc() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            if (optInt == 1) {
                return 1;
            }
            return 3;
        }
        return 2;
    }
}
