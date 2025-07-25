package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.t2 */
/* loaded from: classes3.dex */
public class C10211t2 {
    /* renamed from: a */
    public JSONObject m80559a(C10160r2 c10160r2) {
        if (c10160r2 == null) {
            return new JSONObject();
        }
        return AbstractC10396z1.m79814a(AbstractC10396z1.m79817a("carrier-name", c10160r2.m80692d()), AbstractC10396z1.m79817a("mobile-country-code", c10160r2.m80695a()), AbstractC10396z1.m79817a("mobile-network-code", c10160r2.m80694b()), AbstractC10396z1.m79817a("iso-country-code", c10160r2.m80693c()), AbstractC10396z1.m79817a("phone-type", Integer.valueOf(c10160r2.m80691e())));
    }
}
