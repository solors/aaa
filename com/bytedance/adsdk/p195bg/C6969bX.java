package com.bytedance.adsdk.p195bg;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.bX */
/* loaded from: classes3.dex */
public class C6969bX implements InterfaceC6977zx {
    @Override // com.bytedance.adsdk.p195bg.InterfaceC6977zx
    /* renamed from: IL */
    public String mo90392bg(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 3) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(valueOf);
            String valueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            return jSONObject2.optString(valueOf2, String.valueOf(objArr[2]));
        } catch (JSONException unused) {
            return null;
        }
    }
}
