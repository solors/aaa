package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.UUID;

/* renamed from: com.chartboost.sdk.impl.a4 */
/* loaded from: classes3.dex */
public abstract class AbstractC9670a4 {

    /* renamed from: a */
    public static int f21553a = 4;

    /* renamed from: b */
    public static int f21554b = 5;

    /* renamed from: a */
    public static String m82133a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || m82128e(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, C26484a.f69184A);
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return string;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static Integer m82131b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        if (Math.sqrt((f2 * f2) + (f * f)) >= 6.5d) {
            return Integer.valueOf(f21554b);
        }
        return Integer.valueOf(f21553a);
    }

    /* renamed from: c */
    public static String m82130c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null) {
            edit.putString("cbUUID", uuid).apply();
        }
        return uuid;
    }

    /* renamed from: d */
    public static String m82129d(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i = configuration.uiMode & 15;
        int i2 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (!packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            String str = Build.BRAND;
            if (str == null || !str.equals("chromium") || !Build.MANUFACTURER.equals("chromium")) {
                String str2 = Build.DEVICE;
                if (str2 == null || !str2.matches(".+_cheets")) {
                    if (!packageManager.hasSystemFeature("android.hardware.type.watch") && i != 6) {
                        if (!packageManager.hasSystemFeature("android.hardware.type.television") && i != 4) {
                            String str3 = Build.MANUFACTURER;
                            if ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i2 != 4) {
                                return "phone";
                            }
                            return "tablet";
                        }
                        return "tv";
                    }
                    return "watch";
                }
                return "chromebook";
            }
            return "chromebook";
        }
        return "chromebook";
    }

    /* renamed from: e */
    public static boolean m82128e(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() == 1) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m82132a(Context context, boolean z) {
        String m82133a = m82133a(context);
        return (z || m82133a == null) ? m82130c(context) : m82133a;
    }
}
