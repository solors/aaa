package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.yandex.mobile.ads.impl.EnumC31260r6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d7 */
/* loaded from: classes8.dex */
public final class C30148d7 {
    @NotNull
    /* renamed from: a */
    public static C31634v6 m35094a(@NotNull C31427t6 sdkAdQualityConfiguration) {
        Object obj;
        Intrinsics.checkNotNullParameter(sdkAdQualityConfiguration, "sdkAdQualityConfiguration");
        int m29274g = sdkAdQualityConfiguration.m29274g();
        boolean m29276e = sdkAdQualityConfiguration.m29276e();
        boolean m29278c = sdkAdQualityConfiguration.m29278c();
        Map<String, C31553u6> m29280a = sdkAdQualityConfiguration.m29280a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = m29280a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            EnumC31260r6.C31261a c31261a = EnumC31260r6.f84641c;
            String value = (String) entry.getKey();
            c31261a.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it2 = EnumC31260r6.m30140a().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.m17075f(((EnumC31260r6) obj).m30139b(), value)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AdQualityVerifiableNetwork m30138a = EnumC31260r6.C31261a.m30138a((EnumC31260r6) obj);
            if (m30138a != null) {
                linkedHashMap.put(m30138a, new C29996b7(((C31553u6) entry.getValue()).m28876a(), ((C31553u6) entry.getValue()).m28875b()));
            }
        }
        return new C31634v6(m29274g, m29276e, m29278c, linkedHashMap, sdkAdQualityConfiguration.m29275f());
    }
}
