package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.c4 */
/* loaded from: classes6.dex */
public abstract class AbstractC19227c4 {
    /* renamed from: a */
    public static HashMap m60398a() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", C18968Ia.m61034a());
            Boolean m61047c = C18955Hb.f47329a.m61047c();
            if (m61047c != null) {
                if (m61047c.booleanValue()) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                hashMap.put("u-id-adt", str2);
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C19024Ma.f47518a.getClass();
            HashMap hashMap2 = new HashMap();
            if (C19024Ma.f47522e && (str = C19024Ma.f47521d) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("c4", "TAG");
        }
        return hashMap;
    }
}
