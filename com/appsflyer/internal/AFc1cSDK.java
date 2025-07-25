package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFc1cSDK {
    public final Map<String, Object> valueOf = new HashMap();
    public Map<String, Object> AFInAppEventType = new HashMap();

    public final void AFInAppEventType(Map<String, Object> map) {
        if (!this.valueOf.isEmpty()) {
            map.put("partner_data", this.valueOf);
        }
        if (!this.AFInAppEventType.isEmpty()) {
            AFb1rSDK.AFKeystoreWrapper(map).put("partner_data", this.AFInAppEventType);
            this.AFInAppEventType = new HashMap();
        }
    }
}
