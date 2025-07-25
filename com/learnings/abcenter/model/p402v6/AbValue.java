package com.learnings.abcenter.model.p402v6;

import com.google.gson.annotations.SerializedName;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbValue */
/* loaded from: classes6.dex */
public class AbValue {
    @SerializedName("group_data")
    private Map<String, Object> groupData;
    @SerializedName(alternate = {"param_value"}, value = "value")
    private Object value;

    public Map<String, Object> getGroupData() {
        return this.groupData;
    }

    public Object getValue() {
        return this.value;
    }

    public static Map<String, Object> getGroupData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return ((AbValue) AbCenterUtil.getGson().fromJson(jSONObject.toString(), (Class<Object>) AbValue.class)).getGroupData();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getValue(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return ((AbValue) AbCenterUtil.getGson().fromJson(jSONObject.toString(), (Class<Object>) AbValue.class)).getValue();
        } catch (Throwable unused) {
            return null;
        }
    }
}
