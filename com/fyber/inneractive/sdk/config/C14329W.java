package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.AbstractC15438b0;
import com.fyber.inneractive.sdk.util.InterfaceC15436a0;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.W */
/* loaded from: classes4.dex */
public final class C14329W implements InterfaceC15436a0 {

    /* renamed from: a */
    public Integer f27138a = 50;

    /* renamed from: b */
    public Integer f27139b = 50;

    /* renamed from: c */
    public Set f27140c = null;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15436a0
    /* renamed from: a */
    public final JSONObject mo76509a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC15438b0.m76508a(jSONObject, "pausePct", this.f27138a);
        AbstractC15438b0.m76508a(jSONObject, "playPct", this.f27139b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f27140c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        AbstractC15438b0.m76508a(jSONObject, Verification.VENDOR, jSONArray);
        return jSONObject;
    }
}
