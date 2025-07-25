package com.p552ot.pubsub.util;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.p552ot.pubsub.p559g.C26549l;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ot.pubsub.util.l */
/* loaded from: classes7.dex */
public class C26590l {

    /* renamed from: a */
    public static final int f69771a = 29;

    /* renamed from: b */
    public static final int f69772b = 25;

    /* renamed from: c */
    public static final int f69773c = 24;

    /* renamed from: d */
    public static final int f69774d = 23;

    /* renamed from: e */
    public static final int f69775e = 22;

    /* renamed from: f */
    public static final int f69776f = 21;

    /* renamed from: g */
    public static final int f69777g = 19;

    /* renamed from: h */
    public static final int f69778h = 17;

    /* renamed from: i */
    private static final String f69779i = "OsUtil";

    /* renamed from: j */
    private static Class f69780j = null;

    /* renamed from: k */
    private static Method f69781k = null;

    /* renamed from: l */
    private static Boolean f69782l = null;

    /* renamed from: m */
    private static final long f69783m = 1024;

    /* renamed from: n */
    private static final long f69784n = 1024;

    /* renamed from: o */
    private static final long f69785o = 1048576;

    /* renamed from: p */
    private static final long f69786p = 1073741824;

    /* renamed from: q */
    private static final int f69787q = 1;

    /* renamed from: r */
    private static final int f69788r = 2;

    /* renamed from: s */
    private static final String f69789s = "";

    /* renamed from: t */
    private static boolean f69790t = false;

    /* renamed from: u */
    private static String f69791u = null;

    /* renamed from: v */
    private static boolean f69792v = false;

