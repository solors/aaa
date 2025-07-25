package p1064z0;

import org.json.JSONArray;
import org.json.JSONObject;
import p1049y0.C44996b;
import p975t0.C44346a;

/* renamed from: z0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC45105a {
    /* renamed from: a */
    public static C44346a m901a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        String str = "";
        boolean z = true;
        try {
            if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                String optString = optJSONObject.optString("igniteVersion", "");
                try {
                    if (optJSONObject.has("features") && (optJSONArray = optJSONObject.optJSONArray("features")) != null) {
                        for (int length = optJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(length);
                            if (optJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(optJSONObject2.optString("type", ""))) {
                                str = optString;
                                break;
                            }
                        }
                    }
                    str = optString;
                } catch (Exception e) {
                    e = e;
                    str = optString;
                    C44996b.m1100b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                    z = false;
                    return new C44346a(z, str);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        z = false;
        return new C44346a(z, str);
    }
}
