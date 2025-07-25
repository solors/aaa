package com.mbridge.msdk.mbnative.p466a;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.mbnative.a.c */
/* loaded from: classes6.dex */
public final class NativeCacheFactory {

    /* renamed from: a */
    public static Map<Integer, AbsNativeCache<String, List<Campaign>>> f57404a = new HashMap();

    /* renamed from: a */
    public static AbsNativeCache<String, List<Campaign>> m51347a(int i) {
        if (f57404a.containsKey(Integer.valueOf(i))) {
            return f57404a.get(Integer.valueOf(i));
        }
        APICache aPICache = new APICache(i);
        f57404a.put(Integer.valueOf(i), aPICache);
        return aPICache;
    }
}
