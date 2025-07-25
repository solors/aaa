package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzejj {
    @GuardedBy("this")
    private final Map zza = new HashMap();
    @GuardedBy("this")
    private final Map zzb = new HashMap();
    @GuardedBy("this")
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    @Nullable
    private JSONObject zzg;

    public zzejj(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfxq zzh(String str) {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdn), str);
            boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdo), str);
            if (matches) {
                hashMap = new HashMap(this.zze);
            } else if (matches2) {
                hashMap = new HashMap(this.zzd);
            }
            return zzfxq.zzc(hashMap);
        }
        return zzfxq.zzd();
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (jSONObject != null) {
            Bundle zzo = zzo(jSONObject.optJSONObject("data"));
            JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i, "");
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList2.add(optString);
                    }
                }
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = (String) arrayList2.get(i2);
                    zzg(str2);
                    if (((zzejl) this.zza.get(str2)) != null) {
                        arrayList.add(new zzejl(str2, str, zzo));
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject zzf;
        if (!((Boolean) zzber.zzb.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbU)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzejn zzejnVar = new zzejn(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzejnVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzejnVar);
                                }
                            }
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.zzc.put(str, map);
            List list2 = (List) map.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map.put(str2, list2);
        }
    }

    private final synchronized void zzm() {
        String optString;
        JSONArray optJSONArray;
        JSONObject zzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf();
        if (zzf != null) {
            try {
                JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                this.zzg = zzf.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkM)).booleanValue()) {
                            optString = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                        } else {
                            optString = jSONObject.optString("ad_unit_id", "");
                        }
                        String optString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.addAll(zzi(optJSONArray.getJSONObject(i2), optString2));
                            }
                        }
                        zzl(optString2, optString, arrayList);
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    private final synchronized void zzn() {
        JSONObject zzf;
        if (!((Boolean) zzber.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbT)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle zzo = zzo(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean(Reporting.EventType.RENDER, false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzejn(optString, optBoolean2, optBoolean, true, zzo));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle zzo(@Nullable JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap hashMap;
        Bundle bundle;
        Map zzb = zzb(str, str2);
        zzfxq zzh = zzh(str2);
        hashMap = new HashMap();
        for (Map.Entry entry : ((zzfxq) zzb).entrySet()) {
            String str3 = (String) entry.getKey();
            if (zzh.containsKey(str3)) {
                zzejn zzejnVar = (zzejn) zzh.get(str3);
                List list = (List) entry.getValue();
                boolean z = zzejnVar.zzb;
                boolean z2 = zzejnVar.zzc;
                boolean z3 = zzejnVar.zzd;
                if (list != null && !list.isEmpty()) {
                    bundle = (Bundle) list.get(0);
                } else {
                    bundle = new Bundle();
                }
                hashMap.put(str3, new zzejn(str3, z, z2, z3, bundle));
            }
        }
        zzfzt it = zzh.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str4 = (String) entry2.getKey();
            if (!hashMap.containsKey(str4) && ((zzejn) entry2.getValue()).zzd) {
                hashMap.put(str4, (zzejn) entry2.getValue());
            }
        }
        return hashMap;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
            List<zzejl> list = (List) map.get(str2);
            if (list == null) {
                String zza = zzdpt.zza(this.zzg, str2, str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkM)).booleanValue()) {
                    zza = zza.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(zza);
            }
            if (list != null) {
                HashMap hashMap = new HashMap();
                for (zzejl zzejlVar : list) {
                    String str3 = zzejlVar.zza;
                    if (!hashMap.containsKey(str3)) {
                        hashMap.put(str3, new ArrayList());
                    }
                    ((List) hashMap.get(str3)).add(zzejlVar.zzb);
                }
                return zzfxq.zzc(hashMap);
            }
        }
        return zzfxq.zzd();
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            return zzfxq.zzd();
        }
        return zzfxq.zzc(this.zzb);
    }

    public final void zze() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeji
            {
                zzejj.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzejj.this.zzf();
            }
        });
        this.zzf.execute(new zzejh(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzejh(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzejl(str, "", new Bundle()));
        }
    }
}
