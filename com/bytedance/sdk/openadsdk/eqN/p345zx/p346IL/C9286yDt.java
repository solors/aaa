package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6495bg;
import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.yDt */
/* loaded from: classes3.dex */
public class C9286yDt implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20746IL;

    /* renamed from: bX */
    private final int f20747bX;

    /* renamed from: bg */
    private long f20748bg;
    private final int eqN;

    /* renamed from: zx */
    private final String f20749zx;

    public C9286yDt(C6495bg c6495bg) {
        this.f20747bX = c6495bg.m91694bg();
        this.eqN = c6495bg.m91696IL();
        this.f20749zx = c6495bg.m91695bX();
    }

    /* renamed from: IL */
    public void m83177IL(long j) {
        this.f20746IL = j;
    }

    /* renamed from: bg */
    public void m83176bg(long j) {
        this.f20748bg = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f20748bg);
            jSONObject.put("total_duration", this.f20746IL);
            jSONObject.put("error_code", this.f20747bX);
            jSONObject.put("extra_error_code", this.eqN);
            jSONObject.put("error_message", this.f20749zx);
        } catch (Throwable th) {
            C7741PX.m87873bg("PlayErrorModel", th.getMessage());
        }
    }
}
