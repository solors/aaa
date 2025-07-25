package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.ironsource.C20517nb;
import com.ironsource.C20747r8;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.FqInfo;
import com.mbridge.msdk.foundation.p432d.FeedbackDialogEventListener;
import com.mbridge.msdk.foundation.p432d.FeedbackManager;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.FqInfoDao;
import com.mbridge.msdk.foundation.p434db.p435a.FrequencyDaoMiddle;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingManagerDiff;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.ak */
/* loaded from: classes6.dex */
public final class SameTool extends DomainSameTool {

    /* renamed from: a */
    private static int f56923a = 0;

    /* renamed from: b */
    private static int f56924b = 1;

    /* renamed from: c */
    private static int f56925c = 2;

    /* renamed from: d */
    private static int f56926d = 3;

    /* renamed from: e */
    private static int f56927e = 0;

    /* renamed from: f */
    private static int f56928f = 7;

    /* renamed from: g */
    private static int f56929g = 14;

    /* renamed from: h */
    private static int f56930h = 19;

    /* renamed from: i */
    private static int f56931i = 16;

    /* renamed from: j */
    private static int f56932j = 26;

    /* renamed from: k */
    private static char[] f56933k = {'.', 'X'};

    /* renamed from: l */
    private static char[] f56934l = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: m */
    private static int f56935m = 1;

    /* renamed from: n */
    private static boolean f56936n = true;

    /* renamed from: o */
    private static volatile Boolean f56937o = null;

    /* renamed from: p */
    private static String f56938p = "[一-龥]";

    /* renamed from: q */
    private static Pattern f56939q = Pattern.compile("[一-龥]");

    /* renamed from: r */
    private static Map<String, String> f56940r;

    /* renamed from: s */
    private static Map<String, String> f56941s;

