package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBUtils {
    @NonNull
    public static String buildUriWithQueryParams(@NonNull Uri uri, @NonNull Map<String, String> map) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @NonNull
    public static String buildUrlWithQueryParam(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.build().toString();
    }

    public static int convertDpToPixel(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static float convertDpToPixelWithFloatPrecession(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static int convertPixelToDp(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    @Nullable
    public static List<String> convertStringJsonArrayToList(@Nullable JSONArray jSONArray) {
        if (isJsonArrayNullOrEmpty(jSONArray)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!jSONArray.isNull(i)) {
                arrayList.add(jSONArray.optString(i));
            }
        }
        return arrayList;
    }

    public static double convertToSeconds(@Nullable String str, @Nullable String str2) {
        if (str2 != null && !str2.isEmpty()) {
            if (str2.contains("%")) {
                try {
                    return (getSeconds(str) * Double.parseDouble(str2.replace("%", ""))) / 100.0d;
                } catch (NumberFormatException unused) {
                    POBLog.error("POBUtils", "Invalid time value", new Object[0]);
                }
            } else {
                return getSeconds(str2);
            }
        }
        return 0.0d;
    }

    @Nullable
    public static String decodeUrl(@NonNull String str) {
        try {
            POBLog.debug("POBUtils", "encoded URL: " + str, new Object[0]);
            String decode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
            POBLog.debug("POBUtils", "Decoded URL: " + decode, new Object[0]);
            return decode;
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            POBLog.debug("POBUtils", "Failed to decode url due to " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    @NonNull
    public static List<String> filterListOfStrings(@Nullable List<String> list, @NonNull String str) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (str2 != null && str2.contains(str)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static boolean getBooleanValue(@Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Cannot convert string %s to boolean", str);
            return false;
        }
    }

    public static int getDeviceOrientation(@NonNull Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            return configuration.orientation;
        }
        return 0;
    }

    public static int getIntegerValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Cannot convert string %s to integer", str);
            return 0;
        }
    }

    public static POBAdSize getInterstitialAdSize(@NonNull Context context) {
        int deviceOrientation = getDeviceOrientation(context);
        if (isTablet(context)) {
            if (deviceOrientation == 2) {
                return POBAdSize.INTERSTITIAL_1024x768;
            }
            return POBAdSize.INTERSTITIAL_768x1024;
        } else if (deviceOrientation == 2) {
            return POBAdSize.INTERSTITIAL_480x320;
        } else {
            return POBAdSize.INTERSTITIAL_320x480;
        }
    }

    @Nullable
    public static POBLocation getLocation(@Nullable POBLocationDetector pOBLocationDetector) {
        POBLocation pOBLocation;
        Location location;
        if (POBInstanceProvider.getSdkConfig().isLocationAccessAllowed() && pOBLocationDetector != null && (location = pOBLocationDetector.getLocation()) != null) {
            pOBLocation = new POBLocation(location);
        } else {
            pOBLocation = null;
        }
        if (pOBLocation == null) {
            return POBInstanceProvider.getSdkConfig().getLocation();
        }
        return pOBLocation;
    }

    public static String getMappingKey(int i, @Nullable Integer num) {
        if (num != null) {
            return i + ":" + num;
        }
        return String.valueOf(i);
    }

    public static int getRandomNumber(int i, int i2) {
        return i + ((int) (Math.random() * ((i2 - i) + 1)));
    }

    public static int getScreenHeight() {
        return convertPixelToDp(Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    public static int getScreenWidth() {
        return convertPixelToDp(Resources.getSystem().getDisplayMetrics().widthPixels);
    }

    public static double getSeconds(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return 0.0d;
        }
        String[] split = str.split(":", -1);
        double d = 0.0d;
        for (int length = split.length - 1; length >= 0; length--) {
            try {
                d += Double.parseDouble(split[length]) * Math.pow(60.0d, (split.length - 1) - length);
            } catch (NumberFormatException unused) {
                POBLog.error("POBUtils", "Invalid time value", new Object[0]);
                return 0.0d;
            }
        }
        return d;
    }

    public static int getTimeOffsetInMinutes() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return (calendar.get(15) + calendar.get(16)) / 60000;
    }

    public static int getValidRefreshInterval(int i, int i2) {
        if (i <= 0) {
            return 0;
        }
        if (i <= i2) {
            return i2;
        }
        return i;
    }

    public static int getViewVisiblePixel(@Nullable View view) {
        if (view != null) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                return rect.height() * rect.width();
            }
            return 0;
        }
        return 0;
    }

    public static int[] getViewXYPosition(View view) {
        view.getLocationOnScreen(r0);
        int[] iArr = {convertPixelToDp(iArr[0]), convertPixelToDp(iArr[1])};
        return iArr;
    }

    public static float getVisiblePercent(@Nullable View view) {
        if (view != null) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                return ((rect.height() * rect.width()) * 100) / (view.getHeight() * view.getWidth());
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static boolean hasPermission(@NonNull Context context, @NonNull String str) {
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            POBLog.warn("POBUtils", "Error while checking permission %s", e.getMessage());
            return false;
        }
    }

    public static boolean isDebugBuild(@NonNull Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isJsonArrayNullOrEmpty(@Nullable JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            return false;
        }
        return true;
    }

    public static boolean isJsonObjectNullOrEmpty(@Nullable JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            return false;
        }
        return true;
    }

    public static boolean isListNullOrEmpty(@Nullable List<?> list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean isNull(@Nullable Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj != null) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isNullOrEmpty(@Nullable String str) {
        if (str != null) {
            return str.isEmpty();
        }
        return true;
    }

    public static boolean isStringValueNullOrEmpty(@Nullable String str) {
        if (str != null && !str.isEmpty() && !str.equals("null")) {
            return false;
        }
        return true;
    }

    public static boolean isTablet(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    public static boolean isValidPlayStoreUrl(@Nullable String str) {
        if (str != null) {
            if (str.contains("play.google.com") || str.contains("market://launch") || str.contains("market://details")) {
                return str.contains("id=");
            }
            return false;
        }
        return false;
    }

    public static boolean isViewVisible(@Nullable View view, int i) {
        if (getViewVisiblePixel(view) >= i) {
            return true;
        }
        return false;
    }

    public static void logBidWinningStatus(boolean z, @Nullable String str) {
        if (z) {
            POBLog.debug("POBUtils", "Bid win for partner - %s", str);
        } else {
            POBLog.debug("POBUtils", "AdServerWin", new Object[0]);
        }
    }

    public static boolean openExternalBrowser(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Open external browser %s", "Not able to parse url");
            return false;
        }
    }

    @NonNull
    public static String parseJsTracker(@NonNull List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (str.startsWith("http")) {
                sb2.append(String.format("<script src=\"%s\"></script>", str));
            } else {
                sb2.append(str);
            }
        }
        return String.format("<!DOCTYPE HTML><html><head>%s</head></html>", sb2);
    }

    @NonNull
    public static Set<String> parseJsonArrayToSet(@Nullable JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        }
        return hashSet;
    }

    @Nullable
    @WorkerThread
    public static String readFromAssets(@NonNull Context context, @NonNull String str) {
        IOException e;
        String str2;
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            str2 = new String(bArr);
            try {
                POBLog.debug("POBUtils", "Successfully read file %s from bundle", str);
            } catch (IOException e2) {
                e = e2;
                POBLog.error("POBUtils", "Failed to read file %s from bundle with error: %s", str, e);
                return str2;
            }
        } catch (IOException e3) {
            e = e3;
            str2 = null;
        }
        return str2;
    }

    public static void runOnBackgroundThread(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    public static void runOnMainThread(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) throws Exception {
        try {
            context.getApplicationContext().startActivity(intent);
        } catch (Exception e) {
            POBLog.warn("POBUtils", "Error while starting activity %s", e.getMessage());
            throw new Exception(e);
        }
    }

    @NonNull
    public static Context resolveWebViewContext(@NonNull Context context) {
        return context;
    }
}