    static {
        try {
            f69780j = Class.forName("miui.os.Build");
        } catch (Throwable th) {
            C26586j.m41074b(f69779i, "sMiuiBuild init failed ex: " + th.getMessage());
        }
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Secure").getDeclaredMethod("isUserExperienceProgramEnable", ContentResolver.class);
            f69781k = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th2) {
            C26586j.m41074b(f69779i, "sMiuiUEPMethod init failed ex: " + th2.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m41054a() {
        Boolean bool = f69782l;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!TextUtils.isEmpty(C26600u.m40963a("ro.miui.ui.version.code"))) {
            f69782l = Boolean.TRUE;
        } else {
            f69782l = Boolean.FALSE;
        }
        return f69782l.booleanValue();
    }

    /* renamed from: b */
    public static String m41047b() {
        return m41053a(TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: c */
    public static String m41045c() {
        Class cls = f69780j;
        if (cls != null) {
            try {
                return ((Boolean) cls.getField("IS_ALPHA_BUILD").get(null)).booleanValue() ? ExifInterface.GPS_MEASUREMENT_IN_PROGRESS : ((Boolean) f69780j.getField("IS_DEVELOPMENT_VERSION").get(null)).booleanValue() ? "D" : ((Boolean) f69780j.getField("IS_STABLE_VERSION").get(null)).booleanValue() ? ExifInterface.LATITUDE_SOUTH : "";
            } catch (Exception e) {
                Log.e(f69779i, "getRomBuildCode failed: " + e.toString());
                return "";
            }
        }
        return "";
    }

    /* renamed from: d */
    public static String m41043d() {
        return Build.VERSION.INCREMENTAL;
    }

    /* renamed from: e */
    public static String m41042e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m41041f() {
        /*
            java.lang.String r0 = "OsUtil"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.os.UserHandle"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "getUserId"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L43
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L43
            r6[r1] = r7     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r6)     // Catch: java.lang.Throwable -> L43
            r3.setAccessible(r5)     // Catch: java.lang.Throwable -> L43
            int r4 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L43
            r6[r1] = r7     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = r3.invoke(r2, r6)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "getUserId, uid:%d, userId:%d"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L41
            r6[r1] = r4     // Catch: java.lang.Throwable -> L41
            r6[r5] = r3     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = java.lang.String.format(r2, r6)     // Catch: java.lang.Throwable -> L41
            com.p552ot.pubsub.util.C26586j.m41080a(r0, r2)     // Catch: java.lang.Throwable -> L41
            goto L63
        L41:
            r2 = move-exception
            goto L47
        L43:
            r3 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
        L47:
            java.lang.String r0 = com.p552ot.pubsub.util.C26586j.m41081a(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getUserId exception: "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.e(r0, r2)
        L63:
            if (r3 != 0) goto L69
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L69:
            int r0 = r3.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p552ot.pubsub.util.C26590l.m41041f():int");
    }

    @TargetApi(17)
    /* renamed from: g */
    public static boolean m41040g() {
        try {
            if (Settings.Global.getInt(C26577b.m41116b().getContentResolver(), "device_provisioned", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C26586j.m41073b(f69779i, "isDeviceProvisioned exception：", e);
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m41039h() {
        if (m41054a() && !f69792v) {
            return m41036k();
        }
        return f69790t;
    }

    /* renamed from: i */
    public static String m41038i() {
        if (m41054a() && !f69792v) {
            return m41037j();
        }
        if (!TextUtils.isEmpty(f69791u)) {
            return f69791u;
        }
        return m41037j();
    }

    /* renamed from: j */
    private static String m41037j() {
        try {
            String m40961a = C26600u.m40961a("ro.miui.region", "");
            if (TextUtils.isEmpty(m40961a)) {
                m40961a = C26600u.m40961a("ro.product.locale.region", "");
            }
            if (TextUtils.isEmpty(m40961a)) {
                Object invoke = Class.forName("android.os.LocaleList").getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Object invoke2 = invoke.getClass().getMethod("size", new Class[0]).invoke(invoke, new Object[0]);
                if ((invoke2 instanceof Integer) && ((Integer) invoke2).intValue() > 0) {
                    Object invoke3 = invoke.getClass().getMethod(KiwiConstants.f2714as, Integer.TYPE).invoke(invoke, 0);
                    Object invoke4 = invoke3.getClass().getMethod("getCountry", new Class[0]).invoke(invoke3, new Object[0]);
                    if (invoke4 instanceof String) {
                        m40961a = (String) invoke4;
                    }
                }
            }
            if (TextUtils.isEmpty(m40961a)) {
                m40961a = Locale.getDefault().getCountry();
            }
            if (!TextUtils.isEmpty(m40961a)) {
                return m40961a.trim();
            }
        } catch (Throwable th) {
            C26586j.m41074b(f69779i, "getRegion Exception: " + th.getMessage());
        }
        return "";
    }

    /* renamed from: k */
    private static boolean m41036k() {
        Class cls = f69780j;
        if (cls != null) {
            try {
                return ((Boolean) cls.getField("IS_INTERNATIONAL_BUILD").get(null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        String m41037j = m41037j();
        if (!TextUtils.isEmpty(m41037j)) {
            return !TextUtils.equals(C26549l.f69547a, m41037j.toUpperCase());
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m41046b(String str) {
        try {
            return ((Boolean) Class.forName(ConstantsUtil.SYS_GMC_INIT).getMethod("isPreinstalledPAIPackage", String.class).invoke(null, str)).booleanValue();
        } catch (Throwable th) {
            String m41081a = C26586j.m41081a(f69779i);
            Log.e(m41081a, "isPreinstalledPAIPackage failed:" + th.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m41044c(String str) {
        if (m41040g()) {
            return false;
        }
        C26586j.m41069c(str, "should not access network or location, not provisioned");
        return true;
    }

    /* renamed from: a */
    public static String m41053a(int i) {
        char c;
        try {
            int i2 = i / 60000;
            if (i2 < 0) {
                i2 = -i2;
                c = '-';
            } else {
                c = '+';
            }
            StringBuilder sb2 = new StringBuilder(9);
            sb2.append("GMT");
            sb2.append(c);
            m41050a(sb2, i2 / 60);
            sb2.append(':');
            m41050a(sb2, i2 % 60);
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static void m41050a(StringBuilder sb2, int i) {
        String num = Integer.toString(i);
        for (int i2 = 0; i2 < 2 - num.length(); i2++) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* renamed from: a */
    public static boolean m41052a(Context context) {
        Method method = f69781k;
        if (method == null) {
            return true;
        }
        try {
            return ((Boolean) method.invoke(null, context.getContentResolver())).booleanValue();
        } catch (Exception e) {
            Log.e(f69779i, "isUserExperiencePlanEnabled failed: " + e.toString());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m41051a(String str) {
        try {
            return ((Boolean) Class.forName(ConstantsUtil.SYS_GMC_INIT).getMethod("isPreinstalledPackage", String.class).invoke(null, str)).booleanValue();
        } catch (ClassNotFoundException e) {
            if (m41054a()) {
                String m41081a = C26586j.m41081a(f69779i);
                Log.e(m41081a, "checkPreinstallApp failed:" + e.getMessage());
            }
            return false;
        } catch (Throwable th) {
            String m41081a2 = C26586j.m41081a(f69779i);
            Log.e(m41081a2, "checkPreinstallApp failed:" + th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static void m41048a(boolean z, String str) {
        f69790t = z;
        f69791u = str;
    }

    /* renamed from: a */
    public static void m41049a(boolean z) {
        f69792v = z;
    }
}
