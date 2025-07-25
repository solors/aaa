package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnu {
    private final zzdrw zza;
    private final zzfca zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnu(zzdrw zzdrwVar, zzfca zzfcaVar) {
        this.zza = zzdrwVar;
        this.zzb = zzfcaVar;
    }

    public final void zza(long j, int i) {
        String str;
        zzdrv zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            str = ApsMetricsDataMap.APSMETRICS_FIELD_URL;
                        } else {
                            str = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
                        }
                    } else {
                        str = "cb";
                    }
                } else {
                    str = "cc";
                }
            } else {
                str = "bb";
            }
        } else {
            str = "h";
        }
        zza.zzb("acr", str);
        zza.zzg();
    }
}
