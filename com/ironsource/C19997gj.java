package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.gj */
/* loaded from: classes6.dex */
public class C19997gj extends AbstractC19795e {

    /* renamed from: i */
    private final String f50276i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* renamed from: j */
    private final String f50277j = "super.dwh.mediation_events";

    /* renamed from: k */
    private final String f50278k = C20517nb.f52170Q;

    /* renamed from: l */
    private final String f50279l = "data";

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19997gj(int i) {
        this.f49845g = i;
    }

    @Override // com.ironsource.AbstractC19795e
    /* renamed from: a */
    public String mo56110a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC19795e
    /* renamed from: c */
    public String mo56108c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC19795e
    /* renamed from: a */
    public String mo56109a(ArrayList<C20200kb> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f49844f = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C20200kb> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject m58841a = m58841a(it.next());
                    if (m58841a != null) {
                        jSONArray.put(m58841a);
                    }
                }
            }
            jSONObject2.put(C20517nb.f52170Q, "super.dwh.mediation_events");
            jSONObject2.put("data", m58839a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
