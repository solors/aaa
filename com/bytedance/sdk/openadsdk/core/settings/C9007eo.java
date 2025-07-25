package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.eo */
/* loaded from: classes3.dex */
public class C9007eo extends AbstractC8995Lq {
    public C9007eo() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx
    /* renamed from: bg */
    public void mo83726bg(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            InterfaceC9036zx.InterfaceC9040bg m83854bg = m83854bg();
            m83854bg.mo83717bg("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            m83854bg.mo83722bg();
            eqN();
        }
    }
}
