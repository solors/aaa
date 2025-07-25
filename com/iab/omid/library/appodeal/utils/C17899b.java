package com.iab.omid.library.appodeal.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.utils.b */
/* loaded from: classes6.dex */
public final class C17899b {
    /* renamed from: a */
    public static String m64803a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m64802b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m64801c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m64800d() {
        JSONObject jSONObject = new JSONObject();
        C17900c.m64789a(jSONObject, "deviceType", m64803a());
        C17900c.m64789a(jSONObject, "osVersion", m64801c());
        C17900c.m64789a(jSONObject, "os", m64802b());
        return jSONObject;
    }
}
