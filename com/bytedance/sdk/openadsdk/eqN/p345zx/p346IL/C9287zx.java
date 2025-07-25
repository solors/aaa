package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.zx */
/* loaded from: classes3.dex */
public class C9287zx implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20750IL;

    /* renamed from: bg */
    private long f20751bg;

    /* renamed from: IL */
    public void m83175IL(long j) {
        this.f20750IL = j;
    }

    /* renamed from: bg */
    public void m83174bg(long j) {
        this.f20751bg = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f20751bg);
            jSONObject.put("total_duration", this.f20750IL);
        } catch (Throwable th) {
            C7741PX.m87873bg("FeedContinueModel", th.getMessage());
        }
    }
}
