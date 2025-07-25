package com.amazon.device.iap.internal.p106c;

import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PromotionsDataParser.java */
/* renamed from: com.amazon.device.iap.internal.c.a */
/* loaded from: classes2.dex */
final class C3717a {
    C3717a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<Promotion> m102418a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(KiwiConstants.f2730q);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m102417b(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Promotion m102417b(JSONObject jSONObject) throws JSONException {
        return new Promotion(jSONObject.getString(KiwiConstants.f2731r), m102419a(jSONObject.getJSONArray(KiwiConstants.f2732s)));
    }

    /* renamed from: c */
    private static PromotionPlan m102416c(JSONObject jSONObject) throws JSONException {
        String str;
        String string = jSONObject.getString(KiwiConstants.f2733t);
        int i = jSONObject.getInt(KiwiConstants.f2734u);
        JSONObject optJSONObject = jSONObject.optJSONObject(KiwiConstants.f2736w);
        if (optJSONObject != null && optJSONObject != JSONObject.NULL) {
            Currency currency = Currency.getInstance(optJSONObject.optString("currency"));
            str = currency.getSymbol() + optJSONObject.optString("value");
        } else {
            str = null;
        }
        return new PromotionPlan(string, str, i);
    }

    /* renamed from: a */
    private static List<PromotionPlan> m102419a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m102416c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
