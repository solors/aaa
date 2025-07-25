package com.bytedance.sdk.openadsdk.eqN.p342IL;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.IL.bX */
/* loaded from: classes3.dex */
public class C9118bX implements InterfaceC9117IL {

    /* renamed from: bg */
    InterfaceC9117IL f20347bg;

    @Override // com.bytedance.sdk.openadsdk.eqN.p342IL.InterfaceC9117IL
    /* renamed from: bg */
    public void mo83522bg(JSONObject jSONObject, long j) throws JSONException {
        InterfaceC9117IL interfaceC9117IL = this.f20347bg;
        if (interfaceC9117IL != null) {
            interfaceC9117IL.mo83522bg(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
