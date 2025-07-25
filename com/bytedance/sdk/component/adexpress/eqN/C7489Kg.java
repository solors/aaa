package com.bytedance.sdk.component.adexpress.eqN;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.utils.C7730Fy;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.Kg */
/* loaded from: classes3.dex */
public class C7489Kg {

    /* renamed from: bg */
    private static boolean f16271bg;

    /* renamed from: IL */
    public static int m88680IL(Context context, float f) {
        if (context == null) {
            context = C7324bg.m89118bg().m89119bX().mo85794IL();
        }
        float eqN = eqN(context);
        if (eqN <= 0.0f) {
            eqN = 1.0f;
        }
        return (int) ((f / eqN) + 0.5f);
    }

    /* renamed from: bX */
    public static float m88678bX(Context context, float f) {
        if (context == null) {
            context = C7324bg.m89118bg().m89119bX().mo85794IL();
        }
        return f * eqN(context);
    }

    /* renamed from: bg */
    public static int m88677bg(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    private static float eqN(Context context) {
        try {
            if (f16271bg) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = loadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(loadClass, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: bg */
    public static float m88675bg(Context context, float f) {
        if (context == null) {
            context = C7324bg.m89118bg().m89119bX().mo85794IL();
        }
        return (f * eqN(context)) + 0.5f;
    }

    /* renamed from: IL */
    public static int m88681IL(Context context) {
        if (context == null) {
            context = C7324bg.m89118bg().m89119bX().mo85794IL();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: bX */
    public static String m88679bX(@NonNull Context context) {
        String str;
        try {
            Locale locale = C7730Fy.m87925IL(context).getConfiguration().getLocales().get(0);
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return m88674bg(str);
    }

    /* renamed from: bg */
    public static int m88676bg(Context context) {
        if (context == null) {
            context = C7324bg.m89118bg().m89119bX().mo85794IL();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: bg */
    private static String m88674bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    c = 0;
                    break;
                }
                break;
            case 3383:
                if (str.equals("ja")) {
                    c = 1;
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    c = 2;
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    c = 3;
                    break;
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "aa";
            case 1:
                return "japan";
            case 2:
                return "korea";
            case 3:
                return "my";
            case 4:
                return "cn";
            default:
                return str;
        }
    }
}
