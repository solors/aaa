package com.maticoo.sdk.utils.log;

import android.util.Log;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.error.InternalError;

/* loaded from: classes6.dex */
public class AdLog {
    private static final String TAG = "MaticooDev";
    private boolean isDebug;

    /* loaded from: classes6.dex */
    private static class AdLogHolder {
        private static final AdLog INSTANCE = new AdLog();

        private AdLogHolder() {
        }
    }

    public static AdLog getSingleton() {
        return AdLogHolder.INSTANCE;
    }

    public void LogD(String str) {
        LogD(str, "");
    }

    public void LogE(String str) {
        LogE(str, "");
    }

    public void isDebug(boolean z) {
        this.isDebug = z;
    }

    private AdLog() {
        this.isDebug = false;
    }

    public void LogD(String str, String str2) {
        LogD(str, str2, null);
    }

    public void LogE(String str, String str2) {
        LogE(str, str2, null);
    }

    public void LogD(String str, String str2, Throwable th) {
        if (this.isDebug) {
            Log.d(TAG, C21114v8.C21123i.f54137d + str + "] " + str2, th);
        }
    }

    public void LogE(String str, InternalError internalError) {
        if (internalError == null) {
            return;
        }
        LogE(str, internalError.toString(), null);
    }

    public void LogE(String str, String str2, Throwable th) {
        if (this.isDebug) {
            Log.e(TAG, C21114v8.C21123i.f54137d + str + "] " + str2, th);
        }
    }
}
