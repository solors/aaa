package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import net.pubnative.lite.sdk.models.C38595Ad;

/* loaded from: classes10.dex */
public class AdCustomCTAManager {
    public static final Integer CUSTOM_CTA_DELAY_DEFAULT = 2;
    public static final Integer CUSTOM_CTA_DELAY_MAX = 10;

    /* loaded from: classes10.dex */
    public enum CtaType {
        DEFAULT("default"),
        EXTENDED("extended");
        
        private final String mCtaType;

        CtaType(String str) {
            this.mCtaType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mCtaType;
        }
    }

    public static Integer getCustomCtaDelay(C38595Ad c38595Ad) {
        Integer num;
        if (c38595Ad.getCustomCTADelay() != null && c38595Ad.getCustomCTADelay().intValue() >= 0) {
            num = c38595Ad.getCustomCTADelay();
        } else {
            num = CUSTOM_CTA_DELAY_DEFAULT;
        }
        return Integer.valueOf(Math.min(num.intValue(), CUSTOM_CTA_DELAY_MAX.intValue()));
    }

    public static CtaType getCustomCtaType(C38595Ad c38595Ad) {
        String customCTAType = c38595Ad.getCustomCTAType();
        if (customCTAType != null) {
            CtaType ctaType = CtaType.EXTENDED;
            if (customCTAType.equals(ctaType.toString())) {
                return ctaType;
            }
        }
        return CtaType.DEFAULT;
    }

    private static Boolean hasIcon(C38595Ad c38595Ad) {
        boolean z;
        if (c38595Ad.hasCustomCTA() && !TextUtils.isEmpty(c38595Ad.getAsset("custom_cta").getStringField("icon")) && URLValidator.isValidURL(c38595Ad.getAsset("custom_cta").getStringField("icon"))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean isAbleShow(C38595Ad c38595Ad) {
        boolean z;
        if (isEnabled(c38595Ad).booleanValue() && hasIcon(c38595Ad).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Boolean isEnabled(C38595Ad c38595Ad) {
        boolean z;
        if (c38595Ad.isCustomCTAEnabled() != null && c38595Ad.isCustomCTAEnabled().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
