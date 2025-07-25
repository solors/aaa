package com.p551my.tracker.personalize;

import android.text.TextUtils;
import com.applovin.impl.C4801lz;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p551my.tracker.obfuscated.C26468z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.tracker.personalize.d */
/* loaded from: classes7.dex */
final class C26475d extends AbstractC26473b<List<PersonalizePlacement>> {
    /* renamed from: b */
    static C26474c<PersonalizeItem> m41503b(JSONObject jSONObject) {
        String m41505a = m41505a(jSONObject, "sku", "payload", "value", "discount_value", "price", "discount_price");
        if (m41505a != null) {
            return new C26474c<>(null, m41505a);
        }
        String optString = jSONObject.optString("sku");
        if (TextUtils.isEmpty(optString)) {
            return m41504a("Invalid value for key: ", "sku");
        }
        String optString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(optString2)) {
            return m41504a("Invalid value for key: ", "payload");
        }
        return new C26474c<>(new PersonalizeItem(optString, optString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    /* renamed from: c */
    static C26474c<PersonalizeOffer> m41502c(JSONObject jSONObject) {
        String str;
        StringBuilder sb2;
        String m41505a = m41505a(jSONObject, "offer_id", "subitems");
        if (m41505a != null) {
            return new C26474c<>(null, m41505a);
        }
        int optInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subitems");
        if (optJSONArray == null) {
            return m41504a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C26474c<PersonalizeItem> m41503b = m41503b(optJSONArray.optJSONObject(i));
            String m41508a = m41503b.m41508a();
            if (!TextUtils.isEmpty(m41508a)) {
                str = "Can't parse item " + i + " with errors: " + m41508a;
                arrayList2.add(str);
                sb2 = new StringBuilder();
            } else {
                PersonalizeItem m41507b = m41503b.m41507b();
                if (m41507b == null) {
                    str = "Can't parse item " + i + " without errors";
                    arrayList2.add(str);
                    sb2 = new StringBuilder();
                } else {
                    arrayList.add(m41507b);
                }
            }
            sb2.append("PersonalizePlacementsParser: ");
            sb2.append(str);
            C26468z0.m41528a(sb2.toString());
        }
        if (arrayList2.size() > 0) {
            return new C26474c<>(null, C4801lz.m97621a(", ", arrayList2));
        }
        return new C26474c<>(new PersonalizeOffer(optInt, arrayList), null);
    }

    /* renamed from: d */
    static C26474c<PersonalizePlacement> m41501d(JSONObject jSONObject) {
        String m41505a = m41505a(jSONObject, "placement_id", "test_id", FirebaseAnalytics.Param.GROUP_ID, "offer");
        if (m41505a != null) {
            return new C26474c<>(null, m41505a);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("offer");
        if (optJSONObject == null) {
            return m41504a("Invalid value for key: ", "offer");
        }
        C26474c<PersonalizeOffer> m41502c = m41502c(optJSONObject);
        String m41508a = m41502c.m41508a();
        if (m41508a != null) {
            C26468z0.m41528a("PersonalizePlacementsParser: Can't parse offer's object with error: " + m41508a);
            return new C26474c<>(null, m41508a);
        }
        PersonalizeOffer m41507b = m41502c.m41507b();
        if (m41507b == null) {
            return m41504a("Can't parse offer's object without error from parser", null);
        }
        String optString = jSONObject.optString("placement_id");
        if (TextUtils.isEmpty(optString)) {
            return m41504a("Invalid value for key: ", "placement_id");
        }
        return new C26474c<>(new PersonalizePlacement(optString, jSONObject.optInt(FirebaseAnalytics.Param.GROUP_ID), jSONObject.optInt("test_id"), m41507b), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p551my.tracker.personalize.AbstractC26473b
    /* renamed from: a */
    public C26474c<List<PersonalizePlacement>> mo41506a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                arrayList.add(next + ": " + optString);
            }
            return new C26474c<>(null, C4801lz.m97621a(", ", arrayList));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return m41504a("No value for key: ", "data");
        }
        if (optJSONArray.length() == 0) {
            return m41504a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C26474c<PersonalizePlacement> m41501d = m41501d(optJSONArray.optJSONObject(i));
            String m41508a = m41501d.m41508a();
            if (m41508a != null) {
                C26468z0.m41528a("PersonalizePlacementsParser: Placement parsing error: " + m41508a);
            } else {
                PersonalizePlacement m41507b = m41501d.m41507b();
                if (m41507b != null) {
                    arrayList2.add(m41507b);
                }
            }
        }
        return arrayList2.isEmpty() ? m41504a("No placements in the list") : new C26474c<>(arrayList2, null);
    }

    /* renamed from: a */
    static <T> C26474c<T> m41504a(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        C26468z0.m41528a("PersonalizePlacementsParser: " + sb3);
        return new C26474c<>(null, sb3);
    }

    /* renamed from: a */
    static String m41505a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String str2 = "No value for key: " + str;
                C26468z0.m41528a("PersonalizePlacementsParser: " + str2);
                return str2;
            }
        }
        return null;
    }
}
