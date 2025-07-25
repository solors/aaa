package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.z3 */
/* loaded from: classes2.dex */
public abstract class AbstractC5947z3 {

    /* renamed from: a */
    private static final Map f12472a = new HashMap(2);

    /* renamed from: com.applovin.impl.z3$a */
    /* loaded from: classes2.dex */
    public static class C5948a {

        /* renamed from: a */
        int f12473a;

        /* renamed from: b */
        int f12474b;

        /* renamed from: c */
        int f12475c;

        /* renamed from: d */
        int f12476d;

        /* renamed from: com.applovin.impl.z3$a$a */
        /* loaded from: classes2.dex */
        public static class C5949a {

            /* renamed from: a */
            private int f12477a;

            /* renamed from: b */
            private int f12478b;

            /* renamed from: c */
            private int f12479c;

            /* renamed from: d */
            private int f12480d;

            C5949a() {
            }

            /* renamed from: a */
            public C5949a m92522a(int i) {
                this.f12479c = i;
                return this;
            }

            /* renamed from: b */
            public C5949a m92521b(int i) {
                this.f12480d = i;
                return this;
            }

            /* renamed from: c */
            public C5949a m92520c(int i) {
                this.f12477a = i;
                return this;
            }

            /* renamed from: d */
            public C5949a m92519d(int i) {
                this.f12478b = i;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f12477a + ", topRight=" + this.f12478b + ", bottomLeft=" + this.f12479c + ", bottomRight=" + this.f12480d + ")";
            }

            /* renamed from: a */
            public C5948a m92523a() {
                return new C5948a(this.f12477a, this.f12478b, this.f12479c, this.f12480d);
            }
        }

        C5948a(int i, int i2, int i3, int i4) {
            this.f12473a = i;
            this.f12474b = i2;
            this.f12475c = i3;
            this.f12476d = i4;
        }

        /* renamed from: a */
        protected boolean m92527a(Object obj) {
            return obj instanceof C5948a;
        }

        /* renamed from: b */
        public int m92526b() {
            return this.f12476d;
        }

        /* renamed from: c */
        public int m92525c() {
            return this.f12473a;
        }

        /* renamed from: d */
        public int m92524d() {
            return this.f12474b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5948a)) {
                return false;
            }
            C5948a c5948a = (C5948a) obj;
            if (c5948a.m92527a(this) && m92525c() == c5948a.m92525c() && m92524d() == c5948a.m92524d() && m92528a() == c5948a.m92528a() && m92526b() == c5948a.m92526b()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((m92525c() + 59) * 59) + m92524d()) * 59) + m92528a()) * 59) + m92526b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + m92525c() + ", topRight=" + m92524d() + ", bottomLeft=" + m92528a() + ", bottomRight=" + m92526b() + ")";
        }

        /* renamed from: a */
        public int m92528a() {
            return this.f12475c;
        }
    }

    /* renamed from: a */
    public static Point m92545a(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    /* renamed from: b */
    public static Point m92541b(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        int orientation = AppLovinSdkUtils.getOrientation(context);
        C5416j c5416j = C5416j.f9935u0;
        boolean z = c5416j == null || ((Boolean) c5416j.m95144a(C5517sj.f10638l6)).booleanValue();
        if (!m92539c(context) || z) {
            Map map = f12472a;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (m92542b()) {
                maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
                bounds = maximumWindowMetrics.getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else if (m92538d()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        f12472a.put(Integer.valueOf(orientation), point);
        return point;
    }

    /* renamed from: c */
    public static boolean m92539c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    /* renamed from: d */
    public static boolean m92538d() {
        return true;
    }

    /* renamed from: e */
    public static boolean m92537e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m92536f() {
        return true;
    }

    /* renamed from: g */
    public static boolean m92535g() {
        return true;
    }

    /* renamed from: h */
    public static boolean m92534h() {
        return true;
    }

    /* renamed from: i */
    public static boolean m92533i() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m92532j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m92531k() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m92530l() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m92529m() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m92540c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* renamed from: a */
    private static int m92546a(int i, Display display) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            return radius;
        }
        return -1;
    }

    /* renamed from: a */
    public static C5948a m92544a(Context context, C5416j c5416j) {
        C5948a c5948a = null;
        if (((Boolean) c5416j.m95144a(C5517sj.f10529X3)).booleanValue() && m92529m()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    c5948a = new C5948a.C5949a().m92520c(m92546a(0, defaultDisplay)).m92519d(m92546a(1, defaultDisplay)).m92522a(m92546a(3, defaultDisplay)).m92521b(m92546a(2, defaultDisplay)).m92523a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return c5948a;
    }

    /* renamed from: b */
    public static boolean m92542b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: a */
    public static boolean m92543a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static void m92547a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }
}
