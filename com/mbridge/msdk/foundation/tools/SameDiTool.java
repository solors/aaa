package com.mbridge.msdk.foundation.tools;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import com.mbridge.msdk.p426e.CronetEnvironmentCheckUtil;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONObject;

@SuppressLint({"NewApi"})
/* renamed from: com.mbridge.msdk.foundation.tools.ab */
/* loaded from: classes6.dex */
public final class SameDiTool extends DomainSameDiTool {

    /* renamed from: A */
    private static String f56857A = "";

    /* renamed from: B */
    private static Object f56858B = null;

    /* renamed from: C */
    private static int f56859C = 0;

    /* renamed from: D */
    private static int f56860D = 0;

    /* renamed from: E */
    private static String f56861E = "";

    /* renamed from: e */
    private static String f56862e = "";

    /* renamed from: f */
    private static String f56863f = "";

    /* renamed from: g */
    private static int f56864g = -1;

    /* renamed from: h */
    private static String f56865h = "";

    /* renamed from: i */
    private static int f56866i = -1;

    /* renamed from: j */
    private static int f56867j = 0;

    /* renamed from: k */
    private static String f56868k = "";

    /* renamed from: l */
    private static int f56869l = -1;

    /* renamed from: m */
    private static String f56870m = "";

    /* renamed from: n */
    private static String f56871n = "";

    /* renamed from: o */
    private static volatile int f56872o = -1;

    /* renamed from: p */
    private static String f56873p = "";

    /* renamed from: q */
    private static String f56874q = "";

    /* renamed from: r */
    private static int f56875r = -1;

    /* renamed from: s */
    private static int f56876s = -1;

    /* renamed from: t */
    private static int f56877t = 0;

    /* renamed from: u */
    private static String f56878u = "";

    /* renamed from: v */
    private static String f56879v = null;

    /* renamed from: w */
    private static int f56880w = 0;

    /* renamed from: x */
    private static String f56881x = "";

    /* renamed from: y */
    private static int f56882y = -1;

    /* renamed from: z */
    private static int f56883z;

    /* renamed from: B */
    private static void m51904B() {
        String str = Build.VERSION.RELEASE;
        String m51887h = m51887h();
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(m51887h)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Mozilla/5.0 (Linux; Android ");
            sb2.append(str);
            sb2.append("; ");
            sb2.append(m51887h);
            sb2.append(" Build/");
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            f56881x = sb2.toString();
            return;
        }
        f56881x = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    /* renamed from: C */
    private static long m51903C() {
        Context m52792c = MBSDKContext.m52746m().m52792c();
        if (m52792c != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) m52792c.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return 0L;
    }

    /* renamed from: D */
    private static String m51902D() {
        String str;
        if (!TextUtils.isEmpty(f56865h)) {
            return f56865h;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            SameLogTool.m51824b("SameDiTool", th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                jSONObject.put("version", (String) cls2.getMethod(MobileAdsBridge.versionMethodName, new Class[0]).invoke(cls2, new Object[0]));
                jSONObject.put("pure_state", Settings.Secure.getInt(MBSDKContext.m52746m().m52792c().getContentResolver(), "pure_mode_state", -1));
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = SameBase64Tool.m51602b(jSONObject2);
                }
                f56865h = jSONObject2;
            } else {
                f56865h = "android";
            }
        } catch (Throwable th2) {
            SameLogTool.m51824b("SameDiTool", th2.getMessage());
        }
        return f56865h;
    }

