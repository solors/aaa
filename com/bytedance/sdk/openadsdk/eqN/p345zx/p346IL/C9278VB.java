package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.VB */
/* loaded from: classes3.dex */
public class C9278VB implements InterfaceC9280bX {

    /* renamed from: IL */
    private final long f20726IL;

    /* renamed from: bg */
    private final String f20727bg;

    public C9278VB(String str, long j) {
        this.f20727bg = str;
        this.f20726IL = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f20727bg);
            jSONObject.put("preload_size", this.f20726IL);
        } catch (Throwable th) {
            C7741PX.m87873bg("LoadVideoStartModel", th.getMessage());
        }
    }
}
