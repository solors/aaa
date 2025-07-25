package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbie implements zzbjp {
    private final zzbif zza;

    public zzbie(zzbif zzbifVar) {
        this.zza = zzbifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbs.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
