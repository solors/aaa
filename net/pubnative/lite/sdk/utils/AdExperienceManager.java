package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.models.AdExperience;

/* loaded from: classes10.dex */
public class AdExperienceManager {
    public static boolean isBrandAd(Integer num, String str) {
        if (isBrandCompatible(num) && str.equalsIgnoreCase("brand")) {
            return true;
        }
        return false;
    }

    private static boolean isBrandCompatible(Integer num) {
        if (num.intValue() == 15) {
            return true;
        }
        return false;
    }

    public static boolean isPerformanceAd(Integer num, String str) {
        if (isPerformanceCompatible(num) && str.equalsIgnoreCase(AdExperience.PERFORMANCE)) {
            return true;
        }
        return false;
    }

    private static boolean isPerformanceCompatible(Integer num) {
        if (num.intValue() != 15 && num.intValue() != 21 && num.intValue() != 29 && num.intValue() != 23 && num.intValue() != 22 && num.intValue() != 27) {
            return false;
        }
        return true;
    }
}
