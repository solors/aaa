package com.learnings.abcenter.model.p401v5;

import com.learnings.abcenter.util.AbCenterUtil;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v5.AbExperimentGroup */
/* loaded from: classes6.dex */
public class AbExperimentGroup {
    private int index;
    private String tag;
    private Object value;

    public static AbExperimentGroup getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return (AbExperimentGroup) AbCenterUtil.getGson().fromJson(jSONObject.toString(), (Class<Object>) AbExperimentGroup.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getIndex() {
        return this.index;
    }

    public String getTag() {
        return this.tag;
    }

    public Object getValue() {
        return this.value;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }
}
