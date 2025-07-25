package com.ironsource;

import com.ironsource.C20688qf;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.xi */
/* loaded from: classes6.dex */
public class C21226xi {

    /* renamed from: a */
    static String f54494a = "ManRewInst_";

    /* renamed from: a */
    public static String m54134a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static String m54131b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m54133a(C20473mi c20473mi) {
        return (c20473mi.m56298i() ? C20688qf.EnumC20693e.Banner : c20473mi.m56293n() ? C20688qf.EnumC20693e.RewardedVideo : C20688qf.EnumC20693e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m54132a(JSONObject jSONObject) {
        if (jSONObject.optBoolean("rewarded")) {
            return f54494a + jSONObject.optString("name");
        }
        return jSONObject.optString("name");
    }
}
