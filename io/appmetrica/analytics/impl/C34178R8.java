package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.R8 */
/* loaded from: classes9.dex */
public final class C34178R8 {

    /* renamed from: a */
    public final C34997wn f93443a;

    public C34178R8(C34997wn c34997wn) {
        this.f93443a = c34997wn;
    }

    /* renamed from: a */
    public final void m22319a(int i, long j) {
        JSONObject optJSONObject;
        C34997wn c34997wn = this.f93443a;
        synchronized (c34997wn) {
            optJSONObject = c34997wn.f95576a.m20761a().optJSONObject("numbers_of_type");
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put(String.valueOf(i), j);
        this.f93443a.m20806a(optJSONObject);
    }
}
