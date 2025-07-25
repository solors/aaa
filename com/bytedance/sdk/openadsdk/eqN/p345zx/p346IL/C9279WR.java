package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.WR */
/* loaded from: classes3.dex */
public class C9279WR implements InterfaceC9280bX {

    /* renamed from: IL */
    private final long f20728IL;

    /* renamed from: bg */
    private final String f20729bg;

    public C9279WR(String str, long j) {
        this.f20729bg = str;
        this.f20728IL = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX
    /* renamed from: bg */
    public void mo83173bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f20729bg);
            jSONObject.put("preload_size", this.f20728IL);
        } catch (Throwable th) {
            C7741PX.m87873bg("LoadVideoCancelModel", th.getMessage());
        }
    }
}
