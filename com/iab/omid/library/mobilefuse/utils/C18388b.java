package com.iab.omid.library.mobilefuse.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.utils.b */
/* loaded from: classes6.dex */
public final class C18388b {
    /* renamed from: a */
    public static String m62904a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m62903b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m62902c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m62901d() {
        JSONObject jSONObject = new JSONObject();
        C18389c.m62890a(jSONObject, "deviceType", m62904a());
        C18389c.m62890a(jSONObject, "osVersion", m62902c());
        C18389c.m62890a(jSONObject, "os", m62903b());
        return jSONObject;
    }
}
