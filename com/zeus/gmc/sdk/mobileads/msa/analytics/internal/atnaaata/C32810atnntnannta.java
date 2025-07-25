package com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnaaata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p552ot.pubsub.p553a.C26485b;
import com.p552ot.pubsub.p554b.C26517m;
import com.zeus.gmc.sdk.mobileads.msa.analytics.C32805atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.C32806atntntntanaan;
import com.zeus.gmc.sdk.mobileads.msa.analytics.pubsub.PubSubManager;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32819atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32820atntaanaa;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnaaata.atnntnannta */
/* loaded from: classes8.dex */
public class C32810atnntnannta {
    private static final String atnntnannta = "Analytics-NetWorkManager";

    /* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnaaata.atnntnannta$atntntntanaan */
    /* loaded from: classes8.dex */
    private static class C32812atntntntanaan {
        private static final C32810atnntnannta atnntnannta = new C32810atnntnannta();

        private C32812atntntntanaan() {
        }
    }

    public static C32810atnntnannta atnntnannta() {
        return C32812atntntntanaan.atnntnannta;
    }

    private String atntntntanaan(Context context, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = (String) map.get(C32805atnntnannta.atnannttnnata);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("pk", str);
                map.remove(C32805atnntnannta.atnannttnnata);
            } else {
                jSONObject.put("pk", context.getPackageName());
            }
            jSONObject.put("key", map.get(C32805atnntnannta.atntntntanaan));
            jSONObject.put("eventTime", System.currentTimeMillis() + "");
            map.remove(C32805atnntnannta.atntntntanaan);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C26485b.f69245b, jSONObject);
            jSONObject3.put(C26485b.f69244a, jSONObject2);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            JSONObject atnntnannta2 = atnntnannta(context);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C26485b.f69245b, atnntnannta2);
            jSONObject4.putOpt(C26485b.f69244a, jSONArray);
            return jSONObject4.toString();
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "getRequestParams had Exception", e);
            return null;
        }
    }

    private C32810atnntnannta() {
    }

    public void atnntnannta(Context context, Map<String, Object> map) {
        String atntntntanaan;
        try {
            if (map == null) {
                C32821atntntntanaan.atnntnannta(atnntnannta, "dataMap is null, return");
                return;
            }
            String str = (String) map.get(C32805atnntnannta.atntntntanaan);
            C32821atntntntanaan.atnntnannta(atnntnannta, "configKey = " + str);
            if (TextUtils.isEmpty(str) || (atntntntanaan = atntntntanaan(context, map)) == null) {
                return;
            }
            C32821atntntntanaan.atnntnannta(atnntnannta, "〓〓payload = 【" + map.get(C32805atnntnannta.atntaanaa) + "】〓〓\n〓 " + atntntntanaan);
            PubSubManager.sendMessage(context, str, atntntntanaan, (String) map.get(C32805atnntnannta.atntaanaa));
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "", e);
        }
    }

    @SuppressLint({"MissingPermission"})
    private JSONObject atnntnannta(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("android", Build.VERSION.RELEASE);
            jSONObject.put("miui", Build.VERSION.INCREMENTAL);
            jSONObject.put("product", Build.PRODUCT);
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("lang", C32819atnntnannta.atntntntanaan());
            jSONObject.put("region", C32819atnntnannta.atntaanaa());
            jSONObject.put(C26517m.f69371j, context.getPackageName());
            jSONObject.put("n", C32820atntaanaa.atnntnannta(context));
            jSONObject.put("st", System.currentTimeMillis() + "");
            jSONObject.put("trackSdkCv", C32806atntntntanaan.atnaaata);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