    /* renamed from: a */
    public static int m51774a(int i) {
        if ((i <= 100 || i >= 199) && i != 2) {
            if ((i <= 200 || i >= 299) && i != 4) {
                return (i <= 500 || i >= 599) ? -1 : 5;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m51748b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b == null) {
                SettingManager.m53286a();
                m53279b = SettingManagerDiff.m53265a();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return m53279b.m53472aC();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static int m51737c(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: d */
    public static float m51731d(Context context) {
        if (context != null) {
            try {
                float f = context.getResources().getDisplayMetrics().density;
                if (f == 0.0f) {
                    return 2.5f;
                }
                return f;
            } catch (Exception e) {
                e.printStackTrace();
                return 2.5f;
            }
        }
        return 2.5f;
    }

    /* renamed from: e */
    public static int m51727e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m51702o(context).heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static int m51724f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m51702o(context).widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: g */
    public static int m51721g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static int m51718h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static float m51715i(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: j */
    public static float m51712j(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: k */
    public static int m51710k(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: l */
    public static boolean m51708l(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m51706m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("SameTools", "isNetworkAvailable", e);
            }
            return false;
        }
    }

    /* renamed from: n */
    public static boolean m51704n(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return C20747r8.f52730b.equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US));
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o */
    private static DisplayMetrics m51702o(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    /* renamed from: a */
    public static String m51755a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put(str2, str3);
                return m51754a(str, hashMap);
            }
            return str;
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return str;
        }
    }

    /* renamed from: d */
    public static synchronized String m51729d(String str) {
        synchronized (SameTool.class) {
            String str2 = MBSDKContext.m52746m().m52779k() + "_" + str;
            Map<String, String> map = f56941s;
            if (map == null || !map.containsKey(str2)) {
                return null;
            }
            return f56941s.get(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0036  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m51714i(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L48
            if (r4 == 0) goto L3a
            java.lang.String r0 = "dyview"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L48
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L48
            r3 = 1
            if (r2 != 0) goto L27
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L48
            goto L21
        L20:
            r0 = -1
        L21:
            int r0 = r0 % 2
            if (r0 != 0) goto L27
            r0 = r3
            goto L28
        L27:
            r0 = r1
        L28:
            java.lang.String r2 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L47
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L47
            if (r4 != 0) goto L36
            r1 = r3
            goto L3a
        L36:
            r1 = r0
            goto L3a
        L38:
            r4 = move-exception
            goto L3d
        L3a:
            return r1
        L3b:
            r4 = move-exception
            r0 = r1
        L3d:
            java.lang.String r2 = "SameTools"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L47
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r2, r4)     // Catch: java.lang.Throwable -> L47
            return r1
        L47:
            r1 = r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.SameTool.m51714i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public static <T extends String> boolean m51711j(T t) {
        return t != null && t.length() > 0;
    }

    /* renamed from: e */
    public static final synchronized String m51726e(String str) {
        String str2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        JSONObject jSONObject;
        Map<String, String> map;
        synchronized (SameTool.class) {
            try {
                str2 = MBSDKContext.m52746m().m52779k() + "_" + str;
                Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
                if (m53279b != null) {
                    z = m53279b.m53471aD();
                    z2 = m53279b.m53466aI();
                    i2 = Math.max(0, m53279b.m53458ae());
                } else {
                    z = true;
                    i2 = 3;
                    z2 = false;
                }
            } catch (Exception e) {
                SameLogTool.m51824b("SameTools", e.getMessage());
            }
            if (z2 && i2 != 0) {
                if (z && (map = f56940r) != null && map.containsKey(str2)) {
                    return f56940r.get(str2);
                }
                StringBuilder sb2 = new StringBuilder("");
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    List<String> m51751a = m51751a(stackTrace);
                    Collections.reverse(m51751a);
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : m51751a) {
                        if (!str3.startsWith(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_APP) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_REFLECT_METHOD) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_VIEW) && !arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                    int min = Math.min(arrayList.size(), i2);
                    if (min > 0) {
                        for (i = 0; i < min; i++) {
                            sb2.append((String) arrayList.get(i));
                            if (i < min - 1) {
                                sb2.append(SignedToken.f2767c);
                            }
                        }
                    }
                    if (TextUtils.isEmpty(sb2.toString())) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("1", sb2.toString());
                    }
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        return "";
                    }
                    String m51909a = AESCBCUtil.m51909a(jSONObject.toString());
                    if (z && !TextUtils.isEmpty(m51909a)) {
                        if (f56940r == null) {
                            f56940r = new HashMap();
                        }
                        f56940r.put(str2, m51909a);
                    }
                    return m51909a;
                }
                return "";
            }
            return "";
        }
    }

    /* renamed from: f */
    public static int m51723f(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(SameDiTool.m51898b(str), new Object[0])).intValue();
        } catch (Throwable th) {
            SameLogTool.m51824b("SameTools", th.getMessage());
            return 0;
        }
    }

    /* renamed from: g */
    public static Object m51720g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, MBSDKContext.m52746m().m52792c(), str);
        } catch (ClassNotFoundException e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return null;
        } catch (IllegalAccessException e2) {
            SameLogTool.m51824b("SameTools", e2.getMessage());
            return null;
        } catch (NoSuchMethodException e3) {
            SameLogTool.m51824b("SameTools", e3.getMessage());
            return null;
        } catch (InvocationTargetException e4) {
            SameLogTool.m51824b("SameTools", e4.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m51717h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                return queryParameter.equals("1");
            }
            return false;
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: j */
    public static void m51713j() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
        builder.setDatabaseHandler(handler);
        builder.setDatabaseOpenHelper(new IDatabaseOpenHelper() { // from class: com.mbridge.msdk.foundation.tools.ak.2
            @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
            public final SQLiteDatabase getReadableDatabase() {
                return CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()).m52596c();
            }

            @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
            public final SQLiteDatabase getWritableDatabase() {
                return CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()).m52595d();
            }
        });
        builder.setLogger(new ILogger() { // from class: com.mbridge.msdk.foundation.tools.ak.3
            @Override // com.mbridge.msdk.foundation.download.utils.ILogger
            public final void log(String str, String str2) {
                SameLogTool.m51827a(str, str2);
            }

            @Override // com.mbridge.msdk.foundation.download.utils.ILogger
            public final void log(String str, Exception exc) {
                SameLogTool.m51827a(str, exc.getMessage());
            }
        });
        MBDownloadManager.getInstance().initialize(MBSDKContext.m52746m().m52792c(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100L).setMaxStorageTime(259200000L).build());
    }

    /* renamed from: l */
    public static boolean m51707l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("isplayableec");
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                return queryParameter.equals("0");
            }
            return false;
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x004a, code lost:
        if ((r5 + (r3 * 1000)) >= r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x006e, code lost:
        if ((r5 + (r3.m53459ad() * 1000)) >= r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0071, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0072, code lost:
        if (r10 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0074, code lost:
        r2 = r2.m52510c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0078, code lost:
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007e, code lost:
        if (r2.size() <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0080, code lost:
        r0.addAll(r2);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m51734c(java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.ConcurrentHashMap r14 = com.mbridge.msdk.foundation.same.p436a.StaticDataPoll.m52303a(r14)
            if (r14 == 0) goto L99
            int r0 = r14.size()
            if (r0 <= 0) goto L99
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
        L22:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r14.next()
            com.mbridge.msdk.foundation.entity.c r2 = (com.mbridge.msdk.foundation.entity.BidCacheBean) r2
            if (r2 == 0) goto L22
            long r3 = r2.m52505e()
            long r5 = r2.m52504f()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 0
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r10 = 1
            r11 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r9 <= 0) goto L4d
            long r3 = r3 * r12
            long r5 = r5 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L71
            goto L72
        L4d:
            com.mbridge.msdk.c.h r3 = com.mbridge.msdk.p411c.SettingManager.m53286a()
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.MBSDKContext.m52746m()
            java.lang.String r4 = r4.m52779k()
            com.mbridge.msdk.c.g r3 = r3.m53279b(r4)
            if (r3 != 0) goto L66
            com.mbridge.msdk.p411c.SettingManager.m53286a()
            com.mbridge.msdk.c.g r3 = com.mbridge.msdk.p411c.SettingManagerDiff.m53265a()
        L66:
            long r3 = r3.m53459ad()
            long r3 = r3 * r12
            long r5 = r5 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L71
            goto L72
        L71:
            r10 = r11
        L72:
            if (r10 == 0) goto L22
            java.util.List r2 = r2.m52510c()
            if (r2 == 0) goto L22
            int r3 = r2.size()
            if (r3 <= 0) goto L22
            r0.addAll(r2)
            goto L22
        L84:
            int r14 = r0.size()
            if (r14 <= 0) goto L99
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            r0.clear()
            r0.addAll(r14)
            java.lang.String r1 = r0.toString()
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.SameTool.m51734c(java.lang.String):java.lang.String");
    }

    /* renamed from: n */
    public static BitmapDrawable m51703n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                return bitmapDrawable;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    /* renamed from: m */
    public static double m51705m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: a */
    private static String m51754a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb2 = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals("0")) {
                                sb2 = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb2 = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals("0")) {
                            sb2.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb2.toString();
            }
            return str;
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return str;
        }
    }

    /* renamed from: d */
    public static String m51732d() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (C22047ap.m51693a(str)) {
            return System.currentTimeMillis() + "";
        }
        return str;
    }

    /* renamed from: k */
    public static <T extends String> boolean m51709k(T t) {
        return t == null || t.length() == 0;
    }

    /* renamed from: b */
    public static int m51744b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("dyview");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = parse.getQueryParameter("view");
                }
                if (TextUtils.isEmpty(queryParameter)) {
                    return -1;
                }
                try {
                    return Integer.parseInt(queryParameter);
                } catch (Exception unused) {
                    return -1;
                }
            }
            return -1;
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return -1;
        }
    }

    /* renamed from: f */
    public static boolean m51725f() {
        if (TextUtils.isEmpty(MBSDKContext.m52746m().m52782h())) {
            return false;
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
            return true;
        } catch (ClassNotFoundException e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m51719h() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager m51607a = NetManager.m51607a();
            if (m51607a != null && (networkInfo = m51607a.getNetworkInfo(17)) != null) {
                return networkInfo.isConnected();
            }
            return false;
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public static synchronized int m51730d(Context context, String str) {
        int i;
        synchronized (SameTool.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i = m51743b(str, context) != null ? 1 : 0;
                    } catch (Exception unused) {
                        i = 3;
                    }
                }
            }
            if (context == null) {
                i = 5;
            } else {
                i = TextUtils.isEmpty(str) ? 2 : 4;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static boolean m51722g() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: i */
    public static boolean m51716i() {
        try {
            if (MBSDKContext.m52746m().m52792c() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            int parseInt = Integer.parseInt(property2);
            SameLogTool.m51827a("address = ", property + "~");
            SameLogTool.m51827a("port = ", parseInt + "~");
            return (TextUtils.isEmpty(property) || parseInt == -1) ? false : true;
        } catch (Throwable th) {
            SameLogTool.m51824b("SameTools", th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003f A[Catch: Exception -> 0x0052, LOOP:0: B:51:0x003d->B:52:0x003f, LOOP_END, TryCatch #0 {Exception -> 0x0052, blocks: (B:36:0x0002, B:38:0x0014, B:39:0x001b, B:41:0x0022, B:43:0x0029, B:45:0x0033, B:49:0x0039, B:52:0x003f, B:53:0x0047, B:55:0x004d), top: B:60:0x0002 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m51749b(int r5) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.c.h r1 = com.mbridge.msdk.p411c.SettingManager.m53286a()     // Catch: java.lang.Exception -> L52
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.MBSDKContext.m52746m()     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r2.m52779k()     // Catch: java.lang.Exception -> L52
            com.mbridge.msdk.c.g r1 = r1.m53279b(r2)     // Catch: java.lang.Exception -> L52
            if (r1 != 0) goto L1b
            com.mbridge.msdk.p411c.SettingManager.m53286a()     // Catch: java.lang.Exception -> L52
            com.mbridge.msdk.c.g r1 = com.mbridge.msdk.p411c.SettingManagerDiff.m53265a()     // Catch: java.lang.Exception -> L52
        L1b:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L47
            int r1 = r1.m53386t()     // Catch: java.lang.Exception -> L52
            r3 = 1
            if (r1 != r3) goto L47
            com.mbridge.msdk.foundation.db.a.a r1 = com.mbridge.msdk.foundation.p434db.p435a.FrequencyDaoMiddle.m52673a()     // Catch: java.lang.Exception -> L52
            java.lang.String[] r1 = r1.m52668b()     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L47
            int r3 = r1.length     // Catch: java.lang.Exception -> L52
            if (r3 <= r5) goto L3c
            if (r5 != 0) goto L39
            goto L3c
        L39:
            int r5 = r3 - r5
            goto L3d
        L3c:
            r5 = 0
        L3d:
            if (r5 >= r3) goto L47
            r4 = r1[r5]     // Catch: java.lang.Exception -> L52
            r2.put(r4)     // Catch: java.lang.Exception -> L52
            int r5 = r5 + 1
            goto L3d
        L47:
            int r5 = r2.length()     // Catch: java.lang.Exception -> L52
            if (r5 <= 0) goto L56
            java.lang.String r0 = m51753a(r2)     // Catch: java.lang.Exception -> L52
            goto L56
        L52:
            r5 = move-exception
            r5.printStackTrace()
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.SameTool.m51749b(int):java.lang.String");
    }

    /* renamed from: a */
    public static String m51761a(String str) {
        try {
            return C22047ap.m51692b(str) ? URLEncoder.encode(str, C20517nb.f52167N) : "";
        } catch (Throwable th) {
            SameLogTool.m51823b("SameTools", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: a */
    public static void m51768a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
            imageView.setImageBitmap(null);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private static final char[] m51738c(int i) {
        StringBuilder sb2;
        if (i == 0) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(SameSDKTool.f56920a, f56928f)));
            sb2.append(f56933k[f56927e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(SameSDKTool.f56920a, f56928f, f56929g)));
            sb2.append(f56933k[f56927e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(SameSDKTool.f56920a, f56929g, f56931i)));
            sb2.append(f56933k[f56927e]);
            sb2.append(String.valueOf(SameSDCardTool.f56912a));
        } else if (i == 1) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(SameSDKTool.f56920a, f56928f)));
            sb2.append(f56933k[f56927e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(SameSDKTool.f56920a, f56928f, f56929g)));
            sb2.append(f56933k[f56927e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(SameSDKTool.f56920a, f56930h, f56932j)));
        } else if (i == 2) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(SameSDKTool.f56920a, f56931i, f56930h)));
            sb2.append(String.valueOf(f56934l));
        } else if (i != 3) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(SameSDKTool.f56920a, f56931i, f56930h)));
            sb2.append(String.valueOf(SameSDCardTool.f56912a));
        }
        return sb2.toString().toCharArray();
    }

    /* renamed from: a */
    public static final void m51773a(final int i, final ImageView imageView, final CampaignEx campaignEx, Context context, boolean z, final FeedbackDialogEventListener feedbackDialogEventListener) {
        if (imageView == null || campaignEx == null) {
            return;
        }
        SameLogTool.m51827a("configPrivacyButton", "configPrivacyButton");
        boolean z2 = campaignEx.getPrivacyButtonTemplateVisibility() == 0;
        SameLogTool.m51827a("configPrivacyButton", "privacyButtonVisibilityGone: " + z2 + " isIgnoreCampaignPrivacyConfig: " + z);
        if (!z && z2) {
            try {
                imageView.setVisibility(8);
            } catch (Exception e) {
                SameLogTool.m51824b("SameTools", e.getMessage());
            }
        } else if (TextUtils.isEmpty(m51766a(campaignEx))) {
            try {
                imageView.setVisibility(8);
            } catch (Exception e2) {
                SameLogTool.m51824b("SameTools", e2.getMessage());
            }
        } else {
            try {
                imageView.setVisibility(0);
            } catch (Exception e3) {
                SameLogTool.m51824b("SameTools", e3.getMessage());
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.tools.ak.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        SameTool.m51765a(campaignEx, feedbackDialogEventListener, i, (String) imageView.getTag());
                    } catch (Exception e4) {
                        SameLogTool.m51824b("SameTools", e4.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static JSONArray m51746b(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b == null) {
                SettingManager.m53286a();
                m53279b = SettingManagerDiff.m53265a();
            }
            if (m53279b != null && m53279b.m53386t() == 1) {
                SameLogTool.m51822c("SameTools", "fqci cfc:" + m53279b.m53386t());
                String[] m52668b = FrequencyDaoMiddle.m52673a().m52668b();
                if (m52668b != null) {
                    for (String str2 : m52668b) {
                        SameLogTool.m51822c("SameTools", "cfc campaignIds:" + m52668b);
                        jSONArray.put(str2);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static synchronized boolean m51736c(Context context, String str) {
        boolean z;
        synchronized (SameTool.class) {
            z = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (m51743b(str, context) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m51735c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m51733c(String str, String str2) {
        return m51756a(str, str2, 0);
    }

    /* renamed from: c */
    public static final String m51739c() {
        return MIMManager.C22029a.m51910a().m51918c();
    }

    /* renamed from: e */
    public static int m51728e() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable th) {
            SameLogTool.m51824b("SameTools", th.getMessage());
            return 0;
        }
    }

    /* renamed from: a */
    public static String m51766a(CampaignEx campaignEx) {
        Setting m53279b;
        CampaignEx.C21959a adchoice;
        String str = "";
        if (campaignEx != null) {
            try {
                str = campaignEx.getPrivacyUrl();
            } catch (Exception e) {
                SameLogTool.m51824b("SameTools", e.getMessage());
                return "";
            }
        }
        if (TextUtils.isEmpty(str) && campaignEx != null && (adchoice = campaignEx.getAdchoice()) != null) {
            str = adchoice.m52537c();
        }
        if (TextUtils.isEmpty(str) && (m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k())) != null) {
            str = m53279b.m53406j();
        }
        return TextUtils.isEmpty(str) ? RequestUrlUtil.m52180f().f56652f : str;
    }

    /* renamed from: b */
    public static int m51750b() {
        int i = f56935m;
        f56935m = i + 1;
        return i;
    }

    /* renamed from: b */
    private static Object m51743b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(m51738c(f56923a))).getMethod(String.valueOf(m51738c(f56925c)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(m51738c(f56924b))).getMethod(String.valueOf(m51738c(f56926d)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m51745b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    /* renamed from: b */
    public static List<String> m51740b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i);
                        if (C22047ap.m51692b(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    return arrayList;
                }
                return null;
            } catch (Throwable th) {
                SameLogTool.m51823b("SameTools", th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m51765a(CampaignEx campaignEx, FeedbackDialogEventListener feedbackDialogEventListener, int i, String str) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str2 = campaignEx.getCampaignUnitId() + "_" + i;
            FeedbackManager.m52694a().m52676c(str2);
            FeedbackManager.m52694a().m52682a(str2, campaignEx);
            FeedbackManager.m52694a().m52683a(str2, feedbackDialogEventListener);
            FeedbackManager.m52694a().m52690a(str2, i);
            FeedbackManager.m52694a().m52680a(str2, str);
            FeedbackManager.m52694a().m52691a(str2).m52704e();
        } catch (Throwable th) {
            SameLogTool.m51823b("SameTools", "feedback error", th);
        }
    }

    /* renamed from: b */
    public static synchronized void m51742b(String str, String str2) {
        synchronized (SameTool.class) {
            if (f56941s == null) {
                f56941s = new HashMap();
            }
            f56941s.put(MBSDKContext.m52746m().m52779k() + "_" + str, str2);
        }
    }

    /* renamed from: a */
    public static int m51772a(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m51747b(Context context, float f) {
        float f2 = 2.5f;
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 != 0.0f) {
                    f2 = f3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: a */
    public static double m51763a(Double d) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d);
            if (C22047ap.m51692b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: b */
    public static String m51741b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("device");
                if (jSONObject2 == null) {
                    return str;
                }
                if (jSONObject2.has(str2)) {
                    if (str3.equals("0")) {
                        jSONObject2.remove(str2);
                    } else {
                        jSONObject2.put(str2, str3);
                    }
                } else if (str3.equals("0")) {
                    return str;
                } else {
                    jSONObject2.put(str2, str3);
                }
                return jSONObject.toString();
            } catch (Exception e) {
                SameLogTool.m51824b("SameTools", e.getMessage());
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x001d, code lost:
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x001f, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x002a, code lost:
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002d, code lost:
        return r0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m51764a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            if (r3 == 0) goto L1a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L18
            long r0 = (long) r4
            r2 = r3
            goto L1d
        L15:
            r4 = move-exception
            r2 = r3
            goto L24
        L18:
            r2 = r3
            goto L2a
        L1a:
            r4.createNewFile()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
        L1d:
            if (r2 == 0) goto L2d
        L1f:
            r2.close()     // Catch: java.lang.Exception -> L2d
            goto L2d
        L23:
            r4 = move-exception
        L24:
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.lang.Exception -> L29
        L29:
            throw r4
        L2a:
            if (r2 == 0) goto L2d
            goto L1f
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.SameTool.m51764a(java.io.File):long");
    }

    /* renamed from: a */
    public static String m51753a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
        if (m53279b == null) {
            SettingManager.m53286a();
            m53279b = SettingManagerDiff.m53265a();
        }
        int m53482Z = m53279b.m53482Z();
        if (jSONArray.length() > m53482Z) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < m53482Z; i++) {
                try {
                    jSONArray2.put(jSONArray.get(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public static String m51771a(Context context, String str) {
        String str2;
        str2 = "";
        try {
            JSONArray m51746b = m51746b(context, str);
            str2 = m51746b.length() > 0 ? m51753a(m51746b) : "";
            SameLogTool.m51822c("SameTools", "get excludes:" + str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    /* renamed from: a */
    public static final int m51775a() {
        if (f56937o == null) {
            try {
                f56937o = MIMManager.C22029a.m51910a().m51916d();
            } catch (Exception e) {
                SameLogTool.m51824b("SameTools", e.getMessage());
            }
        }
        if (f56937o != null) {
            return f56937o.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: a */
    public static synchronized String m51770a(Context context, String str, String str2) {
        String sb2;
        synchronized (SameTool.class) {
            StringBuilder sb3 = new StringBuilder(str2);
            try {
                sb3.append(m51759a(str2, context, str));
            } catch (Exception unused) {
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: a */
    private static synchronized String m51759a(String str, Context context, String str2) {
        StringBuilder sb2;
        String sb3;
        synchronized (SameTool.class) {
            try {
                Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    sb2 = new StringBuilder("&rtins_type=");
                } else {
                    sb2 = new StringBuilder("?rtins_type=");
                }
            } catch (Exception unused) {
                sb2 = new StringBuilder("&rtins_type=");
            }
            try {
                if (m51743b(str2, context) != null) {
                    sb2.append(1);
                } else {
                    sb2.append(2);
                }
            } catch (Exception unused2) {
                sb2.append(0);
            }
            sb3 = sb2.toString();
        }
        return sb3;
    }

    /* renamed from: a */
    private static List<String> m51751a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                arrayList.add(stackTraceElement.getClassName());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ImageView m51767a(ImageView imageView, BitmapDrawable bitmapDrawable, DisplayMetrics displayMetrics) {
        try {
            bitmapDrawable.setTargetDensity(displayMetrics);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imageView;
    }

    /* renamed from: a */
    public static void m51769a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m51758a(String str, CampaignEx campaignEx, int i) {
        if (TextUtils.isEmpty(str) || campaignEx == null || MBSDKContext.m52746m().m52792c() == null) {
            return;
        }
        FqInfoDao m52581a = FqInfoDao.m52581a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));
        FqInfo fqInfo = new FqInfo();
        fqInfo.m52471a(System.currentTimeMillis());
        fqInfo.m52468b(str);
        fqInfo.m52470a(campaignEx.getId());
        fqInfo.m52472a(i);
        m52581a.m52580a(fqInfo);
    }

    /* renamed from: a */
    public static boolean m51760a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m51752a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0 || jSONObject.optInt("v", -1) != -1) ? false : true;
    }

    /* renamed from: a */
    public static boolean m51757a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri parse = Uri.parse(str2);
                    if (parse != null) {
                        return !TextUtils.isEmpty(parse.getQueryParameter(str));
                    }
                    return false;
                } catch (Exception e) {
                    SameLogTool.m51824b("SameTools", e.getMessage());
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m51762a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Integer.parseInt((String) obj);
                }
                return 0;
            } catch (Throwable th) {
                SameLogTool.m51823b("SameTools", th.getMessage(), th);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m51756a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                return TextUtils.isEmpty(queryParameter) ? i : (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
            }
        } catch (Exception e) {
            SameLogTool.m51824b("SameTools", e.getMessage());
        }
        return i;
    }
}
