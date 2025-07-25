package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.H3 */
/* loaded from: classes6.dex */
public abstract class AbstractC18947H3 {
    /* renamed from: a */
    public static C18961I3 m61089a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        C18961I3 c18961i3 = new C18961I3();
        c18961i3.f47340b = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            c18961i3.f47339a = true;
            if (jSONObject.has("useCustomClose")) {
                c18961i3.f47342d = true;
            }
            c18961i3.f47341c = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return c18961i3;
    }
}
