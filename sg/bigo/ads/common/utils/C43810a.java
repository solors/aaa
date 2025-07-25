package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.Locale;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.utils.a */
/* loaded from: classes10.dex */
public final class C43810a {

    /* renamed from: a */
    private static Context f114644a = null;

    /* renamed from: b */
    private static boolean f114645b = true;

    /* renamed from: a */
    public static Drawable m4955a(Context context, int i) {
        if (context != null) {
            try {
                return m4943d(context, i);
            } catch (Exception unused) {
                m4951a("Activity context getDrawable failed. the resId is " + Integer.toHexString(i));
                try {
                    return m4943d(m4950b(context), i);
                } catch (Exception unused2) {
                    m4951a("Application context getDrawable failed. the resId is " + Integer.toHexString(i));
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static int m4949b(@NonNull Context context, int i) {
        try {
            return m4942e(context, i);
        } catch (Exception unused) {
            m4951a("Activity context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i));
            try {
                return m4942e(m4950b(context), i);
            } catch (Exception unused2) {
                m4951a("Application context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i));
                return 0;
            }
        }
    }

    /* renamed from: c */
    public static int m4944c(@NonNull Context context, int i) {
        try {
            return m4941f(context, i);
        } catch (Exception unused) {
            m4951a("Activity context getColor failed. the resId is " + Integer.toHexString(i));
            try {
                return m4941f(m4950b(context), i);
            } catch (Exception unused2) {
                m4951a("Application context getColor failed. the resId is " + Integer.toHexString(i));
                return 0;
            }
        }
    }

    /* renamed from: d */
    private static Drawable m4943d(@NonNull Context context, @DrawableRes int i) {
        try {
            return context.getResources().getDrawable(i);
        } catch (Exception unused) {
            m4945c(context);
            return context.getResources().getDrawable(i);
        }
    }

    /* renamed from: e */
    private static int m4942e(@NonNull Context context, int i) {
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Exception unused) {
            m4945c(context);
            return context.getResources().getDimensionPixelSize(i);
        }
    }

    /* renamed from: f */
    private static int m4941f(@NonNull Context context, int i) {
        try {
            return context.getResources().getColor(i);
        } catch (Exception unused) {
            m4945c(context);
            return context.getResources().getColor(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View m4954a(android.content.Context r2, int r3, @androidx.annotation.Nullable android.view.ViewGroup r4, boolean r5) {
        /*
            if (r2 == 0) goto L1c
            android.view.View r0 = m4948b(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L7
            goto L1d
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Self context inflateView failed. the resId is "
            r0.<init>(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m4951a(r0)
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L3d
            android.content.Context r2 = m4950b(r2)     // Catch: java.lang.Exception -> L28
            android.view.View r0 = m4948b(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L28
            goto L3d
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Application context inflateView failed. the resId is "
            r2.<init>(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            m4951a(r2)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.C43810a.m4954a(android.content.Context, int, android.view.ViewGroup, boolean):android.view.View");
    }

    /* renamed from: b */
    private static Context m4950b(@NonNull Context context) {
        m4956a(context);
        Context context2 = f114644a;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    /* renamed from: c */
    private static void m4945c(Context context) {
        try {
            SplitCompat.install(context);
        } catch (Throwable unused) {
            m4951a("SplitCompact not found.");
        }
    }

    /* renamed from: a */
    public static String m4953a(@NonNull Context context, int i, Locale locale) {
        CharSequence m4947b = m4947b(context, i, locale);
        if (m4947b != null) {
            return m4947b.toString();
        }
        return null;
    }

    /* renamed from: b */
    private static View m4948b(@NonNull Context context, int i, ViewGroup viewGroup, boolean z) {
        try {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        } catch (Exception unused) {
            m4945c(context);
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
    }

    /* renamed from: a */
    public static String m4952a(@NonNull Context context, int i, Object... objArr) {
        try {
            return m4946b(context, i, objArr);
        } catch (Exception unused) {
            m4951a("Activity context getString failed. the resId is " + Integer.toHexString(i));
            try {
                return m4946b(m4950b(context), i, objArr);
            } catch (Exception unused2) {
                m4951a("Application context getString failed. the resId is " + Integer.toHexString(i));
                return "";
            }
        }
    }

    /* renamed from: b */
    public static CharSequence m4947b(Context context, int i, Locale locale) {
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getText(i);
    }

    /* renamed from: a */
    private static void m4956a(Context context) {
        if (f114645b) {
            f114645b = false;
            try {
                Context applicationContext = context.getApplicationContext();
                f114644a = applicationContext.createPackageContext(applicationContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    private static String m4946b(@NonNull Context context, int i, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    return context.getString(i, objArr);
                }
            } catch (Exception unused) {
                m4945c(context);
                return (objArr == null || objArr.length <= 0) ? context.getString(i) : context.getString(i, objArr);
            }
        }
        return context.getString(i);
    }

    /* renamed from: a */
    private static void m4951a(String str) {
        C43782a.m5009a(0, "BigoAAB", String.valueOf(str));
    }
}
