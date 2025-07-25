package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.InterfaceC7570bg;
import com.ironsource.C21114v8;

/* renamed from: com.bytedance.sdk.component.utils.PX */
/* loaded from: classes3.dex */
public class C7741PX {

    /* renamed from: IL */
    private static int f16921IL = 4;

    /* renamed from: bX */
    private static InterfaceC7570bg f16922bX = null;

    /* renamed from: bg */
    private static boolean f16923bg = false;
    private static String eqN = "";

    /* renamed from: IL */
    public static void m87881IL() {
        f16923bg = true;
        m87875bg(3);
    }

    /* renamed from: bX */
    public static void m87878bX() {
        f16923bg = false;
        m87875bg(7);
    }

    /* renamed from: bg */
    public static void m87874bg(String str) {
        eqN = str;
    }

    public static boolean eqN() {
        return f16923bg;
    }

    /* renamed from: bg */
    public static void m87875bg(int i) {
        f16921IL = i;
    }

    /* renamed from: IL */
    public static void m87880IL(String str) {
        if (f16923bg) {
            m87873bg("Logger", str);
        }
    }

    /* renamed from: bX */
    public static String m87877bX(String str) {
        if (TextUtils.isEmpty(eqN)) {
            return str;
        }
        return m87869bg(C21114v8.C21123i.f54137d + eqN + "]-[" + str + C21114v8.C21123i.f54139e);
    }

    /* renamed from: bg */
    public static boolean m87876bg() {
        return f16921IL <= 3;
    }

    /* renamed from: bg */
    public static void m87873bg(String str, String str2) {
        if (f16922bX != null) {
            m87877bX(str);
        }
        if (f16923bg && str2 != null && f16921IL <= 6) {
            Log.e(m87877bX(str), str2);
        }
    }

    /* renamed from: IL */
    public static String m87879IL(String str, String str2) {
        if (TextUtils.isEmpty(eqN)) {
            return str;
        }
        return m87869bg(str2 + "]-[" + str);
    }

    /* renamed from: bg */
    public static void m87872bg(String str, String str2, String str3, Throwable th) {
        if (f16923bg) {
            m87871bg(m87879IL(str, str2), str3, th);
        }
    }

    /* renamed from: bg */
    public static void m87871bg(String str, String str2, Throwable th) {
        if (f16922bX != null) {
            m87877bX(str);
        }
        if (f16923bg) {
            if (!(str2 == null && th == null) && f16921IL <= 6) {
                Log.e(m87877bX(str), str2, th);
            }
        }
    }

    /* renamed from: bg */
    public static void m87870bg(String str, Object... objArr) {
        if (f16922bX != null) {
            m87877bX(str);
            m87869bg(objArr);
        }
        if (f16923bg && objArr != null && f16921IL <= 6) {
            Log.e(m87877bX(str), m87869bg(objArr));
        }
    }

    /* renamed from: bg */
    private static String m87869bg(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
