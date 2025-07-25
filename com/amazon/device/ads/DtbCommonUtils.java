package com.amazon.device.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.applovin.sdk.AppLovinMediationProvider;
import com.unity3d.player.UnityPlayerActivity;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DtbCommonUtils {
    private static final String IAB_GPP_SID = "gpp_sid";
    private static final String IAB_GPP_STRING = "gpp";
    private static String sdkFlavor;

    /* loaded from: classes2.dex */
    static class APIVersion {
        public int majorVersion = 0;
        public int minorVersion = 0;
    }

    private DtbCommonUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, Object> addGPPParametersFromPreferences(SharedPreferences sharedPreferences) {
        Object obj;
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            Object obj2 = null;
            if (sharedPreferences.contains("IABGPP_HDR_GppString")) {
                obj = sharedPreferences.getAll().get("IABGPP_HDR_GppString");
            } else {
                obj = null;
            }
            if ((obj instanceof String) && !isNullOrEmpty((String) obj)) {
                hashMap.put("gpp", (String) obj);
            }
            if (sharedPreferences.contains("IABGPP_GppSID")) {
                obj2 = sharedPreferences.getAll().get("IABGPP_GppSID");
            }
            if ((obj2 instanceof String) && !isNullOrEmpty((String) obj2)) {
                JSONArray jSONArray = new JSONArray();
                Matcher matcher = Pattern.compile("\\d+").matcher((String) obj2);
                while (matcher.find()) {
                    for (int i = 0; i <= matcher.groupCount(); i++) {
                        jSONArray.put(Integer.parseInt(matcher.group(i)));
                    }
                }
                if (jSONArray.length() > 0) {
                    hashMap.put("gpp_sid", jSONArray);
                }
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to get Global privacy platform params from shared preference", e);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBAdRequest createAutoRefreshAdLoader(DTBAdRequest dTBAdRequest) {
        DTBAdRequest dTBAdRequest2 = new DTBAdRequest();
        if (!isNullOrEmpty(dTBAdRequest.getAdSizes())) {
            dTBAdRequest2.setAdSizes(dTBAdRequest.getAdSizes());
        }
        if (!isNullOrEmpty(dTBAdRequest.getSlotGroupName())) {
            dTBAdRequest2.setSlotGroup(dTBAdRequest.getSlotGroupName());
        }
        if (!isNullOrEmpty(dTBAdRequest.getCustomTargets())) {
            dTBAdRequest2.setCustomTargets(dTBAdRequest.getCustomTargets());
        }
        dTBAdRequest2.setRefreshFlag(true);
        return dTBAdRequest2;
    }

    static String exceptionToString(Exception exc) {
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage != null) {
            return "(" + localizedMessage + ")";
        }
        return "";
    }

    @NonNull
    static APIVersion getAPIVersion(String str) {
        String str2;
        String str3;
        APIVersion aPIVersion = new APIVersion();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = str;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str3 = stringTokenizer.nextToken();
            } else {
                str3 = "0";
            }
            try {
                aPIVersion.majorVersion = Integer.parseInt(str2);
                aPIVersion.minorVersion = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                DtbLog.warn("Invalid API version:" + str);
            }
        }
        return aPIVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle getApplicationBundle() throws PackageManager.NameNotFoundException {
        if (AdRegistration.getContext() != null) {
            return AdRegistration.getContext().getPackageManager().getApplicationInfo(AdRegistration.getContext().getPackageName(), 128).metaData;
        }
        throw new IllegalStateException("Application Context can't be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getHostNameFromUrl(String str) {
        if (!str.startsWith(DtbConstants.HTTPS) && !str.startsWith("http://")) {
            str = DtbConstants.HTTPS + str;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception unused) {
            DtbLog.error(String.format("The url %s that is passed for parsing is invalid. Please check the URL", new Object[0]));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Integer getIntegerFieldValue(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            if (declaredField.isAccessible()) {
                return (Integer) declaredField.get(null);
            }
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        } catch (ClassNotFoundException unused) {
            DtbLog.debug("Class notFound:" + str);
            return null;
        } catch (IllegalAccessException e) {
            DtbLog.debug("Illegal Access exception:" + e.getMessage());
            return null;
        } catch (IllegalArgumentException e2) {
            DtbLog.debug("Illegal Argument exception:" + e2.getMessage());
            return null;
        } catch (NoSuchFieldException unused2) {
            DtbLog.debug("Field:" + str2 + " does not exist");
            return null;
        } catch (SecurityException unused3) {
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        }
    }

    static long getMilliSeconds(String str) {
        return Long.parseLong(str) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject getParamsAsJson(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            jSONObject.put(str, map.get(str));
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getParamsAsJsonString(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            jSONObject.put(str, map.get(str));
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputStream getResourceAsStream(String str) {
        return DtbCommonUtils.class.getResourceAsStream(str);
    }

    static String getSDKFlavor() {
        String[] strArr;
        String str = sdkFlavor;
        if (str != null) {
            return str;
        }
        for (String str2 : AdRegistration.serverlessMarkers) {
            try {
                Class.forName(str2);
                if (str2.contains("admob")) {
                    sdkFlavor = "admob";
                } else if (str2.contains(AppLovinMediationProvider.MOPUB)) {
                    sdkFlavor = AppLovinMediationProvider.MOPUB;
                } else if (str2.contains("applovin")) {
                    sdkFlavor = "MAX";
                }
                Map<String, String> customDictionary = AdRegistration.getCustomDictionary();
                break;
            } catch (Exception unused) {
            }
        }
        Map<String, String> customDictionary2 = AdRegistration.getCustomDictionary();
        if (!isNullOrEmpty(customDictionary2)) {
            String str3 = customDictionary2.get(DtbConstants.MEDIATION_NAME);
            if (!isNullOrEmpty(str3)) {
                sdkFlavor = str3;
            }
        }
        return sdkFlavor;
    }

    public static String getSDKFramework() {
        try {
            int i = UnityPlayerActivity.f74821b;
            return "unity";
        } catch (ClassNotFoundException unused) {
            return "native";
        }
    }

    public static String getSDKMRAIDVersion() {
        String sDKFlavor = getSDKFlavor();
        if (sDKFlavor == null) {
            return "aps-android";
        }
        return "aps-android-" + sDKFlavor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSDKVersion() {
        String sDKFlavor = getSDKFlavor();
        if (sDKFlavor == null) {
            return "aps-android-9.10.3";
        }
        return "aps-android-9.10.3-" + sDKFlavor;
    }

    @Nullable
    static String getStringFieldValue(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            if (declaredField.isAccessible()) {
                return (String) declaredField.get(null);
            }
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        } catch (ClassNotFoundException unused) {
            DtbLog.debug("Class not found:" + str);
            return null;
        } catch (IllegalAccessException e) {
            DtbLog.debug("Illegal Access exception:" + e.getMessage());
            return null;
        } catch (IllegalArgumentException e2) {
            DtbLog.debug("Illegal Argument exception:" + e2.getMessage());
            return null;
        } catch (NoSuchFieldException unused2) {
            DtbLog.debug("Field:" + str2 + " does not exist");
            return null;
        } catch (SecurityException unused3) {
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getURLEncodedString(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace(ProxyConfig.MATCH_ALL_SCHEMES, "%2A").replace("%7E", "~");
        } catch (UnsupportedEncodingException unused) {
            DtbLog.debugError("Unable to url encode :" + str);
            return str;
        }
    }

    public static Bundle initializeEmptyBundle() {
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(17)
    public static boolean isActivityDestroyed(Activity activity) {
        if (activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isNetworkConnected() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (AdRegistration.getContext() == null || AdRegistration.getContext().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1)) {
            return true;
        }
        return false;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.equals("");
    }

    public static boolean isNullOrWhiteSpace(String str) {
        if (!isNullOrEmpty(str) && !str.trim().equals("")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isOnMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            DtbLog.debugError("Exception parsing the integer from string:" + str);
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isNullOrEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNullOrEmpty(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isNullOrEmpty(List list) {
        return list == null || list.size() == 0;
    }
}
