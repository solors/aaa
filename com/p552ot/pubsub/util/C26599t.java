package com.p552ot.pubsub.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.ot.pubsub.util.t */
/* loaded from: classes7.dex */
public class C26599t {

    /* renamed from: a */
    private static final String f69815a = "SysPrefUtil";

    /* renamed from: b */
    private static final String f69816b = "one_track_pub_sub";

    /* renamed from: c */
    private static SharedPreferences f69817c = null;

    /* renamed from: d */
    private static SharedPreferences.Editor f69818d = null;

    /* renamed from: e */
    private static final String f69819e = "loc_token";

    /* renamed from: f */
    private static final String f69820f = "loc_config";

    /* renamed from: g */
    private static final String f69821g = "pub_sub_secret_key_data";

    /* renamed from: h */
    private static final String f69822h = "last_secret_key_time";

    /* renamed from: i */
    private static final String f69823i = "pref_custom_privacy_policy_";

    /* renamed from: j */
    private static final String f69824j = "pref_instance_id";

    /* renamed from: k */
    private static final String f69825k = "pref_instance_id_last_use_time";

    /* renamed from: l */
    private static final String f69826l = "custom_id";

    /* renamed from: m */
    private static final String f69827m = "first_launch_time";

    /* renamed from: n */
    private static final String f69828n = "next_update_common_conf_time";

    /* renamed from: o */
    private static final String f69829o = "common_cloud_data";

    /* renamed from: p */
    private static final String f69830p = "common_config_hash";

    /* renamed from: q */
    private static final String f69831q = "region_rul";

    /* renamed from: r */
    private static final String f69832r = "app_config_region";

    /* renamed from: a */
    private static String m40993a(String str, String str2) {
        m40964m();
        return f69817c.getString(str, str2);
    }

    /* renamed from: b */
    private static void m40986b(String str, String str2) {
        m40964m();
        f69818d.putString(str, str2).apply();
    }

    /* renamed from: c */
    private static void m40981c(String str, boolean z) {
        m40964m();
        f69818d.putBoolean(str, z).apply();
    }

    /* renamed from: d */
    public static String m40980d() {
        return m40993a(f69821g, "");
    }

    /* renamed from: e */
    public static long m40977e() {
        return m40994a(f69822h, 0L);
    }

    /* renamed from: f */
    public static String m40975f() {
        return m40993a(f69824j, "");
    }

    /* renamed from: g */
    public static long m40973g() {
        return m40994a(f69827m, 0L);
    }

    /* renamed from: h */
    public static String m40971h() {
        return m40993a(f69829o, "");
    }

    /* renamed from: i */
    public static long m40969i() {
        return m40994a(f69828n, 0L);
    }

    /* renamed from: j */
    public static String m40967j() {
        return m40993a(f69831q, "");
    }

    /* renamed from: k */
    public static String m40966k() {
        return m40993a(f69830p, "");
    }

    /* renamed from: l */
    public static String m40965l() {
        return m40993a(f69832r, "");
    }

    /* renamed from: m */
    private static void m40964m() {
        if (f69818d != null) {
            return;
        }
        synchronized (C26599t.class) {
            if (f69818d == null) {
                SharedPreferences sharedPreferences = C26577b.m41121a().getSharedPreferences(f69816b, 0);
                f69817c = sharedPreferences;
                f69818d = sharedPreferences.edit();
            }
        }
    }

    /* renamed from: d */
    public static boolean m40978d(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return m40985b(f69823i + str, true);
    }

    /* renamed from: e */
    public static void m40976e(String str) {
        m40986b(f69824j, str);
        m40999a(C26601v.m40960a());
    }

    /* renamed from: f */
    public static void m40974f(String str) {
        m40986b(f69829o, str);
    }

    /* renamed from: g */
    public static void m40972g(String str) {
        m40986b(f69831q, str);
    }

    /* renamed from: h */
    public static void m40970h(String str) {
        m40986b(f69830p, str);
    }

    /* renamed from: i */
    public static void m40968i(String str) {
        m40986b(f69832r, str);
    }

    /* renamed from: a */
    private static long m40994a(String str, long j) {
        m40964m();
        return f69817c.getLong(str, j);
    }

    /* renamed from: b */
    private static void m40987b(String str, long j) {
        m40964m();
        f69818d.putLong(str, j).apply();
    }

    /* renamed from: c */
    public static String m40984c() {
        return m40993a(f69820f, "");
    }

    /* renamed from: c */
    public static void m40982c(String str) {
        m40986b(f69821g, str);
    }

    /* renamed from: d */
    public static void m40979d(long j) {
        m40987b(f69828n, j);
    }

    /* renamed from: a */
    private static void m40995a(String str, float f) {
        m40964m();
        f69818d.putFloat(str, f).apply();
    }

    /* renamed from: b */
    private static boolean m40985b(String str, boolean z) {
        m40964m();
        return f69817c.getBoolean(str, z);
    }

    /* renamed from: c */
    public static void m40983c(long j) {
        m40987b(f69827m, j);
    }

    /* renamed from: a */
    public static long m41000a() {
        return m40994a(f69825k, 0L);
    }

    /* renamed from: b */
    private static float m40988b(String str, float f) {
        m40964m();
        return f69817c.getFloat(str, f);
    }

    /* renamed from: a */
    public static void m40999a(long j) {
        m40987b(f69825k, j);
    }

    /* renamed from: a */
    public static void m40996a(String str) {
        m40986b(f69819e, str);
    }

    /* renamed from: b */
    public static String m40991b() {
        return m40993a(f69819e, "");
    }

    /* renamed from: a */
    public static void m40992a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m40981c(f69823i + str, z);
    }

    /* renamed from: b */
    public static void m40989b(String str) {
        m40986b(f69820f, str);
    }

    /* renamed from: b */
    public static void m40990b(long j) {
        m40987b(f69822h, j);
    }

    /* renamed from: a */
    public static void m40997a(Context context, String str) {
        m40986b(f69826l, str);
    }

    /* renamed from: a */
    public static String m40998a(Context context) {
        return m40993a(f69826l, "");
    }
}
