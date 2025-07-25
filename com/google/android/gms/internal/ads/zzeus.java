package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeus implements zzetq {
    @Nullable
    private final AdvertisingIdClient.Info zza;
    @Nullable
    private final String zzb;
    private final zzfra zzc;

    public zzeus(@Nullable AdvertisingIdClient.Info info, @Nullable String str, zzfra zzfraVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzg.put("rdid", this.zza.getId());
                zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzg.put("idtype", Constants.ADID);
                zzfra zzfraVar = this.zzc;
                if (zzfraVar.zzc()) {
                    zzg.put("paidv1_id_android_3p", zzfraVar.zzb());
                    zzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                zzg.put("pdid", str);
                zzg.put("pdidtype", "ssaid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}
