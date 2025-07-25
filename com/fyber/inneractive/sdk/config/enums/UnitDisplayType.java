package com.fyber.inneractive.sdk.config.enums;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT("default", false);
    
    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        UnitDisplayType[] values;
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = CONSTANTS.get(str);
        if (unitDisplayType == null) {
            return DEFAULT;
        }
        return unitDisplayType;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        if (this != INTERSTITIAL && this != REWARDED) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
