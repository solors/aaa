package com.bytedance.adsdk.p195bg;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL */
/* loaded from: classes3.dex */
public class C6911IL implements InterfaceC6977zx {
    @Override // com.bytedance.adsdk.p195bg.InterfaceC6977zx
    /* renamed from: bg */
    public Object mo90392bg(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf) && !TextUtils.equals(valueOf, "null")) {
                    return valueOf;
                }
            }
        }
        return null;
    }
}
