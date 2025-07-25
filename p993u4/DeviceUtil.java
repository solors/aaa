package p993u4;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import p797n4.PropertiesManager;
import p874s4.WorkHandler;
import p993u4.DeviceUtil;

/* renamed from: u4.e */
/* loaded from: classes6.dex */
public class DeviceUtil {

    /* renamed from: a */
    private static C44429c f116606a;

    /* compiled from: DeviceUtil.java */
    /* renamed from: u4.e$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC44428b {
        /* renamed from: a */
        void mo3010a(String str, boolean z);
    }

    /* compiled from: DeviceUtil.java */
    /* renamed from: u4.e$c */
    /* loaded from: classes6.dex */
    public static class C44429c extends BroadcastReceiver {
        private C44429c() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m3009a() {
            m3008b();
        }

        /* renamed from: b */
        public static /* synthetic */ void m3008b() {
            PropertiesManager.m14701e().m14687s();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.LOCALE_CHANGED")) {
                C44433l.m2997a("DeviceUtil", "Language changed.");
                WorkHandler.m12139g().m12133m(new Runnable() { // from class: u4.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceUtil.C44429c.m3009a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m3032a(File file) {
        return m3012u(file);
    }

    /* renamed from: b */
    public static /* synthetic */ void m3031b(Context context, InterfaceC44428b interfaceC44428b) {
        m3013t(context, interfaceC44428b);
    }

    /* renamed from: c */
    public static void m3030c(final Context context, final InterfaceC44428b interfaceC44428b) {
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: u4.d
            @Override // java.lang.Runnable
            public final void run() {
                DeviceUtil.m3031b(context, interfaceC44428b);
            }
        });
    }

    /* renamed from: d */
    public static String m3029d() {
        try {
            String str = Build.BRAND;
            if (str != null) {
                return String.format(Locale.US, "%s", str.trim().toUpperCase());
            }
            return "unset";
        } catch (Exception e) {
            C44433l.m2992f(e);
            return "unset";
        }
    }

    /* renamed from: e */
    public static String m3028e(Context context) {
        if (m3015r(context)) {
            return ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY;
        }
        if (m3014s(context)) {
            return "tablet";
        }
        return DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY;
    }

    /* renamed from: f */
    public static String m3027f() {
        return m3026g() + " * " + m3022k();
    }

    /* renamed from: g */
    private static int m3026g() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: u4.c
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return DeviceUtil.m3032a(file);
                }
            });
            if (listFiles == null) {
                C44433l.m2990h("DeviceUtil", "Can not get cpu files.");
                return 1;
            }
            return listFiles.length;
        } catch (Exception e) {
            C44433l.m2992f(e);
            return 1;
        }
    }

    /* renamed from: h */
    public static String m3025h(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        long round = Math.round((displayMetrics.widthPixels / displayMetrics.xdpi) * 25.4d);
        long round2 = Math.round((displayMetrics.heightPixels / displayMetrics.ydpi) * 25.4d);
        if (round > round2) {
            return round2 + " * " + round;
        }
        return round + " * " + round2;
    }

    /* renamed from: i */
    public static String m3024i() {
        return Locale.getDefault().getLanguage().toLowerCase() + "-" + Locale.getDefault().getCountry().toLowerCase();
    }

    /* renamed from: j */
    public static String m3023j() {
        try {
            String str = Build.MANUFACTURER;
            if (str != null) {
                return String.format(Locale.US, "%s", str.trim().toUpperCase());
            }
            return "unset";
        } catch (Exception e) {
            C44433l.m2992f(e);
            return "unset";
        }
    }

    /* renamed from: k */
    private static int m3022k() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        int i = 0;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            bufferedReader = new BufferedReader(fileReader);
            readLine = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (readLine == null) {
            bufferedReader.close();
            fileReader.close();
            return 0;
        }
        i = Integer.parseInt(readLine.trim());
        bufferedReader.close();
        fileReader.close();
        return i;
    }

    /* renamed from: l */
    public static String m3021l() {
        return "Android";
    }

    /* renamed from: m */
    public static String m3020m() {
        try {
            String str = Build.MODEL;
            if (str != null) {
                return String.format(Locale.US, "%s", str.trim().toUpperCase());
            }
            return "unset";
        } catch (Exception e) {
            C44433l.m2992f(e);
            return "unset";
        }
    }

    /* renamed from: n */
    public static String m3019n() {
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            return "";
        }
        return "Android " + str;
    }

    /* renamed from: o */
    public static String m3018o(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return FormatterUtil.m3006a(context, memoryInfo.totalMem);
    }

    /* renamed from: p */
    public static String m3017p(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            return displayMetrics.heightPixels + " * " + displayMetrics.widthPixels;
        }
        return displayMetrics.widthPixels + " * " + displayMetrics.heightPixels;
    }

    /* renamed from: q */
    public static String m3016q(Context context) {
        try {
            return FormatterUtil.m3006a(context, new StatFs(Environment.getExternalStorageDirectory().getPath()).getTotalBytes());
        } catch (Exception unused) {
            return "unset";
        }
    }

    /* renamed from: r */
    public static boolean m3015r(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: s */
    private static boolean m3014s(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        if (Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)) >= 7.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static /* synthetic */ void m3013t(Context context, InterfaceC44428b interfaceC44428b) {
        boolean z;
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName) && packageName.endsWith(".amz")) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                if (interfaceC44428b != null) {
                    interfaceC44428b.mo3010a(string, z);
                    return;
                }
                return;
            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
                interfaceC44428b.mo3010a("unset", true);
                return;
            }
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null && interfaceC44428b != null) {
                interfaceC44428b.mo3010a(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
        } catch (Exception e2) {
            C44433l.m2992f(e2);
            interfaceC44428b.mo3010a("unset", true);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m3012u(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }

    /* renamed from: v */
    public static void m3011v(Context context) {
        if (f116606a == null) {
            f116606a = new C44429c();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        context.registerReceiver(f116606a, intentFilter);
    }
}
