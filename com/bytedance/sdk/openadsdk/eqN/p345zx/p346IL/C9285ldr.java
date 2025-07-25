package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.ldr */
/* loaded from: classes3.dex */
public class C9285ldr implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20743IL;

    /* renamed from: bX */
    private int f20744bX = 0;

    /* renamed from: bg */
    private long f20745bg;

    /* renamed from: IL */
    public void m83180IL(long j) {
        this.f20743IL = j;
    }

    /* renamed from: bg */
    public void m83178bg(long j) {
        this.f20745bg = j;
    }

    /* renamed from: bg */
    public void m83179bg(int i) {
        this.f20744bX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.f20745bg);
            jSONObject.put("buffers_time", this.f20743IL);
            jSONObject.put("video_backup", this.f20744bX);
        } catch (Throwable th) {
            C7741PX.m87873bg("FeedOverModel", th.getMessage());
        }
    }
}
