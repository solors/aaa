package com.chartboost.sdk.impl;

import com.ironsource.C20517nb;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.ka */
/* loaded from: classes3.dex */
public abstract class AbstractC10004ka {

    /* renamed from: a */
    public static final List f22485a;

    static {
        List m17166m;
        m17166m = C37563v.m17166m();
        f22485a = m17166m;
    }

    /* renamed from: a */
    public static final List m81214a(JSONObject jSONObject) {
        List asList;
        List m80882a;
        JSONArray optJSONArray = jSONObject.optJSONArray("blacklist");
        return (optJSONArray == null || (asList = AbstractC9761c5.asList(optJSONArray)) == null || (m80882a = AbstractC10102oa.m80882a(asList)) == null) ? f22485a : m80882a;
    }

    /* renamed from: b */
    public static final C9986ja m81213b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            String optString = optJSONObject.optString(C20517nb.f52192r, "https://ssp-events.chartboost.com/track/sdk");
            int optInt = optJSONObject.optInt("eventLimit", 10);
            int optInt2 = optJSONObject.optInt("windowDuration", 60);
            boolean optBoolean2 = optJSONObject.optBoolean("persistenceEnabled", true);
            int optInt3 = optJSONObject.optInt("persistenceMaxEvents", 100);
            List m81214a = m81214a(optJSONObject);
            Intrinsics.m17074g(optString);
            return new C9986ja(optBoolean, m81214a, optString, optInt, optInt2, optBoolean2, optInt3);
        }
        return new C9986ja(false, null, null, 0, 0, false, 0, 127, null);
    }

    /* renamed from: a */
    public static final List m81215a() {
        return f22485a;
    }
}
