package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Zd */
/* loaded from: classes9.dex */
public abstract class AbstractC34375Zd {

    /* renamed from: a */
    public static final SafePackageManager f93883a = new SafePackageManager();

    /* renamed from: b */
    public static final C34255Ud f93884b = new C34255Ud();

    /* renamed from: c */
    public static final C34279Vd f93885c = new C34279Vd();

    /* renamed from: d */
    public static final C34303Wd f93886d = new C34303Wd(2);

    /* renamed from: a */
    public static String m22039a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb2.append('-');
            sb2.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static EnumC34351Yd m22040a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        EnumC34351Yd enumC34351Yd = EnumC34351Yd.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return EnumC34351Yd.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            for (Integer num : f93885c.f95173a.keySet()) {
                if (networkCapabilities.hasTransport(num.intValue())) {
                    return (EnumC34351Yd) f93885c.m21158a(num);
                }
            }
            return enumC34351Yd;
        }
        return enumC34351Yd;
    }
}
