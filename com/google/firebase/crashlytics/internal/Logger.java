package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes4.dex */
public class Logger {
    public static final String TAG = "FirebaseCrashlytics";

    /* renamed from: c */
    static final Logger f42268c = new Logger(TAG);

    /* renamed from: a */
    private final String f42269a;

    /* renamed from: b */
    private int f42270b = 4;

    public Logger(String str) {
        this.f42269a = str;
    }

    /* renamed from: a */
    private boolean m67217a(int i) {
        if (this.f42270b > i && !Log.isLoggable(this.f42269a, i)) {
            return false;
        }
        return true;
    }

    public static Logger getLogger() {
        return f42268c;
    }

    /* renamed from: d */
    public void m67215d(String str, Throwable th) {
        if (m67217a(3)) {
            Log.d(this.f42269a, str, th);
        }
    }

    /* renamed from: e */
    public void m67213e(String str, Throwable th) {
        if (m67217a(6)) {
            Log.e(this.f42269a, str, th);
        }
    }

    /* renamed from: i */
    public void m67211i(String str, Throwable th) {
        if (m67217a(4)) {
            Log.i(this.f42269a, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* renamed from: v */
    public void m67209v(String str, Throwable th) {
        if (m67217a(2)) {
            Log.v(this.f42269a, str, th);
        }
    }

    /* renamed from: w */
    public void m67207w(String str, Throwable th) {
        if (m67217a(5)) {
            Log.w(this.f42269a, str, th);
        }
    }

    public void log(int i, String str, boolean z) {
        if (z || m67217a(i)) {
            Log.println(i, this.f42269a, str);
        }
    }

    /* renamed from: d */
    public void m67216d(String str) {
        m67215d(str, null);
    }

    /* renamed from: e */
    public void m67214e(String str) {
        m67213e(str, null);
    }

    /* renamed from: i */
    public void m67212i(String str) {
        m67211i(str, null);
    }

    /* renamed from: v */
    public void m67210v(String str) {
        m67209v(str, null);
    }

    /* renamed from: w */
    public void m67208w(String str) {
        m67207w(str, null);
    }
}
