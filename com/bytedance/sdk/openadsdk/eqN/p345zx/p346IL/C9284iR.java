package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.iR */
/* loaded from: classes3.dex */
public class C9284iR implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20741IL;

    /* renamed from: bg */
    private long f20742bg;

    /* renamed from: IL */
    public void m83182IL(long j) {
        this.f20741IL = j;
    }

    /* renamed from: bg */
    public void m83181bg(long j) {
        this.f20742bg = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f20742bg);
            jSONObject.put("total_duration", this.f20741IL);
        } catch (Throwable th) {
            C7741PX.m87873bg("FeedPauseModel", th.getMessage());
        }
    }
}
