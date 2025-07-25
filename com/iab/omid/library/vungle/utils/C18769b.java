package com.iab.omid.library.vungle.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.utils.b */
/* loaded from: classes6.dex */
public final class C18769b {
    /* renamed from: a */
    public static String m61423a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m61422b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m61421c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m61420d() {
        JSONObject jSONObject = new JSONObject();
        C18770c.m61409a(jSONObject, "deviceType", m61423a());
        C18770c.m61409a(jSONObject, "osVersion", m61421c());
        C18770c.m61409a(jSONObject, "os", m61422b());
        return jSONObject;
    }
}
