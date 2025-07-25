package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.nativecrash.NativeFileParser;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.DefaultCommonParams;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.e */
/* loaded from: classes2.dex */
public final class NpthBus {

    /* renamed from: a */
    private static Context f3711a = null;

    /* renamed from: b */
    private static Application f3712b = null;

    /* renamed from: c */
    private static long f3713c = 0;

    /* renamed from: d */
    private static String f3714d = "default";

    /* renamed from: e */
    private static boolean f3715e = false;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    private static NativeFileParser f3716f;

    /* renamed from: i */
    private static volatile ConcurrentHashMap<Integer, String> f3719i;

    /* renamed from: n */
    private static volatile String f3724n;

    /* renamed from: g */
    private static ConfigManager f3717g = new ConfigManager();

    /* renamed from: h */
    private static AppDataCenter f3718h = new AppDataCenter();

    /* renamed from: j */
    private static DefaultCommonParams f3720j = null;

    /* renamed from: k */
    private static volatile String f3721k = null;

    /* renamed from: l */
    private static Object f3722l = new Object();

    /* renamed from: m */
    private static volatile int f3723m = 0;

    /* renamed from: o */
    private static int f3725o = 0;

    /* renamed from: p */
    private static boolean f3726p = true;

    /* renamed from: q */
    private static boolean f3727q = true;

    /* renamed from: r */
    private static boolean f3728r = false;

    /* renamed from: s */
    private static boolean f3729s = true;

    /* renamed from: a */
    public static NativeFileParser m102029a() {
        if (f3716f == null) {
            f3716f = DefaultCommonParams.m101404a(f3711a);
        }
        return f3716f;
    }

    /* renamed from: b */
    public static AppDataCenter m102020b() {
        return f3718h;
    }

    /* renamed from: c */
    public static DefaultCommonParams m102017c() {
        if (f3720j == null) {
            synchronized (NpthBus.class) {
                f3720j = new DefaultCommonParams();
            }
        }
        return f3720j;
    }

    /* renamed from: d */
    public static void m102014d(boolean z) {
        f3729s = z;
    }

    /* renamed from: e */
    public static String m102013e() {
        return m102012f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    /* renamed from: f */
    public static String m102012f() {
        if (f3721k == null) {
            synchronized (f3722l) {
                if (f3721k == null) {
                    f3721k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f3721k;
    }

    /* renamed from: g */
    public static Context m102011g() {
        return f3711a;
    }

    /* renamed from: h */
    public static Application m102010h() {
        return f3712b;
    }

    /* renamed from: i */
    public static ConfigManager m102009i() {
        return f3717g;
    }

    /* renamed from: j */
    public static long m102008j() {
        return f3713c;
    }

    /* renamed from: k */
    public static String m102007k() {
        return f3714d;
    }

    /* renamed from: l */
    public static void m102006l() {
        f3725o = 1;
    }

    /* renamed from: m */
    public static int m102005m() {
        return f3725o;
    }

    /* renamed from: n */
    public static boolean m102004n() {
        return f3715e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static void m102003o() {
        f3715e = true;
    }

    /* renamed from: p */
    public static ConcurrentHashMap<Integer, String> m102002p() {
        return f3719i;
    }

    /* renamed from: q */
    public static int m102001q() {
        return f3723m;
    }

    /* renamed from: r */
    public static String m102000r() {
        return f3724n;
    }

    /* renamed from: s */
    public static boolean m101999s() {
        return f3726p;
    }

    /* renamed from: t */
    public static boolean m101998t() {
        return f3727q;
    }

    /* renamed from: u */
    public static boolean m101997u() {
        return f3728r;
    }

    /* renamed from: v */
    public static boolean m101996v() {
        return f3729s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m102019b(int i, String str) {
        f3723m = i;
        f3724n = str;
    }

    /* renamed from: d */
    public static boolean m102015d() {
        if (f3717g.isDebugMode()) {
            Object obj = m102029a().m101542a().get(AppsFlyerProperties.CHANNEL);
            return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
        }
        return false;
    }

    /* renamed from: a */
    public static void m102023a(NativeFileParser nativeFileParser) {
        f3716f = nativeFileParser;
    }

    /* renamed from: b */
    public static void m102018b(boolean z) {
        f3727q = z;
    }

    /* renamed from: a */
    public static void m102026a(Application application) {
        if (application != null) {
            f3712b = application;
        }
    }

    /* renamed from: a */
    public static void m102025a(Application application, Context context) {
        if (f3712b == null) {
            f3713c = System.currentTimeMillis();
            f3711a = context;
            f3712b = application;
            f3721k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    /* renamed from: c */
    public static void m102016c(boolean z) {
        f3728r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102024a(Application application, Context context, ICommonParams iCommonParams) {
        m102025a(application, context);
        f3716f = new NativeFileParser(f3711a, iCommonParams, m102029a());
    }

    /* renamed from: a */
    public static String m102027a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(m102012f());
        sb2.append('_');
        sb2.append(z ? "oom_" : "normal_");
        sb2.append(f3713c);
        sb2.append('_');
        sb2.append(z2 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102022a(String str) {
        f3714d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102028a(int i, String str) {
        if (f3719i == null) {
            synchronized (NpthBus.class) {
                if (f3719i == null) {
                    f3719i = new ConcurrentHashMap<>();
                }
            }
        }
        f3719i.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m102021a(boolean z) {
        f3726p = z;
    }
}
