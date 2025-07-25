package com.learnings.abcenter.model.p402v6;

import com.learnings.abcenter.util.AbCenterUtil;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbStrategy */
/* loaded from: classes6.dex */
public class AbStrategy {
    private AbCondition condition;
    private String flowDomainId;
    private String paramKey;
    private Object paramValue;
    private int priority;

    public static AbStrategy getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbStrategy abStrategy = new AbStrategy();
            abStrategy.setFlowDomainId(AbCenterUtil.optString(jSONObject, "flow_domain_id"));
            abStrategy.setParamKey(AbCenterUtil.optString(jSONObject, "param_key"));
            abStrategy.setPriority(jSONObject.optInt("priority"));
            abStrategy.setParamValue(AbValue.getValue(jSONObject));
            abStrategy.setCondition(AbCondition.getFromJson(jSONObject.optJSONObject("condition")));
            return abStrategy;
        } catch (Throwable unused) {
            return null;
        }
    }

    public AbCondition getCondition() {
        return this.condition;
    }

    public String getFlowDomainId() {
        return this.flowDomainId;
    }

    public String getParamKey() {
        return this.paramKey;
    }

    public Object getParamValue() {
        return this.paramValue;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setCondition(AbCondition abCondition) {
        this.condition = abCondition;
    }

    public void setFlowDomainId(String str) {
        this.flowDomainId = str;
    }

    public void setParamKey(String str) {
        this.paramKey = str;
    }

    public void setParamValue(Object obj) {
        this.paramValue = obj;
    }

    public void setPriority(int i) {
        this.priority = i;
    }
}
