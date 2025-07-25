package com.p551my.target;

import android.util.Log;

/* renamed from: com.my.target.ja */
/* loaded from: classes7.dex */
public abstract class AbstractC25846ja {

    /* renamed from: a */
    public static boolean f67064a = false;

    /* renamed from: a */
    public static String m43679a(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str + ": ";
        }
        sb2.append(str3);
        if (str2 == null) {
            str2 = "<empty log>";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m43677b(String str, String str2) {
        if (f67064a) {
            Log.d("[myTarget]", m43679a(str, str2));
        }
    }

    /* renamed from: c */
    public static void m43675c(String str, String str2) {
        if (f67064a) {
            Log.e("[myTarget]", m43679a(str, str2));
        }
    }

    /* renamed from: d */
    public static void m43673d(String str, String str2) {
        Log.i("[myTarget]", m43679a(str, str2));
    }

    /* renamed from: e */
    public static void m43672e(String str, String str2) {
        if (f67064a) {
            Log.w("[myTarget]", m43679a(str, str2));
        }
    }

    /* renamed from: a */
    public static void m43680a(String str) {
        m43677b(null, str);
    }

    /* renamed from: b */
    public static void m43678b(String str) {
        m43675c(null, str);
    }

    /* renamed from: c */
    public static void m43676c(String str) {
        m43673d(null, str);
    }

    /* renamed from: d */
    public static void m43674d(String str) {
        m43672e(null, str);
    }
}
