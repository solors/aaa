package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzewi implements zzetq {
    private final String zza;

    public zzewi(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed putting trustless token.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}
