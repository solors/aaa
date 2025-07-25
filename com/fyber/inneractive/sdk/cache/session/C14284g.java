package com.fyber.inneractive.sdk.cache.session;

import com.amazon.p047a.p048a.p059h.Metric;
import com.maticoo.sdk.utils.event.EventId;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.g */
/* loaded from: classes4.dex */
public final class C14284g {

    /* renamed from: a */
    public int f26993a;

    /* renamed from: b */
    public int f26994b;

    /* renamed from: c */
    public int f26995c;

    /* renamed from: d */
    public final long f26996d;

    public C14284g(int i, int i2, int i3, long j) {
        this.f26996d = j;
        this.f26993a = i;
        this.f26994b = i2;
        this.f26995c = i3;
    }

    /* renamed from: a */
    public final JSONObject m78009a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(Metric.f2405b, this.f26996d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put(EventId.AD_SHOW_SUCCESS_NAME, this.f26993a);
        if (z2) {
            jSONObject.put("com", this.f26995c);
        }
        jSONObject.put("cli", this.f26994b);
        return jSONObject;
    }

    /* renamed from: a */
    public static C14284g m78010a(JSONObject jSONObject) {
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(Metric.f2405b);
            int optInt = jSONObject.optInt("cli", -1);
            int optInt2 = jSONObject.optInt(EventId.AD_SHOW_SUCCESS_NAME, -1);
            int optInt3 = jSONObject.optInt("com", -1);
            if (optLong != 0 && optInt >= 0 && optInt2 >= 0 && optInt3 >= 0) {
                return new C14284g(optInt2, optInt, optInt3, optLong);
            }
        }
        return null;
    }
}
