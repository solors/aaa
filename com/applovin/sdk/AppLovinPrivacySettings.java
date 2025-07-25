package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC3987a4;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;

/* loaded from: classes2.dex */
public class AppLovinPrivacySettings {
    @Nullable
    public static Boolean getAdditionalConsentStatus(int i) {
        C5416j c5416j = C5416j.f9935u0;
        if (c5416j == null) {
            C5434n.m94898h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return c5416j.m95079j0().m96274a(i);
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i) {
        C5416j c5416j = C5416j.f9935u0;
        if (c5416j == null) {
            C5434n.m94898h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return c5416j.m95079j0().m96269b(i);
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i) {
        C5416j c5416j = C5416j.f9935u0;
        if (c5416j == null) {
            C5434n.m94898h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return c5416j.m95079j0().m96266c(i);
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i) {
        C5416j c5416j = C5416j.f9935u0;
        if (c5416j == null) {
            C5434n.m94898h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return c5416j.m95079j0().m96263d(i);
    }

    public static boolean hasUserConsent(Context context) {
        Boolean m101055b = AbstractC3987a4.m101061b().m101055b(context);
        if (m101055b != null) {
            return m101055b.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean m101055b = AbstractC3987a4.m101066a().m101055b(context);
        if (m101055b != null) {
            return m101055b.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        if (AbstractC3987a4.m101066a().m101055b(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean isUserConsentSet(Context context) {
        if (AbstractC3987a4.m101061b().m101055b(context) != null) {
            return true;
        }
        return false;
    }

    public static void setDoNotSell(boolean z, Context context) {
        C5434n.m94899g("AppLovinPrivacySettings", "setDoNotSell()");
        if (AbstractC3987a4.m101062a(z, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        C5434n.m94899g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (AbstractC3987a4.m101060b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), null);
        }
    }
}
