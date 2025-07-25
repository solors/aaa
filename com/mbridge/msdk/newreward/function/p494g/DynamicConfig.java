package com.mbridge.msdk.newreward.function.p494g;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.newreward.function.g.a */
/* loaded from: classes6.dex */
public final class DynamicConfig {
    /* renamed from: a */
    public static IOCBean m50277a() {
        JSONObject jSONObject;
        int optInt;
        IOCBean iOCBean = new IOCBean();
        String string = MBridgeSharedPreferenceModel.getInstance().getString(MBridgeConstans.SP_DYNAMIC_METRICS_REPORT, "");
        if (TextUtils.isEmpty(string)) {
            return iOCBean;
        }
        try {
            jSONObject = new JSONObject(string);
            optInt = jSONObject.optInt("version", -1);
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        if (optInt == -1) {
            return iOCBean;
        }
        String optString = jSONObject.optString("name", "");
        JSONArray jSONArray = jSONObject.getJSONArray("report");
        IOCBeanItem[] iOCBeanItemArr = new IOCBeanItem[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String optString2 = jSONObject2.optString("key", "");
                    String optString3 = jSONObject2.optString(ViewHierarchyConstants.CLASS_NAME_KEY, "");
                    String optString4 = jSONObject2.optString("method", "");
                    if (!TextUtils.isEmpty(optString2)) {
                        iOCBeanItemArr[i] = new IOCBeanItem(optString3, optString4, optString2);
                    }
                }
            } catch (JSONException e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        iOCBean.m50271a(optString);
        iOCBean.m50272a(optInt);
        iOCBean.m50270a(iOCBeanItemArr);
        return iOCBean;
    }
}
