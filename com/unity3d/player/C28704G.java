package com.unity3d.player;

import android.os.Build;
import com.facebook.internal.AnalyticsEvents;
import java.lang.Thread;
import java.util.Arrays;

/* renamed from: com.unity3d.player.G */
/* loaded from: classes7.dex */
class C28704G implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private volatile Thread.UncaughtExceptionHandler f74528a;

    /* renamed from: b */
    private String f74529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m37750a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            return false;
        }
        this.f74528a = defaultUncaughtExceptionHandler;
        this.f74529b = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        Thread.setDefaultUncaughtExceptionHandler(this);
        return true;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public synchronized void uncaughtException(Thread thread, Throwable th) {
        try {
            Error error = new Error(String.format("FATAL EXCEPTION [%s]\n", thread.getName()) + String.format("Unity version     : %s\n", "2022.3.24f1") + String.format("Device model      : %s %s\n", Build.MANUFACTURER, Build.MODEL) + String.format("Device fingerprint: %s\n", Build.FINGERPRINT) + String.format("CPU supported ABI : %s\n", Arrays.toString(Build.SUPPORTED_ABIS)) + String.format("Build Type        : %s\n", "Release") + String.format("Scripting Backend : %s\n", "IL2CPP") + String.format("Libs loaded from  : %s\n", this.f74529b) + String.format("Strip Engine Code : %s\n", Boolean.TRUE));
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.f74528a.uncaughtException(thread, error);
        } catch (Throwable unused) {
            this.f74528a.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m37749a(String str) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C28704G) {
            C28704G c28704g = (C28704G) defaultUncaughtExceptionHandler;
            int i = -1;
            int i2 = -1;
            while (true) {
                int indexOf = str.indexOf(47, i + 1);
                if (indexOf == -1) {
                    break;
                }
                i2 = i;
                i = indexOf;
            }
            c28704g.f74529b = i2 < 0 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : str.substring(i2 + 1);
        }
    }
}
