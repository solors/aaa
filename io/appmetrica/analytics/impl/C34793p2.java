package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C21170w8;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.p2 */
/* loaded from: classes9.dex */
public final class C34793p2 {
    /* renamed from: a */
    public static void m21177a(C34596hl c34596hl, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(C21170w8.f54322c);
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    C34712m2 c34712m2 = null;
                    String optString = optJSONObject2.optString("key", null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString("value", null);
                        if (optString2 != null) {
                            c34712m2 = new C34712m2(optString2);
                        }
                        arrayList.add(new Pair(optString, c34712m2));
                    }
                }
            }
            c34596hl.f94574t = new C34739n2(arrayList);
        }
    }
}
