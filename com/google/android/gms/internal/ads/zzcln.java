package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcln implements zzcla {
    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzE(Boolean.parseBoolean(str));
            }
        }
    }
}
