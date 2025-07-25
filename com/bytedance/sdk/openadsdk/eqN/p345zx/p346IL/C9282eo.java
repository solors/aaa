package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.eo */
/* loaded from: classes3.dex */
public class C9282eo implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20734IL;

    /* renamed from: bX */
    private long f20735bX;

    /* renamed from: bg */
    private String f20736bg;
    private int eqN;
    private String ldr;

    /* renamed from: zx */
    private String f20737zx;

    /* renamed from: IL */
    public void m83192IL(long j) {
        this.f20735bX = j;
    }

    /* renamed from: bX */
    public void m83190bX(String str) {
        this.ldr = str;
    }

    /* renamed from: bg */
    public void m83187bg(String str) {
        this.f20736bg = str;
    }

    /* renamed from: IL */
    public void m83191IL(String str) {
        this.f20737zx = str;
    }

    /* renamed from: bg */
    public void m83188bg(long j) {
        this.f20734IL = j;
    }

    /* renamed from: bg */
    public void m83189bg(int i) {
        this.eqN = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f20736bg);
            jSONObject.put("preload_size", this.f20734IL);
            jSONObject.put("load_time", this.f20735bX);
            jSONObject.put("error_code", this.eqN);
            jSONObject.put("error_message", this.f20737zx);
            jSONObject.put("error_message_server", this.ldr);
        } catch (Throwable th) {
            C7741PX.m87873bg("LoadVideoErrorModel", th.getMessage());
        }
    }
}
