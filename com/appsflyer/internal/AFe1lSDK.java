package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFe1lSDK implements AFe1iSDK<Map<String, Object>> {
    public static Map<String, Object> valueOf(String str) throws JSONException {
        Object obj;
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.isNull(next)) {
                    obj = null;
                } else {
                    obj = jSONObject.get(next);
                }
                hashMap.put(next, obj);
            }
            hashMap.remove("is_cache");
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", e);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("string_response", str);
            return hashMap2;
        }
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ Map<String, Object> AFKeystoreWrapper(String str) throws JSONException {
        return valueOf(str);
    }
}
