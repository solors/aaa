package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.pgl.ssdk.c0 */
/* loaded from: classes7.dex */
public class C26612c0 {

    /* renamed from: a */
    public static int f69851a;

    /* renamed from: b */
    public static int f69852b;

    /* renamed from: c */
    private static int f69853c;

    /* renamed from: d */
    public static int f69854d;

    /* renamed from: e */
    private static int f69855e;

    /* renamed from: f */
    private static int f69856f;

    /* renamed from: a */
    private static void m40924a(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f69853c = (int) displayMetrics.density;
            f69854d = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m40923b(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f69855e = (int) displayMetrics.xdpi;
            f69856f = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m40922c(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f69851a = point.x;
            f69852b = point.y;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static String m40921d(Context context) {
        int i = -1;
        if (context != null) {
            try {
                i = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i);
    }

    /* renamed from: e */
    public static String m40920e(Context context) {
        try {
            m40922c(context);
            m40924a(context);
            m40923b(context);
        } catch (Throwable unused) {
        }
        return f69854d + "[<!>]" + f69851a + "," + f69852b + "[<!>]";
    }
}
