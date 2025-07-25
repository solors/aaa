package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.b0 */
/* loaded from: classes4.dex */
public abstract class AbstractC15438b0 {
    /* renamed from: a */
    public static void m76508a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof InterfaceC15436a0) {
                    jSONObject.putOpt(str, ((InterfaceC15436a0) obj).mo76509a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