    /* renamed from: a */
    public static String m51901a(Context context, int i) {
        TelephonyManager telephonyManager;
        if (i == 0 || i == 9) {
            return "";
        }
        try {
            return (!CommonConst.f56481z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: b */
    public static int m51899b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    public static int m51896c(String str) {
        if (f56860D == 0) {
            f56860D = SameTool.m51723f(str);
        }
        return f56860D;
    }

    /* renamed from: f */
    public static String m51890f(Context context) {
        if (context == null) {
            return f56874q;
        }
        try {
            if (TextUtils.isEmpty(f56874q)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f56874q = str;
                return str;
            }
            return f56874q;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static String m51889g() {
        if (TextUtils.isEmpty(f56881x)) {
            m51888g(MBSDKContext.m52746m().m52792c());
        }
        return f56881x;
    }

    /* renamed from: h */
    public static String m51887h() {
        return !SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    /* renamed from: i */
    public static String m51885i() {
        SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    /* renamed from: j */
    public static int m51882j(Context context) {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) {
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap m51884i = m51884i(context);
                return m51884i.get("width") == null ? displayMetrics.widthPixels : ((Integer) m51884i.get("width")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: k */
    public static int m51881k() {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    /* renamed from: l */
    public static String m51878l(Context context) {
        try {
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f56871n)) {
                    if (context == null) {
                        f56871n = "";
                        return f56870m;
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (SameTool.m51711j(simOperator)) {
                        f56871n = simOperator.substring(Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f56871n = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            f56871n = "";
        }
        return f56871n;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: m */
    public static int m51876m(Context context) {
        try {
            final Context m52792c = MBSDKContext.m52746m().m52792c();
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (m52792c == null) {
                    return f56872o;
                }
                if (f56872o != -1) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.3
                        @Override // java.lang.Runnable
                        @SuppressLint({"MissingPermission"})
                        public final void run() {
                            try {
                                ConnectivityManager connectivityManager = (ConnectivityManager) m52792c.getSystemService("connectivity");
                                if (connectivityManager != null && CommonConst.f56481z) {
                                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                    if (activeNetworkInfo == null) {
                                        int unused = SameDiTool.f56872o = 0;
                                    } else if (activeNetworkInfo.getType() == 1) {
                                        int unused2 = SameDiTool.f56872o = 9;
                                    } else {
                                        TelephonyManager telephonyManager = (TelephonyManager) m52792c.getSystemService("phone");
                                        if (telephonyManager == null) {
                                            int unused3 = SameDiTool.f56872o = 0;
                                        } else {
                                            int unused4 = SameDiTool.f56872o = SameDiTool.m51899b(telephonyManager.getNetworkType());
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
                                int unused5 = SameDiTool.f56872o = 0;
                            }
                        }
                    };
                    if (ThreadPoolUtils.m52225d().getActiveCount() < 1) {
                        ThreadPoolUtils.m52225d().execute(runnable);
                    }
                    return f56872o;
                }
                f56872o = 0;
                return f56872o;
            }
            return f56872o;
        } catch (Exception e) {
            SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
            f56872o = 0;
            return f56872o;
        }
    }

    /* renamed from: n */
    public static String m51875n() {
        Context m52792c;
        long m51907a;
        long m51903C;
        String m51905A;
        String str;
        String str2;
        String str3 = "";
        try {
            m52792c = MBSDKContext.m52746m().m52792c();
            m51907a = SameDeviceTimeTool.m51907a();
            m51903C = m51903C();
            m51905A = m51905A(m52792c);
            str = "app_tki_" + m51907a + "_" + m51903C + "_" + m51905A;
            str2 = (String) SharedPreferencesUtils.m51698a(m52792c, str, "");
            try {
            } catch (Exception e) {
                e = e;
                str3 = str2;
                e.printStackTrace();
                return str3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("1", m51905A);
                jSONObject.put("2", String.valueOf(m51903C));
                jSONObject.put("3", String.valueOf(m51907a));
                jSONObject.put(Protocol.VAST_1_0_WRAPPER, "");
                jSONObject.put("5", "");
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            str3 = AESCBCUtil.m51909a(jSONObject.toString());
            SharedPreferencesUtils.m51697b(m52792c, str, str3);
            return str3;
        }
        return str2;
    }

    /* renamed from: o */
    public static int m51873o() {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (f56876s < 1) {
                try {
                    Context m52792c = MBSDKContext.m52746m().m52792c();
                    long longValue = ((Long) SharedPreferencesUtils.m51698a(m52792c, "TotalRamSize", 0L)).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - longValue > 1800000 || f56876s == -1) {
                        f56876s = Long.valueOf((m51903C() / 1000) / 1000).intValue();
                        SharedPreferencesUtils.m51697b(m52792c, "TotalRamSize", Long.valueOf(currentTimeMillis));
                    }
                } catch (Throwable th) {
                    SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
                }
            }
            return f56876s;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: p */
    public static String m51871p() {
        FileReader fileReader;
        Throwable th;
        Exception e;
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (f56880w > 0) {
                return f56880w + "GB";
            }
            ?? r1 = AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO;
            f56880w = 0;
            try {
                try {
                    try {
                        fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
                        try {
                            r1 = new BufferedReader(fileReader, 8192);
                            try {
                                String str = r1.readLine().split("\\s+")[1];
                                r1.close();
                                if (str != null) {
                                    f56880w = (int) Math.ceil(new Float(Float.valueOf(str).floatValue() / 1048576.0f).doubleValue());
                                }
                                try {
                                    fileReader.close();
                                } catch (IOException unused) {
                                }
                                r1.close();
                                r1 = r1;
                            } catch (Exception e2) {
                                e = e2;
                                SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
                                if (fileReader != null) {
                                    try {
                                        fileReader.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (r1 != 0) {
                                    r1.close();
                                    r1 = r1;
                                }
                                return f56880w + "GB";
                            } catch (Throwable th2) {
                                th = th2;
                                SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
                                if (fileReader != null) {
                                    try {
                                        fileReader.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                if (r1 != 0) {
                                    r1.close();
                                    r1 = r1;
                                }
                                return f56880w + "GB";
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r1 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r1 = 0;
                        }
                    } catch (Exception e4) {
                        fileReader = null;
                        e = e4;
                        r1 = 0;
                    } catch (Throwable th4) {
                        fileReader = null;
                        th = th4;
                        r1 = 0;
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return f56880w + "GB";
            } catch (Throwable th5) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused4) {
                    }
                }
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th5;
            }
        }
        return "";
    }

    /* renamed from: q */
    public static String m51868q(Context context) {
        if (context == null) {
            return f56857A;
        }
        try {
            if (TextUtils.isEmpty(f56857A)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                f56857A = str;
                return str;
            }
            return f56857A;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: r */
    public static int m51867r() {
        try {
            if (SameTool.m51719h()) {
                return 1;
            }
            return SameTool.m51716i() ? 2 : 0;
        } catch (Exception e) {
            SameLogTool.m51824b("SameDiTool", e.getMessage());
            return 0;
        }
    }

    /* renamed from: s */
    public static int m51865s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: t */
    public static int m51863t() {
        return f56882y;
    }

    /* renamed from: u */
    public static int m51861u() {
        if (f56859C == 0) {
            f56859C = SameTool.m51728e();
        }
        return f56859C;
    }

    /* renamed from: v */
    public static int m51859v() {
        return f56869l;
    }

    /* renamed from: w */
    public static String m51857w() {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (TextUtils.isEmpty(f56873p)) {
                int m51865s = m51865s();
                f56873p = m51865s + "";
            }
            return f56873p;
        }
        return "";
    }

    /* renamed from: y */
    private static void m51852y(final Context context) {
        try {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        str = WebSettings.getDefaultUserAgent(context);
                    } catch (Throwable unused) {
                        str = null;
                    }
                    try {
                        if (!TextUtils.isEmpty(str) && !str.equals(SameDiTool.f56881x)) {
                            String unused2 = SameDiTool.f56881x = str;
                            SameDiTool.m51850z(context);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: z */
    public static void m51850z(Context context) {
        try {
            SharedPreferencesUtils.m51697b(context, "mbridge_ua", f56881x);
        } catch (Throwable th) {
            SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: A */
    private static String m51905A(Context context) {
        try {
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f56863f)) {
                    f56863f = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f56863f = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            f56863f = "";
        }
        return f56863f;
    }

    /* renamed from: b */
    public static Object m51898b(String str) {
        if (f56858B == null) {
            f56858B = SameTool.m51720g(str);
        }
        return f56858B;
    }

    /* renamed from: e */
    public static void m51893e(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                BaseSameDiTool.m51655b(context);
            } else {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseSameDiTool.m51655b(context);
                    }
                });
            }
        } catch (Exception e) {
            SameLogTool.m51823b("SameDiTool", "", e);
        }
    }

    /* renamed from: i */
    public static HashMap m51884i(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e) {
            SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
        }
        return hashMap;
    }

    /* renamed from: t */
    public static String m51862t(Context context) {
        Locale locale;
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (TextUtils.isEmpty(f56868k)) {
                if (context == null) {
                    return "en-US";
                }
                try {
                    if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                        return "en-US";
                    }
                    String languageTag = locale.toLanguageTag();
                    f56868k = languageTag;
                    return languageTag;
                } catch (Throwable th) {
                    SameLogTool.m51827a("SameDiTool", th.getMessage());
                    f56868k = "en-US";
                }
            }
            return f56868k;
        }
        return "";
    }

    /* renamed from: v */
    public static int m51858v(Context context) {
        if (f56864g == -1) {
            f56864g = SameTool.m51736c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f56864g;
    }

    /* renamed from: x */
    public static String m51855x() {
        return !SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.BRAND;
    }

    /* renamed from: h */
    public static int m51886h(Context context) {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) {
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap m51884i = m51884i(context);
                return m51884i.get("height") == null ? displayMetrics.heightPixels : ((Integer) m51884i.get("height")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: k */
    public static String m51880k(Context context) {
        try {
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f56870m)) {
                    if (context == null) {
                        f56870m = "";
                        return "";
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (SameTool.m51711j(simOperator)) {
                        f56870m = simOperator.substring(0, Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f56870m = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            f56870m = "";
        }
        return f56870m;
    }

    /* renamed from: s */
    public static int m51864s(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    /* renamed from: z */
    public static int m51851z() {
        if (f56866i == -1) {
            f56866i = SameTool.m51725f() ? 1 : 0;
        }
        return f56866i;
    }

    /* renamed from: c */
    public static void m51897c(int i) {
        f56869l = i;
    }

    /* renamed from: g */
    public static String m51888g(Context context) {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (TextUtils.isEmpty(f56881x)) {
                try {
                    f56881x = SharedPreferencesUtils.m51698a(context, "mbridge_ua", "").toString();
                } catch (Throwable th) {
                    SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
                }
            }
            try {
                if ((Looper.myLooper() == Looper.getMainLooper()) && !MBridgeConstans.DNT_GUA_ON_UI) {
                    if (TextUtils.isEmpty(f56881x)) {
                        try {
                            f56881x = WebSettings.getDefaultUserAgent(context);
                        } catch (Throwable unused) {
                        }
                        if (TextUtils.isEmpty(f56881x)) {
                            Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                            declaredConstructor.setAccessible(true);
                            f56881x = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                            declaredConstructor.setAccessible(false);
                            if (TextUtils.isEmpty(f56881x)) {
                                f56881x = new WebView(context).getSettings().getUserAgentString();
                            }
                            if (TextUtils.isEmpty(f56881x)) {
                                m51904B();
                            }
                        }
                    } else {
                        m51852y(context);
                    }
                } else {
                    if (TextUtils.isEmpty(f56881x)) {
                        m51904B();
                    }
                    m51852y(context);
                }
            } catch (Throwable th2) {
                SameLogTool.m51823b("SameDiTool", th2.getMessage(), th2);
            }
            m51850z(context);
            return f56881x;
        }
        return null;
    }

    /* renamed from: r */
    public static int m51866r(Context context) {
        if (context == null) {
            return f56883z;
        }
        int i = f56883z;
        if (i == 0) {
            try {
                int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                f56883z = i2;
                return i2;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m51860u(Context context) {
        if (context == null) {
            return f56877t;
        }
        if (f56877t == 0) {
            try {
                f56877t = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e) {
                SameLogTool.m51824b("SameDiTool", e.getMessage());
            }
        }
        return f56877t;
    }

    /* renamed from: y */
    public static String m51853y() {
        try {
        } catch (Throwable th) {
            SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
        }
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_OTHER)) {
            if (TextUtils.isEmpty(f56878u)) {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            String unused = SameDiTool.f56878u = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }).start();
                return f56878u;
            }
            return f56878u;
        }
        return "";
    }

    /* renamed from: a */
    public static String m51900a(String str, Context context) {
        try {
        } catch (Exception e) {
            SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
        }
        if (!TextUtils.isEmpty(f56862e)) {
            return f56862e;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f56862e = context.getPackageManager().getInstallerPackageName(str);
            SameLogTool.m51827a("SameDiTool", "PKGSource:" + f56862e);
        }
        return f56862e;
    }

    /* renamed from: j */
    public static void m51883j() {
        try {
            Object m51698a = SharedPreferencesUtils.m51698a(MBSDKContext.m52746m().m52792c(), MBridgeConstans.SP_GA_ID, "");
            Object m51698a2 = SharedPreferencesUtils.m51698a(MBSDKContext.m52746m().m52792c(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (m51698a instanceof String) {
                String str = (String) m51698a;
                if (!TextUtils.isEmpty(str)) {
                    BaseSameDiTool.m51657a(str);
                }
                if (m51698a2 instanceof Integer) {
                    BaseSameDiTool.f56986d = ((Integer) m51698a2).intValue();
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("SameDiTool", e.getMessage());
            }
        }
    }

    /* renamed from: w */
    public static boolean m51856w(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* renamed from: f */
    public static int m51891f() {
        try {
        } catch (Throwable th) {
            SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
        }
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            Context m52792c = MBSDKContext.m52746m().m52792c();
            long j = 0;
            long longValue = ((Long) SharedPreferencesUtils.m51698a(m52792c, "FreeRamSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f56875r == -1) {
                Context m52792c2 = MBSDKContext.m52746m().m52792c();
                if (m52792c2 != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) m52792c2.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                }
                f56875r = Long.valueOf((j / 1000) / 1000).intValue();
                SharedPreferencesUtils.m51697b(m52792c, "FreeRamSize", Long.valueOf(currentTimeMillis));
            }
            return f56875r;
        }
        return 0;
    }

    /* renamed from: q */
    public static int m51869q() {
        try {
        } catch (Exception e) {
            f56867j = 0;
            SameLogTool.m51824b("SameDiTool", e.getMessage());
        }
        if (SameOptimizedController.C22042a.f56911a.m51810a("v_a_d_p", false)) {
            if (SameTool.m51719h()) {
                f56867j = 1;
            } else if (SameTool.m51716i()) {
                f56867j = 2;
            } else {
                f56867j = 0;
            }
            return f56867j;
        }
        return 0;
    }

    /* renamed from: o */
    public static String m51872o(Context context) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) {
            if (!TextUtils.isEmpty(f56879v)) {
                return f56879v;
            }
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    try {
                        fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
                        try {
                            bufferedReader = new BufferedReader(fileReader, 8192);
                        } catch (IOException e) {
                            e = e;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        fileReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileReader = null;
                    }
                    try {
                        String formatFileSize = Formatter.formatFileSize(context, Long.valueOf(bufferedReader.readLine().split("\\s+")[1]).longValue() * 1024);
                        f56879v = formatFileSize;
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            SameLogTool.m51823b("SameDiTool", e3.getMessage(), e3);
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e4) {
                            SameLogTool.m51823b("SameDiTool", e4.getMessage(), e4);
                        }
                        return formatFileSize;
                    } catch (IOException e5) {
                        e = e5;
                        bufferedReader2 = bufferedReader;
                        SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e6) {
                                SameLogTool.m51823b("SameDiTool", e6.getMessage(), e6);
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return "";
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e7) {
                                SameLogTool.m51823b("SameDiTool", e7.getMessage(), e7);
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return "";
                    }
                } catch (IOException e8) {
                    SameLogTool.m51823b("SameDiTool", e8.getMessage(), e8);
                    return "";
                }
            } catch (Throwable th4) {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e9) {
                        SameLogTool.m51823b("SameDiTool", e9.getMessage(), e9);
                    }
                }
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e10) {
                        SameLogTool.m51823b("SameDiTool", e10.getMessage(), e10);
                    }
                }
                throw th4;
            }
        }
        return "";
    }

    /* renamed from: l */
    public static String m51879l() {
        return !SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MANUFACTURER;
    }

    /* renamed from: m */
    public static String m51877m() {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.MANUFACTURER + " " + Build.MODEL;
        }
        return "";
    }

    /* renamed from: n */
    public static String m51874n(Context context) {
        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) {
            try {
                return Settings.System.getString(context.getContentResolver(), "time_12_24");
            } catch (Exception e) {
                SameLogTool.m51823b("SameDiTool", e.getMessage(), e);
                return "";
            } catch (Throwable th) {
                SameLogTool.m51823b("SameDiTool", th.getMessage(), th);
                return "";
            }
        }
        return "";
    }

    /* renamed from: p */
    public static void m51870p(Context context) {
        try {
            BaseSameDiTool.m51659a(context);
            m51857w();
            m51890f(context);
            m51868q(context);
            m51866r(context);
            m51864s(context);
            m51887h();
            m51855x();
            m51862t(context);
            m51853y();
            CommonConst.f56433B = false;
            CommonConst.f56481z = SameTool.m51760a("android.permission.ACCESS_NETWORK_STATE", context);
            m51860u(context);
            m51902D();
            BaseSameDiTool.m51651e();
            ThreadPoolUtils.m52224e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        CronetEnvironmentCheckUtil.m52901a();
                    } catch (Exception e) {
                        SameLogTool.m51824b("SameDiTool", e.getMessage());
                    }
                }
            });
        } catch (Throwable th) {
            SameLogTool.m51824b("SameDiTool", th.getMessage());
        }
    }
}
