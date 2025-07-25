package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdpr {
    @Nullable
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    @Nullable
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdpr(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (!this.zzf.getAndSet(true)) {
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpp
                {
                    zzdpr.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdpr.this.zzf();
                }
            });
        }
    }

    /* renamed from: zzh */
    public final synchronized void zze() {
        JSONObject zzf;
        JSONObject jSONObject;
        Map map;
        this.zzd = true;
        zzbzg zzg = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        if (zzg != null && (zzf = zzg.zzf()) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzef)).booleanValue()) {
                jSONObject = zzf.optJSONObject("common_settings");
            } else {
                jSONObject = null;
            }
            this.zzb = jSONObject;
            this.zze = zzf.optJSONObject("ad_unit_patterns");
            JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("ad_unit_id");
                        String optString2 = optJSONObject.optString("format");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                        if (optString != null && optJSONObject2 != null && optString2 != null) {
                            if (this.zza.containsKey(optString2)) {
                                map = (Map) this.zza.get(optString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.zza.put(optString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(optString, optJSONObject2);
                        }
                    }
                }
            }
        }
    }

    public final JSONObject zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzef)).booleanValue()) {
            return null;
        }
        return this.zzb;
    }

    public final JSONObject zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzed)).booleanValue() && str != null && str2 != null) {
            if (!this.zzd) {
                zze();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzee)).booleanValue()) {
                    zzg();
                }
            }
            Map map = (Map) this.zza.get(str2);
            if (map != null) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                String zza = zzdpt.zza(this.zze, str, str2);
                if (zza != null) {
                    return (JSONObject) map.get(zza);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void zzd() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            {
                zzdpr.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdpr.this.zze();
            }
        });
    }

    public final /* synthetic */ void zzf() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpq
            {
                zzdpr.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdpr.this.zze();
            }
        });
    }
}
