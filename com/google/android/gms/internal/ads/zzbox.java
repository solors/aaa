package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbox {
    public final List zza;
    public final String zzb;
    @Nullable
    public final String zzc;

    public zzbox(JSONObject jSONObject) throws JSONException {
        String str;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        } else {
            str = null;
        }
        this.zzb = str;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject(POBNativeConstants.NATIVE_ASSETS);
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.zzc = jSONObject.optString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
