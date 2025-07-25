package com.p551my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import java.io.File;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.my.tracker.obfuscated.m */
/* loaded from: classes7.dex */
public final class C26366m {

    /* renamed from: a */
    private boolean f68725a = false;

    /* renamed from: b */
    private String f68726b = "";

    /* renamed from: c */
    private String f68727c = "";

    /* renamed from: d */
    private String f68728d = "";

    /* renamed from: e */
    private String f68729e = "";

    /* renamed from: f */
    private String f68730f = "";

    /* renamed from: g */
    private String f68731g = "";

    /* renamed from: h */
    private String f68732h = "";

    /* renamed from: i */
    private String f68733i = "";

    /* renamed from: j */
    private String f68734j = "";

    /* renamed from: k */
    private String f68735k = "";

    /* renamed from: l */
    private String f68736l = "";

    /* renamed from: m */
    private String f68737m = "";

    /* renamed from: n */
    private String f68738n = "";

    /* renamed from: o */
    private String f68739o = "";

    /* renamed from: p */
    private String f68740p = "";

    /* renamed from: q */
    private int f68741q = -1;

    /* renamed from: r */
    private int f68742r = -1;

    /* renamed from: s */
    private int f68743s = -1;

    /* renamed from: t */
    private float f68744t = Float.NaN;

    /* renamed from: u */
    private float f68745u = Float.NaN;

    /* renamed from: v */
    private float f68746v = Float.NaN;

    /* renamed from: w */
    private int f68747w = -1;

    /* renamed from: x */
    private long f68748x = -1;

    /* renamed from: y */
    private long f68749y = -1;

    /* renamed from: z */
    private int f68750z = -1;

    /* renamed from: A */
    private int f68724A = -1;

    /* renamed from: com.my.tracker.obfuscated.m$a */
    /* loaded from: classes7.dex */
    static final class C26367a {

        /* renamed from: a */
        static final int f68751a = m41920a() ? 1 : 0;

