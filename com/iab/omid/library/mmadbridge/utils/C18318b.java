package com.iab.omid.library.mmadbridge.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.utils.b */
/* loaded from: classes6.dex */
public final class C18318b {
    /* renamed from: a */
    public static String m63157a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m63156b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m63155c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m63154d() {
        JSONObject jSONObject = new JSONObject();
        C18319c.m63143a(jSONObject, "deviceType", m63157a());
        C18319c.m63143a(jSONObject, "osVersion", m63155c());
        C18319c.m63143a(jSONObject, "os", m63156b());
        return jSONObject;
    }
}
