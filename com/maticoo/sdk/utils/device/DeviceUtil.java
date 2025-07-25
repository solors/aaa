package com.maticoo.sdk.utils.device;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.C20747r8;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.device.AdvertisingIdClient;
import com.maticoo.sdk.utils.device.DeviceUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.prefs.Preference;
import com.maticoo.sdk.utils.request.network.util.NetworkChecker;
import com.maticoo.sdk.utils.request.network.util.SharedPreferencesUtils;
import com.p552ot.pubsub.p553a.C26484a;
import com.p552ot.pubsub.util.C26601v;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class DeviceUtil {
    private static final String REG_EXA_IP = "^10\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)$";
    private static final String REG_EXB_IP = "^172\\.(1[6-9]|2\\d|3[0-1])\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)$";
    private static final String REG_EXC_IP = "^192\\.168\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)$";
    private static String mSessionId = null;
    private static String uAt = "";
    private static final AtomicBoolean GET_GAID_STATE = new AtomicBoolean(false);
    private static final AtomicBoolean GET_ASID_STATE = new AtomicBoolean(false);

    /* loaded from: classes6.dex */
    public interface OnGetASIDListener {
        void onGetASID(String str, int i);
    }

    /* loaded from: classes6.dex */
    public interface OnInitDeviceListener {
        void onComplete();
    }

    private DeviceUtil() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m53555a(OnInitDeviceListener onInitDeviceListener, String str, int i) {
        lambda$initDeviceId$1(onInitDeviceListener, str, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m53554b(OnInitDeviceListener onInitDeviceListener, String str) {
        lambda$initDeviceId$0(onInitDeviceListener, str);
    }

    public static String createReqId() {
        return UUID.randomUUID().toString();
    }

    public static long disk() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return (long) ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / Math.pow(2.0d, 20.0d));
    }

    private static void fillUAFromSP(Context context) {
        if (TextUtils.isEmpty(uAt)) {
            try {
                uAt = SharedPreferencesUtils.getParam(context, "moticoo_ua", "").toString();
            } catch (Throwable th) {
                DeveloperLog.LogD(th.getMessage(), th);
            }
        }
    }

    public static String generateUid() {
        return UUID.randomUUID().toString();
    }

    public static String getAndroidID(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), C26484a.f69184A);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getAndroidIDFromPref() {
        if (TextUtils.isEmpty(Preference.AndroidId.getValue())) {
            Preference.AndroidId.setValue(getAndroidID(ApplicationUtil.getInstance().getApplicationContext()));
        }
        return Preference.AndroidId.getValue();
    }

    private static void getAppSetIdForLazy(Context context, final OnGetASIDListener onGetASIDListener) {
        if (context != null && context.getApplicationContext() != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                String value = Preference.APP_SET_ID.getValue();
                if (!TextUtils.isEmpty(value)) {
                    onGetASIDListener.onGetASID(value, 0);
                    return;
                }
                Object invoke = AppSet.class.getMethod("getClient", Context.class).invoke(null, applicationContext);
                Objects.requireNonNull(invoke);
                Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
                Object newProxyInstance = Proxy.newProxyInstance(OnSuccessListener.class.getClassLoader(), new Class[]{OnSuccessListener.class}, new InvocationHandler() { // from class: com.maticoo.sdk.utils.device.DeviceUtil.1
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        int i;
                        try {
                            if (method.getName().equals("onSuccess")) {
                                Object obj2 = objArr[0];
                                Object invoke3 = obj2.getClass().getMethod("getScope", new Class[0]).invoke(obj2, new Object[0]);
                                if (invoke3 instanceof Integer) {
                                    i = ((Integer) invoke3).intValue();
                                } else {
                                    i = 0;
                                }
                                String str = (String) obj2.getClass().getMethod("getId", new Class[0]).invoke(obj2, new Object[0]);
                                if (!TextUtils.isEmpty(str)) {
                                    Preference.APP_SET_ID.setValue(str);
                                }
                                OnGetASIDListener onGetASIDListener2 = onGetASIDListener;
                                if (onGetASIDListener2 != null) {
                                    onGetASIDListener2.onGetASID(str, i);
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                            OnGetASIDListener onGetASIDListener3 = onGetASIDListener;
                            if (onGetASIDListener3 != null) {
                                onGetASIDListener3.onGetASID(null, 0);
                            }
                        }
                        return null;
                    }
                });
                Objects.requireNonNull(invoke2);
                invoke2.getClass().getMethod("addOnSuccessListener", OnSuccessListener.class).invoke(invoke2, newProxyInstance);
            } catch (Throwable th) {
                th.printStackTrace();
                onGetASIDListener.onGetASID(null, 0);
            }
        }
    }

    public static String getAppVersion() {
        try {
            Application applicationContext = ApplicationUtil.getInstance().getApplicationContext();
            if (applicationContext == null) {
                return "";
            }
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.Integer> getBatteryInfo(android.content.Context r11) {
        /*
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L73
            android.content.Intent r11 = r11.registerReceiver(r0, r2)     // Catch: java.lang.Exception -> L73
            r0 = -1
            r2 = 0
            if (r11 == 0) goto L1f
            java.lang.String r3 = "level"
            int r3 = r11.getIntExtra(r3, r0)     // Catch: java.lang.Exception -> L73
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r11 == 0) goto L29
            java.lang.String r4 = "scale"
            int r4 = r11.getIntExtra(r4, r0)     // Catch: java.lang.Exception -> L73
            goto L2a
        L29:
            r4 = r2
        L2a:
            float r5 = (float) r3     // Catch: java.lang.Exception -> L73
            float r6 = (float) r4     // Catch: java.lang.Exception -> L73
            float r5 = r5 / r6
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            int r5 = (int) r5     // Catch: java.lang.Exception -> L73
            if (r3 == r0) goto L3e
            if (r4 == r0) goto L3e
            java.lang.String r3 = "battery"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L73
            r1.put(r3, r6)     // Catch: java.lang.Exception -> L73
        L3e:
            if (r11 == 0) goto L47
            java.lang.String r3 = "status"
            int r11 = r11.getIntExtra(r3, r0)     // Catch: java.lang.Exception -> L73
            goto L48
        L47:
            r11 = r2
        L48:
            java.lang.String r0 = "btch"
            r3 = 2
            r6 = 1
            if (r11 == r3) goto L54
            r3 = 5
            if (r11 != r3) goto L52
            goto L54
        L52:
            r11 = r2
            goto L55
        L54:
            r11 = r6
        L55:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L73
            r1.put(r0, r11)     // Catch: java.lang.Exception -> L73
            java.lang.String r11 = "lowp"
            double r7 = (double) r5     // Catch: java.lang.Exception -> L73
            double r3 = (double) r4     // Catch: java.lang.Exception -> L73
            r9 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r3 = r3 * r9
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6b
            goto L6c
        L6b:
            r2 = r6
        L6c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L73
            r1.put(r11, r0)     // Catch: java.lang.Exception -> L73
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maticoo.sdk.utils.device.DeviceUtil.getBatteryInfo(android.content.Context):java.util.Map");
    }

    public static long getBtime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public static String getCarrier(Context context) {
        HashMap<String, String> hashMap = new HashMap<String, String>() { // from class: com.maticoo.sdk.utils.device.DeviceUtil.3
            {
                put("46000", "中国移动");
                put("46002", "中国移动");
                put("46007", "中国移动");
                put("46008", "中国移动");
                put("46001", "中国联通");
                put("46006", "中国联通");
                put("46009", "中国联通");
                put("46003", "中国电信");
                put("46005", "中国电信");
                put("46011", "中国电信");
                put("46004", "中国卫通");
                put("46020", "中国铁通");
            }
        };
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String simOperator = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(simOperator) && hashMap.containsKey(simOperator)) {
                return hashMap.get(simOperator);
            }
            String simOperatorName = telephonyManager.getSimOperatorName();
            if (!TextUtils.isEmpty(simOperatorName)) {
                return simOperatorName;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long getFit() {
        PackageInfo packageInfo;
        try {
            Application applicationContext = ApplicationUtil.getInstance().getApplicationContext();
            if (applicationContext == null) {
                return 0L;
            }
            String packageName = applicationContext.getPackageName();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(packageName, 256)) == null) {
                return 0L;
            }
            return packageInfo.firstInstallTime / 1000;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static long getFlt() {
        return Preference.FLT.getValue().longValue() / 1000;
    }

    public static long getFm() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
    }

    public static String getHostIp() {
        Enumeration<NetworkInterface> enumeration;
        Pattern compile = Pattern.compile("(^10\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)$)|(^172\\.(1[6-9]|2\\d|3[0-1])\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)$)|(^192\\.168\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)\\.(\\d{1}|[1-9]\\d|1\\d{2}|2[0-4]\\d|25\\d)$)");
        try {
            enumeration = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            DeveloperLog.LogE("getHostIp", e);
            enumeration = null;
        }
        while (enumeration != null && enumeration.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = enumeration.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                String hostAddress = inetAddresses.nextElement().getHostAddress();
                if (compile.matcher(hostAddress).matches()) {
                    return hostAddress;
                }
            }
        }
        return null;
    }

    public static String getIntToIp(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    public static String getIp(Context context) {
        if (NetworkChecker.getConnectType(context).getValue() == NetworkChecker.NetType.WIFI.getValue()) {
            return getIntToIp(((WifiManager) context.getSystemService(C20747r8.f52730b)).getConnectionInfo().getIpAddress());
        }
        return getLocalIpAddress();
    }

    public static String getLocalIpAddress() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            Log.e("localip", e.toString());
            return null;
        }
    }

    public static Map<String, Object> getLocaleInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put("lang", Locale.getDefault().getLanguage());
        return hashMap;
    }

    public static String getSessionId() {
        if (mSessionId == null) {
            mSessionId = new UUID(getUniquePsuedoId().hashCode(), System.currentTimeMillis()).toString();
        }
        return mSessionId;
    }

    public static String getSystemProperties(String str) {
        try {
            Object invoke = Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Throwable th) {
            DeveloperLog.LogD("DeviceUtil", th);
            CrashUtil.getSingleton().reportSDKException(th);
        }
        return null;
    }

    public static String getTimeZone() {
        return TimeZone.getDefault().getID();
    }

    public static int getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 60000;
    }

    public static int getTimeZoneOffset_v2() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / C26601v.f69837d;
    }

    public static long getTotalRAM(Context context) {
        if (context == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static String getUa(final Context context) {
        boolean z;
        fillUAFromSP(context);
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception e) {
            DeveloperLog.LogD(e.getMessage());
        }
        if (z) {
            if (TextUtils.isEmpty(uAt)) {
                uAt = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(uAt)) {
                try {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        uAt = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    }
                } catch (InstantiationException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
                if (TextUtils.isEmpty(uAt)) {
                    uAt = new WebView(context).getSettings().getUserAgentString();
                }
                if (TextUtils.isEmpty(uAt)) {
                    setAUA();
                }
            } else {
                try {
                    new Thread(new Runnable() { // from class: com.maticoo.sdk.utils.device.DeviceUtil.2
                        @Override // java.lang.Runnable
                        public void run() {
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                            if (!TextUtils.isEmpty(defaultUserAgent) && !defaultUserAgent.equals(DeviceUtil.uAt)) {
                                String unused = DeviceUtil.uAt = defaultUserAgent;
                                DeviceUtil.saveUA(context);
                            }
                        }
                    }).start();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            DeveloperLog.LogD(e.getMessage());
        } else {
            setAUA();
        }
        saveUA(context);
        return uAt;
    }

    public static synchronized String getUid() {
        String value;
        synchronized (DeviceUtil.class) {
            value = Preference.UID.getValue();
            if (TextUtils.isEmpty(value)) {
                value = generateUid();
                Preference.UID.setValue(value);
                Preference.FLT.setValue(Long.valueOf(System.currentTimeMillis()));
            }
        }
        return value;
    }

    public static String getUniquePsuedoId() {
        String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
        try {
            return new UUID(str.hashCode(), Build.class.getField("SERIAL").get(null).toString().hashCode()).toString();
        } catch (Exception unused) {
            return new UUID(str.hashCode(), -905839116).toString();
        }
    }

    private static String getUserAgent(Context context) {
        String property;
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb2 = new StringBuilder();
        if (property != null) {
            int length = property.length();
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt > 31 && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                }
            }
        }
        return sb2.toString();
    }

    public static String getUserAgentStr(Context context) {
        boolean z;
        WebView webView;
        if (context == null) {
            context = ApplicationUtil.getInstance().getApplicationContext();
        }
        if (TextUtils.isEmpty(uAt)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                WebView webView2 = null;
                try {
                    webView = new WebView(context);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    uAt = webView.getSettings().getUserAgentString();
                    DeveloperLog.LogD("getUserAgentStr, uAt = " + uAt);
                    Preference.USER_AGENT.setValue(uAt);
                    webView.destroy();
                } catch (Throwable th2) {
                    th = th2;
                    webView2 = webView;
                    try {
                        DeveloperLog.LogE("getUserAgentStr >>" + th.getMessage());
                        return uAt;
                    } finally {
                        if (webView2 != null) {
                            webView2.destroy();
                        }
                    }
                }
            }
        }
        return uAt;
    }

    public static String getVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            DeveloperLog.LogE("getVersionName", e);
            return "";
        }
    }

    public static int ifGp(Context context) {
        if (context == null) {
            return 0;
        }
        return "com.android.vending".equals(context.getPackageManager().getInstallerPackageName(context.getPackageName())) ? 1 : 0;
    }

    public static void initDeviceId(Context context, final OnInitDeviceListener onInitDeviceListener) {
        AdvertisingIdClient.getGaid(ApplicationUtil.getInstance().getApplicationContext(), new AdvertisingIdClient.OnGetGaidListener() { // from class: com.maticoo.sdk.utils.device.a
            @Override // com.maticoo.sdk.utils.device.AdvertisingIdClient.OnGetGaidListener
            public final void onGetGaid(String str) {
                DeviceUtil.m53554b(DeviceUtil.OnInitDeviceListener.this, str);
            }
        });
        getAppSetIdForLazy(context, new OnGetASIDListener() { // from class: com.maticoo.sdk.utils.device.b
            @Override // com.maticoo.sdk.utils.device.DeviceUtil.OnGetASIDListener
            public final void onGetASID(String str, int i) {
                DeviceUtil.m53555a(DeviceUtil.OnInitDeviceListener.this, str, i);
            }
        });
    }

    public static boolean isActivityAvailable(Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0068, code lost:
        if (0 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isCanExecute(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            r3.<init>()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.lang.String r4 = "ls -l "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            r3.append(r5)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.lang.Process r1 = r2.exec(r5)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            if (r2 == 0) goto L52
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            r4 = 4
            if (r3 < r4) goto L52
            r5 = 3
            char r5 = r2.charAt(r5)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
            r2 = 115(0x73, float:1.61E-43)
            if (r5 == r2) goto L49
            r2 = 120(0x78, float:1.68E-43)
            if (r5 != r2) goto L4a
        L49:
            r0 = 1
        L4a:
            r1.exitValue()     // Catch: java.lang.Exception -> L4e
            goto L51
        L4e:
            r1.destroy()     // Catch: java.lang.Exception -> L51
        L51:
            return r0
        L52:
            r5.close()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L68
        L55:
            r1.exitValue()     // Catch: java.lang.Exception -> L59
            goto L6b
        L59:
            r1.destroy()     // Catch: java.lang.Exception -> L6b
            goto L6b
        L5d:
            r5 = move-exception
            if (r1 == 0) goto L67
            r1.exitValue()     // Catch: java.lang.Exception -> L64
            goto L67
        L64:
            r1.destroy()     // Catch: java.lang.Exception -> L67
        L67:
            throw r5
        L68:
            if (r1 == 0) goto L6b
            goto L55
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maticoo.sdk.utils.device.DeviceUtil.isCanExecute(java.lang.String):boolean");
    }

    public static int isGpInstall(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.android.vending", 256) == null) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            DeveloperLog.LogD("DeviceUtil", e);
            return 1;
        }
    }

    public static boolean isLargeScreen(Context context) {
        if (context == null) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.widthPixels / f;
        if (displayMetrics.heightPixels / f <= 720.0f || f2 < 728.0f) {
            return false;
        }
        return true;
    }

    public static boolean isPkgInstalled(String str) {
        try {
            if (ApplicationUtil.getInstance().getApplicationContext().getPackageManager().getPackageInfo(str, 256) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isRoot() {
        if (new File("/system/bin/su").exists() && isCanExecute("/system/bin/su")) {
            return true;
        }
        if (new File("/system/xbin/su").exists() && isCanExecute("/system/xbin/su")) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$initDeviceId$0(OnInitDeviceListener onInitDeviceListener, String str) {
        if (!TextUtils.isEmpty(str)) {
            Preference.GAID.setValue(str);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GET_GAID_STATE:");
        AtomicBoolean atomicBoolean = GET_GAID_STATE;
        sb2.append(atomicBoolean.get());
        sb2.append(", GET_ASID_STATE=");
        AtomicBoolean atomicBoolean2 = GET_ASID_STATE;
        sb2.append(atomicBoolean2.get());
        DeveloperLog.LogD(sb2.toString());
        if (atomicBoolean.compareAndSet(false, true) && atomicBoolean2.compareAndSet(true, false) && onInitDeviceListener != null) {
            onInitDeviceListener.onComplete();
        }
    }

    public static /* synthetic */ void lambda$initDeviceId$1(OnInitDeviceListener onInitDeviceListener, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                str = getUid();
            }
            Preference.APP_SET_ID.setValue(str);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GET_GAID_STATE:");
        AtomicBoolean atomicBoolean = GET_GAID_STATE;
        sb2.append(atomicBoolean.get());
        sb2.append(", GET_ASID_STATE=");
        AtomicBoolean atomicBoolean2 = GET_ASID_STATE;
        sb2.append(atomicBoolean2.get());
        DeveloperLog.LogD(sb2.toString());
        if (atomicBoolean2.compareAndSet(false, true) && atomicBoolean.compareAndSet(true, false) && onInitDeviceListener != null) {
            onInitDeviceListener.onComplete();
        }
    }

    public static void openBrowser(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }

    public static void saveUA(Context context) {
        try {
            SharedPreferencesUtils.setParam(context, "moticoo_ua", uAt);
        } catch (Throwable th) {
            DeveloperLog.LogD(th.getMessage(), th);
        }
    }

    private static void setAUA() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            uAt = "Mozilla/5.0 (Linux; Android " + str + "; " + str2 + "-test Build/) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        uAt = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B-test) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }
}
