package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFc1kSDK implements AFe1iSDK<AFc1jSDK> {
    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ AFc1jSDK AFKeystoreWrapper(String str) {
        boolean z;
        JSONObject optJSONObject;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        DeepLink deepLink = null;
        if (!z) {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("found", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
            if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
                deepLink = DeepLink.AFInAppEventParameterName(optJSONObject);
                deepLink.AFInAppEventParameterName.put("is_deferred", true);
            }
            return new AFc1jSDK(optBoolean2, deepLink);
        }
        return new AFc1jSDK(false, null, 3, null);
    }
}
