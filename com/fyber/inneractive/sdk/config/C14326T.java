package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.AbstractC15438b0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.T */
/* loaded from: classes4.dex */
public final class C14326T implements InterfaceC14327U {

    /* renamed from: a */
    public String f27120a;

    /* renamed from: b */
    public String f27121b;

    /* renamed from: c */
    public C14320M f27122c;

    /* renamed from: d */
    public C14323P f27123d;

    /* renamed from: e */
    public C14324Q f27124e;

    /* renamed from: f */
    public C14328V f27125f;

    /* renamed from: g */
    public C14329W f27126g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        AbstractC15438b0.m76508a(jSONObject, "id", this.f27120a);
        AbstractC15438b0.m76508a(jSONObject, "spotId", this.f27121b);
        AbstractC15438b0.m76508a(jSONObject, "display", this.f27122c);
        AbstractC15438b0.m76508a(jSONObject, "monitor", this.f27123d);
        AbstractC15438b0.m76508a(jSONObject, "native", this.f27124e);
        AbstractC15438b0.m76508a(jSONObject, "video", this.f27125f);
        AbstractC15438b0.m76508a(jSONObject, "viewability", this.f27126g);
        return jSONObject.toString();
    }
}
