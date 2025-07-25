package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.bg */
/* loaded from: classes3.dex */
public class C9005bg extends AbstractC8995Lq {
    public C9005bg() {
        super("tt_set_apm.prop", new AbstractC8995Lq.InterfaceC8998bg() { // from class: com.bytedance.sdk.openadsdk.core.settings.bg.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq.InterfaceC8998bg
            /* renamed from: IL */
            public void mo82670IL() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq.InterfaceC8998bg
            /* renamed from: bg */
            public void mo82669bg() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx
    /* renamed from: bg */
    public void mo83726bg(JSONObject jSONObject) {
        InterfaceC9036zx.InterfaceC9040bg m83854bg = m83854bg();
        if (jSONObject.has("apm_url")) {
            m83854bg.mo83717bg("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    m83854bg.mo83719bg("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        m83854bg.mo83722bg();
        eqN();
    }
}
