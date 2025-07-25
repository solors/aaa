package com.learnings.unity.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.AnalyzePlatform;
import p1007v3.AnalyzeManager;
import p1020w3.C44574a;

/* loaded from: classes6.dex */
public class GameAnalytics {
    public static final int APPSFLYER = 1;
    public static final int FACEBOOK = 2;
    public static final int FIREBASE = 4;
    public static final int LEARNINGS = 8;
    private static final String TAG = "GameAnalytics";
    private static String afConversionData;
    private static final Map<Long, Bundle> transactionData = new HashMap(8);
    private static final Map<Long, String> transactionNames = new HashMap(8);

    private static Bundle JsonToBundle(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
                if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                }
                if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                }
                if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                }
                if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bundle;
    }

    public static void addEventPairBool(long j, String str, boolean z) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).addEventPairBool[%s=%b]", Long.valueOf(j), str, Boolean.valueOf(z)));
        }
        Bundle bundle = transactionData.get(Long.valueOf(j));
        if (bundle != null) {
            bundle.putBoolean(str, z);
        }
    }

    public static void addEventPairDouble(long j, String str, double d) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).addEventPairDouble[%s=%f]", Long.valueOf(j), str, Double.valueOf(d)));
        }
        Bundle bundle = transactionData.get(Long.valueOf(j));
        if (bundle != null) {
            bundle.putDouble(str, d);
        }
    }

    public static void addEventPairFloat(long j, String str, float f) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).addEventPairFloat[%s=%f]", Long.valueOf(j), str, Float.valueOf(f)));
        }
        Bundle bundle = transactionData.get(Long.valueOf(j));
        if (bundle != null) {
            bundle.putFloat(str, f);
        }
    }

    public static void addEventPairInt(long j, String str, int i) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).appendInt[%s=%d]", Long.valueOf(j), str, Integer.valueOf(i)));
        }
        Bundle bundle = transactionData.get(Long.valueOf(j));
        if (bundle != null) {
            bundle.putInt(str, i);
        }
    }

    public static void addEventPairString(long j, String str, String str2) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).appendStr[%s=%s]", Long.valueOf(j), str, str2));
        }
        Bundle bundle = transactionData.get(Long.valueOf(j));
        if (bundle != null) {
            bundle.putString(str, str2);
        }
    }

    public static void agreeUserConsent() {
        AnalyzeManager.m2734g(AnalyzeAppDelegate.getContext());
    }

    public static long beginTransaction(String str) {
        long j = IdFactory.get();
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).create[%s]", Long.valueOf(j), str));
        }
        transactionNames.put(Long.valueOf(j), str);
        transactionData.put(Long.valueOf(j), new Bundle());
        return j;
    }

    public static void cancel(long j) {
        transactionData.remove(Long.valueOf(j));
        transactionNames.remove(Long.valueOf(j));
    }

    public static String getAfConversionData() {
        return afConversionData;
    }

    public static String getLearningsId() {
        return AnalyzeManager.m2733h(UnityPlayer.currentActivity);
    }

    public static String getUUID() {
        if (AnalyzeAppDelegate.getContext() != null) {
            return AnalyzeManager.m2732i(AnalyzeAppDelegate.getContext());
        }
        return "";
    }

    public static void init(boolean z) {
        AnalyticsLogger.warning(TAG, "init. you should not use this method.");
    }

    public static void installAnalyticsPlatform(int i) {
        AnalyticsLogger.warning(TAG, "installAnalyticsPlatform. you should not use this method.");
    }

    public static void installAnalyticsPlatformWithContext(int i, Context context) {
        AnalyticsLogger.warning(TAG, "installAnalyticsPlatformWithContext. you should not use this method.");
    }

    private static boolean isPlatform(int i, int i2) {
        if ((i & i2) > 0) {
            return true;
        }
        return false;
    }

    private static AnalyzePlatform[] platformNames(int i) {
        ArrayList arrayList = new ArrayList();
        if (isPlatform(i, 1)) {
            arrayList.add(AnalyzePlatform.f51c);
        }
        if (isPlatform(i, 2)) {
            arrayList.add(AnalyzePlatform.f52d);
        }
        if (isPlatform(i, 4)) {
            arrayList.add(AnalyzePlatform.f50b);
        }
        if (isPlatform(i, 8)) {
            arrayList.add(AnalyzePlatform.f53e);
        }
        return (AnalyzePlatform[]) arrayList.toArray(new AnalyzePlatform[0]);
    }

    public static void send(long j, int i) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).send %s", Long.valueOf(j), platformNames(i)));
        }
        Map<Long, String> map = transactionNames;
        Map<Long, Bundle> map2 = transactionData;
        map.remove(Long.valueOf(j));
        map2.remove(Long.valueOf(j));
        send(map.get(Long.valueOf(j)), map2.get(Long.valueOf(j)), null, i);
    }

    public static void sendEvent(String str, String str2, int i) {
        sendEvent(str, JsonToBundle(str2), i);
    }

    public static void sendInnerEvent(String str, Bundle bundle, int i) {
        AnalyticsLogger.warning(TAG, "sendInnerEvent. you should not use this method.");
    }

    public static void sendWithValueToSum(long j, double d, int i) {
        if (AnalyticsLogger.getVerbose()) {
            AnalyticsLogger.debug(TAG, String.format(Locale.US, "transaction(%d).send %s", Long.valueOf(j), platformNames(i)));
        }
        Map<Long, String> map = transactionNames;
        Map<Long, Bundle> map2 = transactionData;
        map.remove(Long.valueOf(j));
        map2.remove(Long.valueOf(j));
        send(map.get(Long.valueOf(j)), map2.get(Long.valueOf(j)), Double.valueOf(d), i);
    }

    public static void setAccountId(String str) {
        AnalyzeManager.m2722s(str);
    }

    public static void setAfConversionData(String str) {
        afConversionData = str;
    }

    public static void setAppId(String str) {
        AnalyticsLogger.warning(TAG, "setAppId. you should not use this method.");
    }

    public static void setAppsflyerDevKey(String str) {
        AnalyticsLogger.warning(TAG, "setAppsflyerDevKey. you should not use this method.");
    }

    public static void setEventProperty(String str, String str2) {
        AnalyzeManager.m2717x(str, str2);
    }

    public static void setLuid(String str) {
        AnalyzeManager.m2715z(str);
    }

    public static void setUserId(String str, int i) {
        AnalyticsLogger.warning(TAG, "setUserId. you should not use this method.");
    }

    public static void setUserProperty(String str, String str2) {
        AnalyzeManager.m2741B(str, str2);
    }

    public static void setWhiteList(String str) {
        AnalyticsLogger.warning(TAG, "setWhiteList. you should not use this method.");
    }

    public static void sendEvent(String str, String str2, Double d, int i) {
        sendEvent(str, JsonToBundle(str2), d, i);
    }

    public static void setUserProperty(String str, String str2, int i) {
        setUserProperty(str, str2);
    }

    public static void sendEvent(String str, Bundle bundle) {
        new C44574a.C44575a(str).m2365b(bundle).m2366a().mo2359k();
    }

    public static void sendEvent(String str, Bundle bundle, Double d) {
        new C44574a.C44575a(str).m2365b(bundle).m2364c(new AnalyzePlatform[0]).m2363d(d).m2366a().mo2359k();
    }

    public static void sendEvent(String str, Bundle bundle, int i) {
        new C44574a.C44575a(str).m2365b(bundle).m2364c(platformNames(i)).m2366a().mo2359k();
    }

    public static void sendEvent(String str, Bundle bundle, Double d, int i) {
        new C44574a.C44575a(str).m2365b(bundle).m2364c(platformNames(i)).m2363d(d).m2366a().mo2359k();
    }

    public static void send(String str, Bundle bundle, int i) {
        sendEvent(str, bundle, i);
    }

    public static void send(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sendEvent(str, bundle);
    }

    public static void send(String str, Bundle bundle, Double d, int i) {
        sendEvent(str, bundle, d, i);
    }
}
