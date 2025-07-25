package com.iab.omid.library.amazon.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.utils.b */
/* loaded from: classes6.dex */
public final class C17768b {
    /* renamed from: a */
    public static String m65293a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m65292b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m65291c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m65290d() {
        JSONObject jSONObject = new JSONObject();
        C17769c.m65279a(jSONObject, "deviceType", m65293a());
        C17769c.m65279a(jSONObject, "osVersion", m65291c());
        C17769c.m65279a(jSONObject, "os", m65292b());
        return jSONObject;
    }
}
