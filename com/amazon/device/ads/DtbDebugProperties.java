package com.amazon.device.ads;

import android.content.Context;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.ironsource.C20517nb;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DtbDebugProperties {
    public static final String AAX_HOSTNAME = "aaxHostname";
    public static final String AAX_ROUTE53_ENABLED_CNAME = "route53EnabledAAXCname";
    public static final String CONFIG_HOSTNAME = "configHostname";
    public static final String CONFIG_REQUEST_HEADERS = "configRequestHeaders";
    public static final String INTERNAL_DEBUG_MODE = "internalDebugMode";
    private static final String LOG_TAG = "com.amazon.device.ads.DtbDebugProperties";
    public static final String SIS_URL = "sisUrl";
    private static final String TEST_OVERRIDE_FILE = "com.amazon.device.ads.dtb.debug.override";
    public static final String USE_SECURE = "useSecure";
    private static DtbDebugProperties debugProperties = null;
    static boolean isInternalDebugMode = false;
    private static Set<String> preDefinedKeys;
    private static HashMap<String, String> propertyMap = new HashMap<>();
    private static boolean isInitialized = false;

    DtbDebugProperties() {
    }

    public static String getAaxHostName(String str) {
        return getDebugProperty(AAX_HOSTNAME, str);
    }

    public static String getAaxVideoHostName(String str) {
        return getDebugProperty(AAX_ROUTE53_ENABLED_CNAME, str);
    }

    public static String getConfigHostName(String str) {
        return getDebugProperty(CONFIG_HOSTNAME, str);
    }

    public static HashMap<String, String> getConfigRequestHeaders(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(getDebugProperty(CONFIG_REQUEST_HEADERS, str));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    hashMap.put(next, String.valueOf(obj));
                }
            }
        } catch (RuntimeException | JSONException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Failed to execute getConfigRequestHeaders method", e);
        }
        return hashMap;
    }

    public static HashMap<String, String> getDebugParams() {
        if (AdRegistration.isTestMode() && isInternalDebugMode) {
            return propertyMap;
        }
        return new HashMap<>();
    }

    private static String getDebugProperty(String str, String str2) {
        HashMap<String, String> hashMap;
        if (AdRegistration.isTestMode() && isInternalDebugMode && (hashMap = propertyMap) != null && hashMap.get(str) != null) {
            return propertyMap.get(str);
        }
        return str2;
    }

    public static String getEncodedUrlParams() {
        if (!isInternalDebugMode) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : propertyMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            try {
                if (!preDefinedKeys.contains(key.toLowerCase())) {
                    sb2.append('&');
                    sb2.append(key);
                    sb2.append(C20517nb.f52173T);
                    sb2.append(URLEncoder.encode(value, "UTF-8"));
                }
            } catch (UnsupportedEncodingException e) {
                DtbLog.debugError(String.format("Cannot encode %d=%d due to exception %d", key, value, e.getMessage()));
            }
        }
        return sb2.toString();
    }

    public static DtbDebugProperties getInstance() {
        if (!isInitialized) {
            DtbLog.debug("Running the debug initialization.");
            debugProperties = new DtbDebugProperties();
            HashSet hashSet = new HashSet();
            preDefinedKeys = hashSet;
            hashSet.add(AAX_HOSTNAME.toLowerCase());
            preDefinedKeys.add(SIS_URL.toLowerCase());
            preDefinedKeys.add(USE_SECURE.toLowerCase());
            preDefinedKeys.add(CONFIG_HOSTNAME.toLowerCase());
            preDefinedKeys.add(INTERNAL_DEBUG_MODE.toLowerCase());
            preDefinedKeys.add(CONFIG_REQUEST_HEADERS.toLowerCase());
            initializeDtbDebugProperties();
        }
        return debugProperties;
    }

    public static boolean getIsSecure(boolean z) {
        String debugProperty = getDebugProperty(USE_SECURE, "");
        if (debugProperty.equals("true")) {
            return true;
        }
        if (debugProperty.equals("false")) {
            return false;
        }
        return z;
    }

    public static String getSISUrl(String str) {
        return getDebugProperty(SIS_URL, str);
    }

    public static void initializeDtbDebugProperties() {
        try {
            Context context = AdRegistration.getContext();
            if (AdRegistration.isTestMode() && context == null) {
                DtbLog.debugError("unable to initialize debug preferences without setting app context");
                throw new IllegalArgumentException("unable to initialize debug preferences without setting app context");
            }
            String string = DtbCommonUtils.getApplicationBundle().getString(TEST_OVERRIDE_FILE);
            if (!DtbCommonUtils.isNullOrEmpty(string) && context != null) {
                DtbLog.debug("Override file: " + string);
                InputStream resourceAsStream = DtbCommonUtils.getResourceAsStream(string);
                if (resourceAsStream == null) {
                    DtbLog.debug("Failed to read override from classpath, trying to read override file from absolute location: " + string);
                    File file = new File(context.getFilesDir() + "/aps_override_properties/override.properties");
                    if (!file.exists()) {
                        DtbLog.debug("Couldn't find the override file, skipping.");
                        return;
                    }
                    resourceAsStream = new FileInputStream(file);
                }
                DtbLog.debug("Reading debug params..");
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                for (Map.Entry entry : properties.entrySet()) {
                    String str = (String) entry.getKey();
                    if (DtbCommonUtils.isNullOrWhiteSpace(str)) {
                        DtbLog.debug("Error: The debug property name must not be null or empty string");
                    } else {
                        String str2 = (String) entry.getValue();
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                        DtbLog.debug("Overrides found: " + str + " --> " + str2);
                        if (str.equalsIgnoreCase(INTERNAL_DEBUG_MODE)) {
                            isInternalDebugMode = str2.equalsIgnoreCase("true");
                        }
                        propertyMap.put(str, str2);
                    }
                }
                resourceAsStream.close();
            }
        } catch (Exception e) {
            DtbLog.debug("Error:: Failed to read the debug params. ignoring." + e.getStackTrace());
        }
        isInitialized = true;
    }

    public static void resetProperties() {
        isInitialized = false;
        propertyMap = new HashMap<>();
    }

    public boolean isDebugMode() {
        return isInternalDebugMode;
    }
}
