package com.bytedance.sdk.component.p256bg;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.bg.Lq */
/* loaded from: classes3.dex */
public final class C7578Lq {

    /* renamed from: bg */
    private final Map<String, Object> f16514bg = new ConcurrentHashMap();

    private C7578Lq() {
    }

    /* renamed from: bg */
    public static C7578Lq m88487bg() {
        return new C7578Lq();
    }

    /* renamed from: IL */
    public String m88488IL() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f16514bg.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: bg */
    public C7578Lq m88486bg(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f16514bg.put(str, obj);
        }
        return this;
    }
}
