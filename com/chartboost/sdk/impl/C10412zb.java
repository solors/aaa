package com.chartboost.sdk.impl;

import com.amazon.device.ads.DtbConstants;
import com.google.common.net.HttpHeaders;
import kotlin.text.C37690r;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.zb */
/* loaded from: classes3.dex */
public final class C10412zb {

    /* renamed from: com.chartboost.sdk.impl.zb$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10413a {
        /* renamed from: a */
        void mo79785a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public final void m79786a(String str, InterfaceC10413a interfaceC10413a) {
        if (m79787a(str)) {
            C9763c7.m81919b("CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource", null, 2, null);
            if (interfaceC10413a != null) {
                interfaceC10413a.mo79785a(new JSONObject().put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    /* renamed from: a */
    public final boolean m79787a(String str) {
        boolean m16592R;
        boolean m16592R2;
        boolean m16592R3;
        boolean m16592R4;
        if (str != null) {
            m16592R = C37690r.m16592R(str, HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, false, 2, null);
            if (m16592R) {
                m16592R2 = C37690r.m16592R(str, "'null'", false, 2, null);
                if (m16592R2) {
                    m16592R3 = C37690r.m16592R(str, "http://", false, 2, null);
                    if (m16592R3) {
                        return false;
                    }
                    m16592R4 = C37690r.m16592R(str, DtbConstants.HTTPS, false, 2, null);
                    return !m16592R4;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
