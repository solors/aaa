package com.iab.omid.library.pubmatic.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.utils.b */
/* loaded from: classes6.dex */
public final class C18458b {
    /* renamed from: a */
    public static String m62651a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m62650b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m62649c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m62648d() {
        JSONObject jSONObject = new JSONObject();
        C18459c.m62637a(jSONObject, "deviceType", m62651a());
        C18459c.m62637a(jSONObject, "osVersion", m62649c());
        C18459c.m62637a(jSONObject, "os", m62650b());
        return jSONObject;
    }
}
