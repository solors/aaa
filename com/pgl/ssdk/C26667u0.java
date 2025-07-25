package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pgl.ssdk.u0 */
/* loaded from: classes7.dex */
public class C26667u0 {

    /* renamed from: a */
    private static SharedPreferences f69970a;

    /* renamed from: a */
    public static String m40742a(Context context, String str) {
        return m40740a(context, str, "");
    }

    /* renamed from: b */
    public static void m40738b(Context context, String str, String str2) {
        SharedPreferences m40743a = m40743a(context);
        if (m40743a != null) {
            m40743a.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: a */
    public static String m40740a(Context context, String str, String str2) {
        SharedPreferences m40743a = m40743a(context);
        return m40743a != null ? m40743a.getString(str, str2) : str2;
    }

    /* renamed from: b */
    public static void m40739b(Context context, String str, int i) {
        SharedPreferences m40743a = m40743a(context);
        if (m40743a != null) {
            m40743a.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: a */
    public static int m40741a(Context context, String str, int i) {
        SharedPreferences m40743a = m40743a(context);
        return m40743a != null ? m40743a.getInt(str, i) : i;
    }

    /* renamed from: a */
    public static SharedPreferences m40743a(Context context) {
        if (f69970a == null) {
            f69970a = context.getSharedPreferences("ss_config", 0);
        }
        return f69970a;
    }
}
