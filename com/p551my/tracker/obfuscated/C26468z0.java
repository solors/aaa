package com.p551my.tracker.obfuscated;

import android.util.Log;

/* renamed from: com.my.tracker.obfuscated.z0 */
/* loaded from: classes7.dex */
public final class C26468z0 {

    /* renamed from: a */
    private static volatile boolean f69106a = false;

    /* renamed from: a */
    public static void m41528a(String str) {
        if (f69106a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str);
        }
    }

    /* renamed from: b */
    public static void m41525b(String str) {
        if (f69106a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    /* renamed from: c */
    public static void m41523c(String str) {
        if (str == null) {
            str = "null";
        }
        Log.i("[myTracker]", str);
    }

    /* renamed from: a */
    public static void m41527a(String str, Throwable th) {
        if (f69106a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str, th);
        }
    }

    /* renamed from: b */
    public static void m41524b(String str, Throwable th) {
        if (f69106a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th);
        }
    }

    /* renamed from: a */
    public static void m41526a(boolean z) {
        f69106a = z;
    }

    /* renamed from: a */
    public static boolean m41529a() {
        return f69106a;
    }
}
