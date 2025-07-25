package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C21114v8;

/* renamed from: com.bytedance.sdk.openadsdk.utils.LZ */
/* loaded from: classes3.dex */
public class C9510LZ {

    /* renamed from: bg */
    private static boolean f21165bg;

    /* renamed from: IL */
    public static void m82620IL() {
        f21165bg = false;
    }

    /* renamed from: bX */
    private static String m82616bX(String str, String str2) {
        if (TextUtils.isEmpty("PangleSDK-6406")) {
            return str;
        }
        return m82610bg(str2 + "]-[" + str);
    }

    /* renamed from: bg */
    public static void m82615bg() {
        f21165bg = true;
    }

    /* renamed from: IL */
    public static void m82618IL(String str, String str2, Object... objArr) {
        m82617IL(m82616bX(str, str2), objArr);
    }

    /* renamed from: bg */
    public static void m82612bg(String str, String str2, Object... objArr) {
        m82611bg(m82616bX(str, str2), objArr);
    }

    /* renamed from: IL */
    public static void m82619IL(String str, String str2) {
        if (f21165bg && str2 != null) {
            Log.e(m82614bg(str), str2);
        }
    }

    /* renamed from: bg */
    public static void m82613bg(String str, String str2) {
        if (f21165bg && str2 != null) {
            Log.d(m82614bg(str), str2);
        }
    }

    /* renamed from: IL */
    public static void m82617IL(String str, Object... objArr) {
        if (f21165bg && objArr != null) {
            Log.e(m82614bg(str), m82610bg(objArr));
        }
    }

    /* renamed from: bg */
    public static void m82611bg(String str, Object... objArr) {
        if (f21165bg && objArr != null) {
            Log.d(m82614bg(str), m82610bg(objArr));
        }
    }

    /* renamed from: bg */
    private static String m82614bg(String str) {
        if (TextUtils.isEmpty("PangleSDK-6406")) {
            return str;
        }
        return m82610bg("[PangleSDK-6406]-[" + str + C21114v8.C21123i.f54139e);
    }

    /* renamed from: bg */
    private static String m82610bg(Object... objArr) {
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
