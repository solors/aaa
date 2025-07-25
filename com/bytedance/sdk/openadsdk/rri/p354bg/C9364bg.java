package com.bytedance.sdk.openadsdk.rri.p354bg;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.rri.bg.bg */
/* loaded from: classes3.dex */
public class C9364bg {

    /* renamed from: IL */
    private final int f20890IL;

    /* renamed from: bX */
    private final float f20891bX;

    /* renamed from: bg */
    private final int f20892bg;

    public C9364bg(int i, int i2, float f) {
        this.f20892bg = i;
        this.f20890IL = i2;
        this.f20891bX = f;
    }

    /* renamed from: bg */
    public static JSONObject m82932bg(C9364bg c9364bg) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", c9364bg.f20892bg);
        jSONObject.put("height", c9364bg.f20890IL);
        jSONObject.put("alpha", c9364bg.f20891bX);
        return jSONObject;
    }
}
