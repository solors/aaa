package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.LocaleList;
import android.provider.Settings;
import com.p552ot.pubsub.p553a.C26484a;
import java.lang.reflect.Method;
import java.util.TimeZone;

/* renamed from: com.pgl.ssdk.b0 */
/* loaded from: classes7.dex */
public class C26608b0 {

    /* renamed from: a */
    private static double f69844a = -1.0d;

    /* renamed from: a */
    public static String m40937a() {
        return LocaleList.getDefault().get(0).getLanguage();
    }

    /* renamed from: b */
    public static String m40935b() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: c */
    public static String m40933c() {
        return "";
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static String m40932c(Context context) {
        return "";
    }

    /* renamed from: a */
    public static String m40936a(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), C26484a.f69184A);
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: b */
    public static String m40934b(Context context) {
        double d = f69844a;
        double d2 = 0.0d;
        if (d >= 0.0d) {
            return Integer.toString((int) d);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            d2 = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        f69844a = d2;
        return Integer.toString((int) d2);
    }
}
