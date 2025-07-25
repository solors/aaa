package net.pubnative.lite.sdk.vpaid.macros;

import android.text.TextUtils;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;

/* loaded from: classes10.dex */
public class RegulationMacros {
    private static final String MACRO_GDPR_CONSENT = "[GDPRCONSENT]";
    private static final String MACRO_LIMIT_AD_TRACKING = "[LIMITADTRACKING]";
    private static final String MACRO_REGULATIONS = "[REGULATIONS]";
    private final DeviceInfo mDeviceInfo;
    private final UserDataManager mUserDataManager;

    public RegulationMacros() {
        this(HyBid.getDeviceInfo(), HyBid.getUserDataManager());
    }

    private String getGdprConsent() {
        UserDataManager userDataManager = this.mUserDataManager;
        if (userDataManager != null && !TextUtils.isEmpty(userDataManager.getIABGDPRConsentString())) {
            return this.mUserDataManager.getIABGDPRConsentString();
        }
        return String.valueOf(-1);
    }

    private String getLimitAdTracking() {
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null) {
            if (deviceInfo.limitTracking()) {
                return "1";
            }
            return "0";
        }
        return String.valueOf(-1);
    }

    private String getRegulations() {
        StringBuilder sb2 = new StringBuilder();
        UserDataManager userDataManager = this.mUserDataManager;
        if (userDataManager != null) {
            if (userDataManager.gdprApplies() || !TextUtils.isEmpty(this.mUserDataManager.getIABGDPRConsentString())) {
                sb2.append("gdpr");
            }
            if (HyBid.isCoppaEnabled()) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append("coppa");
            }
        }
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(sb3)) {
            return String.valueOf(-1);
        }
        return sb3;
    }

    public String processUrl(String str) {
        return str.replace(MACRO_LIMIT_AD_TRACKING, getLimitAdTracking()).replace(MACRO_REGULATIONS, getRegulations()).replace(MACRO_GDPR_CONSENT, getGdprConsent());
    }

    RegulationMacros(DeviceInfo deviceInfo, UserDataManager userDataManager) {
        this.mDeviceInfo = deviceInfo;
        this.mUserDataManager = userDataManager;
    }
}
