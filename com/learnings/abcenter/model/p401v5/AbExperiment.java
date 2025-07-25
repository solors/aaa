package com.learnings.abcenter.model.p401v5;

import com.learnings.abcenter.util.AbCenterUtil;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v5.AbExperiment */
/* loaded from: classes6.dex */
public class AbExperiment {
    private AbParamsBoundary boundary;
    private String event;
    private String exp_id;
    private boolean is_empty;
    private boolean keep_hitting;
    private String key;
    private String layer_id;
    private List<AbExperimentGroup> value;

    private static List<AbExperimentGroup> getAbExperimentGroupListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbExperimentGroup.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AbExperiment getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbExperiment abExperiment = new AbExperiment();
            abExperiment.setEvent(AbCenterUtil.optString(jSONObject, "event"));
            abExperiment.setLayerId(AbCenterUtil.optString(jSONObject, "layer_id"));
            abExperiment.setKey(AbCenterUtil.optString(jSONObject, "key"));
            abExperiment.setExpId(AbCenterUtil.optString(jSONObject, C26484a.f69214ad));
            abExperiment.setEmpty(jSONObject.optBoolean("is_empty"));
            abExperiment.setKeepHitting(jSONObject.optBoolean("keep_hitting"));
            abExperiment.setValue(getAbExperimentGroupListFromJson(jSONObject.optJSONArray("value")));
            abExperiment.setBoundary(AbParamsBoundary.getFromJson(jSONObject.optJSONObject("boundary")));
            return abExperiment;
        } catch (Throwable unused) {
            return null;
        }
    }

    public AbParamsBoundary getBoundary() {
        return this.boundary;
    }

    public String getExpId() {
        return this.exp_id;
    }

    public List<AbExperimentGroup> getGroupList() {
        return this.value;
    }

    public String getKey() {
        return this.key;
    }

    public String getLayerId() {
        return this.layer_id;
    }

    public boolean isEmpty() {
        return this.is_empty;
    }

    public boolean isKeepHitting() {
        return this.keep_hitting;
    }

    public boolean isPublished() {
        return "exp_published".equals(this.event);
    }

    public void setBoundary(AbParamsBoundary abParamsBoundary) {
        this.boundary = abParamsBoundary;
    }

    public void setEmpty(boolean z) {
        this.is_empty = z;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setExpId(String str) {
        this.exp_id = str;
    }

    public void setKeepHitting(boolean z) {
        this.keep_hitting = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLayerId(String str) {
        this.layer_id = str;
    }

    public void setValue(List<AbExperimentGroup> list) {
        this.value = list;
    }
}