        /* JADX WARN: Can't wrap try/catch for region: R(7:54|(2:58|59)|(2:57|50)|46|47|49|50) */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(java.lang.String.format(java.util.Locale.US, "/proc/%d/mounts", java.lang.Integer.valueOf(android.os.Process.myPid())))));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
            if (r4 == null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
            if (r5 >= 4) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
            if (r4.contains(r0[r5]) == false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
            if (r5 != null) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f2, code lost:
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
            if (r5 != null) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
            return false;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m41920a() {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p551my.tracker.obfuscated.C26366m.C26367a.m41920a():boolean");
        }
    }

    /* renamed from: b */
    private void m41923b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        this.f68748x = filesDir.getTotalSpace();
        this.f68749y = filesDir.getFreeSpace();
    }

    /* renamed from: c */
    private void m41922c(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return;
        }
        Point point = new Point();
        display.getRealSize(point);
        this.f68741q = point.x;
        this.f68742r = point.y;
    }

    /* renamed from: a */
    public void m41925a(Context context) {
        if (this.f68725a) {
            return;
        }
        C26468z0.m41528a("DeviceParamsDataProvider: collect application info...");
        this.f68727c = Build.DEVICE;
        this.f68732h = Build.MANUFACTURER;
        this.f68733i = Build.MODEL;
        this.f68728d = Build.VERSION.RELEASE;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                this.f68738n = telephonyManager.getNetworkOperatorName();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                    this.f68737m = networkOperator;
                } else {
                    this.f68737m = networkOperator.substring(3);
                    this.f68736l = networkOperator.substring(0, 3);
                }
                if (telephonyManager.getSimState() == 5) {
                    this.f68739o = telephonyManager.getSimOperator();
                }
            }
        } catch (Throwable th) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting telephony exception: ", th);
        }
        try {
            this.f68729e = context.getPackageName();
        } catch (Throwable th2) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting packageName exception: ", th2);
        }
        try {
            this.f68735k = context.getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th3) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting app lang exception: ", th3);
        }
        try {
            PackageInfo m41975a = AbstractC26356k.m41975a(context);
            if (m41975a != null) {
                this.f68731g = m41975a.versionName;
                this.f68730f = Long.toString(Build.VERSION.SDK_INT < 28 ? m41975a.versionCode : m41975a.getLongVersionCode());
            }
        } catch (Throwable th4) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting app package info exception: ", th4);
        }
        try {
            m41922c(context);
        } catch (Throwable th5) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting screen size exception: ", th5);
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                this.f68743s = displayMetrics.densityDpi;
                this.f68744t = displayMetrics.density;
                this.f68745u = displayMetrics.xdpi;
                this.f68746v = displayMetrics.ydpi;
            }
        } catch (Throwable th6) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting display metrics exception: ", th6);
        }
        try {
            TimeZone timeZone = TimeZone.getDefault();
            this.f68740p = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
        } catch (Throwable th7) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting timezone exception: ", th7);
        }
        try {
            this.f68747w = C26367a.f68751a;
        } catch (Throwable th8) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting isRooted exception: ", th8);
        }
        try {
            m41923b(context);
        } catch (Throwable th9) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting disk info exception: ", th9);
        }
        try {
            this.f68734j = Locale.getDefault().getLanguage();
        } catch (Throwable th10) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting lang exception: ", th10);
        }
        try {
            this.f68750z = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 1 : 0;
        } catch (Throwable th11) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th11);
        }
        try {
            this.f68724A = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
        } catch (Throwable th12) {
            C26468z0.m41527a("DeviceParamsDataProvider: collecting ui mode info exception: ", th12);
        }
        this.f68726b = C26300b1.m42125a(context);
        this.f68725a = true;
        C26468z0.m41528a("DeviceParamsDataProvider: collected");
    }

    /* renamed from: a */
    public void m41924a(C26405s0 c26405s0, Context context) {
        if (!TextUtils.isEmpty(this.f68727c)) {
            c26405s0.m41669g(this.f68727c);
        }
        if (!TextUtils.isEmpty(this.f68732h)) {
            c26405s0.m41653l(this.f68732h);
        }
        if (!TextUtils.isEmpty(this.f68728d)) {
            c26405s0.m41644q(this.f68728d);
        }
        if (!TextUtils.isEmpty(this.f68734j)) {
            c26405s0.m41645p(this.f68734j);
        }
        if (!TextUtils.isEmpty(this.f68736l)) {
            c26405s0.m41641t(this.f68736l);
        }
        if (!TextUtils.isEmpty(this.f68733i)) {
            c26405s0.m41665h(this.f68733i);
        }
        if (!TextUtils.isEmpty(this.f68737m)) {
            c26405s0.m41643r(this.f68737m);
        }
        if (!TextUtils.isEmpty(this.f68738n)) {
            c26405s0.m41642s(this.f68738n);
        }
        if (!TextUtils.isEmpty(this.f68739o)) {
            c26405s0.m41640u(this.f68739o);
        }
        if (!TextUtils.isEmpty(this.f68740p)) {
            c26405s0.m41639v(this.f68740p);
        }
        if (!TextUtils.isEmpty(this.f68729e)) {
            c26405s0.m41677e(this.f68729e);
        }
        if (!TextUtils.isEmpty(this.f68731g)) {
            c26405s0.m41673f(this.f68731g);
        }
        if (!TextUtils.isEmpty(this.f68730f)) {
            c26405s0.m41696b(this.f68730f);
        }
        if (!TextUtils.isEmpty(this.f68735k)) {
            c26405s0.m41681d(this.f68735k);
        }
        if (!TextUtils.isEmpty(this.f68726b)) {
            c26405s0.m41659j(this.f68726b);
        }
        c26405s0.m41654l(3);
        c26405s0.m41646p(this.f68741q);
        c26405s0.m41657k(this.f68742r);
        c26405s0.m41663i(this.f68743s);
        c26405s0.m41719a(this.f68744t);
        c26405s0.m41699b(this.f68745u);
        c26405s0.m41689c(this.f68746v);
        c26405s0.m41652m(this.f68747w);
        c26405s0.m41697b(this.f68748x);
        c26405s0.m41715a(this.f68749y);
        c26405s0.m41650n(this.f68750z);
        c26405s0.m41648o(this.f68724A);
    }

    /* renamed from: d */
    public void m41921d(Context context) {
    }
}
