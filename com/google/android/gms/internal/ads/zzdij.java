package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C21170w8;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdij extends zzdik {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    @Nullable
    private final JSONObject zzh;

    public zzdij(zzfbo zzfboVar, JSONObject jSONObject) {
        super(zzfboVar);
        JSONObject jSONObject2;
        this.zzb = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbs.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbs.zzl(false, jSONObject, C21170w8.f54322c, "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbs.zzl(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbs.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfj)).booleanValue()) {
            jSONObject2 = jSONObject.optJSONObject("omid_settings");
        } else {
            jSONObject2 = null;
        }
        this.zzh = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final zzfcm zza() {
        JSONObject jSONObject = this.zzh;
        if (jSONObject != null) {
            return new zzfcm(jSONObject);
        }
        return this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    @Nullable
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzg() {
        return this.zzf;
    }
}
