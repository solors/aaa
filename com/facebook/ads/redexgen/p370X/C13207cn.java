package com.facebook.ads.redexgen.p370X;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cn */
/* loaded from: assets/audience_network.dex */
public class C13207cn implements InterfaceC109100k {
    public final /* synthetic */ C13029Zs A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C13207cn(JSONObject jSONObject, C13029Zs c13029Zs, String str) {
        this.A02 = jSONObject;
        this.A00 = c13029Zs;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109100k
    public final String A6r() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109100k
    public final Collection<String> A7B() {
        return AbstractC109110l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109100k
    public final EnumC109090j A7c() {
        return AbstractC109110l.A00(this.A02);
    }
}
