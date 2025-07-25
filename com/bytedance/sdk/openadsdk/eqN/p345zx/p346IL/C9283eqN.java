package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.eqN */
/* loaded from: classes3.dex */
public class C9283eqN implements InterfaceC9280bX {

    /* renamed from: IL */
    public long f20738IL;

    /* renamed from: bX */
    public int f20739bX;

    /* renamed from: bg */
    public long f20740bg;
    public int eqN = 0;

    /* renamed from: IL */
    public void m83185IL(long j) {
        this.f20738IL = j;
    }

    /* renamed from: bg */
    public void m83183bg(long j) {
        this.f20740bg = j;
    }

    /* renamed from: IL */
    public void m83186IL(int i) {
        this.eqN = i;
    }

    /* renamed from: bg */
    public void m83184bg(int i) {
        this.f20739bX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.f20740bg);
            jSONObject.put("buffers_time", this.f20738IL);
            jSONObject.put("break_reason", this.f20739bX);
            jSONObject.put("video_backup", this.eqN);
        } catch (Throwable th) {
            C7741PX.m87873bg("FeedBreakModel", th.getMessage());
        }
    }
}
