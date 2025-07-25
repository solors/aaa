package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.I3 */
/* loaded from: classes6.dex */
public final class C18961I3 {

    /* renamed from: e */
    public static final /* synthetic */ int f47338e = 0;

    /* renamed from: a */
    public boolean f47339a = true;

    /* renamed from: b */
    public String f47340b;

    /* renamed from: c */
    public boolean f47341c;

    /* renamed from: d */
    public boolean f47342d;

    public C18961I3() {
        JSONObject jSONObject = new JSONObject();
        try {
            C19352l3 m60127d = AbstractC19338k3.m60127d();
            jSONObject.put("width", m60127d.f48459a);
            jSONObject.put("height", m60127d.f48460b);
            jSONObject.put("useCustomClose", this.f47341c);
            jSONObject.put("isModal", this.f47339a);
        } catch (JSONException unused) {
            Intrinsics.checkNotNullExpressionValue("I3", "TAG");
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        this.f47340b = jSONObject2;
    }
}
