package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzehl implements zzecy {
    private final Map zza = new HashMap();
    private final zzdpm zzb;

    public zzehl(zzdpm zzdpmVar) {
        this.zzb = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        zzecz zzeczVar;
        synchronized (this) {
            zzeczVar = (zzecz) this.zza.get(str);
            if (zzeczVar == null) {
                zzeczVar = new zzecz(this.zzb.zzc(str, jSONObject), new zzeet(), str);
                this.zza.put(str, zzeczVar);
            }
        }
        return zzeczVar;
    }
}
