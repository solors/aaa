package com.chartboost.sdk.impl;

import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.eb */
/* loaded from: classes3.dex */
public final class C9835eb {

    /* renamed from: a */
    public final boolean f21969a;

    /* renamed from: b */
    public final Float f21970b;

    /* renamed from: c */
    public final boolean f21971c;

    /* renamed from: d */
    public final EnumC9982j8 f21972d;

    public C9835eb(boolean z, Float f, boolean z2, EnumC9982j8 enumC9982j8) {
        this.f21969a = z;
        this.f21970b = f;
        this.f21971c = z2;
        this.f21972d = enumC9982j8;
    }

    /* renamed from: a */
    public JSONObject m81724a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21969a);
            if (this.f21969a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21970b);
            }
            jSONObject.put("autoPlay", this.f21971c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f21972d);
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C9835eb m81722a(boolean z, EnumC9982j8 enumC9982j8) {
        AbstractC10085nd.m80982a(enumC9982j8, "Position is null");
        return new C9835eb(false, null, z, enumC9982j8);
    }

    /* renamed from: a */
    public static C9835eb m81723a(float f, boolean z, EnumC9982j8 enumC9982j8) {
        AbstractC10085nd.m80982a(enumC9982j8, "Position is null");
        return new C9835eb(true, Float.valueOf(f), z, enumC9982j8);
    }
}
