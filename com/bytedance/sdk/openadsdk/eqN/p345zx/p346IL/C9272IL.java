package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.IL */
/* loaded from: classes3.dex */
public class C9272IL implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20701IL;

    /* renamed from: bX */
    private int f20702bX;

    /* renamed from: bg */
    private long f20703bg;
    private int eqN;

    /* renamed from: IL */
    public void m83233IL(long j) {
        this.f20701IL = j;
    }

    /* renamed from: bg */
    public void m83231bg(long j) {
        this.f20703bg = j;
    }

    /* renamed from: IL */
    public void m83234IL(int i) {
        this.eqN = i;
    }

    /* renamed from: bg */
    public void m83232bg(int i) {
        this.f20702bX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f20703bg);
            jSONObject.put("total_duration", this.f20701IL);
            jSONObject.put("vbtt_skip_type", this.f20702bX);
            jSONObject.put("skip_reason", this.eqN);
        } catch (Throwable th) {
            C7741PX.m87873bg("EndcardSkipModel", th.getMessage());
        }
    }
}
