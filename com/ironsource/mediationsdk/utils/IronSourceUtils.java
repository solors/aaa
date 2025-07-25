package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C19588ak;
import com.ironsource.C19709ch;
import com.ironsource.C19821el;
import com.ironsource.C20086i9;
import com.ironsource.C20747r8;
import com.ironsource.C20761ri;
import com.ironsource.C21059u3;
import com.ironsource.C21085un;
import com.ironsource.C21220xc;
import com.ironsource.InterfaceC19697ce;
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.logger.C20417d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.unity3d.mediation.LevelPlay;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceUtils {
    private static final String DEFAULT_IS_EVENTS_FORMATTER_TYPE = "default_is_events_formatter_type";
    private static final String DEFAULT_IS_EVENTS_URL = "default_is_events_url";
    private static final String DEFAULT_IS_NON_CONNECTIVITY_EVENTS = "default_is_non_connectivity_events";
    private static final String DEFAULT_IS_OPT_IN_EVENTS = "default_is_opt_in_events";
    private static final String DEFAULT_IS_OPT_OUT_EVENTS = "default_is_opt_out_events";
    private static final String DEFAULT_IS_TRIGGER_EVENTS = "default_is_trigger_events";
    private static final String DEFAULT_PXL_EVENTS_URL = "default_pxl_events_url";
    private static final String DEFAULT_PXL_TRIGGER_EVENTS = "default_pxl_trigger_events";
    private static final String DEFAULT_RV_EVENTS_FORMATTER_TYPE = "default_rv_events_formatter_type";
    private static final String DEFAULT_RV_EVENTS_URL = "default_rv_events_url";
    private static final String DEFAULT_RV_NON_CONNECTIVITY_EVENTS = "default_rv_non_connectivity_events";
    private static final String DEFAULT_RV_OPT_IN_EVENTS = "default_rv_opt_in_events";
    private static final String DEFAULT_RV_OPT_OUT_EVENTS = "default_rv_opt_out_events";
    private static final String DEFAULT_RV_TRIGGER_EVENTS = "default_rv_trigger_events";
    private static final String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";
    private static final String GENERAL_PROPERTIES = "general_properties";
    private static final String LAST_RESPONSE = "last_response";
    private static final String PROVIDER_PRIORITY = "providerPriority";
    private static final String SDK_VERSION = "8.4.0";
    private static final String SHARED_PREFERENCES_NAME = "Mediation_Shared_Preferences";
    private static int serr = 1;
    private static AtomicBoolean mDidCreateSessionID = new AtomicBoolean(false);
    private static String mSessionId = null;
    private static Boolean mFirstSession = null;
    private static IronSourceUtils instance = new IronSourceUtils();

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new C20417d());
        thread.start();
    }

    public static JSONObject deepMergeJSONObjects(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof JSONObject) && jSONObject3.optJSONObject(next) != null) {
                obj = deepMergeJSONObjects(jSONObject3.getJSONObject(next), (JSONObject) obj);
            }
            jSONObject3.put(next, obj);
        }
        return jSONObject3;
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Map<LevelPlay.AdFormat, Map<String, JSONObject>> getAdUnitIds() {
        C19588ak mo57983a;
        LevelPlay.AdFormat[] values;
        HashMap hashMap = new HashMap();
        try {
            mo57983a = C19821el.m58797N().mo57089r().mo57983a();
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e);
        }
        if (mo57983a == null) {
            return hashMap;
        }
        for (LevelPlay.AdFormat adFormat : LevelPlay.AdFormat.values()) {
            HashMap hashMap2 = new HashMap();
            hashMap.put(adFormat, hashMap2);
            for (String str : mo57983a.m59437a(adFormat)) {
                if (!str.equals(C21059u3.f53751e)) {
                    hashMap2.put(str, new JSONObject());
                }
            }
        }
        return hashMap;
    }

    public static String getBase64Auth(String str, String str2) {
        String str3 = str + ":" + str2;
        return "Basic " + Base64.encodeToString(str3.getBytes(), 10);
    }

    public static boolean getBooleanFromSharedPrefs(Context context, String str, boolean z) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getBoolean(str, z);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return C20747r8.f52730b;
            }
            if (!networkCapabilities.hasTransport(0)) {
                return "none";
            }
            return C20747r8.f52735g;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to connection type - exception = " + e);
            return "none";
        }
    }

    public static String getCurrentMethodName() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultFormatterTypeByEventType(str), str2);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultEventsUrlByEventType(str), str2);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e);
            }
        }
        return str2;
    }

    private static String getDefaultEventsUrlByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_EVENTS_URL;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_EVENTS_URL;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return DEFAULT_PXL_EVENTS_URL;
        }
        return "";
    }

    private static String getDefaultFormatterTypeByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_EVENTS_FORMATTER_TYPE;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_EVENTS_FORMATTER_TYPE;
        }
        return "";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultNonConnectivityEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultNonConnectivityEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_NON_CONNECTIVITY_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_NON_CONNECTIVITY_EVENTS;
        }
        return "";
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptInEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultOptInEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_OPT_IN_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_OPT_IN_EVENTS;
        }
        return "";
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptOutEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultOptOutEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_OPT_OUT_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_OPT_OUT_EVENTS;
        }
        return "";
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultTriggerEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultTriggerEventsByEventType(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_TRIGGER_EVENTS;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_TRIGGER_EVENTS;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return DEFAULT_PXL_TRIGGER_EVENTS;
        }
        return "";
    }

    public static String getDeviceType(Context context) {
        if (C19821el.m58797N().mo57096f().mo57116r(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (mFirstSession == null) {
            mFirstSession = Boolean.valueOf(!C19709ch.m59160a(context));
        }
        return mFirstSession.booleanValue();
    }

    public static IronSourceUtils getInstance() {
        return instance;
    }

    public static int getIntFromSharedPrefs(Context context, String str, int i) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getInt(str, i);
    }

    public static C20761ri getIronSourceAdvId(Context context) {
        String str;
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        if (context != null) {
            String mo54642b = C20423p.m56615m().mo54642b(context);
            if (TextUtils.isEmpty(mo54642b)) {
                mo54642b = mo57096f.mo57167J(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
                str = IronSourceConstants.TYPE_UUID;
            } else {
                str = IronSourceConstants.TYPE_GAID;
            }
            return new C20761ri(mo54642b, str);
        }
        return null;
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i < list.size() && i2 < list2.size(); i2++) {
                String str2 = list.get(i);
                String str3 = list2.get(i2);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, POBAdDescriptor.DYNAMIC_PRICE_BID);
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(LAST_RESPONSE, "");
    }

    public static long getLongFromSharedPrefs(Context context, String str, long j) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong(str, j);
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z) {
        return getMediationAdditionalData(z, false, 1);
    }

    public static String getMediationUserId() {
        return C21220xc.m54147a().m54146a("userId");
    }

    public static String getSDKVersion() {
        return "8.4.0";
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            C20086i9.m57997d().m58003a(e);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e);
                return "";
            }
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getSHA256(input:" + str + ")", e);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (mDidCreateSessionID.compareAndSet(false, true)) {
                mSessionId = UUID.randomUUID().toString();
            }
            str = mSessionId;
        }
        return str;
    }

    public static String getStringFromSharedPrefs(Context context, String str, String str2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(str, str2);
    }

    public static long getTimestamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j, String str) {
        return getSHA256(String.format("%s%s%s", Long.valueOf(j), C20423p.m56615m().m56613n(), str));
    }

    public static String getUserIdForNetworks() {
        String m54146a = C21220xc.m54147a().m54146a("userId");
        if (!TextUtils.isEmpty(m54146a)) {
            return m54146a;
        }
        return null;
    }

    public static boolean isEncryptedResponse() {
        if (serr == 1) {
            return true;
        }
        return false;
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return C21085un.m54607d(context);
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to check if network is connected - exception = " + e);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static List<Pair<String, String>> parseJsonToPairList(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return arrayList;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return hashMap;
    }

    public static void saveBooleanToSharedPrefs(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                edit.putString(getDefaultFormatterTypeByEventType(str), str2);
                edit.apply();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                edit.putString(getDefaultEventsUrlByEventType(str), str2);
                edit.apply();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i : iArr) {
                        sb2.append(i);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = null;
                }
                edit.putString(getDefaultNonConnectivityEventsByEventType(str), str2);
                edit.apply();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i : iArr) {
                        sb2.append(i);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = null;
                }
                edit.putString(getDefaultOptInEventsByEventType(str), str2);
                edit.apply();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i : iArr) {
                        sb2.append(i);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = null;
                }
                edit.putString(getDefaultOptOutEventsByEventType(str), str2);
                edit.apply();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i : iArr) {
                        sb2.append(i);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = null;
                }
                edit.putString(getDefaultTriggerEventsByEventType(str), str2);
                edit.apply();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e);
            }
        }
    }

    public static void saveIntToSharedPrefs(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            edit.putString(LAST_RESPONSE, str);
            edit.apply();
        }
    }

    public static void saveLongToSharedPrefs(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void saveStringToSharedPrefs(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
        }
    }

    private static void setSerr(int i) {
        serr = i;
    }

    public static JSONObject getMediationAdditionalData(boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z2 && i != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i);
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
        }
        return jSONObject;
    }
}
