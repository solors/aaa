package com.learnings.luid;

import android.os.Build;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.p552ot.pubsub.util.C26601v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes6.dex */
final class MeeviiCommonHttpHeaderFactory {
    private static final String API_VERSION = "2";
    private static final String PARAMS_KEY_API_VERSION = "apiVersion";
    private static final String PARAMS_KEY_APP = "app";
    private static final String PARAMS_KEY_CDN_ABTEST = "CDN-ABTest";
    private static final String PARAMS_KEY_COUNTRY = "country";
    private static final String PARAMS_KEY_LANGUAGE = "language";
    private static final String PARAMS_KEY_PLATFORM = "platform";
    private static final String PARAMS_KEY_TIMEZONE = "timezone";
    private static final String PARAMS_KEY_TODAY = "today";
    private static final String PARAMS_KEY_USER_AGENT = "User-Agent";
    private static final String PARAMS_KEY_VERSION_NAME = "version";
    private static final String PARAMS_KEY_VERSION_NUM = "versionNum";

    MeeviiCommonHttpHeaderFactory() {
    }

    public static Map<String, String> create(String str, String str2, int i) {
        String todayTimeStamp = getTodayTimeStamp();
        String country = Locale.getDefault().getCountry();
        String id2 = TimeZone.getDefault().getID();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", getUaTitle() + " " + str + RemoteSettings.FORWARD_SLASH_STRING + str2);
        hashMap.put(PARAMS_KEY_TODAY, todayTimeStamp);
        hashMap.put("app", str);
        hashMap.put("version", str2);
        hashMap.put(PARAMS_KEY_VERSION_NUM, String.valueOf(i));
        hashMap.put("platform", "android");
        hashMap.put("country", country);
        hashMap.put("apiVersion", "2");
        hashMap.put(PARAMS_KEY_TIMEZONE, id2);
        return hashMap;
    }

    private static String getTodayTimeStamp() {
        return new SimpleDateFormat(C26601v.f69840g, Locale.US).format(new Date(System.currentTimeMillis()));
    }

    private static String getUaTitle() {
        return "android/" + Build.VERSION.SDK_INT;
    }
}
