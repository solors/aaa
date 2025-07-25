package com.maticoo.sdk.mraid.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.webkit.WebView;
import androidx.annotation.Keep;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Keep
/* loaded from: classes6.dex */
public class Utils {
    static final String APK_TYPE = "application/vnd.android.package-archive";
    static final String GOOGLE_PLAY_PKG_NAME = "com.android.vending";
    private static final String TAG = "Utils";
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);

    @Keep
    public static int dpToPx(int i) {
        return (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    @Keep
    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = sNextGeneratedId;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int getBitmapBytes(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    @Keep
    public static String getProcessName(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static boolean isNotEmpty(String str) {
        if (str != null && !"".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !"".equals(str)) {
            return false;
        }
        return true;
    }

    public static void loadJsCode(String str, WebView webView) {
        webView.evaluateJavascript(str, null);
    }

    @Keep
    public static int pxToDp(float f) {
        return (int) ((f / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
