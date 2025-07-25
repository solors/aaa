package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final /* synthetic */ class zzbml {
    public static void zza(zzbmm zzbmmVar, String str, Map map) {
        try {
            zzbmmVar.zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmm zzbmmVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        zzbmmVar.zza(sb2.toString());
    }

    public static void zzc(zzbmm zzbmmVar, String str, String str2) {
        zzbmmVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmm zzbmmVar, String str, JSONObject jSONObject) {
        zzbmmVar.zzb(str, jSONObject.toString());
    }
}
