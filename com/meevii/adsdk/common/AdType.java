package com.meevii.adsdk.common;

import com.vungle.ads.internal.Constants;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;

/* loaded from: classes6.dex */
public enum AdType {
    BANNER("banner"),
    INTERSTITIAL("interstitial"),
    APPOPEN(Constants.PLACEMENT_TYPE_APP_OPEN),
    NATIVE("native"),
    REWARDED(Reporting.EventType.REWARD),
    SPLASH("splash"),
    UNKNOWN("unknown");
    
    private static Map<String, AdType> adTypeMap = new HashMap();
    public String name;

    static {
        AdType[] values;
        for (AdType adType : values()) {
            adTypeMap.put(adType.name, adType);
        }
    }

    AdType(String str) {
        this.name = str;
    }

    public static AdType fromStr(String str) {
        if (adTypeMap.containsKey(str)) {
            return adTypeMap.get(str);
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
