package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.PX */
/* loaded from: classes3.dex */
public class C9276PX implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20720IL;

    /* renamed from: bX */
    private long f20721bX;

    /* renamed from: bg */
    private String f20722bg;
    private long eqN;

    /* renamed from: IL */
    public void m83204IL(long j) {
        this.f20721bX = j;
    }

    /* renamed from: bX */
    public void m83203bX(long j) {
        this.eqN = j;
    }

    /* renamed from: bg */
    public void m83201bg(String str) {
        this.f20722bg = str;
    }

    /* renamed from: bg */
    public void m83202bg(long j) {
        this.f20720IL = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f20722bg);
            jSONObject.put("preload_size", this.f20720IL);
            jSONObject.put("load_time", this.f20721bX);
            jSONObject.put("local_cache", this.eqN);
        } catch (Throwable th) {
            C7741PX.m87873bg("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
