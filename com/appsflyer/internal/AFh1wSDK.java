package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFh1wSDK {
    public final AFd1pSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public long AFLogger;

    /* renamed from: d */
    public long f13067d;

    /* renamed from: e */
    public final long[] f13068e;
    public long force;
    public final long[] registerClient;
    public final long[] unregisterClient;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    /* renamed from: w */
    public long f13069w;

    public AFh1wSDK(AFd1pSDK aFd1pSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.values = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap3;
        this.AFInAppEventType = 0L;
        this.AFLogger = 0L;
        this.unregisterClient = new long[2];
        this.f13068e = new long[2];
        this.registerClient = new long[2];
        this.f13067d = 0L;
        this.force = 0L;
        this.AFInAppEventParameterName = aFd1pSDK;
        concurrentHashMap.putAll(AFInAppEventParameterName("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventParameterName("ddl"));
        concurrentHashMap3.putAll(AFInAppEventParameterName("gcd"));
        this.f13069w = aFd1pSDK.AFInAppEventParameterName("prev_session_dur", 0L);
    }

    private Map<String, Object> AFInAppEventParameterName(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper(str, (String) null);
        if (AFKeystoreWrapper != null) {
            try {
                return AFa1mSDK.AFInAppEventParameterName(new JSONObject(AFKeystoreWrapper));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
                return emptyMap;
            }
        }
        return emptyMap;
    }

    public final void AFInAppEventType() {
        this.AFLogger = System.currentTimeMillis();
        if (values()) {
            long j = this.AFInAppEventType;
            if (j != 0) {
                this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.AFLogger - j));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFKeystoreWrapper(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f13067d = currentTimeMillis;
        if (i == 1) {
            long j = this.AFLogger;
            if (j != 0) {
                this.AFKeystoreWrapper.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void values(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.force;
        if (j != 0) {
            this.valueOf.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.valueOf.put("retries", Integer.valueOf(i));
        this.AFInAppEventParameterName.AFInAppEventParameterName("gcd", new JSONObject(this.valueOf).toString());
    }

    public final void AFInAppEventType(AFh1uSDK aFh1uSDK) {
        if (values()) {
            this.AFKeystoreWrapper.put("start_with", aFh1uSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.valueOf("appsFlyerCount", 0) == 0;
    }

    public final void AFInAppEventType(DeepLinkResult deepLinkResult, long j) {
        this.values.put("status", deepLinkResult.getStatus().toString());
        this.values.put("timeout_value", Long.valueOf(j));
        this.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(this.values).toString());
    }
}
