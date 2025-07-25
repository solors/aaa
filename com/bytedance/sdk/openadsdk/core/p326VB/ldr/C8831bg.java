package com.bytedance.sdk.openadsdk.core.p326VB.ldr;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB.ldr.bg */
/* loaded from: classes3.dex */
public class C8831bg {

    /* renamed from: IL */
    private String f19503IL;

    /* renamed from: bX */
    private String f19504bX;

    /* renamed from: bg */
    private String f19505bg;
    private String eqN;

    /* renamed from: zx */
    private String f19506zx;

    /* renamed from: IL */
    public String m84781IL() {
        return this.f19503IL;
    }

    /* renamed from: bX */
    public String m84779bX() {
        return this.f19504bX;
    }

    /* renamed from: bg */
    public String m84777bg() {
        return this.f19505bg;
    }

    public String eqN() {
        return this.eqN;
    }

    /* renamed from: zx */
    public String m84774zx() {
        return this.f19506zx;
    }

    /* renamed from: IL */
    public C8831bg m84780IL(String str) {
        this.f19503IL = str;
        return this;
    }

    /* renamed from: bX */
    public C8831bg m84778bX(String str) {
        this.f19504bX = str;
        return this;
    }

    /* renamed from: bg */
    public C8831bg m84775bg(String str) {
        this.f19505bg = str;
        return this;
    }

    public C8831bg eqN(String str) {
        this.eqN = str;
        return this;
    }

    /* renamed from: zx */
    public C8831bg m84773zx(String str) {
        this.f19506zx = str;
        return this;
    }

    /* renamed from: bg */
    public JSONObject m84776bg(C8831bg c8831bg) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f19505bg);
            jSONObject.put("md5", this.f19503IL);
            jSONObject.put("url", this.f19504bX);
            if (c8831bg != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", c8831bg.m84777bg());
                jSONObject2.put("md5", c8831bg.m84781IL());
                jSONObject2.put("url", c8831bg.m84779bX());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
