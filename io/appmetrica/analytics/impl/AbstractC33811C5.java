package io.appmetrica.analytics.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.C5 */
/* loaded from: classes9.dex */
public abstract class AbstractC33811C5 {

    /* renamed from: a */
    public static final Map f92671a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f92671a = Collections.unmodifiableMap(hashMap);
    }
}
