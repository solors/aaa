package com.p552ot.pubsub.util;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.ot.pubsub.util.j */
/* loaded from: classes7.dex */
public class C26586j {

    /* renamed from: a */
    public static boolean f69734a = false;

    /* renamed from: b */
    public static boolean f69735b = false;

    /* renamed from: c */
    public static boolean f69736c = false;

    /* renamed from: d */
    private static final int f69737d = 3000;

    /* renamed from: e */
    private static final String f69738e = "OT-PubSub-";

    /* renamed from: f */
    private static final int f69739f = 0;

    /* renamed from: g */
    private static final int f69740g = 1;

    /* renamed from: h */
    private static final int f69741h = 2;

    /* renamed from: i */
    private static final int f69742i = 3;

    /* renamed from: j */
    private static final int f69743j = 4;

    /* renamed from: k */
    private static boolean f69744k = false;

    /* renamed from: l */
    private static boolean f69745l = false;

    /* renamed from: m */
    private static boolean f69746m = false;

    /* renamed from: n */
    private static boolean f69747n = false;

    /* renamed from: a */
    public static void m41082a() {
        try {
            String m41111e = C26577b.m41111e();
            String m40963a = C26600u.m40963a("debug.pubsub.log");
            boolean z = true;
            f69745l = (TextUtils.isEmpty(m40963a) || TextUtils.isEmpty(m41111e) || !TextUtils.equals(m41111e, m40963a)) ? false : true;
            String m40963a2 = C26600u.m40963a("debug.pubsub.upload");
            f69735b = (TextUtils.isEmpty(m40963a2) || TextUtils.isEmpty(m41111e) || !TextUtils.equals(m41111e, m40963a2)) ? false : true;
            String m40963a3 = C26600u.m40963a("debug.pubsub.test");
            if (TextUtils.isEmpty(m40963a3) || TextUtils.isEmpty(m41111e) || !TextUtils.equals(m41111e, m40963a3)) {
                z = false;
            }
            f69747n = z;
            m41075b();
        } catch (Exception e) {
            Log.e("OT-PubSub-Sdk", "LogUtil static initializer: " + e.toString());
        }
        Log.d("OT-PubSub-Sdk", "log on: " + f69745l + ", quick upload on: " + f69735b);
    }

    /* renamed from: b */
    public static void m41072b(String str, String str2, Object... objArr) {
        if (f69734a) {
            m41079a(m41081a(str), String.format(str2, objArr), 0);
        }
    }

    /* renamed from: c */
    public static void m41067c(String str, String str2, Object... objArr) {
        if (f69734a) {
            m41079a(m41081a(str), String.format(str2, objArr), 1);
        }
    }

    /* renamed from: d */
    public static void m41064d(String str, String str2, Object... objArr) {
        if (f69734a) {
            m41079a(m41081a(str), String.format(str2, objArr), 2);
        }
    }

    /* renamed from: b */
    public static void m41074b(String str, String str2) {
        if (f69734a) {
            m41079a(m41081a(str), str2, 0);
        }
    }

    /* renamed from: c */
    public static void m41069c(String str, String str2) {
        if (f69734a) {
            m41079a(m41081a(str), str2, 1);
        }
    }

    /* renamed from: d */
    public static void m41066d(String str, String str2) {
        if (f69734a) {
            m41079a(m41081a(str), str2, 2);
        }
    }

    /* renamed from: b */
    public static void m41073b(String str, String str2, Throwable th) {
        if (f69734a) {
            Log.e(m41081a(str), str2, th);
        }
    }

    /* renamed from: c */
    public static void m41068c(String str, String str2, Throwable th) {
        if (f69734a) {
            Log.w(m41081a(str), str2, th);
        }
    }

    /* renamed from: d */
    public static void m41065d(String str, String str2, Throwable th) {
        if (f69734a) {
            Log.i(m41081a(str), str2, th);
        }
    }

    /* renamed from: b */
    public static void m41071b(boolean z) {
        f69746m = z;
        m41070c();
    }

    /* renamed from: c */
    private static void m41070c() {
        f69736c = f69746m || f69747n;
        Log.d("OneTrackSdk", "updateTestSwitch sTestEnable: " + f69736c + " sTestMode：" + f69746m + " sTestProperty：" + f69747n);
    }

    /* renamed from: b */
    private static void m41075b() {
        f69734a = f69744k || f69745l;
        Log.d("OT-PubSub-Sdk", "updateDebugSwitch sEnable: " + f69734a + " sDebugMode：" + f69744k + " sDebugProperty：" + f69745l);
    }

    /* renamed from: a */
    public static void m41077a(String str, String str2, Object... objArr) {
        if (f69734a) {
            m41079a(m41081a(str), String.format(str2, objArr), 3);
        }
    }

    /* renamed from: a */
    public static void m41080a(String str, String str2) {
        if (f69734a) {
            m41079a(m41081a(str), str2, 3);
        }
    }

    /* renamed from: a */
    public static void m41078a(String str, String str2, Throwable th) {
        if (f69734a) {
            Log.d(m41081a(str), str2, th);
        }
    }

    /* renamed from: a */
    private static void m41079a(String str, String str2, int i) {
        if (str2 == null) {
            return;
        }
        int i2 = 0;
        while (i2 <= str2.length() / 3000) {
            int i3 = i2 * 3000;
            i2++;
            int min = Math.min(str2.length(), i2 * 3000);
            if (i3 < min) {
                String substring = str2.substring(i3, min);
                if (i == 0) {
                    Log.e(str, substring);
                } else if (i == 1) {
                    Log.w(str, substring);
                } else if (i == 2) {
                    Log.i(str, substring);
                } else if (i == 3) {
                    Log.d(str, substring);
                } else if (i == 4) {
                    Log.v(str, substring);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m41081a(String str) {
        return f69738e + str;
    }

    /* renamed from: a */
    public static void m41076a(boolean z) {
        f69744k = z;
        m41075b();
    }
}
