package com.meevii.soniclib.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes5.dex */
public class CountryUtil {
    public static String getCountry(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (!TextUtils.isEmpty(simCountryIso)) {
                    return simCountryIso.toUpperCase();
                }
            }
        } catch (Error | Exception e) {
            e.printStackTrace();
        }
        return Locale.getDefault().getCountry().toUpperCase();
    }
}
