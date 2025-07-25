package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdta {
    @Nullable
    private Long zza;
    private final String zzb;
    @Nullable
    private String zzc;
    @Nullable
    private Integer zzd;
    @Nullable
    private String zze;
    @Nullable
    private Integer zzf;

    public /* synthetic */ zzdta(String str, zzdtb zzdtbVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdta zzdtaVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjQ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtaVar.zza);
            jSONObject.put("eventCategory", zzdtaVar.zzb);
            jSONObject.putOpt("event", zzdtaVar.zzc);
            jSONObject.putOpt("errorCode", zzdtaVar.zzd);
            jSONObject.putOpt("rewardType", zzdtaVar.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdtaVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
