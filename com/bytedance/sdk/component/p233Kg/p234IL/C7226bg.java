package com.bytedance.sdk.component.p233Kg.p234IL;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.Kg.IL.bg */
/* loaded from: classes3.dex */
public class C7226bg {

    /* renamed from: IL */
    public int f15589IL;

    /* renamed from: bX */
    public int f15590bX;

    /* renamed from: bg */
    public int f15591bg;
    public int eqN;

    public C7226bg(int i, int i2, int i3, int i4) {
        this.f15591bg = i;
        this.f15589IL = i2;
        this.f15590bX = i3;
        this.eqN = i4;
    }

    /* renamed from: bg */
    public JSONObject m89554bg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.f15591bg);
            jSONObject.put("sdk_max_thread_num", this.f15589IL);
            jSONObject.put("app_thread_num", this.f15590bX);
            jSONObject.put("app_max_thread_num", this.eqN);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
