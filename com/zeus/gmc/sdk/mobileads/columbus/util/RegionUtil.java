package com.zeus.gmc.sdk.mobileads.columbus.util;

import android.content.ContentResolver;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes8.dex */
public class RegionUtil {
    private static final String c2oc2i = "android.os.SystemProperties";
    private static final Set<String> cioccoiococ = new HashSet(Arrays.asList("AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"));
    private static final String coi222o222 = "unknown";
    private static final String coo2iico = "RegionUtil";

    private static String coo2iico(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getSystemProperties error : ", e);
            return "";
        }
    }

    public static String getRegion() {
        String coo2iico2 = coo2iico("ro.miui.region");
        if (TextUtils.isEmpty(coo2iico2)) {
            LocaleList localeList = LocaleList.getDefault();
            if (localeList.size() > 0) {
                coo2iico2 = localeList.get(0).getCountry();
            }
            if (TextUtils.isEmpty(coo2iico2)) {
                coo2iico2 = Locale.getDefault().getCountry();
            }
        }
        if (TextUtils.isEmpty(coo2iico2)) {
            return "unknown";
        }
        return coo2iico2;
    }

    public static boolean isAdEnableInEURegion(Context context) {
        if (!isInEURegion()) {
            return true;
        }
        return coo2iico(context);
    }

    public static boolean isInEURegion() {
        String region = getRegion();
        if (!TextUtils.isEmpty(region) && !TextUtils.equals(region, "unknown")) {
            return cioccoiococ.contains(region);
        }
        return true;
    }

    private static boolean coo2iico(Context context) {
        try {
            Object invoke = Class.forName("android.provider.MiuiSettings$Ad").getDeclaredMethod("isPersonalizedAdEnabled", ContentResolver.class).invoke(null, context.getContentResolver());
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception unused) {
            MLog.m25889e(coo2iico, "isPersonalizedAdEnabled error.");
        }
        return false;
    }
}
