package com.iab.omid.library.unity3d.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.utils.b */
/* loaded from: classes6.dex */
public final class C18707b {
    /* renamed from: a */
    public static String m61669a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m61668b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m61667c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m61666d() {
        JSONObject jSONObject = new JSONObject();
        C18708c.m61655a(jSONObject, "deviceType", m61669a());
        C18708c.m61655a(jSONObject, "osVersion", m61667c());
        C18708c.m61655a(jSONObject, "os", m61668b());
        return jSONObject;
    }
}
