package com.pubmatic.sdk.common.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBCacheService {
    @Nullable

    /* renamed from: a */
    private static POBCacheService f70099a;
    @NonNull

    /* renamed from: b */
    private final Map<String, Map<String, ?>> f70100b = Collections.synchronizedMap(new HashMap());

    private POBCacheService() {
    }

    @NonNull
    public static synchronized POBCacheService getInstance() {
        POBCacheService pOBCacheService;
        synchronized (POBCacheService.class) {
            if (f70099a == null) {
                f70099a = new POBCacheService();
            }
            pOBCacheService = f70099a;
        }
        return pOBCacheService;
    }

    @NonNull
    public <T> Map<String, T> getService(@NonNull String str) {
        Map<String, ?> map;
        try {
            map = this.f70100b.get(str);
        } catch (Exception unused) {
            POBLog.error("POBCacheService", "Couldn't find cache for - %s", str);
            map = null;
        }
        if (map == null) {
            Map<String, T> synchronizedMap = Collections.synchronizedMap(new HashMap());
            this.f70100b.put(str, synchronizedMap);
            return synchronizedMap;
        }
        return map;
    }
}
