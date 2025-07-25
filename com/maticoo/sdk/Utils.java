package com.maticoo.sdk;

import android.content.Context;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.maticoo.sdk.core.MaticooAds;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class Utils {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterError toMaxError(int i) {
        MaxAdapterError maxAdapterError;
        if (i != 111) {
            if (i != 135) {
                switch (i) {
                    case 131:
                        maxAdapterError = MaxAdapterError.SERVER_ERROR;
                        break;
                    case 132:
                    case 133:
                        break;
                    default:
                        maxAdapterError = MaxAdapterError.UNSPECIFIED;
                        break;
                }
            } else {
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
            }
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, "");
        }
        maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, "");
    }

    public static void updateConsentStatus(Context context) {
        if (context == null) {
            try {
                context = ApplicationUtil.getInstance().getApplicationContext();
            } catch (Exception unused) {
                return;
            }
        }
        boolean isUserConsentSet = AppLovinPrivacySettings.isUserConsentSet(context);
        DeveloperLog.LogD("[Max], updateConsentStatus, isUserConsentSet = " + isUserConsentSet);
        if (isUserConsentSet) {
            boolean hasUserConsent = AppLovinPrivacySettings.hasUserConsent(context);
            DeveloperLog.LogD("[Max], updateConsentStatus, hasUserConsent = " + hasUserConsent);
            MaticooAds.setGDPRConsent(hasUserConsent);
        }
        boolean isDoNotSellSet = AppLovinPrivacySettings.isDoNotSellSet(context);
        DeveloperLog.LogD("[Max], updateConsentStatus, isDoNotSellSet = " + isDoNotSellSet);
        if (isDoNotSellSet) {
            boolean isDoNotSell = AppLovinPrivacySettings.isDoNotSell(context);
            DeveloperLog.LogD("[Max], updateConsentStatus, isDoNotSell = " + isDoNotSell);
            MaticooAds.setDoNotTrackStatus(isDoNotSell);
        }
    }
}
