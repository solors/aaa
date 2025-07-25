package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFb1bSDK {
    public static Map<String, String> valueOf(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), C20517nb.f52167N), URLEncoder.encode(entry.getValue(), C20517nb.f52167N));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return hashMap;
    }
}
