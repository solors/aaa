package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes2.dex */
public abstract class AFi1oSDK extends AFi1bSDK {
    private AFd1sSDK values;

    public AFi1oSDK(String str, String str2, AFd1sSDK aFd1sSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.values = aFd1sSDK;
    }

    public final boolean AFKeystoreWrapper() {
        if (this.values.values.valueOf("appsFlyerCount", 0) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}
