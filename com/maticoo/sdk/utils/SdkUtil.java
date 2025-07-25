package com.maticoo.sdk.utils;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.compose.material.TextFieldImplKt;
import com.maticoo.sdk.MaticooAdsConstant;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.maticoo.sdk.utils.error.InternalError;
import com.maticoo.sdk.utils.lifecycle.ActLifecycle;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.Response;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SdkUtil {
    private static final String PARAMS_HEIGHT = "&h=";
    private static final String PARAMS_WIDTH = "&w=";
    private static final String[] ADT_PERMISSIONS = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};
    private static final Pattern ACCEPTED_URI_SCHEME = Pattern.compile("(?i)((?:http|https|ftp|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");
    private static List<String> sInternalHosts = new ArrayList();

    public static InternalError banRun(String str) {
        if (TextUtils.isEmpty(str)) {
            InternalError internalError = new InternalError(111, ErrorCode.MSG_INIT_INVALID_REQUEST);
            DeveloperLog.LogE(internalError.toString());
            return internalError;
        }
        return null;
    }

    public static boolean checkWifiProxy() {
        int i;
        boolean z;
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (!TextUtils.isEmpty(property2)) {
                i = Integer.parseInt(property2);
            } else {
                i = 0;
            }
            if (!TextUtils.isEmpty(property) && i != 0) {
                z = true;
            } else {
                z = false;
            }
            DeveloperLog.LogD("proxyAddress:" + property + " proxyPort：" + i + "  wifiProxy = " + z);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean connectedCheck() {
        try {
            return Debug.isDebuggerConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean copy(String str) {
        try {
            ((ClipboardManager) ApplicationUtil.getInstance().getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(TextFieldImplKt.LabelId, str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean debugVersionCheck(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static List<String> getInternalHosts() {
        return sInternalHosts;
    }

    public static String getSHA1(Context context) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase);
                sb2.append(":");
            }
            String sb3 = sb2.toString();
            return sb3.substring(0, sb3.length() - 1);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String handleAdUrl(Context context, String str, int i) {
        int phoneWidth;
        int phoneHeight;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.contains(PARAMS_WIDTH) && !str.contains(PARAMS_HEIGHT)) {
            float density = DensityUtil.getDensity(context);
            if (density <= 0.0f) {
                density = 1.0f;
            }
            Activity activity = ActLifecycle.getInstance().getActivity();
            if (activity != null) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                phoneWidth = rect.width();
                phoneHeight = rect.height();
            } else {
                phoneWidth = DensityUtil.getPhoneWidth(context);
                phoneHeight = DensityUtil.getPhoneHeight(context);
            }
            int i2 = (int) (phoneWidth / density);
            int i3 = (int) (phoneHeight / density);
            boolean z2 = false;
            if (i == 1 && i2 > i3) {
                z = true;
            } else {
                z = false;
            }
            if (i == 2 && i2 < i3) {
                z2 = true;
            }
            if (z || z2) {
                i2 = i3;
                i3 = i2;
            }
            return str + PARAMS_WIDTH + i2 + PARAMS_HEIGHT + i3;
        }
        return str;
    }

    public static boolean hasVpnConnection(Context context) {
        NetworkCapabilities networkCapabilities;
        if (checkWifiProxy()) {
            return true;
        }
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isAcceptedScheme(String str) {
        return ACCEPTED_URI_SCHEME.matcher(str.toLowerCase()).matches();
    }

    public static boolean isCharging(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null && registerReceiver.getIntExtra("plugged", -1) != 0) {
                z = true;
            } else {
                z = false;
            }
            DeveloperLog.LogD("isCharging = " + z);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isExpire(AdBean adBean) {
        if (adBean == null || adBean.getBidBean() == null) {
            return false;
        }
        if (System.currentTimeMillis() - adBean.getBidBean().getFillTime() <= adBean.getBidBean().getExpire() * 1000) {
            return false;
        }
        return true;
    }

    public static boolean isInternalHost(String str) {
        String host;
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            return false;
        }
        try {
            host = Uri.parse(str).getHost();
        } catch (Exception e) {
            DeveloperLog.LogD("isInternalHost, Exception = " + e);
        }
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        for (String str2 : sInternalHosts) {
            if (host.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUsbDebuggingMode(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0) {
            z = true;
        }
        DeveloperLog.LogD("isAdbModeEnabled, enableAdb = " + z);
        return z;
    }

    public static String parseResponseMsg(Response response) {
        if (response == null) {
            return "";
        }
        try {
            return new JSONObject(new String(response.body().byteArray(), Charset.forName("UTF-8"))).optString("msg");
        } catch (Exception e) {
            CrashUtil.getSingleton().reportSDKException(e);
            return "";
        }
    }

    public static String retrieveAppKeyFromMetadata(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString(MaticooAdsConstant.MATICOO_APP_KEY);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static void setInternalHosts(List<String> list) {
        sInternalHosts.clear();
        sInternalHosts.addAll(list);
    }
}
