package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC15438b0;
import com.fyber.inneractive.sdk.util.InterfaceC15436a0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.Q */
/* loaded from: classes4.dex */
public final class C14324Q implements InterfaceC15436a0 {

    /* renamed from: a */
    public UnitDisplayType f27117a;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15436a0
    /* renamed from: a */
    public final JSONObject mo76509a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC15438b0.m76508a(jSONObject, "unitDisplayType", this.f27117a);
        return jSONObject;
    }
}
