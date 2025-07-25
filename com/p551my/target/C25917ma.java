package com.p551my.target;

import android.text.TextUtils;
import com.p551my.target.C25669c;
import com.p551my.target.common.models.ImageData;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.my.target.ma */
/* loaded from: classes7.dex */
public final class C25917ma {
    /* renamed from: a */
    public static C25917ma m43438a() {
        return new C25917ma();
    }

    /* renamed from: b */
    public final C25669c.C25670a m43436b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adId");
        if (optJSONObject != null) {
            String m44232a = AbstractC25631a5.m44232a(optJSONObject, "text");
            if (!TextUtils.isEmpty(m44232a)) {
                String m44232a2 = AbstractC25631a5.m44232a(optJSONObject, "copyText");
                if (!TextUtils.isEmpty(m44232a2)) {
                    AbstractC25846ja.m43680a("VastAdChoicesParser: parsed adId: name = " + m44232a + ", copyText = " + m44232a2);
                    return C25669c.C25670a.m44129a(m44232a, "copy", null, null, m44232a2, false);
                }
                throw new JSONException("VastAdChoicesParser: adId:copyText json field is mandatory");
            }
            throw new JSONException("VastAdChoicesParser: adId:text json field is mandatory");
        }
        throw new JSONException("VastAdChoicesParser: adId json object is mandatory");
    }

    /* renamed from: c */
    public final C25669c m43435c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adInfo");
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m43434d(optJSONObject));
            arrayList.add(m43436b(optJSONObject));
            ImageData m43433e = m43433e(optJSONObject);
            C25669c.C25670a m43432f = m43432f(optJSONObject);
            if (m43432f != null) {
                arrayList.add(m43432f);
            }
            C25669c m44133a = C25669c.m44133a(m43433e, "");
            m44133a.m44132a(arrayList);
            AbstractC25846ja.m43680a("VastAdChoicesParser: parsed adInfo");
            return m44133a;
        }
        throw new JSONException("VastAdChoicesParser: adInfo json object is mandatory");
    }

    /* renamed from: d */
    public final C25669c.C25670a m43434d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("advertiserInfo");
        if (optJSONObject != null) {
            String m44232a = AbstractC25631a5.m44232a(optJSONObject, "text");
            if (!TextUtils.isEmpty(m44232a)) {
                String m44232a2 = AbstractC25631a5.m44232a(optJSONObject, "url");
                if (!TextUtils.isEmpty(m44232a2) && C25895la.m43500e(m44232a2)) {
                    AbstractC25846ja.m43680a("VastAdChoicesParser: parsed advertiserInfo: name = " + m44232a + ", clickLink = " + m44232a2);
                    return C25669c.C25670a.m44129a(m44232a, "default", null, m44232a2, null, true);
                }
                throw new JSONException("VastAdChoicesParser: Invalid url (" + m44232a2 + ") in advertiserInfo:url");
            }
            throw new JSONException("VastAdChoicesParser: advertiserInfo:text json field is mandatory");
        }
        throw new JSONException("VastAdChoicesParser: advertiserInfo json object is mandatory");
    }

    /* renamed from: e */
    public final ImageData m43433e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("icon");
        if (optJSONObject != null) {
            String m44232a = AbstractC25631a5.m44232a(optJSONObject, "url");
            if (!TextUtils.isEmpty(m44232a) && C25895la.m43500e(m44232a)) {
                AbstractC25846ja.m43680a("VastAdChoicesParser: parsed icon: url = " + m44232a);
                return ImageData.newImageData(m44232a);
            }
            throw new JSONException("VastAdChoicesParser: Invalid iconLink in adChoices = " + m44232a);
        }
        throw new JSONException("VastAdChoicesParser: icon json object is mandatory");
    }

    /* renamed from: f */
    public final C25669c.C25670a m43432f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("recommendationInfo");
        if (optJSONObject == null) {
            return null;
        }
        String m44232a = AbstractC25631a5.m44232a(optJSONObject, "text");
        if (!TextUtils.isEmpty(m44232a)) {
            String m44232a2 = AbstractC25631a5.m44232a(optJSONObject, "url");
            if (!TextUtils.isEmpty(m44232a2) && C25895la.m43500e(m44232a2)) {
                AbstractC25846ja.m43680a("VastAdChoicesParser: parsed recommendationInfo: name = " + m44232a + ", clickLink = " + m44232a2);
                return C25669c.C25670a.m44129a(m44232a, "default", null, m44232a2, null, true);
            }
            throw new JSONException("VastAdChoicesParser: Invalid url (" + m44232a2 + ") in recommendationInfo:url");
        }
        throw new JSONException("VastAdChoicesParser: recommendationInfo:text json field is mandatory");
    }

    /* renamed from: a */
    public C25669c m43437a(JSONObject jSONObject) {
        C25669c m43435c = m43435c(jSONObject);
        AbstractC25846ja.m43680a("VastAdChoicesParser: parsed adChoices");
        return m43435c;
    }
}
