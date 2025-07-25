package com.amazon.device.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.facebook.AuthenticationTokenClaims;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class DtbDeviceData {
    private static final String DEFAULT_USER_AGENT = "Android";
    static final String DEVICE_DATA_CARRIER_KEY = "carrier";
    static final String DEVICE_DATA_CONNECTION_TYPE_KEY = "connectionType";
    static final String DEVICE_DATA_COUNTRY_KEY = "country";
    static final String DEVICE_DATA_HWV_KEY = "hwv";
    static final String DEVICE_DATA_LANGUAGE_KEY = "language";
    static final String DEVICE_DATA_MAKE_KEY = "make";
    public static final String DEVICE_DATA_MODEL_KEY = "model";
    public static final String DEVICE_DATA_ORIENTATION_KEY = "orientation";
    static final String DEVICE_DATA_OS_KEY = "os";
    public static final String DEVICE_DATA_OS_VERSION_KEY = "osVersion";
    static final String DEVICE_DATA_PPI_KEY = "ppi";
    static final String DEVICE_DATA_SCALING_FACTOR_KEY = "scalingFactor";
    public static final String DEVICE_DATA_SCREEN_SIZE_KEY = "screenSize";
    private static final String LOG_TAG = "DtbDeviceData";
    private static DtbDeviceData deviceDataInstance;
    private boolean bad_serial = false;
    private boolean bad_udid = false;
    private boolean bad_mac = false;
    private String sha1_mac = null;
    private String sha1_udid = null;
    private String sha1_serial = null;

    /* renamed from: ua */
    private String f3028ua = null;
    private String screenSize = null;
    private String orientation = null;
    private HashMap<String, Object> deviceParams = new HashMap<>();
    private JSONObject deviceInfoJson = new JSONObject();

    private DtbDeviceData(Context context) {
        getOrientation();
        getScreenSize();
        getDeviceInfoJson();
        getUserAgent();
        buildDeviceParams();
    }

    private void buildDeviceParams() {
        this.deviceParams.put("dt", "android");
        this.deviceParams.put("app", "app");
        this.deviceParams.put(AuthenticationTokenClaims.JSON_KEY_AUD, "3p");
        String str = this.f3028ua;
        if (str != null) {
            this.deviceParams.put("ua", str);
        }
        this.deviceParams.put("sdkVer", DtbCommonUtils.getSDKVersion());
        JSONObject jSONObject = this.deviceInfoJson;
        if (jSONObject != null) {
            this.deviceParams.put("dinfo", jSONObject);
        }
    }

    private String generateSha1Hash(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b : digest) {
            sb2.append(Integer.toHexString((b & 255) | 256).substring(1));
        }
        return sb2.toString();
    }

    public static String getConnectionType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "0";
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 6) {
                    return "0";
                }
                return Protocol.VAST_4_2;
            }
            return "Wifi";
        }
        return Integer.toString(activeNetworkInfo.getSubtype());
    }

    public static DtbDeviceData getDeviceDataInstance() {
        if (AdRegistration.getContext() != null) {
            if (deviceDataInstance == null) {
                if (AdRegistration.getContext() != null) {
                    deviceDataInstance = new DtbDeviceData(AdRegistration.getContext());
                } else {
                    DtbLog.debugError("Invalid intialization of Device Data. Context is null");
                    throw new IllegalArgumentException("Invalid intialization of Device Data. Context is null");
                }
            }
            return deviceDataInstance;
        }
        DtbLog.debugError("unable to initialize advertising info without setting app context");
        throw new IllegalArgumentException("unable to initialize advertising info without setting app context");
    }

    private void getDeviceInfoJson() {
        String str;
        float f;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.DEVICE;
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        String connectionType = getConnectionType();
        int screenPpi = getScreenPpi();
        TelephonyManager telephonyManager = (TelephonyManager) AdRegistration.getContext().getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        } else {
            str = null;
        }
        if (str3.equals("motorola") && str2.equals("MB502")) {
            f = 1.0f;
        } else {
            f = getDisplayMetrics().scaledDensity;
        }
        String f2 = Float.toString(f);
        try {
            placeProperty("Android", "os");
            placeProperty(str2, "model");
            placeProperty(str3, "make");
            placeProperty(str5, DEVICE_DATA_HWV_KEY);
            placeProperty(str4, "osVersion");
            placeProperty(country, "country");
            placeProperty(str, "carrier");
            placeProperty(language, DEVICE_DATA_LANGUAGE_KEY);
            placeProperty(this.screenSize, DEVICE_DATA_SCREEN_SIZE_KEY);
            placeProperty(f2, DEVICE_DATA_SCALING_FACTOR_KEY);
            placeProperty(Integer.toString(screenPpi), DEVICE_DATA_PPI_KEY);
            placeProperty(this.orientation, "orientation");
            placeProperty(connectionType, "connectionType");
        } catch (UnsupportedEncodingException unused) {
            DtbLog.error(LOG_TAG, "Unsupported encoding");
        } catch (JSONException unused2) {
            DtbLog.error(LOG_TAG, "JSONException while producing deviceInfoJson");
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return AdRegistration.getContext().getResources().getDisplayMetrics();
    }

    private void getOrientation() {
        this.orientation = DtbDeviceDataRetriever.getOrientation(AdRegistration.getContext());
    }

    private int getScreenPpi() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        return (int) (Math.sqrt(Math.pow(displayMetrics.widthPixels, 2.0d) + Math.pow(displayMetrics.heightPixels, 2.0d)) / Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)));
    }

    private void getScreenSize() {
        this.screenSize = DtbDeviceDataRetriever.getScreenSize(new DisplayMetrics(), this.orientation);
    }

    private void getUserAgent() {
        try {
            this.f3028ua = WebSettings.getDefaultUserAgent(AdRegistration.getContext());
        } catch (Exception unused) {
            DtbLog.info("Unable to Get User Agent, Setting it to default");
            this.f3028ua = "Android";
        }
    }

    public HashMap<String, Object> getDeviceParams() {
        if (!this.deviceParams.containsKey("ua") || (this.deviceParams.containsKey("ua") && this.deviceParams.get("ua").equals("Android"))) {
            getUserAgent();
            buildDeviceParams();
        }
        return this.deviceParams;
    }

    public JSONObject getParamsJson() {
        try {
            getOrientation();
            placeProperty(this.orientation, "orientation");
            getScreenSize();
            placeProperty(this.screenSize, DEVICE_DATA_SCREEN_SIZE_KEY);
        } catch (Exception e) {
            DtbLog.error("Error:" + e);
        }
        return this.deviceInfoJson;
    }

    public JSONObject getParamsJsonGetSafe() {
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = this.deviceInfoJson.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = this.deviceInfoJson.get(next);
                if (obj instanceof String) {
                    jSONObject.put(next, URLEncoder.encode((String) obj, "UTF-8"));
                }
            } catch (Exception unused) {
                DtbLog.error("Error converting to JsonGetSafe");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUserAgentString() {
        return this.f3028ua;
    }

    void placeProperty(String str, String str2) throws JSONException, UnsupportedEncodingException {
        if (str != null && !str.isEmpty()) {
            this.deviceInfoJson.put(str2, str);
        }
    }
}
