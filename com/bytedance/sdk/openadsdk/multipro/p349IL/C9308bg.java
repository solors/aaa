package com.bytedance.sdk.openadsdk.multipro.p349IL;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.IL.bg */
/* loaded from: classes3.dex */
public class C9308bg {

    /* renamed from: IL */
    public boolean f20806IL;

    /* renamed from: bX */
    public boolean f20807bX;

    /* renamed from: bg */
    public boolean f20808bg;
    public boolean eqN;

    /* renamed from: iR */
    public long f20809iR;
    public long ldr;

    /* renamed from: zx */
    public long f20810zx;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.IL.bg$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9309bg {
        C9308bg ldr();
    }

    /* renamed from: IL */
    public C9308bg m83085IL(boolean z) {
        this.f20808bg = z;
        return this;
    }

    /* renamed from: bX */
    public C9308bg m83083bX(boolean z) {
        this.f20806IL = z;
        return this;
    }

    /* renamed from: bg */
    public C9308bg m83079bg(boolean z) {
        this.eqN = z;
        return this;
    }

    public C9308bg eqN(boolean z) {
        this.f20807bX = z;
        return this;
    }

    /* renamed from: IL */
    public C9308bg m83086IL(long j) {
        this.ldr = j;
        return this;
    }

    /* renamed from: bX */
    public C9308bg m83084bX(long j) {
        this.f20809iR = j;
        return this;
    }

    /* renamed from: bg */
    public C9308bg m83081bg(long j) {
        this.f20810zx = j;
        return this;
    }

    /* renamed from: bg */
    public JSONObject m83082bg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f20808bg);
            jSONObject.put("isFromVideoDetailPage", this.f20806IL);
            jSONObject.put("isFromDetailPage", this.f20807bX);
            jSONObject.put("duration", this.f20810zx);
            jSONObject.put("totalPlayDuration", this.ldr);
            jSONObject.put("currentPlayPosition", this.f20809iR);
            jSONObject.put("isAutoPlay", this.eqN);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: bg */
    public static C9308bg m83080bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C9308bg c9308bg = new C9308bg();
        c9308bg.m83085IL(jSONObject.optBoolean("isCompleted"));
        c9308bg.m83083bX(jSONObject.optBoolean("isFromVideoDetailPage"));
        c9308bg.eqN(jSONObject.optBoolean("isFromDetailPage"));
        c9308bg.m83081bg(jSONObject.optLong("duration"));
        c9308bg.m83086IL(jSONObject.optLong("totalPlayDuration"));
        c9308bg.m83084bX(jSONObject.optLong("currentPlayPosition"));
        c9308bg.m83079bg(jSONObject.optBoolean("isAutoPlay"));
        return c9308bg;
    }
}
