package com.iab.omid.library.applovin.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.utils.b */
/* loaded from: classes6.dex */
public final class C17829b {
    /* renamed from: a */
    public static String m65052a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m65051b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m65050c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m65049d() {
        JSONObject jSONObject = new JSONObject();
        C17830c.m65038a(jSONObject, "deviceType", m65052a());
        C17830c.m65038a(jSONObject, "osVersion", m65050c());
        C17830c.m65038a(jSONObject, "os", m65051b());
        return jSONObject;
    }
}
