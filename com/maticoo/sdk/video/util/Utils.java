package com.maticoo.sdk.video.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Keep;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

@Keep
/* loaded from: classes6.dex */
public class Utils {
    @Keep
    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 8;
        }
        return activeNetworkInfo.getType();
    }

    @Keep
    public static File getVideoCacheDir(Context context) {
        return new File(context.getFilesDir(), "video-cache");
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    public static boolean isNotEmpty(String str) {
        if (str != null && !"".equals(str)) {
            return true;
        }
        return false;
    }

    @Keep
    public static String optStringHelper(JSONObject jSONObject, String... strArr) {
        String optStringHelperInternal = optStringHelperInternal(jSONObject, strArr);
        if (optStringHelperInternal == null) {
            return "";
        }
        return optStringHelperInternal;
    }

    private static String optStringHelperInternal(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                return null;
            }
        }
        return jSONObject.optString(strArr[strArr.length - 1]);
    }

    public static String urlEncodeUTF8(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
