package com.meevii.adsdk.common;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.AccessToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum Platform {
    ADMOB("admob"),
    ADMOBMEDIATION("admobmediation"),
    FACEBOOK(AccessToken.DEFAULT_GRAPH_DOMAIN),
    UNITY("unityads"),
    APPLOVIN("applovin"),
    MSP("msp"),
    APPLOVINMAX("max"),
    VUNGLE("vungle"),
    ADCOLONY("adcolony"),
    CHARTBOOST("chartboost"),
    IRONSOURCE("ironsource"),
    GDTAD("gdtad"),
    BUAD("buad"),
    PANGLE("pangle"),
    MOPUB(AppLovinMediationProvider.MOPUB),
    SMAATO("smaato"),
    CRITEO("criteo"),
    FYBER("fyber"),
    BIDDERDESK("bidderdesk"),
    INMOBI("inmobi"),
    AMAZON("amazon"),
    MINTEGRAL("mintegral"),
    TAPJOY("tapjoy"),
    YANDEX("yandex"),
    SIGMOB("sigmob"),
    KUAISHOU("kuaishou"),
    PUBMATIC("pubmatic"),
    LEARNINGS("learnings"),
    BIDMACHINE("bidmachine"),
    OPPO("oppo"),
    MAIO("maio"),
    TOPON("topon"),
    NEND("nend"),
    ABUAD("abuad"),
    APS(ApsMetricsDataMap.APSMETRICS_FIELD_APS),
    MYTARGET("mytarget"),
    DISPLAYIO("displayio"),
    UNKNOWN("unknown");
    
    private static Map<String, Platform> nameMap = new HashMap();
    public String name;

    static {
        Platform[] values;
        for (Platform platform : values()) {
            nameMap.put(platform.name, platform);
        }
    }

    Platform(String str) {
        this.name = str;
    }

    public static Platform fromStr(String str) {
        if (nameMap.containsKey(str)) {
            return nameMap.get(str);
        }
        return UNKNOWN;
    }

    public String getName() {
        return this.name;
    }

    public boolean valid() {
        if (this != UNKNOWN) {
            return true;
        }
        return false;
    }
}
