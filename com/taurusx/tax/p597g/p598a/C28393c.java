package com.taurusx.tax.p597g.p598a;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.taurusx.tax.g.a.c */
/* loaded from: classes7.dex */
public class C28393c {

    /* renamed from: a */
    public static final ConcurrentMap<String, C28392b> f73775a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C28392b m38142a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        ConcurrentMap<String, C28392b> concurrentMap = f73775a;
        C28392b c28392b = concurrentMap.get(str);
        if (c28392b == null) {
            C28392b c28392b2 = new C28392b(str);
            C28392b putIfAbsent = concurrentMap.putIfAbsent(str, c28392b2);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return c28392b2;
        }
        return c28392b;
    }
}
