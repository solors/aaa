package net.pubnative.lite.sdk;

import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class AdCache {
    private static final String TAG = "AdCache";
    private final Map<String, C38595Ad> mAdMap = new HashMap();

    public synchronized C38595Ad inspect(String str) {
        return this.mAdMap.get(str);
    }

    public synchronized void put(String str, C38595Ad c38595Ad) {
        String str2 = TAG;
        Logger.m14229d(str2, "AdCache putting ad for zone id: " + str);
        this.mAdMap.put(str, c38595Ad);
    }

    public synchronized C38595Ad remove(String str) {
        return this.mAdMap.remove(str);
    }
}
