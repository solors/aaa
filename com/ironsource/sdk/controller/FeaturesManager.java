package com.ironsource.sdk.controller;

import com.ironsource.C20084i8;
import com.ironsource.C20086i9;
import com.ironsource.C20140j8;
import com.ironsource.C20165jr;
import com.ironsource.C20202kd;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class FeaturesManager {

    /* renamed from: c */
    private static volatile FeaturesManager f52910c = null;

    /* renamed from: d */
    private static final String f52911d = "debugMode";

    /* renamed from: a */
    private Map<String, ?> f52912a;

    /* renamed from: b */
    private final ArrayList<String> f52913b = new C20803a();

    /* renamed from: com.ironsource.sdk.controller.FeaturesManager$a */
    /* loaded from: classes6.dex */
    class C20803a extends ArrayList<String> {
        C20803a() {
            add(C21114v8.C21118d.f53939f);
            add(C21114v8.C21118d.f53938e);
            add(C21114v8.C21118d.f53940g);
            add(C21114v8.C21118d.f53941h);
            add(C21114v8.C21118d.f53942i);
            add(C21114v8.C21118d.f53943j);
            add(C21114v8.C21118d.f53944k);
            add(C21114v8.C21118d.f53945l);
            add(C21114v8.C21118d.f53946m);
        }
    }

    private FeaturesManager() {
        if (f52910c == null) {
            this.f52912a = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f52910c == null) {
            synchronized (FeaturesManager.class) {
                if (f52910c == null) {
                    f52910c = new FeaturesManager();
                }
            }
        }
        return f52910c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> m55341a() {
        return new ArrayList<>(this.f52913b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has(C21114v8.C21115a.f53879c)) {
            return networkConfiguration.optJSONObject(C21114v8.C21115a.f53879c);
        }
        return new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f52912a.containsKey("debugMode")) {
                num = (Integer) this.f52912a.get("debugMode");
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public C20084i8 getFeatureFlagCatchUrlError() {
        return new C20084i8(SDKUtils.getNetworkConfiguration().optJSONObject(C20084i8.C20085a.f50544c));
    }

    public C20140j8 getFeatureFlagClickCheck() {
        return new C20140j8(SDKUtils.getNetworkConfiguration());
    }

    public C20202kd getFeatureFlagHealthCheck() {
        return new C20202kd(SDKUtils.getNetworkConfiguration().optJSONObject(C21114v8.C21115a.f53893q));
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (optJSONObject == null) {
            return 0;
        }
        return optJSONObject.optInt(C21114v8.C21115a.f53880d, 0);
    }

    public C20165jr getSessionHistoryConfig() {
        JSONObject jSONObject;
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has(C21114v8.C21115a.f53894r)) {
            jSONObject = networkConfiguration.optJSONObject(C21114v8.C21115a.f53894r);
        } else {
            jSONObject = new JSONObject();
        }
        return new C20165jr(jSONObject);
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f52912a = map;
    }
}
