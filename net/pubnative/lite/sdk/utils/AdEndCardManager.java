package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.models.C38595Ad;

/* loaded from: classes10.dex */
public class AdEndCardManager {
    private static final Boolean END_CARD_ENABLED = Boolean.TRUE;
    private static final Boolean CUSTOM_END_CARD_ENABLED = Boolean.FALSE;

    public static Boolean getDefaultEndCard() {
        return END_CARD_ENABLED;
    }

    private static Boolean hasEndcardRemoteConfig(C38595Ad c38595Ad) {
        boolean z;
        if (c38595Ad.isEndCardEnabled() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean isEndCardEnabled(C38595Ad c38595Ad) {
        if (c38595Ad == null) {
            return Boolean.FALSE;
        }
        boolean shouldShowEndcard = shouldShowEndcard(c38595Ad);
        if (!shouldShowEndcard) {
            shouldShowEndcard = shouldShowCustomEndcard(c38595Ad);
        }
        return Boolean.valueOf(shouldShowEndcard);
    }

    public static boolean shouldShowCustomEndcard(C38595Ad c38595Ad) {
        if (c38595Ad.hasCustomEndCard()) {
            if (c38595Ad.isCustomEndCardEnabled() != null) {
                return c38595Ad.isCustomEndCardEnabled().booleanValue();
            }
            return CUSTOM_END_CARD_ENABLED.booleanValue();
        }
        return false;
    }

    public static boolean shouldShowEndcard(C38595Ad c38595Ad) {
        if (c38595Ad.hasEndCard()) {
            if (hasEndcardRemoteConfig(c38595Ad).booleanValue()) {
                return c38595Ad.isEndCardEnabled().booleanValue();
            }
            return END_CARD_ENABLED.booleanValue();
        }
        return false;
    }
}
