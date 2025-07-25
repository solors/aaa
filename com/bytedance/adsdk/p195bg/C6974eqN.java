package com.bytedance.adsdk.p195bg;

import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.eqN */
/* loaded from: classes3.dex */
public class C6974eqN implements InterfaceC6977zx {
    @Override // com.bytedance.adsdk.p195bg.InterfaceC6977zx
    /* renamed from: IL */
    public Boolean mo90392bg(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                Double.parseDouble(String.valueOf(objArr[0]));
                return Boolean.TRUE;
            } catch (NumberFormatException unused) {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
