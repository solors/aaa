package com.taurusx.tax.log;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.taurusx.tax.C28162a;
import java.io.File;
import java.util.Locale;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class LogUtil {

    /* renamed from: DB */
    public static final boolean f74063DB = false;
    public static final String TAG;
    public static final String TAG_RELEASE;
    public static final String VERSION;

    /* renamed from: a */
    public static final String f74064a;

    /* renamed from: b */
    public static boolean f74065b;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        TAG = stringFogImpl.m23824a(new byte[]{20, -79, 21, -94, 21, -93, 24}, new byte[]{96, -48});
        TAG_RELEASE = stringFogImpl.m23824a(new byte[]{45, -120, 44, -101, 44, -102, 33, -60, 43, -116, 53, -116, 56, -102, 60}, new byte[]{89, -23});
        VERSION = stringFogImpl.m23824a(new byte[]{-78, 1, -78, 1, -70}, new byte[]{-125, 47});
        try {
            new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), stringFogImpl.m23824a(new byte[]{101, 75, 46, 77, 62, 72}, new byte[]{75, 47})).exists();
        } catch (Exception unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl2 = C28162a.f73047a;
        sb2.append(stringFogImpl2.m23824a(new byte[]{18}, new byte[]{73, 122}));
        sb2.append(stringFogImpl2.m23824a(new byte[]{56, -69, 56, -69, 48}, new byte[]{9, -107}).replace(stringFogImpl2.m23824a(new byte[]{11, 50, 104, 32, 118, 50, 110, 46, 114}, new byte[]{38, 97}), ""));
        sb2.append(stringFogImpl2.m23824a(new byte[]{99}, new byte[]{62, -56}));
        f74064a = sb2.toString();
    }

    /* renamed from: a */
    public static boolean m37907a(String str, int i) {
        if (f74065b) {
            return true;
        }
        return Log.isLoggable(str, i);
    }

    /* renamed from: b */
    public static String m37906b() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 4) {
                return String.format(Locale.ENGLISH, C28162a.f73047a.m23824a(new byte[]{94, 36, 85, 114, 8, 119, 65, 119, 94, 51, 91, 122, 86, 122, 69, 119}, new byte[]{123, 87}), m37909a(), stackTrace[4].getMethodName(), Integer.valueOf(stackTrace[4].getLineNumber()));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m37905d(String str, String str2) {
        String str3;
        String str4 = TAG;
        if (!TextUtils.equals(str, str4) && !TextUtils.equals(str, TAG_RELEASE)) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-15}, new byte[]{-86, -10}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{-33}, new byte[]{-126, -32}));
            str3 = sb2.toString();
            str = str4;
        } else {
            str3 = "";
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 3)) {
            String m37906b = m37906b();
            Log.d(m37908a, f74064a + str3 + m37906b + str2);
        }
    }

    /* renamed from: e */
    public static void m37904e(String str, String str2) {
        String str3;
        String str4 = TAG;
        if (TextUtils.equals(str, str4) || TextUtils.equals(str, TAG_RELEASE)) {
            str3 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-62}, new byte[]{-103, -1}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{-43}, new byte[]{-120, 109}));
            str3 = sb2.toString();
            str = str4;
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 6)) {
            String m37906b = m37906b();
            Log.e(m37908a, f74064a + str3 + m37906b + str2);
        }
    }

    public static String getCallClassAndMethod() {
        return "";
    }

    /* renamed from: i */
    public static void m37902i(String str, String str2) {
        String str3;
        String str4 = TAG;
        if (!TextUtils.equals(str, str4) && !TextUtils.equals(str, TAG_RELEASE)) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-75}, new byte[]{-18, 49}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{-126}, new byte[]{-33, -121}));
            str3 = sb2.toString();
            str = str4;
        } else {
            str3 = "";
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 4)) {
            String m37906b = m37906b();
            Log.i(m37908a, f74064a + str3 + m37906b + str2);
        }
    }

    /* renamed from: iv */
    public static void m37901iv(String str, String str2) {
        String str3;
        String str4 = TAG;
        if (!TextUtils.equals(str, str4) && !TextUtils.equals(str, TAG_RELEASE)) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-36}, new byte[]{-121, -37}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{117}, new byte[]{40, -89}));
            str3 = sb2.toString();
            str = str4;
        } else {
            str3 = "";
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 2)) {
            String m37906b = m37906b();
            Log.v(m37908a, f74064a + str3 + m37906b + str2);
        }
    }

    public static void setLogEnable(boolean z) {
        f74065b = z;
    }

    /* renamed from: v */
    public static void m37900v(String str, String str2) {
        String str3;
        String str4 = TAG;
        if (!TextUtils.equals(str, str4) && !TextUtils.equals(str, TAG_RELEASE)) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-100}, new byte[]{-57, -91}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{-28}, new byte[]{-71, 11}));
            str3 = sb2.toString();
            str = str4;
        } else {
            str3 = "";
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 2)) {
            String m37906b = m37906b();
            Log.v(m37908a, f74064a + str3 + m37906b + str2);
        }
    }

    /* renamed from: w */
    public static void m37899w(String str, String str2) {
        String str3;
        String str4 = TAG;
        if (!TextUtils.equals(str, str4) && !TextUtils.equals(str, TAG_RELEASE)) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{50}, new byte[]{105, 68}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{-127}, new byte[]{-36, -12}));
            str3 = sb2.toString();
            str = str4;
        } else {
            str3 = "";
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 5)) {
            String m37906b = m37906b();
            Log.w(m37908a, f74064a + str3 + m37906b + str2);
        }
    }

    /* renamed from: a */
    public static String m37908a(String str) {
        return (str == null || str.length() <= 23) ? str : TAG;
    }

    /* renamed from: a */
    public static String m37909a() {
        String className;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null || stackTrace.length < 4 || (className = stackTrace[5].getClassName()) == null) {
                return null;
            }
            int lastIndexOf = className.lastIndexOf(C28162a.f73047a.m23824a(new byte[]{-118}, new byte[]{-92, 12}));
            if (lastIndexOf != -1) {
                className = className.substring(lastIndexOf + 1);
            }
            int indexOf = className.indexOf(36);
            return indexOf != -1 ? className.substring(0, indexOf) : className;
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    public static void m37903e(String str, String str2, Throwable th) {
        String str3;
        String str4 = TAG;
        if (TextUtils.equals(str, str4) || TextUtils.equals(str, TAG_RELEASE)) {
            str3 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-59}, new byte[]{-98, 44}));
            sb2.append(str);
            sb2.append(stringFogImpl.m23824a(new byte[]{96}, new byte[]{61, -12}));
            str3 = sb2.toString();
            str = str4;
        }
        String m37908a = m37908a(str);
        if (m37907a(m37908a, 6)) {
            String m37906b = m37906b();
            Log.e(m37908a, f74064a + str3 + m37906b + str2, th);
        }
    }
}
