package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.l5 */
/* loaded from: classes3.dex */
public class C10019l5 {
    /* renamed from: a */
    public JSONObject m81178a(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DataUseConsent dataUseConsent = (DataUseConsent) it.next();
            try {
                jSONObject.put(dataUseConsent.getPrivacyStandard(), dataUseConsent.getConsent());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
