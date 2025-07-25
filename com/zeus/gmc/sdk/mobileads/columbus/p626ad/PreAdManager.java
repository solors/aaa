package com.zeus.gmc.sdk.mobileads.columbus.p626ad;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.PreAdManager */
/* loaded from: classes8.dex */
public class PreAdManager {
    private static Map<String, String> mAdPool = new ConcurrentHashMap();

    private PreAdManager() {
    }

    public static String getAdInfo(String str) {
        return mAdPool.remove(str);
    }

    private static void preLoadAdInfos(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.getJSONObject(i).optString("tagId");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject = new JSONObject("{\"code\": 0,\"status\": 0}");
                    jSONObject.putOpt("adInfos", jSONArray);
                    mAdPool.put(optString, jSONObject.toString());
                    return;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
