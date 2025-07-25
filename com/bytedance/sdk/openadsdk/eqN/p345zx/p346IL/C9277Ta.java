package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.Ta */
/* loaded from: classes3.dex */
public class C9277Ta implements InterfaceC9280bX {

    /* renamed from: IL */
    public int f20723IL;

    /* renamed from: bX */
    public long f20724bX;

    /* renamed from: bg */
    public long f20725bg;

    /* renamed from: IL */
    public void m83200IL(long j) {
        this.f20724bX = j;
    }

    /* renamed from: bg */
    public void m83198bg(long j) {
        this.f20725bg = j;
    }

    /* renamed from: bg */
    public void m83199bg(int i) {
        this.f20723IL = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f20725bg);
            jSONObject.put("buffers_count", this.f20723IL);
            jSONObject.put("total_duration", this.f20724bX);
        } catch (Throwable th) {
            C7741PX.m87873bg("PlayBufferModel", th.getMessage());
        }
    }
}
