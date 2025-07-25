package com.mobilefuse.sdk.privacy;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.device.DeviceCache;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: PrivacyPrefsDefaultsResolver.kt */
@Metadata
/* loaded from: classes7.dex */
public final class PrivacyPrefsDefaultsResolver {
    @NotNull
    public static final PrivacyPrefsDefaultsResolver INSTANCE = new PrivacyPrefsDefaultsResolver();

    private PrivacyPrefsDefaultsResolver() {
    }

    public static final void resolveDefaults() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PrivacyPrefsDefaultsResolver privacyPrefsDefaultsResolver = INSTANCE;
            Debugging.logDebug$default(privacyPrefsDefaultsResolver, "Try to resolve Privacy Prefs Defaults", null, 2, null);
            MobileFusePrivacyPreferences privacyPreferences = MobileFuse.getPrivacyPreferences();
            Intrinsics.checkNotNullExpressionValue(privacyPreferences, "MobileFuse.getPrivacyPreferences()");
            MobileFuse.setPrivacyPreferences(privacyPrefsDefaultsResolver.resolveGppConsentString(privacyPrefsDefaultsResolver.resolveUsPrivacyConsentString(privacyPreferences)));
        } catch (Throwable th) {
            int i = C23655x5481b35.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    private final MobileFusePrivacyPreferences resolveGppConsentString(MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (mobileFusePrivacyPreferences.getGppConsentString() != null) {
                return mobileFusePrivacyPreferences;
            }
            SharedPreferences defaultAppSharedPrefs = DeviceCache.INSTANCE.getDefaultAppSharedPrefs();
            String str = null;
            if (defaultAppSharedPrefs != null) {
                str = defaultAppSharedPrefs.getString("IABGPP_HDR_GppString", null);
            }
            return MobileFusePrivacyPreferences.copy$default(mobileFusePrivacyPreferences, str, null, false, false, 14, null);
        } catch (Throwable th) {
            if (C23656x9876f466.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            Throwable th2 = (Throwable) new ErrorResult(th).getValue();
            return mobileFusePrivacyPreferences;
        }
    }

    private final MobileFusePrivacyPreferences resolveUsPrivacyConsentString(MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        String str;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (mobileFusePrivacyPreferences.getUsPrivacyConsentString() != null) {
                return mobileFusePrivacyPreferences;
            }
            SharedPreferences defaultAppSharedPrefs = DeviceCache.INSTANCE.getDefaultAppSharedPrefs();
            if (defaultAppSharedPrefs != null) {
                str = defaultAppSharedPrefs.getString("IABUSPrivacy_String", null);
            } else {
                str = null;
            }
            return MobileFusePrivacyPreferences.copy$default(mobileFusePrivacyPreferences, null, str, false, false, 13, null);
        } catch (Throwable th) {
            if (C23657x382c55c9.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            Throwable th2 = (Throwable) new ErrorResult(th).getValue();
            return mobileFusePrivacyPreferences;
        }
    }
}
