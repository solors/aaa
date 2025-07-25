package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.tool.bg */
/* loaded from: classes3.dex */
public class C9374bg {
    /* renamed from: bg */
    public static String m82910bg(List<FilterWord> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (FilterWord filterWord : list) {
                JSONObject m82912bg = m82912bg(filterWord);
                if (m82912bg != null) {
                    jSONArray.put(m82912bg);
                }
            }
            return jSONArray.toString();
        }
        return null;
    }

    /* renamed from: bg */
    public static List<FilterWord> m82911bg(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord m82909bg = m82909bg(jSONArray.optJSONObject(i));
                if (m82909bg != null && m82909bg.isValid()) {
                    arrayList.add(m82909bg);
                }
            }
        } catch (JSONException e) {
            C7741PX.m87873bg("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    /* renamed from: bg */
    private static FilterWord m82909bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord m82909bg = m82909bg(optJSONArray.optJSONObject(i));
                    if (m82909bg != null && m82909bg.isValid()) {
                        filterWord.addOption(m82909bg);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    private static JSONObject m82912bg(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord filterWord2 : filterWord.getOptions()) {
                        jSONArray.put(m82912bg(filterWord2));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
