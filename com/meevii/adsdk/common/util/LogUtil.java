package com.meevii.adsdk.common.util;

import android.util.Log;
import com.meevii.adsdk.common.BaseMeeviiAd;

/* loaded from: classes6.dex */
public class LogUtil {
    /* renamed from: e */
    public static void m48062e(String str, String str2) {
        if (BaseMeeviiAd.isShowLog()) {
            Log.e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m48060i(String str, String str2) {
        if (!BaseMeeviiAd.isShowLog()) {
            return;
        }
        Log.i(str, str2);
    }

    public static boolean isShowLog() {
        return BaseMeeviiAd.isShowLog();
    }

    /* renamed from: w */
    public static void m48059w(String str, String str2) {
        if (!BaseMeeviiAd.isShowLog()) {
            return;
        }
        Log.w(str, str2);
    }

    /* renamed from: e */
    public static void m48061e(String str, String str2, Throwable th) {
        if (BaseMeeviiAd.isShowLog()) {
            Log.e(str, str2, th);
        }
    }
}
