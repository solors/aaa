package com.ironsource;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.InterfaceC19697ce;
import com.ironsource.InterfaceC20197k9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.IronSourceSharedPreferencesUtilities;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ma */
/* loaded from: classes6.dex */
public class C20334ma implements InterfaceC19697ce, InterfaceC19697ce.InterfaceC19698a {

    /* renamed from: A */
    private static final String f51206A = "IABTCF_TCString";

    /* renamed from: B */
    private static final String f51207B = "IABTCF_AddtlConsent";

    /* renamed from: i */
    private static final String f51208i = "android";

    /* renamed from: j */
    private static final String f51209j = "com.google.android.gms.permission.AD_ID";

    /* renamed from: k */
    private static final String f51210k = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* renamed from: l */
    private static final String f51211l = "com.google.android.gms.appset.AppSet";

    /* renamed from: m */
    private static final String f51212m = "com.google.android.gms.tasks.OnSuccessListener";

    /* renamed from: n */
    private static final String f51213n = "getAdvertisingIdInfo";

    /* renamed from: o */
    private static final String f51214o = "getClient";

    /* renamed from: p */
    private static final String f51215p = "getAppSetIdInfo";

    /* renamed from: q */
    private static final String f51216q = "addOnSuccessListener";

    /* renamed from: r */
    private static final String f51217r = "getId";

    /* renamed from: s */
    private static final String f51218s = "isLimitAdTrackingEnabled";

    /* renamed from: t */
    private static final String f51219t = "Mediation_Shared_Preferences";

    /* renamed from: u */
    private static final String f51220u = "supersonic_shared_preferen";

    /* renamed from: v */
    private static final String f51221v = "cachedUUID";

    /* renamed from: w */
    private static final String f51222w = "auid";

    /* renamed from: x */
    private static final String f51223x = "browser_user_agent";

    /* renamed from: y */
    private static final String f51224y = "browser_user_agent_time";

    /* renamed from: z */
    private static final String f51225z = "IABTCF_gdprApplies";

    /* renamed from: b */
    private String f51226b = null;

    /* renamed from: c */
    private String f51227c = null;

    /* renamed from: d */
    private String f51228d = "";

    /* renamed from: e */
    private boolean f51229e = false;

    /* renamed from: f */
    private String f51230f = "";

    /* renamed from: g */
    private volatile String f51231g;

