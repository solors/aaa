package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.C19821el;
import com.ironsource.C20086i9;
import com.ironsource.C20688qf;
import com.ironsource.C21114v8;
import com.ironsource.C21189wp;
import com.ironsource.InterfaceC19697ce;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SDKUtils {

    /* renamed from: a */
    private static final String f53466a = "SDKUtils";

    /* renamed from: b */
    private static String f53467b = null;

    /* renamed from: c */
    private static String f53468c = null;

    /* renamed from: d */
    private static String f53469d = null;

    /* renamed from: e */
    private static int f53470e = 0;

    /* renamed from: f */
    private static String f53471f = null;

    /* renamed from: g */
    private static Map<String, String> f53472g = null;

    /* renamed from: h */
    private static String f53473h = "";

    /* renamed from: i */
    private static final AtomicInteger f53474i = new AtomicInteger(1);

    /* renamed from: com.ironsource.sdk.utils.SDKUtils$a */
    /* loaded from: classes6.dex */
    class DialogInterface$OnClickListenerC20966a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC20966a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private static int m54964a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f53474i;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int convertDpToPx(int i) {
        return (int) TypedValue.applyDimension(0, i, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C20086i9.m57997d().m58003a(e);
            String str2 = f53466a;
            Logger.m54974d(str2, "Failed decoding string " + e.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((((float) j) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            C20086i9.m57997d().m58003a(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1b
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L2d
        L14:
            r3 = move-exception
            goto L1d
        L16:
            r3 = move-exception
            goto L1d
        L18:
            r3 = move-exception
        L19:
            r1 = r0
            goto L1d
        L1b:
            r3 = move-exception
            goto L19
        L1d:
            com.ironsource.i9 r2 = com.ironsource.C20086i9.m57997d()
            r2.m58003a(r3)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = r3.toString()
            r2.error(r3)
        L2d:
            if (r1 == 0) goto L34
            byte[] r3 = r1.digest()
            return r3
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(C21189wp c21189wp) {
        return fetchDemandSourceId(c21189wp.m54321a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e) {
                    C20086i9.m57997d().m58003a(e);
                    String str = f53466a;
                    Logger.m54970i(str, "flatMapToJsonAsStringfailed " + e.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        if (z) {
            return 5894;
        }
        return 1798;
    }

    public static String getAdvertiserId() {
        return f53467b;
    }

    public static String getControllerConfig() {
        return f53471f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        if (!TextUtils.isEmpty(f53469d)) {
            return f53469d;
        }
        return "";
    }

    public static int getDebugMode() {
        return f53470e;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f53472g;
    }

    public static String getLimitAdTracking() {
        return f53468c;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e) {
            C20086i9.m57997d().m58003a(e);
            throw new RuntimeException(e);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C21114v8.C21118d.f53935b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C21114v8.C21115a.f53878b);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(mo57096f.mo57172E(context)));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public static C20688qf.EnumC20693e getProductType(String str) {
        C20688qf.EnumC20693e enumC20693e = C20688qf.EnumC20693e.RewardedVideo;
        if (!str.equalsIgnoreCase(enumC20693e.toString())) {
            C20688qf.EnumC20693e enumC20693e2 = C20688qf.EnumC20693e.Interstitial;
            if (!str.equalsIgnoreCase(enumC20693e2.toString())) {
                return null;
            }
            return enumC20693e2;
        }
        return enumC20693e;
    }

    public static String getSDKVersion() {
        return "8.4.0";
    }

    public static String getTesterParameters() {
        return f53473h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState)) {
                if (!"mounted_ro".equals(externalStorageState)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        if (!(activity instanceof ControllerActivity) && !(activity instanceof OpenUrlActivity)) {
            return false;
        }
        return true;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        InterfaceC19697ce mo57096f = C19821el.m58797N().mo57096f();
        String mo57120p = mo57096f.mo57120p(context);
        String mo57157a = mo57096f.mo57157a(context);
        if (!TextUtils.isEmpty(mo57120p)) {
            f53467b = mo57120p;
        }
        if (!TextUtils.isEmpty(mo57157a)) {
            f53468c = mo57157a;
        }
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((((float) j) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f53471f = str;
    }

    public static void setControllerUrl(String str) {
        f53469d = str;
    }

    public static void setDebugMode(int i) {
        f53470e = i;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f53472g = map;
    }

    public static void setTesterParameters(String str) {
        f53473h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new DialogInterface$OnClickListenerC20966a()).show();
    }

    public static String translateDeviceOrientation(int i) {
        if (i != 1) {
            if (i != 2) {
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    public static String translateOrientation(int i) {
        if (i != 1) {
            if (i != 2) {
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    public static String translateRequestedOrientation(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 11) {
                    if (i != 12) {
                        switch (i) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f53471f);
            jSONObject2.put(str, jSONObject);
            f53471f = jSONObject2.toString();
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            String str2 = f53466a;
            Logger.m54970i(str2, "Unable to update controllerConfigs: " + e.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }
}
