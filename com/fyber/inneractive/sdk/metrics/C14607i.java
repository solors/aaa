package com.fyber.inneractive.sdk.metrics;

import com.amazon.p047a.p048a.p059h.Metric;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.metrics.i */
/* loaded from: classes4.dex */
public final class C14607i {

    /* renamed from: a */
    public final LinkedHashMap f27680a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f27681b = new LinkedHashMap();

    /* renamed from: c */
    public long f27682c;

    /* renamed from: d */
    public long f27683d;

    /* renamed from: a */
    public static JSONArray m77759a(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (C14606h c14606h : linkedHashMap.keySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("outcome", c14606h.f27679b);
                jSONObject.putOpt(Metric.f2405b, linkedHashMap.get(c14606h));
                jSONObject.putOpt("idx", Integer.valueOf(jSONArray.length()));
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