    /* renamed from: h */
    private volatile String f51232h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.ma$a */
    /* loaded from: classes6.dex */
    public class C20335a implements InvocationHandler {
        C20335a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String obj3 = obj2.getClass().getMethod(C20334ma.f51217r, new Class[0]).invoke(objArr[0], new Object[0]).toString();
                        if (!TextUtils.isEmpty(obj3)) {
                            C20334ma.this.f51230f = obj3;
                            return null;
                        }
                        return null;
                    }
                    return null;
                } catch (Exception e) {
                    C20086i9.m57997d().m58003a(e);
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: L */
    private String m57165L(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object m57163N = m57163N(context);
        return m57163N.getClass().getMethod(f51217r, new Class[0]).invoke(m57163N, new Object[0]).toString();
    }

    /* renamed from: M */
    private void m57164M(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object invoke = AppSet.class.getMethod(f51214o, Context.class).invoke(AppSet.class, context);
        Object invoke2 = invoke.getClass().getMethod(f51215p, new Class[0]).invoke(invoke, new Object[0]);
        invoke2.getClass().getMethod(f51216q, OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new C20335a()));
    }

    /* renamed from: N */
    private Object m57163N(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return AdvertisingIdClient.class.getMethod(f51213n, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    /* renamed from: O */
    private String m57162O(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object m57163N = m57163N(context);
        return String.valueOf(((Boolean) m57163N.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m57163N, new Object[0])).booleanValue());
    }

    @NotNull
    /* renamed from: P */
    private String m57161P(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f51219t, f51223x, "");
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: Q */
    private long m57160Q(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f51219t, f51224y, String.valueOf(-1L)));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: A */
    public String mo57176A(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", null);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: B */
    public boolean mo57175B(Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: C */
    public String mo57174C(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: D */
    public String mo57173D(Context context) {
        if (C20143ja.f50692a.m57859c()) {
            try {
                m57164M(context);
                if (!TextUtils.isEmpty(this.f51230f)) {
                    return this.f51230f;
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
            }
        }
        return "";
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: E */
    public int mo57172E(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: F */
    public String mo57171F(Context context) throws Exception {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: G */
    public boolean mo57170G(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        if (i != 2 && i != 5) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: H */
    public String mo57169H(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, f51207B, null);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: I */
    public int mo57168I(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: J */
    public synchronized String mo57167J(Context context) {
        if (!TextUtils.isEmpty(this.f51226b)) {
            return this.f51226b;
        }
        if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, f51219t, InterfaceC19697ce.f49428a, true)) {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f51219t, f51221v, "");
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                this.f51226b = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f51219t, f51221v, uuid);
            } else {
                this.f51226b = stringFromSharedPrefs;
            }
        }
        return this.f51226b;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: K */
    public int mo57166K(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: a */
    public int mo57159a() {
        return mo57133j();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: b */
    public String mo57151b() {
        String id2 = TimeZone.getDefault().getID();
        return id2 != null ? id2 : "";
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: c */
    public boolean mo57147c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return Environment.isExternalStorageRemovable();
            }
            return false;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: d */
    public int mo57145d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: e */
    public File mo57142e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: f */
    public String mo57140f(Context context) {
        if (context == null) {
            return "";
        }
        int mo57166K = mo57166K(context);
        if (mo57166K != 0) {
            if (mo57166K != 1) {
                if (mo57166K != 11) {
                    if (mo57166K != 12) {
                        switch (mo57166K) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: g */
    public String mo57139g() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: h */
    public float mo57137h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: i */
    public long mo57135i() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: j */
    public int mo57133j() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: k */
    public int mo57131k() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: l */
    public int mo57128l(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: m */
    public float mo57126m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: n */
    public long mo57125n() {
        return m57153a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: o */
    public String mo57123o() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: p */
    public int mo57121p() {
        return -(TimeZone.getDefault().getOffset(mo57135i()) / 60000);
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: q */
    public boolean mo57119q() {
        return this.f51229e;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: r */
    public int mo57117r() {
        return mo57145d();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: s */
    public String mo57115s() {
        try {
            return this.f51228d.isEmpty() ? m57161P(ContextProvider.getInstance().getApplicationContext()) : this.f51228d;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: t */
    public File mo57113t(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: u */
    public boolean mo57112u(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f51209j)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: v */
    public File mo57111v(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: w */
    public int mo57110w(Context context) {
        int i;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i2 = 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("level", -1);
            } else {
                i = 0;
            }
            if (registerReceiver != null) {
                i2 = registerReceiver.getIntExtra("scale", -1);
            }
            if (i == -1 || i2 == -1) {
                return -1;
            }
            return (int) ((i / i2) * 100.0f);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: x */
    public int mo57109x(Context context) {
        int mo57168I = mo57168I(context);
        int mo57172E = mo57172E(context);
        if (((mo57168I == 0 || mo57168I == 2) && mo57172E == 2) || ((mo57168I == 1 || mo57168I == 3) && mo57172E == 1)) {
            return 2;
        }
        return 1;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: y */
    public int mo57108y(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: z */
    public int mo57107z(Context context) {
        if (context == null) {
            return -1;
        }
        return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
    }

    /* renamed from: a */
    private long m57153a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: b */
    public String mo57150b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: c */
    public boolean mo57146c(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: d */
    public boolean mo57144d(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: e */
    public String mo57143e() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: f */
    public boolean mo57141f() {
        return m57148b("su");
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: g */
    public boolean mo57138g(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: h */
    public long mo57136h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return -1L;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: i */
    public String mo57134i(Context context) {
        return mo57116r(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: j */
    public String mo57132j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: k */
    public File mo57130k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: l */
    public String mo57129l() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: m */
    public long mo57127m() {
        if (mo57147c()) {
            return m57153a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: n */
    public String mo57124n(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC19697ce
    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: o */
    public List<ApplicationInfo> mo57122o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.InterfaceC19697ce
    @Nullable
    /* renamed from: p */
    public String mo57120p(Context context) {
        String m57165L;
        C20143ja c20143ja = C20143ja.f50692a;
        if (c20143ja.m57861b()) {
            try {
                if (!c20143ja.m57864a()) {
                    m57165L = m57165L(context);
                } else if (this.f51232h == null) {
                    String m57165L2 = m57165L(context);
                    if (TextUtils.isEmpty(m57165L2)) {
                        return m57165L2;
                    }
                    this.f51232h = m57165L2;
                    return m57165L2;
                } else {
                    m57165L = this.f51232h;
                }
                return m57165L;
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: q */
    public boolean mo57118q(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: r */
    public boolean mo57116r(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: s */
    public synchronized String mo57114s(Context context) {
        if (!TextUtils.isEmpty(this.f51227c)) {
            return this.f51227c;
        } else if (context == null) {
            return "";
        } else {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
            this.f51227c = stringFromSharedPrefs;
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                this.f51227c = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
            }
            return this.f51227c;
        }
    }

    /* renamed from: b */
    private void m57149b(Context context, long j) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f51219t, f51224y, String.valueOf(j));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: a */
    public long mo57152a(String str) {
        return m57153a(new File(str));
    }

    /* renamed from: b */
    private boolean m57148b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    @Nullable
    /* renamed from: a */
    public String mo57157a(Context context) {
        String m57162O;
        try {
            if (!C20143ja.f50692a.m57864a()) {
                m57162O = m57162O(context);
            } else if (this.f51231g == null) {
                String m57162O2 = m57162O(context);
                if (TextUtils.isEmpty(m57162O2)) {
                    return m57162O2;
                }
                this.f51231g = m57162O2;
                return m57162O2;
            } else {
                m57162O = this.f51231g;
            }
            return m57162O;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC19697ce.InterfaceC19698a
    /* renamed from: a */
    public void mo57156a(Context context, long j) {
        if (context != null) {
            if (!new C21193wt(new InterfaceC20197k9.C20198a()).m54288a(m57160Q(context), j)) {
                String m57161P = m57161P(context);
                this.f51228d = m57161P;
                this.f51229e = !m57161P.isEmpty();
            }
            if (this.f51228d.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f51228d = defaultUserAgent;
                    m57155a(context, defaultUserAgent);
                    if (j > 0) {
                        m57149b(context, System.currentTimeMillis());
                    }
                } catch (Exception e) {
                    C20086i9.m57997d().m58003a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m57155a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f51219t, f51223x, str);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC19697ce
    /* renamed from: a */
    public boolean mo57158a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }
}
