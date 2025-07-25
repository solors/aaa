package com.iab.omid.library.bigosg.p389d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.d.a */
/* loaded from: classes6.dex */
public final class C17950a {
    /* renamed from: a */
    public static String m64596a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m64595b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m64594c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m64593d() {
        JSONObject jSONObject = new JSONObject();
        C17951b.m64585a(jSONObject, "deviceType", m64596a());
        C17951b.m64585a(jSONObject, "osVersion", m64595b());
        C17951b.m64585a(jSONObject, "os", m64594c());
        return jSONObject;
    }
}
