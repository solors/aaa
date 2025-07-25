package com.amazon.device.iap.internal.p096a.p097a;

import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.iap.internal.a.a.e */
/* loaded from: classes2.dex */
final class PromotionsDataParser {
    PromotionsDataParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<Promotion> m102466a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(KiwiConstants.f2730q);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m102465b(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Promotion m102465b(JSONObject jSONObject) throws JSONException {
        return new Promotion(jSONObject.getString(KiwiConstants.f2731r), m102467a(jSONObject.getJSONArray(KiwiConstants.f2732s)));
    }

    /* renamed from: c */
    private static PromotionPlan m102464c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String string = jSONObject.getString(KiwiConstants.f2733t);
        int i = jSONObject.getInt(KiwiConstants.f2734u);
        String optString = jSONObject.optString(KiwiConstants.f2735v);
        if (Validator.m102806a(optString) && (jSONObject2 = jSONObject.getJSONObject(KiwiConstants.f2736w)) != null) {
            Currency currency = Currency.getInstance(jSONObject2.getString("currency"));
            optString = currency.getSymbol() + new BigDecimal(jSONObject2.getString("value"));
        }
        return new PromotionPlan(string, optString, i);
    }

    /* renamed from: a */
    private static List<PromotionPlan> m102467a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m102464c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
