package com.amazon.aps.ads;

import android.util.Log;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.maticoo.sdk.utils.log.p406bi.Constants;

/* loaded from: classes2.dex */
public class ApsLog {
    private static String DEFAULT_TAG = "APSAndroidShared";
    static boolean isLoggable;
    private static ApsLogLevel logLevel = ApsLogLevel.Warn;

    static {
        initIsLoggable();
    }

    private ApsLog() {
    }

    /* renamed from: d */
    public static void m102717d(String str, String str2) {
        if (isOkToLog(ApsLogLevel.Debug)) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m102715e(String str, String str2) {
        if (logLevel.intValue() != ApsLogLevel.Off.intValue()) {
            Log.e(str, str2);
        }
    }

    public static ApsLogLevel getLogLevel() {
        return logLevel;
    }

    /* renamed from: i */
    public static void m102713i(String str, String str2) {
        if (logLevel.intValue() >= ApsLogLevel.Warn.intValue()) {
            Log.i(str, str2);
        }
    }

    static void initIsLoggable() {
        try {
            isLoggable = Log.isLoggable(Constants.KEY_TEST, 7);
        } catch (Throwable unused) {
            isLoggable = false;
        }
    }

    static boolean isOkToLog(ApsLogLevel apsLogLevel) {
        if (isLoggable && logLevel.intValue() <= apsLogLevel.intValue() && logLevel != ApsLogLevel.Off) {
            return true;
        }
        return false;
    }

    public static void setLogLevel(ApsLogLevel apsLogLevel) {
        logLevel = apsLogLevel;
    }

    /* renamed from: d */
    public static void m102718d(String str) {
        m102717d(DEFAULT_TAG, str);
    }

    /* renamed from: e */
    public static void m102716e(String str) {
        m102715e(DEFAULT_TAG, str);
    }

    /* renamed from: i */
    public static void m102714i(String str) {
        m102713i(DEFAULT_TAG, str);
    }
}
