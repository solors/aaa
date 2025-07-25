package net.pubnative.lite.sdk;

import android.text.TextUtils;
import java.util.Locale;
import net.pubnative.lite.sdk.models.IntegrationType;

/* loaded from: classes10.dex */
public class DisplayManager {
    private static final String DISPLAY_MANAGER_ENGINE = "sdkandroid";
    private static final String DISPLAY_MANAGER_NAME = "HyBid";

    public String getDisplayManager() {
        return DISPLAY_MANAGER_NAME;
    }

    public String getDisplayManagerVersion() {
        return getDisplayManagerVersion(IntegrationType.IN_APP_BIDDING);
    }

    public String getDisplayManagerVersion(IntegrationType integrationType) {
        return getDisplayManagerVersion(null, integrationType);
    }

    public String getDisplayManagerVersion(String str, IntegrationType integrationType) {
        return String.format(Locale.ENGLISH, "%s_%s%s_%s", DISPLAY_MANAGER_ENGINE, integrationType.getCode(), !TextUtils.isEmpty(str) ? String.format(Locale.ENGLISH, "_%s", str) : "", "3.3.0");
    }
}
