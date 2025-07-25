package com.iab.omid.library.inmobi.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.utils.b */
/* loaded from: classes6.dex */
public final class C18199b {
    /* renamed from: a */
    public static String m63641a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m63640b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m63639c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m63638d() {
        JSONObject jSONObject = new JSONObject();
        C18200c.m63627a(jSONObject, "deviceType", m63641a());
        C18200c.m63627a(jSONObject, "osVersion", m63639c());
        C18200c.m63627a(jSONObject, "os", m63640b());
        return jSONObject;
    }
}
