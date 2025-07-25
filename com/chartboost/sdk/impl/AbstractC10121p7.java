package com.chartboost.sdk.impl;

import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.p7 */
/* loaded from: classes3.dex */
public abstract class AbstractC10121p7 {
    /* renamed from: a */
    public static final List m80831a(JSONObject jSONObject) {
        List m17166m;
        List<JSONObject> asListSkipNull;
        C9871gb c9871gb;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray optJSONArray = jSONObject.optJSONArray("verification");
        if (optJSONArray == null || (asListSkipNull = AbstractC9761c5.asListSkipNull(optJSONArray)) == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject2 : asListSkipNull) {
            try {
                String string = jSONObject2.getString("url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject2.getString(Verification.VENDOR);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = jSONObject2.getString("params");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                c9871gb = new C9871gb(string, string2, string3);
            } catch (Exception unused) {
                c9871gb = null;
            }
            if (c9871gb != null) {
                arrayList.add(c9871gb);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C10099o7 m80830b(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        List m80831a = m80831a(config);
        JSONObject optJSONObject = config.optJSONObject("viewabilitySettings");
        if (optJSONObject != null) {
            return new C10099o7(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), optJSONObject.optInt("minVisibleDips", 1), optJSONObject.optInt("minVisibleDurationMs", 0), optJSONObject.optLong("visibilityCheckIntervalMs", 100L), optJSONObject.optInt("traversalLimit", 25), m80831a);
        }
        return new C10099o7(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), 0, 0, 0L, 0, m80831a, 60, null);
    }
}
