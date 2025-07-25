package net.pubnative.lite.sdk.utils;

import android.util.Log;
import com.ironsource.C21114v8;

/* loaded from: classes10.dex */
public class Logger {
    private static final String TAG = "HyBid";
    private static Level sLogLevel = Level.info;

    /* loaded from: classes10.dex */
    public enum Level {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);
        
        private final int mValue;

        Level(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    /* renamed from: d */
    public static void m14229d(String str, String str2) {
        m14228d(str, str2, null);
    }

    /* renamed from: e */
    public static void m14227e(String str, String str2) {
        m14226e(str, str2, null);
    }

    public static void setLogLevel(Level level) {
        sLogLevel = level;
    }

    /* renamed from: w */
    public static void m14225w(String str, String str2) {
        m14224w(str, str2, null);
    }

    /* renamed from: d */
    public static void m14228d(String str, String str2, Throwable th) {
        Level level = sLogLevel;
        if (level == null || level.getValue() > Level.debug.getValue()) {
            return;
        }
        Log.d(TAG, C21114v8.C21123i.f54137d + str + "] " + str2, th);
    }

    /* renamed from: e */
    public static void m14226e(String str, String str2, Throwable th) {
        Level level = sLogLevel;
        if (level == null || level.getValue() > Level.error.getValue()) {
            return;
        }
        Log.e(TAG, C21114v8.C21123i.f54137d + str + "] " + str2, th);
    }

    /* renamed from: w */
    public static void m14224w(String str, String str2, Throwable th) {
        Level level = sLogLevel;
        if (level == null || level.getValue() > Level.warning.getValue()) {
            return;
        }
        Log.w(TAG, C21114v8.C21123i.f54137d + str + "] " + str2, th);
    }
}
