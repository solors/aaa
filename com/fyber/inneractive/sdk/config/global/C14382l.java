package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C20217kq;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.l */
/* loaded from: classes4.dex */
public final class C14382l {

    /* renamed from: a */
    public final HashMap f27212a = new HashMap();

    /* renamed from: a */
    public static C14382l m77942a(JSONObject jSONObject) {
        C14382l c14382l = new C14382l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        int i = 0;
        int i2 = 0;
        while (i2 < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            C14387q c14387q = new C14387q();
            c14387q.f27215b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                c14387q.f27214a = new C14385o(optJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[i] = c14387q.f27215b;
                IAlog.m76529a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray(C20217kq.f50860d);
            if (optJSONArray2 != null) {
                int i3 = i;
                while (i3 < optJSONArray2.length()) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                    C14349b c14349b = new C14349b();
                    c14349b.f27185a = jSONObject3.getString("id");
                    c14349b.f27186b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i4 = i; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        C14381k c14381k = new C14381k();
                        c14381k.f27210b = jSONObject4.getString("id");
                        c14381k.f27211c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            c14381k.f27214a = new C14385o(optJSONObject2);
                        }
                        c14349b.f27187c.add(c14381k);
                    }
                    C14349b.m77957a(c14349b, jSONObject3.optJSONObject(POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE), true);
                    C14349b.m77957a(c14349b, jSONObject3.optJSONObject(POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE), false);
                    c14387q.f27216c.put(c14349b.f27185a, c14349b);
                    i3++;
                    i = 0;
                }
            }
            c14382l.f27212a.put(c14387q.f27215b, c14387q);
            i2++;
            i = i;
        }
        return c14382l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14382l.class == obj.getClass()) {
            return this.f27212a.equals(((C14382l) obj).f27212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27212a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f27212a.values());
    }
}
