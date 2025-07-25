package net.pubnative.lite.sdk.mraid.internal;

import android.util.Log;
import com.ironsource.C21114v8;

/* loaded from: classes10.dex */
public class MRAIDLog {
    private static LOG_LEVEL LEVEL = LOG_LEVEL.warning;
    private static final String TAG = "HyBid-MRAID";

    /* loaded from: classes10.dex */
    public enum LOG_LEVEL {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);
        
        private final int value;

        LOG_LEVEL(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* renamed from: d */
    public static void m14286d(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue()) {
            Log.d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m14284e(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue()) {
            Log.e(TAG, str);
        }
    }

    public static LOG_LEVEL getLoggingLevel() {
        return LEVEL;
    }

    /* renamed from: i */
    public static void m14282i(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue()) {
            Log.i(TAG, str);
        }
    }

    public static void setLoggingLevel(LOG_LEVEL log_level) {
        Log.i(TAG, "Changing logging level from :" + LEVEL + ". To:" + log_level);
        LEVEL = log_level;
    }

    /* renamed from: v */
    public static void m14280v(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.verbose.getValue()) {
            Log.v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m14278w(String str) {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue()) {
            Log.w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m14285d(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue()) {
            Log.d(TAG, C21114v8.C21123i.f54137d + str + "] " + str2);
        }
    }

    /* renamed from: e */
    public static void m14283e(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue()) {
            Log.e(TAG, C21114v8.C21123i.f54137d + str + "] " + str2);
        }
    }

    /* renamed from: i */
    public static void m14281i(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue()) {
            Log.i(TAG, C21114v8.C21123i.f54137d + str + "] " + str2);
        }
    }

    /* renamed from: v */
    public static void m14279v(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.verbose.getValue()) {
            Log.v(TAG, C21114v8.C21123i.f54137d + str + "] " + str2);
        }
    }

    /* renamed from: w */
    public static void m14277w(String str, String str2) {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue()) {
            Log.w(TAG, C21114v8.C21123i.f54137d + str + "] " + str2);
        }
    }
}
