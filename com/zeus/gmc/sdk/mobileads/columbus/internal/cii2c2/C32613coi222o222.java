package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.coi222o222 */
/* loaded from: classes8.dex */
public final class C32613coi222o222 {
    public static String c2oc2i() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject cioccoiococ() {
        JSONObject jSONObject = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject, "deviceType", coo2iico());
        C32604c2oc2i.coo2iico(jSONObject, "osVersion", c2oc2i());
        C32604c2oc2i.coo2iico(jSONObject, "os", coi222o222());
        return jSONObject;
    }

    public static String coi222o222() {
        return "Android";
    }

    public static String coo2iico() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }
}
