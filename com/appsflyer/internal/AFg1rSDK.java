package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFg1rSDK implements AFg1oSDK {
    @NotNull
    private final Context AFKeystoreWrapper;
    @NotNull
    private final AppsFlyerProperties values;

    public AFg1rSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFKeystoreWrapper = context;
        this.values = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1oSDK
    @Nullable
    public final AFg1nSDK valueOf() {
        String string;
        if (!Boolean.parseBoolean(this.values.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFKeystoreWrapper);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt(CmpApiConstants.IABTCF_CMP_SDK_ID, -1);
            int i3 = defaultSharedPreferences.getInt(CmpApiConstants.IABTCF_POLICY_VERSION, -1);
            int i4 = defaultSharedPreferences.getInt(CmpApiConstants.IABTCF_CMP_SDK_VERSION, -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1nSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFg1cSDK.e$default(AFLogger.INSTANCE, AFg1bSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }
}
