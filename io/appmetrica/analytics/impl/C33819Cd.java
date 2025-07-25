package io.appmetrica.analytics.impl;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C21170w8;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Cd */
/* loaded from: classes9.dex */
public final class C33819Cd {

    /* renamed from: a */
    public final HashMap f92674a;

    public C33819Cd() {
        HashMap hashMap = new HashMap();
        this.f92674a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY);
        hashMap.put("retry_policy", KeyConstants.RequestBody.KEY_INSTANCE_PRECISION);
        hashMap.put("cache_control", "cc");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put(C21170w8.f54322c, "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    /* renamed from: a */
    public final String m22737a(String str) {
        if (this.f92674a.containsKey(str)) {
            return (String) this.f92674a.get(str);
        }
        return str;
    }
}
