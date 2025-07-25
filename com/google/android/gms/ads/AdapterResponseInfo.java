package com.google.android.gms.ads;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class AdapterResponseInfo {
    private final zzw zza;
    @Nullable
    private final AdError zzb;

    private AdapterResponseInfo(zzw zzwVar) {
        AdError zza;
        this.zza = zzwVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
        if (zzeVar == null) {
            zza = null;
        } else {
            zza = zzeVar.zza();
        }
        this.zzb = zza;
    }

    @Nullable
    public static AdapterResponseInfo zza(@Nullable zzw zzwVar) {
        if (zzwVar != null) {
            return new AdapterResponseInfo(zzwVar);
        }
        return null;
    }

    @Nullable
    public AdError getAdError() {
        return this.zzb;
    }

    @NonNull
    public String getAdSourceId() {
        return this.zza.zzf;
    }

    @NonNull
    public String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    @NonNull
    public String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    @NonNull
    public String getAdSourceName() {
        return this.zza.zze;
    }

    @NonNull
    public String getAdapterClassName() {
        return this.zza.zza;
    }

    @NonNull
    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
    }

    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.zza.zza);
        jSONObject.put("Latency", this.zza.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.zza.zzd.keySet()) {
            jSONObject2.put(str, this.zza.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.zzb;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
