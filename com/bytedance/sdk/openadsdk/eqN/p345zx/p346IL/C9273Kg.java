package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.Kg */
/* loaded from: classes3.dex */
public class C9273Kg implements InterfaceC9280bX {

    /* renamed from: IL */
    private long f20704IL;

    /* renamed from: bX */
    private int f20705bX;

    /* renamed from: bg */
    private long f20706bg;

    /* renamed from: IL */
    public void m83230IL(long j) {
        this.f20704IL = j;
    }

    /* renamed from: bg */
    public void m83228bg(long j) {
        this.f20706bg = j;
    }

    /* renamed from: bg */
    public void m83229bg(int i) {
        this.f20705bX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.f20706bg);
            jSONObject.put("video_cache_size", this.f20704IL);
            jSONObject.put("is_auto_play", this.f20705bX);
        } catch (Throwable th) {
            C7741PX.m87873bg("FeedPlayModel", th.getMessage());
        }
    }
}
