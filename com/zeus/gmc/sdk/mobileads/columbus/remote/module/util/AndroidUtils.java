package com.zeus.gmc.sdk.mobileads.columbus.remote.module.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes8.dex */
public class AndroidUtils {
    private static final String TAG = "AndroidUtils";

    private AndroidUtils() {
    }

    public static String getRegion(Context context) {
        String str = "";
        if (!TextUtils.isEmpty("ro.miui.region")) {
            String str2 = SystemProperties.get("ro.miui.region", "");
            if (TextUtils.isEmpty(str2)) {
                str2 = SystemProperties.get("ro.product.locale.region", "");
            }
            str = TextUtils.isEmpty(str2) ? SystemProperties.get("persist.sys.country", "") : str2;
        } else if (context != null) {
            try {
                str = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
            } catch (Exception e) {
                MLog.m25899e(TAG, "getRegion had exception, ", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return Locale.getDefault().getCountry();
        }
        return str;
    }
}
