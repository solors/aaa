package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcky {
    private final Map zza;
    private final Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcky(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfca zzfcaVar) throws Exception {
        for (zzfby zzfbyVar : zzfcaVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbyVar.zza) && zzfbyVar.zzb != null) {
                ((zzclb) this.zza.get(zzfbyVar.zza)).zza(zzfbyVar.zzb);
            } else if (this.zzb.containsKey(zzfbyVar.zza) && zzfbyVar.zzb != null) {
                zzcla zzclaVar = (zzcla) this.zzb.get(zzfbyVar.zza);
                JSONObject jSONObject = zzfbyVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzclaVar.zza(hashMap);
            }
        }
    }
}
