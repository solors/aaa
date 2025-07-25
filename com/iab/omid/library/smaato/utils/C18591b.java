package com.iab.omid.library.smaato.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.utils.b */
/* loaded from: classes6.dex */
public final class C18591b {
    /* renamed from: a */
    public static String m62145a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m62144b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m62143c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m62142d() {
        JSONObject jSONObject = new JSONObject();
        C18592c.m62131a(jSONObject, "deviceType", m62145a());
        C18592c.m62131a(jSONObject, "osVersion", m62143c());
        C18592c.m62131a(jSONObject, "os", m62144b());
        return jSONObject;
    }
}
