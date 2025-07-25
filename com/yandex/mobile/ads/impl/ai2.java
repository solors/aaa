package com.yandex.mobile.ads.impl;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ai2 {
    /* renamed from: a */
    public static JSONObject m35858a() {
        JSONObject jSONObject = new JSONObject();
        ki2.m32540a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        ki2.m32540a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        ki2.m32540a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
